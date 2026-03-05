/**
 */
package org.nasdanika.models.professionalknowledgegraph.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.professionalknowledgegraph.Activity;
import org.nasdanika.models.professionalknowledgegraph.Award;
import org.nasdanika.models.professionalknowledgegraph.Certification;
import org.nasdanika.models.professionalknowledgegraph.ContactMethod;
import org.nasdanika.models.professionalknowledgegraph.Credential;
import org.nasdanika.models.professionalknowledgegraph.CredentialStatus;
import org.nasdanika.models.professionalknowledgegraph.Education;
import org.nasdanika.models.professionalknowledgegraph.Effort;
import org.nasdanika.models.professionalknowledgegraph.EffortStatus;
import org.nasdanika.models.professionalknowledgegraph.Email;
import org.nasdanika.models.professionalknowledgegraph.Endorsement;
import org.nasdanika.models.professionalknowledgegraph.KnowledgeGraph;
import org.nasdanika.models.professionalknowledgegraph.Location;
import org.nasdanika.models.professionalknowledgegraph.Organization;
import org.nasdanika.models.professionalknowledgegraph.Patent;
import org.nasdanika.models.professionalknowledgegraph.Person;
import org.nasdanika.models.professionalknowledgegraph.PersonSkill;
import org.nasdanika.models.professionalknowledgegraph.Phone;
import org.nasdanika.models.professionalknowledgegraph.PlannedRole;
import org.nasdanika.models.professionalknowledgegraph.Position;
import org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphFactory;
import org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage;
import org.nasdanika.models.professionalknowledgegraph.Publication;
import org.nasdanika.models.professionalknowledgegraph.Skill;
import org.nasdanika.models.professionalknowledgegraph.SkillMastery;
import org.nasdanika.models.professionalknowledgegraph.SkillResource;
import org.nasdanika.models.professionalknowledgegraph.TrainingCourse;
import org.nasdanika.models.professionalknowledgegraph.WebAddress;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfessionalKnowledgeGraphPackageImpl extends EPackageImpl implements ProfessionalKnowledgeGraphPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personSkillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass credentialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass educationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainingCourseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endorsementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass effortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plannedRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum skillMasteryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum credentialStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum effortStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProfessionalKnowledgeGraphPackageImpl() {
		super(eNS_URI, ProfessionalKnowledgeGraphFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ProfessionalKnowledgeGraphPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProfessionalKnowledgeGraphPackage init() {
		if (isInited) return (ProfessionalKnowledgeGraphPackage)EPackage.Registry.INSTANCE.getEPackage(ProfessionalKnowledgeGraphPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProfessionalKnowledgeGraphPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProfessionalKnowledgeGraphPackageImpl theProfessionalKnowledgeGraphPackage = registeredProfessionalKnowledgeGraphPackage instanceof ProfessionalKnowledgeGraphPackageImpl ? (ProfessionalKnowledgeGraphPackageImpl)registeredProfessionalKnowledgeGraphPackage : new ProfessionalKnowledgeGraphPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theProfessionalKnowledgeGraphPackage.createPackageContents();

		// Initialize created meta-data
		theProfessionalKnowledgeGraphPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProfessionalKnowledgeGraphPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProfessionalKnowledgeGraphPackage.eNS_URI, theProfessionalKnowledgeGraphPackage);
		return theProfessionalKnowledgeGraphPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKnowledgeGraph() {
		return knowledgeGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKnowledgeGraph_Name() {
		return (EAttribute)knowledgeGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKnowledgeGraph_Description() {
		return (EAttribute)knowledgeGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKnowledgeGraph_People() {
		return (EReference)knowledgeGraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKnowledgeGraph_Skills() {
		return (EReference)knowledgeGraphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKnowledgeGraph_Organizations() {
		return (EReference)knowledgeGraphEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKnowledgeGraph_Locations() {
		return (EReference)knowledgeGraphEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Name() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Summary() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_ContactMethods() {
		return (EReference)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_Network() {
		return (EReference)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_PersonSkills() {
		return (EReference)personEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_Credentials() {
		return (EReference)personEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_Efforts() {
		return (EReference)personEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_Locations() {
		return (EReference)personEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersonSkill() {
		return personSkillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonSkill_Skill() {
		return (EReference)personSkillEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonSkill_Mastery() {
		return (EAttribute)personSkillEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonSkill_Desired() {
		return (EAttribute)personSkillEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonSkill_Notes() {
		return (EAttribute)personSkillEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSkill() {
		return skillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSkill_Name() {
		return (EAttribute)skillEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSkill_Description() {
		return (EAttribute)skillEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSkill_Skills() {
		return (EReference)skillEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSkill_RelatedSkills() {
		return (EReference)skillEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSkill_Prerequisites() {
		return (EReference)skillEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSkill_Resources() {
		return (EReference)skillEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSkillResource() {
		return skillResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSkillResource_Name() {
		return (EAttribute)skillResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSkillResource_Description() {
		return (EAttribute)skillResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSkillResource_Url() {
		return (EAttribute)skillResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCredential() {
		return credentialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCredential_Name() {
		return (EAttribute)credentialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCredential_Description() {
		return (EAttribute)credentialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCredential_Date() {
		return (EAttribute)credentialEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCredential_Url() {
		return (EAttribute)credentialEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCredential_Status() {
		return (EAttribute)credentialEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCredential_Skills() {
		return (EReference)credentialEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEducation() {
		return educationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEducation_Institution() {
		return (EAttribute)educationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEducation_Degree() {
		return (EAttribute)educationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEducation_FieldOfStudy() {
		return (EAttribute)educationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEducation_StartDate() {
		return (EAttribute)educationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEducation_Location() {
		return (EReference)educationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCertification() {
		return certificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertification_Issuer() {
		return (EAttribute)certificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertification_CredentialId() {
		return (EAttribute)certificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertification_Expires() {
		return (EAttribute)certificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrainingCourse() {
		return trainingCourseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrainingCourse_Provider() {
		return (EAttribute)trainingCourseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrainingCourse_CourseUrl() {
		return (EAttribute)trainingCourseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrainingCourse_CertificateUrl() {
		return (EAttribute)trainingCourseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndorsement() {
		return endorsementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEndorsement_EndorsedBy() {
		return (EReference)endorsementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndorsement_Text() {
		return (EAttribute)endorsementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAward() {
		return awardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAward_Issuer() {
		return (EAttribute)awardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPatent() {
		return patentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatent_PatentNumber() {
		return (EAttribute)patentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatent_Inventors() {
		return (EReference)patentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEffort() {
		return effortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEffort_Name() {
		return (EAttribute)effortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEffort_Description() {
		return (EAttribute)effortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEffort_StartDate() {
		return (EAttribute)effortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEffort_EndDate() {
		return (EAttribute)effortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEffort_Status() {
		return (EAttribute)effortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEffort_Skills() {
		return (EReference)effortEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEffort_Collaborators() {
		return (EReference)effortEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEffort_PlannedRoles() {
		return (EReference)effortEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Title() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPosition_Organization() {
		return (EReference)positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPosition_Location() {
		return (EReference)positionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPosition_Activities() {
		return (EReference)positionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_Outcomes() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublication() {
		return publicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublication_Publisher() {
		return (EAttribute)publicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublication_PublicationUrl() {
		return (EAttribute)publicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublication_Isbn() {
		return (EAttribute)publicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublication_Doi() {
		return (EAttribute)publicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlannedRole() {
		return plannedRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlannedRole_Title() {
		return (EAttribute)plannedRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlannedRole_Description() {
		return (EAttribute)plannedRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlannedRole_Skills() {
		return (EReference)plannedRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlannedRole_Count() {
		return (EAttribute)plannedRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrganization() {
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganization_Name() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganization_Description() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganization_Industry() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganization_Url() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganization_Location() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Country() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_State() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_City() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactMethod() {
		return contactMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactMethod_Name() {
		return (EAttribute)contactMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactMethod_Description() {
		return (EAttribute)contactMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmail() {
		return emailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmail_Address() {
		return (EAttribute)emailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhone() {
		return phoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhone_CountryCode() {
		return (EAttribute)phoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhone_Number() {
		return (EAttribute)phoneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhone_Extension() {
		return (EAttribute)phoneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWebAddress() {
		return webAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebAddress_Url() {
		return (EAttribute)webAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebAddress_Platform() {
		return (EAttribute)webAddressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSkillMastery() {
		return skillMasteryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCredentialStatus() {
		return credentialStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEffortStatus() {
		return effortStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProfessionalKnowledgeGraphFactory getProfessionalKnowledgeGraphFactory() {
		return (ProfessionalKnowledgeGraphFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		knowledgeGraphEClass = createEClass(KNOWLEDGE_GRAPH);
		createEAttribute(knowledgeGraphEClass, KNOWLEDGE_GRAPH__NAME);
		createEAttribute(knowledgeGraphEClass, KNOWLEDGE_GRAPH__DESCRIPTION);
		createEReference(knowledgeGraphEClass, KNOWLEDGE_GRAPH__PEOPLE);
		createEReference(knowledgeGraphEClass, KNOWLEDGE_GRAPH__SKILLS);
		createEReference(knowledgeGraphEClass, KNOWLEDGE_GRAPH__ORGANIZATIONS);
		createEReference(knowledgeGraphEClass, KNOWLEDGE_GRAPH__LOCATIONS);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__NAME);
		createEAttribute(personEClass, PERSON__SUMMARY);
		createEReference(personEClass, PERSON__CONTACT_METHODS);
		createEReference(personEClass, PERSON__NETWORK);
		createEReference(personEClass, PERSON__PERSON_SKILLS);
		createEReference(personEClass, PERSON__CREDENTIALS);
		createEReference(personEClass, PERSON__EFFORTS);
		createEReference(personEClass, PERSON__LOCATIONS);

		personSkillEClass = createEClass(PERSON_SKILL);
		createEReference(personSkillEClass, PERSON_SKILL__SKILL);
		createEAttribute(personSkillEClass, PERSON_SKILL__MASTERY);
		createEAttribute(personSkillEClass, PERSON_SKILL__DESIRED);
		createEAttribute(personSkillEClass, PERSON_SKILL__NOTES);

		skillEClass = createEClass(SKILL);
		createEAttribute(skillEClass, SKILL__NAME);
		createEAttribute(skillEClass, SKILL__DESCRIPTION);
		createEReference(skillEClass, SKILL__SKILLS);
		createEReference(skillEClass, SKILL__RELATED_SKILLS);
		createEReference(skillEClass, SKILL__PREREQUISITES);
		createEReference(skillEClass, SKILL__RESOURCES);

		skillResourceEClass = createEClass(SKILL_RESOURCE);
		createEAttribute(skillResourceEClass, SKILL_RESOURCE__NAME);
		createEAttribute(skillResourceEClass, SKILL_RESOURCE__DESCRIPTION);
		createEAttribute(skillResourceEClass, SKILL_RESOURCE__URL);

		credentialEClass = createEClass(CREDENTIAL);
		createEAttribute(credentialEClass, CREDENTIAL__NAME);
		createEAttribute(credentialEClass, CREDENTIAL__DESCRIPTION);
		createEAttribute(credentialEClass, CREDENTIAL__DATE);
		createEAttribute(credentialEClass, CREDENTIAL__URL);
		createEAttribute(credentialEClass, CREDENTIAL__STATUS);
		createEReference(credentialEClass, CREDENTIAL__SKILLS);

		educationEClass = createEClass(EDUCATION);
		createEAttribute(educationEClass, EDUCATION__INSTITUTION);
		createEAttribute(educationEClass, EDUCATION__DEGREE);
		createEAttribute(educationEClass, EDUCATION__FIELD_OF_STUDY);
		createEAttribute(educationEClass, EDUCATION__START_DATE);
		createEReference(educationEClass, EDUCATION__LOCATION);

		certificationEClass = createEClass(CERTIFICATION);
		createEAttribute(certificationEClass, CERTIFICATION__ISSUER);
		createEAttribute(certificationEClass, CERTIFICATION__CREDENTIAL_ID);
		createEAttribute(certificationEClass, CERTIFICATION__EXPIRES);

		trainingCourseEClass = createEClass(TRAINING_COURSE);
		createEAttribute(trainingCourseEClass, TRAINING_COURSE__PROVIDER);
		createEAttribute(trainingCourseEClass, TRAINING_COURSE__COURSE_URL);
		createEAttribute(trainingCourseEClass, TRAINING_COURSE__CERTIFICATE_URL);

		endorsementEClass = createEClass(ENDORSEMENT);
		createEReference(endorsementEClass, ENDORSEMENT__ENDORSED_BY);
		createEAttribute(endorsementEClass, ENDORSEMENT__TEXT);

		awardEClass = createEClass(AWARD);
		createEAttribute(awardEClass, AWARD__ISSUER);

		patentEClass = createEClass(PATENT);
		createEAttribute(patentEClass, PATENT__PATENT_NUMBER);
		createEReference(patentEClass, PATENT__INVENTORS);

		effortEClass = createEClass(EFFORT);
		createEAttribute(effortEClass, EFFORT__NAME);
		createEAttribute(effortEClass, EFFORT__DESCRIPTION);
		createEAttribute(effortEClass, EFFORT__START_DATE);
		createEAttribute(effortEClass, EFFORT__END_DATE);
		createEAttribute(effortEClass, EFFORT__STATUS);
		createEReference(effortEClass, EFFORT__SKILLS);
		createEReference(effortEClass, EFFORT__COLLABORATORS);
		createEReference(effortEClass, EFFORT__PLANNED_ROLES);

		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__TITLE);
		createEReference(positionEClass, POSITION__ORGANIZATION);
		createEReference(positionEClass, POSITION__LOCATION);
		createEReference(positionEClass, POSITION__ACTIVITIES);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__OUTCOMES);

		publicationEClass = createEClass(PUBLICATION);
		createEAttribute(publicationEClass, PUBLICATION__PUBLISHER);
		createEAttribute(publicationEClass, PUBLICATION__PUBLICATION_URL);
		createEAttribute(publicationEClass, PUBLICATION__ISBN);
		createEAttribute(publicationEClass, PUBLICATION__DOI);

		plannedRoleEClass = createEClass(PLANNED_ROLE);
		createEAttribute(plannedRoleEClass, PLANNED_ROLE__TITLE);
		createEAttribute(plannedRoleEClass, PLANNED_ROLE__DESCRIPTION);
		createEReference(plannedRoleEClass, PLANNED_ROLE__SKILLS);
		createEAttribute(plannedRoleEClass, PLANNED_ROLE__COUNT);

		organizationEClass = createEClass(ORGANIZATION);
		createEAttribute(organizationEClass, ORGANIZATION__NAME);
		createEAttribute(organizationEClass, ORGANIZATION__DESCRIPTION);
		createEAttribute(organizationEClass, ORGANIZATION__INDUSTRY);
		createEAttribute(organizationEClass, ORGANIZATION__URL);
		createEReference(organizationEClass, ORGANIZATION__LOCATION);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__COUNTRY);
		createEAttribute(locationEClass, LOCATION__STATE);
		createEAttribute(locationEClass, LOCATION__CITY);

		contactMethodEClass = createEClass(CONTACT_METHOD);
		createEAttribute(contactMethodEClass, CONTACT_METHOD__NAME);
		createEAttribute(contactMethodEClass, CONTACT_METHOD__DESCRIPTION);

		emailEClass = createEClass(EMAIL);
		createEAttribute(emailEClass, EMAIL__ADDRESS);

		phoneEClass = createEClass(PHONE);
		createEAttribute(phoneEClass, PHONE__COUNTRY_CODE);
		createEAttribute(phoneEClass, PHONE__NUMBER);
		createEAttribute(phoneEClass, PHONE__EXTENSION);

		webAddressEClass = createEClass(WEB_ADDRESS);
		createEAttribute(webAddressEClass, WEB_ADDRESS__URL);
		createEAttribute(webAddressEClass, WEB_ADDRESS__PLATFORM);

		// Create enums
		skillMasteryEEnum = createEEnum(SKILL_MASTERY);
		credentialStatusEEnum = createEEnum(CREDENTIAL_STATUS);
		effortStatusEEnum = createEEnum(EFFORT_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		educationEClass.getESuperTypes().add(this.getCredential());
		certificationEClass.getESuperTypes().add(this.getCredential());
		trainingCourseEClass.getESuperTypes().add(this.getCredential());
		endorsementEClass.getESuperTypes().add(this.getCredential());
		awardEClass.getESuperTypes().add(this.getCredential());
		patentEClass.getESuperTypes().add(this.getCredential());
		positionEClass.getESuperTypes().add(this.getEffort());
		activityEClass.getESuperTypes().add(this.getEffort());
		publicationEClass.getESuperTypes().add(this.getEffort());
		emailEClass.getESuperTypes().add(this.getContactMethod());
		phoneEClass.getESuperTypes().add(this.getContactMethod());
		webAddressEClass.getESuperTypes().add(this.getContactMethod());

		// Initialize classes, features, and operations; add parameters
		initEClass(knowledgeGraphEClass, KnowledgeGraph.class, "KnowledgeGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKnowledgeGraph_Name(), ecorePackage.getEString(), "name", null, 0, 1, KnowledgeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKnowledgeGraph_Description(), ecorePackage.getEString(), "description", null, 0, 1, KnowledgeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledgeGraph_People(), this.getPerson(), null, "people", null, 0, -1, KnowledgeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledgeGraph_Skills(), this.getSkill(), null, "skills", null, 0, -1, KnowledgeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledgeGraph_Organizations(), this.getOrganization(), null, "organizations", null, 0, -1, KnowledgeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledgeGraph_Locations(), this.getLocation(), null, "locations", null, 0, -1, KnowledgeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_ContactMethods(), this.getContactMethod(), null, "contactMethods", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Network(), this.getPerson(), null, "network", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_PersonSkills(), this.getPersonSkill(), null, "personSkills", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Credentials(), this.getCredential(), null, "credentials", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Efforts(), this.getEffort(), null, "efforts", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Locations(), this.getLocation(), null, "locations", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personSkillEClass, PersonSkill.class, "PersonSkill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonSkill_Skill(), this.getSkill(), null, "skill", null, 1, 1, PersonSkill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonSkill_Mastery(), this.getSkillMastery(), "mastery", null, 0, 1, PersonSkill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonSkill_Desired(), ecorePackage.getEBoolean(), "desired", null, 0, 1, PersonSkill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonSkill_Notes(), ecorePackage.getEString(), "notes", null, 0, 1, PersonSkill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skillEClass, Skill.class, "Skill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkill_Name(), ecorePackage.getEString(), "name", null, 0, 1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkill_Description(), ecorePackage.getEString(), "description", null, 0, 1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSkill_Skills(), this.getSkill(), null, "skills", null, 0, -1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSkill_RelatedSkills(), this.getSkill(), null, "relatedSkills", null, 0, -1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSkill_Prerequisites(), this.getSkill(), null, "prerequisites", null, 0, -1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSkill_Resources(), this.getSkillResource(), null, "resources", null, 0, -1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skillResourceEClass, SkillResource.class, "SkillResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkillResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, SkillResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkillResource_Description(), ecorePackage.getEString(), "description", null, 0, 1, SkillResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkillResource_Url(), ecorePackage.getEString(), "url", null, 0, 1, SkillResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(credentialEClass, Credential.class, "Credential", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCredential_Name(), ecorePackage.getEString(), "name", null, 0, 1, Credential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCredential_Description(), ecorePackage.getEString(), "description", null, 0, 1, Credential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCredential_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Credential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCredential_Url(), ecorePackage.getEString(), "url", null, 0, 1, Credential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCredential_Status(), this.getCredentialStatus(), "status", null, 0, 1, Credential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCredential_Skills(), this.getSkill(), null, "skills", null, 0, -1, Credential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(educationEClass, Education.class, "Education", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEducation_Institution(), ecorePackage.getEString(), "institution", null, 0, 1, Education.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEducation_Degree(), ecorePackage.getEString(), "degree", null, 0, 1, Education.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEducation_FieldOfStudy(), ecorePackage.getEString(), "fieldOfStudy", null, 0, 1, Education.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEducation_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Education.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEducation_Location(), this.getLocation(), null, "location", null, 0, 1, Education.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(certificationEClass, Certification.class, "Certification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCertification_Issuer(), ecorePackage.getEString(), "issuer", null, 0, 1, Certification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertification_CredentialId(), ecorePackage.getEString(), "credentialId", null, 0, 1, Certification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertification_Expires(), ecorePackage.getEDate(), "expires", null, 0, 1, Certification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainingCourseEClass, TrainingCourse.class, "TrainingCourse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrainingCourse_Provider(), ecorePackage.getEString(), "provider", null, 0, 1, TrainingCourse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainingCourse_CourseUrl(), ecorePackage.getEString(), "courseUrl", null, 0, 1, TrainingCourse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainingCourse_CertificateUrl(), ecorePackage.getEString(), "certificateUrl", null, 0, 1, TrainingCourse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endorsementEClass, Endorsement.class, "Endorsement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndorsement_EndorsedBy(), this.getPerson(), null, "endorsedBy", null, 0, 1, Endorsement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndorsement_Text(), ecorePackage.getEString(), "text", null, 0, 1, Endorsement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awardEClass, Award.class, "Award", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAward_Issuer(), ecorePackage.getEString(), "issuer", null, 0, 1, Award.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patentEClass, Patent.class, "Patent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatent_PatentNumber(), ecorePackage.getEString(), "patentNumber", null, 0, 1, Patent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatent_Inventors(), this.getPerson(), null, "inventors", null, 0, -1, Patent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(effortEClass, Effort.class, "Effort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEffort_Name(), ecorePackage.getEString(), "name", null, 0, 1, Effort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffort_Description(), ecorePackage.getEString(), "description", null, 0, 1, Effort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffort_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Effort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffort_EndDate(), ecorePackage.getEDate(), "endDate", null, 0, 1, Effort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffort_Status(), this.getEffortStatus(), "status", null, 0, 1, Effort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEffort_Skills(), this.getSkill(), null, "skills", null, 0, -1, Effort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEffort_Collaborators(), this.getPerson(), null, "collaborators", null, 0, -1, Effort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEffort_PlannedRoles(), this.getPlannedRole(), null, "plannedRoles", null, 0, -1, Effort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_Title(), ecorePackage.getEString(), "title", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPosition_Organization(), this.getOrganization(), null, "organization", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPosition_Location(), this.getLocation(), null, "location", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPosition_Activities(), this.getActivity(), null, "activities", null, 0, -1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_Outcomes(), ecorePackage.getEString(), "outcomes", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicationEClass, Publication.class, "Publication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublication_Publisher(), ecorePackage.getEString(), "publisher", null, 0, 1, Publication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublication_PublicationUrl(), ecorePackage.getEString(), "publicationUrl", null, 0, 1, Publication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublication_Isbn(), ecorePackage.getEString(), "isbn", null, 0, 1, Publication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublication_Doi(), ecorePackage.getEString(), "doi", null, 0, 1, Publication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plannedRoleEClass, PlannedRole.class, "PlannedRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlannedRole_Title(), ecorePackage.getEString(), "title", null, 0, 1, PlannedRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlannedRole_Description(), ecorePackage.getEString(), "description", null, 0, 1, PlannedRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlannedRole_Skills(), this.getSkill(), null, "skills", null, 0, -1, PlannedRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlannedRole_Count(), ecorePackage.getEInt(), "count", "1", 0, 1, PlannedRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganization_Name(), ecorePackage.getEString(), "name", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganization_Description(), ecorePackage.getEString(), "description", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganization_Industry(), ecorePackage.getEString(), "industry", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganization_Url(), ecorePackage.getEString(), "url", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganization_Location(), this.getLocation(), null, "location", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Country(), ecorePackage.getEString(), "country", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_State(), ecorePackage.getEString(), "state", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_City(), ecorePackage.getEString(), "city", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactMethodEClass, ContactMethod.class, "ContactMethod", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContactMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContactMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactMethod_Description(), ecorePackage.getEString(), "description", null, 0, 1, ContactMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emailEClass, Email.class, "Email", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmail_Address(), ecorePackage.getEString(), "address", null, 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phoneEClass, Phone.class, "Phone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhone_CountryCode(), ecorePackage.getEString(), "countryCode", null, 0, 1, Phone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhone_Number(), ecorePackage.getEString(), "number", null, 0, 1, Phone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhone_Extension(), ecorePackage.getEString(), "extension", null, 0, 1, Phone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webAddressEClass, WebAddress.class, "WebAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebAddress_Url(), ecorePackage.getEString(), "url", null, 0, 1, WebAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAddress_Platform(), ecorePackage.getEString(), "platform", null, 0, 1, WebAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(skillMasteryEEnum, SkillMastery.class, "SkillMastery");
		addEEnumLiteral(skillMasteryEEnum, SkillMastery.HEARD_OF);
		addEEnumLiteral(skillMasteryEEnum, SkillMastery.AWARE);
		addEEnumLiteral(skillMasteryEEnum, SkillMastery.FAMILIAR);
		addEEnumLiteral(skillMasteryEEnum, SkillMastery.PROFICIENT);
		addEEnumLiteral(skillMasteryEEnum, SkillMastery.EXPERT);

		initEEnum(credentialStatusEEnum, CredentialStatus.class, "CredentialStatus");
		addEEnumLiteral(credentialStatusEEnum, CredentialStatus.PLANNED);
		addEEnumLiteral(credentialStatusEEnum, CredentialStatus.IN_PROGRESS);
		addEEnumLiteral(credentialStatusEEnum, CredentialStatus.OBTAINED);
		addEEnumLiteral(credentialStatusEEnum, CredentialStatus.ACTIVE);
		addEEnumLiteral(credentialStatusEEnum, CredentialStatus.EXPIRED);

		initEEnum(effortStatusEEnum, EffortStatus.class, "EffortStatus");
		addEEnumLiteral(effortStatusEEnum, EffortStatus.IDEA);
		addEEnumLiteral(effortStatusEEnum, EffortStatus.PLANNED);
		addEEnumLiteral(effortStatusEEnum, EffortStatus.IN_PROGRESS);
		addEEnumLiteral(effortStatusEEnum, EffortStatus.COMPLETED);
		addEEnumLiteral(effortStatusEEnum, EffortStatus.ABANDONED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "A model/ontology of a professional knowledge graph that allows users to capture detailed information about their professional experience.\nIt can be used to generate tailored resumes and power professional digital twins.\n\nThe model captures:\n* People and their professional networks\n* Skills with mastery levels and hierarchy\n* Credentials (education, certifications, training, endorsements, awards, patents)\n* Work/engagement history (organizations, positions, activities/projects)\n* Locations"
		   });
		addAnnotation
		  (skillMasteryEEnum,
		   source,
		   new String[] {
			   "documentation", "Level of mastery a person has in a skill, ranging from minimal awareness to deep expertise."
		   });
		addAnnotation
		  (skillMasteryEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "The person has heard of the skill but has no hands-on experience."
		   });
		addAnnotation
		  (skillMasteryEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "The person is aware of the skill and understands its general purpose and capabilities."
		   });
		addAnnotation
		  (skillMasteryEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "The person has some hands-on experience with the skill."
		   });
		addAnnotation
		  (skillMasteryEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "The person uses the skill regularly and effectively in professional contexts."
		   });
		addAnnotation
		  (skillMasteryEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "The person has deep, comprehensive expertise in the skill and can guide others."
		   });
		addAnnotation
		  (credentialStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Status of a credential such as a certification, degree, or course completion."
		   });
		addAnnotation
		  (credentialStatusEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "The credential is desired/planned but not yet started."
		   });
		addAnnotation
		  (credentialStatusEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "The person is currently working toward obtaining this credential."
		   });
		addAnnotation
		  (credentialStatusEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "The credential has been obtained."
		   });
		addAnnotation
		  (credentialStatusEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "The credential is currently active (for credentials with expiry)."
		   });
		addAnnotation
		  (credentialStatusEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "The credential has expired."
		   });
		addAnnotation
		  (effortStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Status of an effort such as a project, position, or activity."
		   });
		addAnnotation
		  (effortStatusEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "The effort is an idea or concept that has not been committed to."
		   });
		addAnnotation
		  (effortStatusEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "The effort is planned and committed to but not yet started."
		   });
		addAnnotation
		  (effortStatusEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "The effort is currently in progress."
		   });
		addAnnotation
		  (effortStatusEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "The effort has been completed."
		   });
		addAnnotation
		  (effortStatusEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "The effort was abandoned before completion."
		   });
		addAnnotation
		  (knowledgeGraphEClass,
		   source,
		   new String[] {
			   "documentation", "Root container for a professional knowledge graph. Holds the catalogue of people, skills, organizations and locations."
		   });
		addAnnotation
		  (getKnowledgeGraph_Name(),
		   source,
		   new String[] {
			   "documentation", "Name of this knowledge graph."
		   });
		addAnnotation
		  (getKnowledgeGraph_Description(),
		   source,
		   new String[] {
			   "documentation", "Description of this knowledge graph."
		   });
		addAnnotation
		  (getKnowledgeGraph_People(),
		   source,
		   new String[] {
			   "documentation", "People contained in this knowledge graph."
		   });
		addAnnotation
		  (getKnowledgeGraph_Skills(),
		   source,
		   new String[] {
			   "documentation", "Top-level skills in the knowledge graph skill catalogue. Skills form a hierarchy - sub-skills are contained within their parent skill."
		   });
		addAnnotation
		  (getKnowledgeGraph_Organizations(),
		   source,
		   new String[] {
			   "documentation", "Organizations (employers, clients, institutions) referenced in this knowledge graph."
		   });
		addAnnotation
		  (getKnowledgeGraph_Locations(),
		   source,
		   new String[] {
			   "documentation", "Locations referenced in this knowledge graph."
		   });
		addAnnotation
		  (personEClass,
		   source,
		   new String[] {
			   "documentation", "A person in the professional knowledge graph. Captures the person\'s network, skills, credentials, and work history."
		   });
		addAnnotation
		  (getPerson_Name(),
		   source,
		   new String[] {
			   "documentation", "Full name of the person."
		   });
		addAnnotation
		  (getPerson_Summary(),
		   source,
		   new String[] {
			   "documentation", "Professional summary or bio of the person."
		   });
		addAnnotation
		  (getPerson_ContactMethods(),
		   source,
		   new String[] {
			   "documentation", "Contact methods for this person (email, phone, web addresses, etc.)."
		   });
		addAnnotation
		  (getPerson_Network(),
		   source,
		   new String[] {
			   "documentation", "Professional network - people this person has interacted with in some way."
		   });
		addAnnotation
		  (getPerson_PersonSkills(),
		   source,
		   new String[] {
			   "documentation", "Skills the person has or would like to have, with mastery levels."
		   });
		addAnnotation
		  (getPerson_Credentials(),
		   source,
		   new String[] {
			   "documentation", "Credentials: education, certifications, training, endorsements, awards, patents."
		   });
		addAnnotation
		  (getPerson_Efforts(),
		   source,
		   new String[] {
			   "documentation", "Work and engagement history: positions held, projects, activities, and publications."
		   });
		addAnnotation
		  (getPerson_Locations(),
		   source,
		   new String[] {
			   "documentation", "Locations where this person has lived or worked."
		   });
		addAnnotation
		  (personSkillEClass,
		   source,
		   new String[] {
			   "documentation", "Associates a skill with a person, capturing mastery level and whether improvement is desired."
		   });
		addAnnotation
		  (getPersonSkill_Skill(),
		   source,
		   new String[] {
			   "documentation", "The skill this entry refers to."
		   });
		addAnnotation
		  (getPersonSkill_Mastery(),
		   source,
		   new String[] {
			   "documentation", "Current level of mastery the person has in this skill."
		   });
		addAnnotation
		  (getPersonSkill_Desired(),
		   source,
		   new String[] {
			   "documentation", "Whether the person desires to improve their mastery in this skill. False means the person has no plans to improve (e.g. they know of JavaScript but have no plans to improve)."
		   });
		addAnnotation
		  (getPersonSkill_Notes(),
		   source,
		   new String[] {
			   "documentation", "Additional notes about the person\'s experience or plans with this skill."
		   });
		addAnnotation
		  (skillEClass,
		   source,
		   new String[] {
			   "documentation", "A capability or ability to achieve something. Skills can form a hierarchy (sub-skills) and a graph (related/prerequisite skills). Skills may require tools or other resources. Examples: Java, JDBC, Spring Boot, Public Speaking, Project Management."
		   });
		addAnnotation
		  (getSkill_Name(),
		   source,
		   new String[] {
			   "documentation", "Name of the skill."
		   });
		addAnnotation
		  (getSkill_Description(),
		   source,
		   new String[] {
			   "documentation", "Description of the skill."
		   });
		addAnnotation
		  (getSkill_Skills(),
		   source,
		   new String[] {
			   "documentation", "Sub-skills forming a hierarchy. For example, the Java skill may contain JDBC, Spring, Jakarta EE as sub-skills."
		   });
		addAnnotation
		  (getSkill_RelatedSkills(),
		   source,
		   new String[] {
			   "documentation", "Skills that are closely related to this skill (graph relationship). For example, C and C++ are related; Python and R are related for data science."
		   });
		addAnnotation
		  (getSkill_Prerequisites(),
		   source,
		   new String[] {
			   "documentation", "Skills that simplify learning this skill. Having a prerequisite skill makes it easier to acquire this skill. For example, knowing C simplifies learning C++; knowing Java simplifies learning Kotlin."
		   });
		addAnnotation
		  (getSkill_Resources(),
		   source,
		   new String[] {
			   "documentation", "Tools and other resources required or commonly used when applying this skill."
		   });
		addAnnotation
		  (skillResourceEClass,
		   source,
		   new String[] {
			   "documentation", "A tool or resource required or commonly used when applying a skill."
		   });
		addAnnotation
		  (getSkillResource_Name(),
		   source,
		   new String[] {
			   "documentation", "Name of the resource or tool."
		   });
		addAnnotation
		  (getSkillResource_Description(),
		   source,
		   new String[] {
			   "documentation", "Description of the resource."
		   });
		addAnnotation
		  (getSkillResource_Url(),
		   source,
		   new String[] {
			   "documentation", "URL for the resource."
		   });
		addAnnotation
		  (credentialEClass,
		   source,
		   new String[] {
			   "documentation", "Abstract base for credentials. A credential is associated with one or more skills and validates proficiency or achievement. Credentials can be in different stages: planned, in-progress, obtained, active, or expired."
		   });
		addAnnotation
		  (getCredential_Name(),
		   source,
		   new String[] {
			   "documentation", "Name of the credential."
		   });
		addAnnotation
		  (getCredential_Description(),
		   source,
		   new String[] {
			   "documentation", "Description of this credential."
		   });
		addAnnotation
		  (getCredential_Date(),
		   source,
		   new String[] {
			   "documentation", "Date the credential was obtained, completed, or awarded."
		   });
		addAnnotation
		  (getCredential_Url(),
		   source,
		   new String[] {
			   "documentation", "URL for verification or more information about this credential."
		   });
		addAnnotation
		  (getCredential_Status(),
		   source,
		   new String[] {
			   "documentation", "Current status of this credential."
		   });
		addAnnotation
		  (getCredential_Skills(),
		   source,
		   new String[] {
			   "documentation", "Skills validated or certified by this credential."
		   });
		addAnnotation
		  (educationEClass,
		   source,
		   new String[] {
			   "documentation", "An educational credential such as a degree, diploma, or certificate from an educational institution."
		   });
		addAnnotation
		  (getEducation_Institution(),
		   source,
		   new String[] {
			   "documentation", "Name of the educational institution."
		   });
		addAnnotation
		  (getEducation_Degree(),
		   source,
		   new String[] {
			   "documentation", "Degree awarded (e.g., Bachelor of Science, Master of Arts, Ph.D.)."
		   });
		addAnnotation
		  (getEducation_FieldOfStudy(),
		   source,
		   new String[] {
			   "documentation", "Field or major area of study (e.g., Computer Science, Electrical Engineering)."
		   });
		addAnnotation
		  (getEducation_StartDate(),
		   source,
		   new String[] {
			   "documentation", "Date when the person started this educational program."
		   });
		addAnnotation
		  (getEducation_Location(),
		   source,
		   new String[] {
			   "documentation", "Location of the educational institution."
		   });
		addAnnotation
		  (certificationEClass,
		   source,
		   new String[] {
			   "documentation", "A professional certification issued by an organization or authority that validates specific skills or knowledge."
		   });
		addAnnotation
		  (getCertification_Issuer(),
		   source,
		   new String[] {
			   "documentation", "Name of the organization or authority that issued this certification."
		   });
		addAnnotation
		  (getCertification_CredentialId(),
		   source,
		   new String[] {
			   "documentation", "Unique identifier or credential ID assigned by the issuer."
		   });
		addAnnotation
		  (getCertification_Expires(),
		   source,
		   new String[] {
			   "documentation", "Expiry date of the certification, if applicable."
		   });
		addAnnotation
		  (trainingCourseEClass,
		   source,
		   new String[] {
			   "documentation", "A training course completed by the person, such as an online course on Udemy, Coursera, or an in-person training."
		   });
		addAnnotation
		  (getTrainingCourse_Provider(),
		   source,
		   new String[] {
			   "documentation", "Name of the course provider or platform (e.g., Udemy, Coursera, Pluralsight)."
		   });
		addAnnotation
		  (getTrainingCourse_CourseUrl(),
		   source,
		   new String[] {
			   "documentation", "URL of the course."
		   });
		addAnnotation
		  (getTrainingCourse_CertificateUrl(),
		   source,
		   new String[] {
			   "documentation", "URL of the completion certificate."
		   });
		addAnnotation
		  (endorsementEClass,
		   source,
		   new String[] {
			   "documentation", "An endorsement of a skill by another person, such as a LinkedIn skill endorsement or a letter of recommendation."
		   });
		addAnnotation
		  (getEndorsement_EndorsedBy(),
		   source,
		   new String[] {
			   "documentation", "The person who provided this endorsement."
		   });
		addAnnotation
		  (getEndorsement_Text(),
		   source,
		   new String[] {
			   "documentation", "Text of the endorsement or recommendation."
		   });
		addAnnotation
		  (awardEClass,
		   source,
		   new String[] {
			   "documentation", "An award or recognition received by the person."
		   });
		addAnnotation
		  (getAward_Issuer(),
		   source,
		   new String[] {
			   "documentation", "Organization or authority that issued the award."
		   });
		addAnnotation
		  (patentEClass,
		   source,
		   new String[] {
			   "documentation", "A patent or invention associated with the person."
		   });
		addAnnotation
		  (getPatent_PatentNumber(),
		   source,
		   new String[] {
			   "documentation", "Official patent number."
		   });
		addAnnotation
		  (getPatent_Inventors(),
		   source,
		   new String[] {
			   "documentation", "Co-inventors of this patent."
		   });
		addAnnotation
		  (effortEClass,
		   source,
		   new String[] {
			   "documentation", "Abstract base for something that a person did, is doing, or is planning to do. An effort may use skills and involve collaboration with others. An effort can be planned (an idea) listing required skills and roles for others."
		   });
		addAnnotation
		  (getEffort_Name(),
		   source,
		   new String[] {
			   "documentation", "Name or title of the effort."
		   });
		addAnnotation
		  (getEffort_Description(),
		   source,
		   new String[] {
			   "documentation", "Description of the effort."
		   });
		addAnnotation
		  (getEffort_StartDate(),
		   source,
		   new String[] {
			   "documentation", "Start date of the effort."
		   });
		addAnnotation
		  (getEffort_EndDate(),
		   source,
		   new String[] {
			   "documentation", "End date of the effort. Null if still ongoing."
		   });
		addAnnotation
		  (getEffort_Status(),
		   source,
		   new String[] {
			   "documentation", "Current status of the effort."
		   });
		addAnnotation
		  (getEffort_Skills(),
		   source,
		   new String[] {
			   "documentation", "Skills used or required in this effort."
		   });
		addAnnotation
		  (getEffort_Collaborators(),
		   source,
		   new String[] {
			   "documentation", "People the person collaborated with on this effort."
		   });
		addAnnotation
		  (getEffort_PlannedRoles(),
		   source,
		   new String[] {
			   "documentation", "Roles needed from others for this effort. Useful for planned/future efforts."
		   });
		addAnnotation
		  (positionEClass,
		   source,
		   new String[] {
			   "documentation", "A professional position or role held at an organization. Contains the activities and projects carried out in that role."
		   });
		addAnnotation
		  (getPosition_Title(),
		   source,
		   new String[] {
			   "documentation", "Job title or role title (e.g., Senior Software Engineer, Principal Architect)."
		   });
		addAnnotation
		  (getPosition_Organization(),
		   source,
		   new String[] {
			   "documentation", "Organization where this position was held."
		   });
		addAnnotation
		  (getPosition_Location(),
		   source,
		   new String[] {
			   "documentation", "Location where this position was based."
		   });
		addAnnotation
		  (getPosition_Activities(),
		   source,
		   new String[] {
			   "documentation", "Activities, projects and assignments carried out within this position."
		   });
		addAnnotation
		  (activityEClass,
		   source,
		   new String[] {
			   "documentation", "A specific project, assignment, or activity carried out as part of a position or independently. Activities are concrete deliverable-focused units of work within an engagement."
		   });
		addAnnotation
		  (getActivity_Outcomes(),
		   source,
		   new String[] {
			   "documentation", "Outcomes, results, or achievements of this activity."
		   });
		addAnnotation
		  (publicationEClass,
		   source,
		   new String[] {
			   "documentation", "A publication such as an article, blog post, book, research paper, or other published work."
		   });
		addAnnotation
		  (getPublication_Publisher(),
		   source,
		   new String[] {
			   "documentation", "Publisher, journal, or platform where this was published."
		   });
		addAnnotation
		  (getPublication_PublicationUrl(),
		   source,
		   new String[] {
			   "documentation", "URL where the publication can be accessed."
		   });
		addAnnotation
		  (getPublication_Isbn(),
		   source,
		   new String[] {
			   "documentation", "ISBN for books."
		   });
		addAnnotation
		  (getPublication_Doi(),
		   source,
		   new String[] {
			   "documentation", "Digital Object Identifier for academic papers."
		   });
		addAnnotation
		  (plannedRoleEClass,
		   source,
		   new String[] {
			   "documentation", "A role needed from collaborators for a planned or future effort."
		   });
		addAnnotation
		  (getPlannedRole_Title(),
		   source,
		   new String[] {
			   "documentation", "Title or description of the needed role."
		   });
		addAnnotation
		  (getPlannedRole_Description(),
		   source,
		   new String[] {
			   "documentation", "Detailed description of responsibilities for this role."
		   });
		addAnnotation
		  (getPlannedRole_Skills(),
		   source,
		   new String[] {
			   "documentation", "Skills required for this role."
		   });
		addAnnotation
		  (getPlannedRole_Count(),
		   source,
		   new String[] {
			   "documentation", "Number of people needed for this role."
		   });
		addAnnotation
		  (organizationEClass,
		   source,
		   new String[] {
			   "documentation", "An organization such as an employer, client, institution, or community referenced in the knowledge graph."
		   });
		addAnnotation
		  (getOrganization_Name(),
		   source,
		   new String[] {
			   "documentation", "Name of the organization."
		   });
		addAnnotation
		  (getOrganization_Description(),
		   source,
		   new String[] {
			   "documentation", "Description of the organization."
		   });
		addAnnotation
		  (getOrganization_Industry(),
		   source,
		   new String[] {
			   "documentation", "Industry or sector the organization operates in."
		   });
		addAnnotation
		  (getOrganization_Url(),
		   source,
		   new String[] {
			   "documentation", "Website URL of the organization."
		   });
		addAnnotation
		  (getOrganization_Location(),
		   source,
		   new String[] {
			   "documentation", "Primary location/headquarters of the organization."
		   });
		addAnnotation
		  (locationEClass,
		   source,
		   new String[] {
			   "documentation", "A geographic location defined by country, state/province and city. Referenced by positions, organizations, and the person\'s residence history."
		   });
		addAnnotation
		  (getLocation_Country(),
		   source,
		   new String[] {
			   "documentation", "Country name."
		   });
		addAnnotation
		  (getLocation_State(),
		   source,
		   new String[] {
			   "documentation", "State or province name."
		   });
		addAnnotation
		  (getLocation_City(),
		   source,
		   new String[] {
			   "documentation", "City name."
		   });
		addAnnotation
		  (contactMethodEClass,
		   source,
		   new String[] {
			   "documentation", "Abstract interface for contact methods such as email, phone, and web addresses."
		   });
		addAnnotation
		  (getContactMethod_Name(),
		   source,
		   new String[] {
			   "documentation", "Label for this contact method (e.g., \'Work Email\', \'Personal Phone\')."
		   });
		addAnnotation
		  (getContactMethod_Description(),
		   source,
		   new String[] {
			   "documentation", "Additional description of this contact method."
		   });
		addAnnotation
		  (emailEClass,
		   source,
		   new String[] {
			   "documentation", "An email address contact method."
		   });
		addAnnotation
		  (getEmail_Address(),
		   source,
		   new String[] {
			   "documentation", "Email address."
		   });
		addAnnotation
		  (phoneEClass,
		   source,
		   new String[] {
			   "documentation", "A phone number contact method."
		   });
		addAnnotation
		  (getPhone_CountryCode(),
		   source,
		   new String[] {
			   "documentation", "Country dialing code (e.g., +1 for USA, +44 for UK)."
		   });
		addAnnotation
		  (getPhone_Number(),
		   source,
		   new String[] {
			   "documentation", "Phone number."
		   });
		addAnnotation
		  (getPhone_Extension(),
		   source,
		   new String[] {
			   "documentation", "Phone extension."
		   });
		addAnnotation
		  (webAddressEClass,
		   source,
		   new String[] {
			   "documentation", "A web address contact method, including social media profiles and personal websites."
		   });
		addAnnotation
		  (getWebAddress_Url(),
		   source,
		   new String[] {
			   "documentation", "The URL."
		   });
		addAnnotation
		  (getWebAddress_Platform(),
		   source,
		   new String[] {
			   "documentation", "Platform or service name (e.g., LinkedIn, GitHub, Twitter, personal website)."
		   });
	}

} //ProfessionalKnowledgeGraphPackageImpl
