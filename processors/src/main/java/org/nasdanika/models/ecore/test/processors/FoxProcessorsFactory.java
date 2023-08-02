package org.nasdanika.models.ecore.test.processors;

import java.util.function.BiConsumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EmfUtil.EModelElementDocumentation;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EClassNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.ecore.test.TestPackage;

@EClassifierNodeProcessorFactory(classifierID = TestPackage.FOX)
public class FoxProcessorsFactory {
	
	private Context context;
	
	public FoxProcessorsFactory(Context context) {
		this.context = context;
	}
	
	/**
	 * Test of different ways to configure action prototype.
	 * @param config
	 * @param prototypeProvider
	 * @param progressMonitor
	 * @return
	 */
	@EClassifierNodeProcessorFactory(
			label = "Лиса",
			description = "Полифилетическая группа млекопитающих из семейства псовых отряда хищных",
			documentation = """
					В старославянском языке прилагательному «лисый» соответствовало определение желтоватого, рыжего и желтовато-оранжевого цвета, 
					характерного для окраса широко распространенной в Евразии лисы обыкновенной. Общее название нескольких видов млекопитающих семейства псовые. 
					Только 10 видов этой группы относят к роду собственно лисиц (лат. Vulpes). 
					Наиболее известный и распространённый представитель — обыкновенная лисица (Vulpes vulpes). 
					Лисицы встречаются в фольклоре многих народов по всему миру.
					""",
			icon = "https://img.icons8.com/fluency-systems-regular/16/fox.svg"
	)
	public EClassNodeProcessor createFoxProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
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
			
			@Override
			protected EModelElementDocumentation getLoadDocumentation() {
				return new EModelElementDocumentation("""
						Some ``documentation``:
						
						```yaml
						key: value
						```
						
						""", 
						Util.createClassURI(getClass()));
			}
						
		};
	}	

}
