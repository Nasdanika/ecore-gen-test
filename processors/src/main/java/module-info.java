module org.nasdanika.models.ecore.test.processors {
		
	requires transitive org.nasdanika.models.ecore.test.model;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.ecore.test.processors;
	opens org.nasdanika.models.ecore.test.processors; // For loading resources
	
}
