package org.nasdanika.models.professionalknowledgegraph.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.capability.emf.EPackageCapabilityFactory;
import org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage;

public class ProfessionalKnowledgeGraphEPackageResourceSetCapabilityFactory extends EPackageCapabilityFactory {

	@Override
	protected EPackage getEPackage() {
		return ProfessionalKnowledgeGraphPackage.eINSTANCE;
	}

	@Override
	protected URI getDocumentationURI() {
		return URI.createURI("https://professional-knowledge-graph.models.nasdanika.org/");
	}

}
