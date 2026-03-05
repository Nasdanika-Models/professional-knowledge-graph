/**
 */
package org.nasdanika.models.professionalknowledgegraph.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.professionalknowledgegraph.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfessionalKnowledgeGraphFactoryImpl extends EFactoryImpl implements ProfessionalKnowledgeGraphFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProfessionalKnowledgeGraphFactory init() {
		try {
			ProfessionalKnowledgeGraphFactory theProfessionalKnowledgeGraphFactory = (ProfessionalKnowledgeGraphFactory)EPackage.Registry.INSTANCE.getEFactory(ProfessionalKnowledgeGraphPackage.eNS_URI);
			if (theProfessionalKnowledgeGraphFactory != null) {
				return theProfessionalKnowledgeGraphFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProfessionalKnowledgeGraphFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfessionalKnowledgeGraphFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH: return createKnowledgeGraph();
			case ProfessionalKnowledgeGraphPackage.PERSON: return createPerson();
			case ProfessionalKnowledgeGraphPackage.PERSON_SKILL: return createPersonSkill();
			case ProfessionalKnowledgeGraphPackage.SKILL: return createSkill();
			case ProfessionalKnowledgeGraphPackage.SKILL_RESOURCE: return createSkillResource();
			case ProfessionalKnowledgeGraphPackage.EDUCATION: return createEducation();
			case ProfessionalKnowledgeGraphPackage.CERTIFICATION: return createCertification();
			case ProfessionalKnowledgeGraphPackage.TRAINING_COURSE: return createTrainingCourse();
			case ProfessionalKnowledgeGraphPackage.ENDORSEMENT: return createEndorsement();
			case ProfessionalKnowledgeGraphPackage.AWARD: return createAward();
			case ProfessionalKnowledgeGraphPackage.PATENT: return createPatent();
			case ProfessionalKnowledgeGraphPackage.POSITION: return createPosition();
			case ProfessionalKnowledgeGraphPackage.ACTIVITY: return createActivity();
			case ProfessionalKnowledgeGraphPackage.PUBLICATION: return createPublication();
			case ProfessionalKnowledgeGraphPackage.PLANNED_ROLE: return createPlannedRole();
			case ProfessionalKnowledgeGraphPackage.ORGANIZATION: return createOrganization();
			case ProfessionalKnowledgeGraphPackage.LOCATION: return createLocation();
			case ProfessionalKnowledgeGraphPackage.EMAIL: return createEmail();
			case ProfessionalKnowledgeGraphPackage.PHONE: return createPhone();
			case ProfessionalKnowledgeGraphPackage.WEB_ADDRESS: return createWebAddress();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ProfessionalKnowledgeGraphPackage.SKILL_MASTERY:
				return createSkillMasteryFromString(eDataType, initialValue);
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL_STATUS:
				return createCredentialStatusFromString(eDataType, initialValue);
			case ProfessionalKnowledgeGraphPackage.EFFORT_STATUS:
				return createEffortStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ProfessionalKnowledgeGraphPackage.SKILL_MASTERY:
				return convertSkillMasteryToString(eDataType, instanceValue);
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL_STATUS:
				return convertCredentialStatusToString(eDataType, instanceValue);
			case ProfessionalKnowledgeGraphPackage.EFFORT_STATUS:
				return convertEffortStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KnowledgeGraph createKnowledgeGraph() {
		KnowledgeGraphImpl knowledgeGraph = new KnowledgeGraphImpl();
		return knowledgeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonSkill createPersonSkill() {
		PersonSkillImpl personSkill = new PersonSkillImpl();
		return personSkill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Skill createSkill() {
		SkillImpl skill = new SkillImpl();
		return skill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkillResource createSkillResource() {
		SkillResourceImpl skillResource = new SkillResourceImpl();
		return skillResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Education createEducation() {
		EducationImpl education = new EducationImpl();
		return education;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Certification createCertification() {
		CertificationImpl certification = new CertificationImpl();
		return certification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrainingCourse createTrainingCourse() {
		TrainingCourseImpl trainingCourse = new TrainingCourseImpl();
		return trainingCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Endorsement createEndorsement() {
		EndorsementImpl endorsement = new EndorsementImpl();
		return endorsement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Award createAward() {
		AwardImpl award = new AwardImpl();
		return award;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Patent createPatent() {
		PatentImpl patent = new PatentImpl();
		return patent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Publication createPublication() {
		PublicationImpl publication = new PublicationImpl();
		return publication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedRole createPlannedRole() {
		PlannedRoleImpl plannedRole = new PlannedRoleImpl();
		return plannedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Email createEmail() {
		EmailImpl email = new EmailImpl();
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Phone createPhone() {
		PhoneImpl phone = new PhoneImpl();
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebAddress createWebAddress() {
		WebAddressImpl webAddress = new WebAddressImpl();
		return webAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillMastery createSkillMasteryFromString(EDataType eDataType, String initialValue) {
		SkillMastery result = SkillMastery.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSkillMasteryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CredentialStatus createCredentialStatusFromString(EDataType eDataType, String initialValue) {
		CredentialStatus result = CredentialStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCredentialStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffortStatus createEffortStatusFromString(EDataType eDataType, String initialValue) {
		EffortStatus result = EffortStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEffortStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProfessionalKnowledgeGraphPackage getProfessionalKnowledgeGraphPackage() {
		return (ProfessionalKnowledgeGraphPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProfessionalKnowledgeGraphPackage getPackage() {
		return ProfessionalKnowledgeGraphPackage.eINSTANCE;
	}

} //ProfessionalKnowledgeGraphFactoryImpl
