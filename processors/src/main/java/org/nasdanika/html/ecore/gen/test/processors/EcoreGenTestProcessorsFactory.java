package org.nasdanika.html.ecore.gen.test.processors;

import org.eclipse.emf.common.util.URI;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.ecore.gen.processors.EPackageNodeProcessor;
import org.nasdanika.html.ecore.gen.processors.EPackageNodeProcessorFactory;
import org.nasdanika.html.ecore.gen.test.TestPackage;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.graph.Registry;
import org.nasdanika.html.model.app.graph.WidgetFactory;

public class EcoreGenTestProcessorsFactory {
	
	private Context context = Context.EMPTY_CONTEXT; // TODO - from constructor
	
	@EPackageNodeProcessorFactory(TestPackage.eNS_URI)
	public EPackageNodeProcessor createEPackageProcessor(NodeProcessorConfig<Object, WidgetFactory, WidgetFactory, Registry<URI>> config, java.util.function.Function<ProgressMonitor, Action> prototypeProvider) {		
		return new EPackageNodeProcessor(config, context, prototypeProvider);
	}		
	

}
