module org.nasdanika.html.ecore.gen.test.processors {
		
	requires transitive org.nasdanika.html.ecore.gen.test.model;
	requires transitive org.nasdanika.html.ecore.gen;
	
	exports org.nasdanika.html.ecore.gen.test.processors;
	opens org.nasdanika.html.ecore.gen.test.processors; // For loading resources
	
}
