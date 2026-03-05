import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.professionalknowledgegraph.util.ProfessionalKnowledgeGraphEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.professionalknowledgegraph {
	
	exports org.nasdanika.models.professionalknowledgegraph;
	exports org.nasdanika.models.professionalknowledgegraph.impl;
	exports org.nasdanika.models.professionalknowledgegraph.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires org.nasdanika.capability;
	
	provides CapabilityFactory with ProfessionalKnowledgeGraphEPackageResourceSetCapabilityFactory;
	
}