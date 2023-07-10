package org.nasdanika.models.ecore.tests;

import java.io.File;
import java.io.IOException;
import java.lang.module.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.jgrapht.Graph;
import org.jgrapht.graph.SimpleDirectedGraph;
import org.jgrapht.traverse.DepthFirstIterator;
import org.junit.jupiter.api.Test;
import org.nasdanika.common.Context;
import org.nasdanika.common.Diagnostic;
import org.nasdanika.common.ExecutionException;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.NullProgressMonitor;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.exec.ExecPackage;
import org.nasdanika.exec.content.ContentPackage;
import org.nasdanika.exec.resources.ResourcesPackage;
import org.nasdanika.graph.Connection;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.JGraphTAdapter;
import org.nasdanika.graph.Node;
import org.nasdanika.graph.emf.EObjectGraphFactory;
import org.nasdanika.graph.emf.EObjectNode;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.graph.processor.emf.EObjectNodeProcessorReflectiveFactory;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppPackage;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.html.model.app.Link;
import org.nasdanika.html.model.app.gen.ActionSiteGenerator;
import org.nasdanika.html.model.app.graph.Registry;
import org.nasdanika.html.model.app.graph.URINodeProcessor;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.html.model.app.graph.emf.EObjectReflectiveProcessorFactory;
import org.nasdanika.html.model.bootstrap.BootstrapPackage;
import org.nasdanika.html.model.html.HtmlPackage;
import org.nasdanika.models.ecore.graph.EClassNode;
import org.nasdanika.models.ecore.graph.EcoreGraphFactory;
import org.nasdanika.models.ecore.graph.processors.EcoreNodeProcessorFactory;
import org.nasdanika.models.ecore.test.Fox;
import org.nasdanika.models.ecore.test.TestPackage;
import org.nasdanika.models.ecore.test.processors.EcoreGenTestProcessorsFactory;
import org.nasdanika.models.ecore.test.util.TestObjectLoaderSupplier;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.persistence.ObjectLoaderResource;

/**
 * Tests Ecore -> Graph -> Processor -> actions generation
 * @author Pavel
 *
 */
public class TestNatureModelDocGen {
		
	@Test
	public void testParallel() throws IOException, DiagnosticException {
		List<EPackage> ePackages = Arrays.asList(
				EcorePackage.eINSTANCE, 
				NcorePackage.eINSTANCE,
				ExecPackage.eINSTANCE,
				ContentPackage.eINSTANCE,
				ResourcesPackage.eINSTANCE,
				HtmlPackage.eINSTANCE,
				BootstrapPackage.eINSTANCE,
				AppPackage.eINSTANCE,
				TestPackage.eINSTANCE);
		
		for (int i = 0; i < 10; ++i) {
			System.out.println("*** Pass " + i);
			EObjectGraphFactory graphFactory = new EcoreGraphFactory(true);  
			ProgressMonitor progressMonitor = new NullProgressMonitor(); // new PrintStreamProgressMonitor();
			List<EObjectNode> nodes = graphFactory.createGraph(ePackages, progressMonitor);
			
			Context context = Context.EMPTY_CONTEXT;
			Consumer<Diagnostic> diagnosticConsumer = d -> d.dump(System.out, 0);
	
			List<Function<URI,Action>> actionProviders = new ArrayList<>();		
	
	//		CoreDocLoader coreDocLoader = new CoreDocLoader(diagnosticConsumer, context, progressMonitor);
	//		actionProviders.add(coreDocLoader::getPrototype);
			
			EcoreGenTestProcessorsFactory ecoreGenTestProcessorFactory = new EcoreGenTestProcessorsFactory();
			
			
			EcoreNodeProcessorFactory ecoreNodeProcessorFactory = new EcoreNodeProcessorFactory(
					context, 
					(uri, pm) -> {
						for (Function<URI, Action> ap: actionProviders) {
							Action prototype = ap.apply(uri);
							if (prototype != null) {
								return prototype;
							}
						}
						return null;
					},
					diagnosticConsumer,
					ecoreGenTestProcessorFactory);
			
			EObjectNodeProcessorReflectiveFactory<Object, WidgetFactory, WidgetFactory, Registry<URI>> eObjectNodeProcessorReflectiveFactory = new EObjectNodeProcessorReflectiveFactory<>(ecoreNodeProcessorFactory);
			
			EObjectReflectiveProcessorFactory eObjectReflectiveProcessorFactory = new EObjectReflectiveProcessorFactory(eObjectNodeProcessorReflectiveFactory);
			
			org.nasdanika.html.model.app.graph.Registry<URI> registry = eObjectReflectiveProcessorFactory.createProcessors(nodes, progressMonitor);
			
			List<Throwable> failures = registry
					.getProcessorInfoMap()
					.values()
					.stream()
					.flatMap(pi -> pi.getFailures().stream())
					.collect(Collectors.toList());
			
			
			if (!failures.isEmpty()) {
				NasdanikaException ne = new NasdanikaException("Theres's been " + failures.size() +  " failures during processor creation: " + failures);
				for (Throwable failure: failures) {
					ne.addSuppressed(failure);
				}
				throw ne;
			}
			
			System.out.println(registry.getProcessorInfoMap().size());
		}
		
	}	
	
	@Test
	public void testGenerateNatureModelDoc() throws IOException, DiagnosticException {
		List<EPackage> ePackages = Arrays.asList(EcorePackage.eINSTANCE, TestPackage.eINSTANCE);
		EObjectGraphFactory graphFactory = new EcoreGraphFactory(false); // TODO - to true in a separate test to weed out concurrency problems 
		ProgressMonitor progressMonitor = new NullProgressMonitor(); // new PrintStreamProgressMonitor();
		List<EObjectNode> nodes = graphFactory.createGraph(ePackages, progressMonitor);
		
		Context context = Context.EMPTY_CONTEXT;
		Consumer<Diagnostic> diagnosticConsumer = d -> d.dump(System.out, 0);

		List<Function<URI,Action>> actionProviders = new ArrayList<>();		

//		CoreDocLoader coreDocLoader = new CoreDocLoader(diagnosticConsumer, context, progressMonitor);
//		actionProviders.add(coreDocLoader::getPrototype);
		
		EcoreGenTestProcessorsFactory ecoreGenTestProcessorFactory = new EcoreGenTestProcessorsFactory();
		
		
		EcoreNodeProcessorFactory ecoreNodeProcessorFactory = new EcoreNodeProcessorFactory(
				context, 
				(uri, pm) -> {
					for (Function<URI, Action> ap: actionProviders) {
						Action prototype = ap.apply(uri);
						if (prototype != null) {
							return prototype;
						}
					}
					return null;
				},
				diagnosticConsumer,
				ecoreGenTestProcessorFactory);
		
		EObjectNodeProcessorReflectiveFactory<Object, WidgetFactory, WidgetFactory, Registry<URI>> eObjectNodeProcessorReflectiveFactory = new EObjectNodeProcessorReflectiveFactory<>(ecoreNodeProcessorFactory);
		
		EObjectReflectiveProcessorFactory eObjectReflectiveProcessorFactory = new EObjectReflectiveProcessorFactory(eObjectNodeProcessorReflectiveFactory);
		
		org.nasdanika.html.model.app.graph.Registry<URI> registry = eObjectReflectiveProcessorFactory.createProcessors(nodes, progressMonitor);
		
		List<Throwable> failures = registry
				.getProcessorInfoMap()
				.values()
				.stream()
				.flatMap(pi -> pi.getFailures().stream())
				.collect(Collectors.toList());
		
		if (!failures.isEmpty()) {
			NasdanikaException ne = new NasdanikaException("Theres's been " + failures.size() +  " failures during processor creation: " + failures);
			for (Throwable failure: failures) {
				ne.addSuppressed(failure);
			}
			throw ne;
		}						
		
		URINodeProcessor testProcessor = null;
		Collection<Throwable> resolveFailures = new ArrayList<>();		
		URI baseActionURI = URI.createURI("tmp-https://test.nasdanika.org/");
		
		Map<EPackage, URI> packageURIMap = Map.ofEntries(
			Map.entry(EcorePackage.eINSTANCE, URI.createURI("https://ecore.nasdanika.org/")),			
			Map.entry(org.nasdanika.ncore.NcorePackage.eINSTANCE, URI.createURI("https://docs.nasdanika.org/core/ncore/model/")),				
			Map.entry(TestPackage.eINSTANCE, URI.createURI("test/").resolve(baseActionURI))	
		);
		
		for (EPackage topLevelPackage: ePackages) {
			for (Entry<Element, ProcessorInfo<Object, Registry<URI>>> re: registry.getProcessorInfoMap().entrySet()) {
				Element element = re.getKey();
				if (element instanceof EObjectNode) {
					EObjectNode eObjNode = (EObjectNode) element;
					EObject target = eObjNode.getTarget();
					if (target == topLevelPackage) {
						ProcessorInfo<Object, Registry<URI>> info = re.getValue();
						Object processor = info.getProcessor();
						if (processor instanceof URINodeProcessor) {
							URINodeProcessor uriNodeProcessor = (URINodeProcessor) processor;
							uriNodeProcessor.resolve(packageURIMap.get(topLevelPackage), progressMonitor);
							
							if (topLevelPackage == TestPackage.eINSTANCE) { 							
								testProcessor = uriNodeProcessor;
							}
						}
					}
				}
			}			
		}
		
		if (!resolveFailures.isEmpty()) {
			NasdanikaException ne = new NasdanikaException("Theres's been " + resolveFailures.size() +  " failures during URI resolution: " + resolveFailures);
			for (Throwable failure: resolveFailures) {
				ne.addSuppressed(failure);
			}
			throw ne;
		}								
		
		ResourceSet actionModelsResourceSet = new ResourceSetImpl();
		actionModelsResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		File actionModelsDir = new File("target\\action-models\\");
		actionModelsDir.mkdirs();
		
		File output = new File(actionModelsDir, "test.xmi");
		Resource actionModelResource = actionModelsResourceSet.createResource(URI.createFileURI(output.getAbsolutePath()));
		Collection<Label> labels = testProcessor.createLabelsSupplier().call(progressMonitor, diagnosticConsumer);
		for (Label label: labels) {
			if (label instanceof Link) {
				Link link = (Link) label;
				String location = link.getLocation();
				if (!org.nasdanika.common.Util.isBlank(location)) {
					URI uri = URI.createURI(location);
					if (!uri.isRelative()) {
						link.setLocation("${base-uri}" + uri.deresolve(baseActionURI, true, true, true).toString());
					}
				}
			}
		}
		
		actionModelResource.getContents().addAll(labels);
		actionModelResource.save(null);
				
		String rootActionResource = "actions.yml";
		URI rootActionURI = URI.createFileURI(new File(rootActionResource).getAbsolutePath());//.appendFragment("/");
		
		String pageTemplateResource = "page-template.yml";
		URI pageTemplateURI = URI.createFileURI(new File(pageTemplateResource).getAbsolutePath());//.appendFragment("/");
		
		String siteMapDomain = "https://architecture.nasdanika.org";
		
		ActionSiteGenerator actionSiteGenerator = new ActionSiteGenerator();
		
		Map<String, Collection<String>> errors = actionSiteGenerator.generate(rootActionURI, pageTemplateURI, siteMapDomain, new File("../docs"), new File("target/doc-site-work-dir"), true);
				
		int errorCount = 0;
		for (Entry<String, Collection<String>> ee: errors.entrySet()) {
			System.err.println(ee.getKey());
			for (String error: ee.getValue()) {
				System.err.println("\t" + error);
				++errorCount;
			}
		}
		
		System.out.println("There are " + errorCount + " site errors");
		
		if (errors.size() != 0) {
			throw new ExecutionException("There are problems with pages: " + errorCount);
		}		
	}
	
	private static final String SPEC = """
			test-fox:
			    name: Лиса Патрикеевна
			    eats:
			      test-hare:
			          name: Зайка-Попрыгайка
			          color: WHITE
			    
			""";
	
	@Test
	public void testLoad() {
		URI specURI = ObjectLoaderResource.encode(SPEC, "YAML", null, null);
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		
		Context context = Context.EMPTY_CONTEXT;
		Consumer<Diagnostic> diagnosticConsumer = d -> d.dump(System.out, 0);
		
		Fox fox = (Fox) TestObjectLoaderSupplier.loadObject(specURI, diagnosticConsumer, context, progressMonitor);
		
		System.out.println("Fox name: " + fox.getName());
	}
	
	@Test
	public void testJGraphTAdapter() {
		List<EPackage> ePackages = Arrays.asList(EcorePackage.eINSTANCE, TestPackage.eINSTANCE);
		EObjectGraphFactory graphFactory = new EcoreGraphFactory(true);
		ProgressMonitor progressMonitor = new NullProgressMonitor(); // new PrintStreamProgressMonitor();
		List<EObjectNode> nodes = graphFactory.createGraph(ePackages, progressMonitor);
		
		record EdgeRecord(String source, String target, Collection<Connection> edge) {};
		
		Graph<String, EdgeRecord> graph = new SimpleDirectedGraph<>(EdgeRecord.class);
		JGraphTAdapter<String, EdgeRecord> adapter = new JGraphTAdapter<String, EdgeRecord>(graph, true, true) {

			@Override
			protected String createVertex(Node node) {
				if (node instanceof EClassNode) {
					EClass eClass = ((EClassNode) node).getTarget();
					return "["  + Thread.currentThread().getName() + "] " + eClass.getName() + "@" + eClass.getEPackage().getNsURI();
				}
				return null;
			}
			
			@Override
			protected EdgeRecord createEdge(String source, String target, Collection<Connection> connections) {
				return new EdgeRecord(source, target, connections);
			}
			
		};
		
		for (EObjectNode node: nodes) {
			node.accept(adapter);
		}
		
		DepthFirstIterator<String, EdgeRecord> depthFirstIterator = new DepthFirstIterator<>(graph);		
		depthFirstIterator.forEachRemaining(System.out::println);	
	}
	
	@Test 
	public void testModules() {
		Module module = getClass().getModule();
		ModuleDescriptor descriptor = module.getDescriptor();
		Set<String> packages = module.getPackages();
		System.out.println(packages);
		System.out.println(descriptor.requires());
		
	}
	
}
