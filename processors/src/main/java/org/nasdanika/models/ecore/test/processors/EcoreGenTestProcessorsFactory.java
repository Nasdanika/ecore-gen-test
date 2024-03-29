package org.nasdanika.models.ecore.test.processors;

import java.util.function.BiConsumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Reflector.Factory;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessorFactory;
import org.nasdanika.models.ecore.test.TestPackage;

@EPackageNodeProcessorFactory(nsURI = TestPackage.eNS_URI)
public class EcoreGenTestProcessorsFactory {

	private Context context = Context.EMPTY_CONTEXT; // TODO - from constructor	

	@Factory
	public final AnimalProcessorsFactory animalProcessorsFactory;

	@Factory
	public final ColorProcessorsFactory colorProcessorsFactory;

	@Factory
	public final FoxProcessorsFactory foxProcessorsFactory;
	
	public EcoreGenTestProcessorsFactory(Context context) {
		animalProcessorsFactory = new AnimalProcessorsFactory(context);
		colorProcessorsFactory = new ColorProcessorsFactory(context);
		foxProcessorsFactory = new FoxProcessorsFactory(context);
	}
	
	/**
	 * Test of different ways to configure action prototype.
	 * @param config
	 * @param prototypeProvider
	 * @param progressMonitor
	 * @return
	 */
	@EPackageNodeProcessorFactory(
			label = "Trum",
			//actionPrototypeRef = "test-package.yml",
			actionPrototype = """
                    app-action:
                        text: Param
                        icon: fas fa-user					
					
					
					""",
			icon = "fas fa-users",
			description = "My description",
			documentation =  """
				# Look at this!
				
				```drawio-resource
				aws.drawio
				```
						
				"""
	)
	public EPackageNodeProcessor createEPackageProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EPackageNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			protected void configureLabel(EObject eObject, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(eObject, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}	

}
