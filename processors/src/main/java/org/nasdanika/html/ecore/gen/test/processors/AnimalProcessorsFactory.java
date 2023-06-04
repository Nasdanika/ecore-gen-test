package org.nasdanika.html.ecore.gen.test.processors;

import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.ecore.gen.processors.EAttributeNodeProcessor;
import org.nasdanika.html.ecore.gen.processors.EClassNodeProcessor;
import org.nasdanika.html.ecore.gen.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.html.ecore.gen.processors.EOperationNodeProcessor;
import org.nasdanika.html.ecore.gen.processors.EOperationNodeProcessorFactory;
import org.nasdanika.html.ecore.gen.processors.EParameterNodeProcessor;
import org.nasdanika.html.ecore.gen.processors.EParameterNodeProcessorFactory;
import org.nasdanika.html.ecore.gen.processors.EStructuralFeatureNodeProcessorFactory;
import org.nasdanika.html.ecore.gen.test.TestPackage;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.html.model.app.graph.Registry;
import org.nasdanika.html.model.app.graph.WidgetFactory;

@EClassifierNodeProcessorFactory(name = "Animal")
public class AnimalProcessorsFactory {
	
	private Context context = Context.EMPTY_CONTEXT; // TODO - from constructor
		
	/**
	 * Test of different ways to configure action prototype.
	 * @param config
	 * @param prototypeProvider
	 * @param progressMonitor
	 * @return
	 */
	@EClassifierNodeProcessorFactory(
			label = "Животное",
			description = "Животные относятся к эукариотам (в клетках имеются ядра). Классическими признаками животных считаются: гетеротрофность (питание готовыми органическими соединениями) и способность активно передвигаться."
	)
	public EClassNodeProcessor createAnimalProcessor(
			NodeProcessorConfig<Object, WidgetFactory, WidgetFactory, Registry<URI>> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EClassNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			protected void configureLabel(EObject eObject, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(eObject, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}			
			
		};
	}
	
	@EStructuralFeatureNodeProcessorFactory(
			featureID = TestPackage.ANIMAL__NAME,
			label = "Имя",
			description = "Имя животного, например 'Мурзик'",
			documentation = "Test of attribute documentation"
	)
	public EAttributeNodeProcessor createAnimalNameProcessor(
			NodeProcessorConfig<Object, WidgetFactory, WidgetFactory, Registry<URI>> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EAttributeNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			protected void configureLabel(EObject eObject, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(eObject, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}
	
	@EOperationNodeProcessorFactory(
			operationID = TestPackage.ANIMAL___EATS__FOOD,
			label = "Ест",
			documentation = "Test of operation documentation"
	)
	public EOperationNodeProcessor createAnimalEatsProcessor(
			NodeProcessorConfig<Object, WidgetFactory, WidgetFactory, Registry<URI>> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EOperationNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			protected void configureLabel(EObject eObject, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(eObject, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}
	
	@EParameterNodeProcessorFactory(
			operationID = TestPackage.ANIMAL___EATS__FOOD,
			name = "food",
			label = "пища",
			description = "Food which animal eats",
			documentation = "Test of parameter documentation"
	)
	public EParameterNodeProcessor createAnimalEatsFoodProcessor(
			NodeProcessorConfig<Object, WidgetFactory, WidgetFactory, Registry<URI>> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EParameterNodeProcessor(config, context, prototypeProvider) {
			
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
