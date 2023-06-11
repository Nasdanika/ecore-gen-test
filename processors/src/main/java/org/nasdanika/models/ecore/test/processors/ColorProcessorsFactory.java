package org.nasdanika.models.ecore.test.processors;

import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.html.model.app.graph.Registry;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.ecore.graph.processors.EEnumLiteralNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EEnumLiteralNodeProcessorFactory;
import org.nasdanika.models.ecore.graph.processors.EEnumNodeProcessor;
import org.nasdanika.models.ecore.test.TestPackage;

@EClassifierNodeProcessorFactory(classifierID = TestPackage.COLOR)
public class ColorProcessorsFactory {
	
	private Context context = Context.EMPTY_CONTEXT; // TODO - from constructor
		
	/**
	 * Test of different ways to configure action prototype.
	 * @param config
	 * @param prototypeProvider
	 * @param progressMonitor
	 * @return
	 */
	@EClassifierNodeProcessorFactory(
			label = "Цвет",
			description = "Цвет животного"
	)
	public EEnumNodeProcessor createColorProcessor(
			NodeProcessorConfig<Object, WidgetFactory, WidgetFactory, Registry<URI>> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EEnumNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			protected void configureLabel(EObject eObject, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(eObject, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}			
			
		};
	}
	
	@EEnumLiteralNodeProcessorFactory(
			literal = "White",
			label = "Белый",
			description = "White color",
			documentation = "Test of enum literal"
	)
	public EEnumLiteralNodeProcessor createWhiteColorProcessor(
			NodeProcessorConfig<Object, WidgetFactory, WidgetFactory, Registry<URI>> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EEnumLiteralNodeProcessor(config, context, prototypeProvider) {
			
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
