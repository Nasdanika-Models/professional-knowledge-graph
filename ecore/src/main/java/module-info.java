import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.professionalknowledgegraph.ecore.ECoreGenProfessionalKnowledgeGraphProcessorsCapabilityFactory;

module org.nasdanika.models.professionalknowledgegraph.ecore {
		
	requires transitive org.nasdanika.models.professionalknowledgegraph;
	requires transitive org.nasdanika.models.ecore.graph;
	requires org.eclipse.emf.common;
	
	exports org.nasdanika.models.professionalknowledgegraph.ecore;
	opens org.nasdanika.models.professionalknowledgegraph.ecore; // For loading resources

	provides CapabilityFactory with	ECoreGenProfessionalKnowledgeGraphProcessorsCapabilityFactory; 		
	
}
