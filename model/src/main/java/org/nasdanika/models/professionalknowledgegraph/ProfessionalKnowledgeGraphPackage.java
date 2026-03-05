/**
 */
package org.nasdanika.models.professionalknowledgegraph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A model/ontology of a professional knowledge graph that allows users to capture detailed information about their professional experience.
 * It can be used to generate tailored resumes and power professional digital twins.
 * 
 * The model captures:
 * * People and their professional networks
 * * Skills with mastery levels and hierarchy
 * * Credentials (education, certifications, training, endorsements, awards, patents)
 * * Work/engagement history (organizations, positions, activities/projects)
 * * Locations
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphFactory
 * @model kind="package"
 * @generated
 */
public interface ProfessionalKnowledgeGraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "professionalknowledgegraph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/professionalknowledgegraph";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.professionalknowledgegraph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProfessionalKnowledgeGraphPackage eINSTANCE = org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.KnowledgeGraphImpl <em>Knowledge Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.KnowledgeGraphImpl
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getKnowledgeGraph()
	 * @generated
	 */
	int KNOWLEDGE_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_GRAPH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_GRAPH__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>People</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_GRAPH__PEOPLE = 2;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_GRAPH__SKILLS = 3;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_GRAPH__ORGANIZATIONS = 4;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_GRAPH__LOCATIONS = 5;

	/**
	 * The number of structural features of the '<em>Knowledge Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_GRAPH_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Knowledge Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.PersonImpl
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SUMMARY = 1;

	/**
	 * The feature id for the '<em><b>Contact Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CONTACT_METHODS = 2;

	/**
	 * The feature id for the '<em><b>Network</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NETWORK = 3;

	/**
	 * The feature id for the '<em><b>Person Skills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERSON_SKILLS = 4;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CREDENTIALS = 5;

	/**
	 * The feature id for the '<em><b>Efforts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EFFORTS = 6;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LOCATIONS = 7;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.PersonSkillImpl <em>Person Skill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.PersonSkillImpl
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getPersonSkill()
	 * @generated
	 */
	int PERSON_SKILL = 2;

	/**
	 * The feature id for the '<em><b>Skill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SKILL__SKILL = 0;

	/**
	 * The feature id for the '<em><b>Mastery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SKILL__MASTERY = 1;

	/**
	 * The feature id for the '<em><b>Desired</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SKILL__DESIRED = 2;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SKILL__NOTES = 3;

	/**
	 * The number of structural features of the '<em>Person Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SKILL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Person Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_SKILL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.SkillImpl <em>Skill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.SkillImpl
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getSkill()
	 * @generated
	 */
	int SKILL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__SKILLS = 2;

	/**
	 * The feature id for the '<em><b>Related Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__RELATED_SKILLS = 3;

	/**
	 * The feature id for the '<em><b>Prerequisites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__PREREQUISITES = 4;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__RESOURCES = 5;

	/**
	 * The number of structural features of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.SkillResourceImpl <em>Skill Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.SkillResourceImpl
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getSkillResource()
	 * @generated
	 */
	int SKILL_RESOURCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_RESOURCE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_RESOURCE__URL = 2;

	/**
	 * The number of structural features of the '<em>Skill Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Skill Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.CredentialImpl <em>Credential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.CredentialImpl
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getCredential()
	 * @generated
	 */
	int CREDENTIAL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__DATE = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__URL = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__STATUS = 4;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__SKILLS = 5;

	/**
	 * The number of structural features of the '<em>Credential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Credential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.EducationImpl <em>Education</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.EducationImpl
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getEducation()
	 * @generated
	 */
	int EDUCATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__NAME = CREDENTIAL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__DESCRIPTION = CREDENTIAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__DATE = CREDENTIAL__DATE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__URL = CREDENTIAL__URL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__STATUS = CREDENTIAL__STATUS;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__SKILLS = CREDENTIAL__SKILLS;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__INSTITUTION = CREDENTIAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__DEGREE = CREDENTIAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Field Of Study</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__FIELD_OF_STUDY = CREDENTIAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__START_DATE = CREDENTIAL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__LOCATION = CREDENTIAL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Education</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_FEATURE_COUNT = CREDENTIAL_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Education</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_OPERATION_COUNT = CREDENTIAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.CertificationImpl <em>Certification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.CertificationImpl
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getCertification()
	 * @generated
	 */
	int CERTIFICATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATION__NAME = CREDENTIAL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATION__DESCRIPTION = CREDENTIAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATION__DATE = CREDENTIAL__DATE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATION__URL = CREDENTIAL__URL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATION__STATUS = CREDENTIAL__STATUS;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATION__SKILLS = CREDENTIAL__SKILLS;

	/**
	 * The feature id for the '<em><b>Issuer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATION__ISSUER = CREDENTIAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Credential Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATION__CREDENTIAL_ID = CREDENTIAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATION__EXPIRES = CREDENTIAL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Certification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATION_FEATURE_COUNT = CREDENTIAL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Certification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATION_OPERATION_COUNT = CREDENTIAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.TrainingCourseImpl <em>Training Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.TrainingCourseImpl
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getTrainingCourse()
	 * @generated
	 */
	int TRAINING_COURSE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_COURSE__NAME = CREDENTIAL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_COURSE__DESCRIPTION = CREDENTIAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_COURSE__DATE = CREDENTIAL__DATE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_COURSE__URL = CREDENTIAL__URL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_COURSE__STATUS = CREDENTIAL__STATUS;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_COURSE__SKILLS = CREDENTIAL__SKILLS;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_COURSE__PROVIDER = CREDENTIAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Course Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_COURSE__COURSE_URL = CREDENTIAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Certificate Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_COURSE__CERTIFICATE_URL = CREDENTIAL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Training Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_COURSE_FEATURE_COUNT = CREDENTIAL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Training Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_COURSE_OPERATION_COUNT = CREDENTIAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.EndorsementImpl <em>Endorsement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.EndorsementImpl
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getEndorsement()
	 * @generated
	 */
	int ENDORSEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT__NAME = CREDENTIAL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT__DESCRIPTION = CREDENTIAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT__DATE = CREDENTIAL__DATE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT__URL = CREDENTIAL__URL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT__STATUS = CREDENTIAL__STATUS;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT__SKILLS = CREDENTIAL__SKILLS;

	/**
	 * The feature id for the '<em><b>Endorsed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT__ENDORSED_BY = CREDENTIAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT__TEXT = CREDENTIAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Endorsement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT_FEATURE_COUNT = CREDENTIAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Endorsement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT_OPERATION_COUNT = CREDENTIAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.AwardImpl <em>Award</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.AwardImpl
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getAward()
	 * @generated
	 */
	int AWARD = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD__NAME = CREDENTIAL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD__DESCRIPTION = CREDENTIAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD__DATE = CREDENTIAL__DATE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD__URL = CREDENTIAL__URL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD__STATUS = CREDENTIAL__STATUS;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD__SKILLS = CREDENTIAL__SKILLS;

	/**
	 * The feature id for the '<em><b>Issuer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD__ISSUER = CREDENTIAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Award</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD_FEATURE_COUNT = CREDENTIAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Award</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD_OPERATION_COUNT = CREDENTIAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.PatentImpl <em>Patent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.PatentImpl
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getPatent()
	 * @generated
	 */
	int PATENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATENT__NAME = CREDENTIAL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATENT__DESCRIPTION = CREDENTIAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATENT__DATE = CREDENTIAL__DATE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATENT__URL = CREDENTIAL__URL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATENT__STATUS = CREDENTIAL__STATUS;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATENT__SKILLS = CREDENTIAL__SKILLS;

	/**
	 * The feature id for the '<em><b>Patent Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATENT__PATENT_NUMBER = CREDENTIAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inventors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATENT__INVENTORS = CREDENTIAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Patent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATENT_FEATURE_COUNT = CREDENTIAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Patent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATENT_OPERATION_COUNT = CREDENTIAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.EffortImpl <em>Effort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.EffortImpl
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getEffort()
	 * @generated
	 */
	int EFFORT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFORT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFORT__START_DATE = 2;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFORT__END_DATE = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFORT__STATUS = 4;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFORT__SKILLS = 5;

	/**
	 * The feature id for the '<em><b>Collaborators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFORT__COLLABORATORS = 6;

	/**
	 * The feature id for the '<em><b>Planned Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFORT__PLANNED_ROLES = 7;

	/**
	 * The number of structural features of the '<em>Effort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFORT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Effort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.PositionImpl
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__NAME = EFFORT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__DESCRIPTION = EFFORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__START_DATE = EFFORT__START_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__END_DATE = EFFORT__END_DATE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__STATUS = EFFORT__STATUS;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__SKILLS = EFFORT__SKILLS;

	/**
	 * The feature id for the '<em><b>Collaborators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__COLLABORATORS = EFFORT__COLLABORATORS;

	/**
	 * The feature id for the '<em><b>Planned Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__PLANNED_ROLES = EFFORT__PLANNED_ROLES;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__TITLE = EFFORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__ORGANIZATION = EFFORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__LOCATION = EFFORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__ACTIVITIES = EFFORT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = EFFORT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = EFFORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ActivityImpl
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = EFFORT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DESCRIPTION = EFFORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__START_DATE = EFFORT__START_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__END_DATE = EFFORT__END_DATE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__STATUS = EFFORT__STATUS;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SKILLS = EFFORT__SKILLS;

	/**
	 * The feature id for the '<em><b>Collaborators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__COLLABORATORS = EFFORT__COLLABORATORS;

	/**
	 * The feature id for the '<em><b>Planned Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PLANNED_ROLES = EFFORT__PLANNED_ROLES;

	/**
	 * The feature id for the '<em><b>Outcomes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTCOMES = EFFORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = EFFORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = EFFORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.PublicationImpl <em>Publication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.PublicationImpl
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getPublication()
	 * @generated
	 */
	int PUBLICATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__NAME = EFFORT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__DESCRIPTION = EFFORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__START_DATE = EFFORT__START_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__END_DATE = EFFORT__END_DATE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__STATUS = EFFORT__STATUS;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__SKILLS = EFFORT__SKILLS;

	/**
	 * The feature id for the '<em><b>Collaborators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__COLLABORATORS = EFFORT__COLLABORATORS;

	/**
	 * The feature id for the '<em><b>Planned Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__PLANNED_ROLES = EFFORT__PLANNED_ROLES;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__PUBLISHER = EFFORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Publication Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__PUBLICATION_URL = EFFORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Isbn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__ISBN = EFFORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Doi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__DOI = EFFORT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Publication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_FEATURE_COUNT = EFFORT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Publication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_OPERATION_COUNT = EFFORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.PlannedRoleImpl <em>Planned Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.PlannedRoleImpl
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getPlannedRole()
	 * @generated
	 */
	int PLANNED_ROLE = 16;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_ROLE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_ROLE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_ROLE__SKILLS = 2;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_ROLE__COUNT = 3;

	/**
	 * The number of structural features of the '<em>Planned Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_ROLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Planned Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.OrganizationImpl
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Industry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__INDUSTRY = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__URL = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__LOCATION = 4;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.LocationImpl
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 18;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__COUNTRY = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__STATE = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CITY = 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.ContactMethod <em>Contact Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.ContactMethod
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getContactMethod()
	 * @generated
	 */
	int CONTACT_METHOD = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_METHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_METHOD__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Contact Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_METHOD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Contact Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.EmailImpl <em>Email</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.EmailImpl
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getEmail()
	 * @generated
	 */
	int EMAIL = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__NAME = CONTACT_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__DESCRIPTION = CONTACT_METHOD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__ADDRESS = CONTACT_METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Email</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FEATURE_COUNT = CONTACT_METHOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Email</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_OPERATION_COUNT = CONTACT_METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.PhoneImpl <em>Phone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.PhoneImpl
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getPhone()
	 * @generated
	 */
	int PHONE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__NAME = CONTACT_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__DESCRIPTION = CONTACT_METHOD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__COUNTRY_CODE = CONTACT_METHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__NUMBER = CONTACT_METHOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__EXTENSION = CONTACT_METHOD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Phone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FEATURE_COUNT = CONTACT_METHOD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Phone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_OPERATION_COUNT = CONTACT_METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.WebAddressImpl <em>Web Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.WebAddressImpl
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getWebAddress()
	 * @generated
	 */
	int WEB_ADDRESS = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS__NAME = CONTACT_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS__DESCRIPTION = CONTACT_METHOD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS__URL = CONTACT_METHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS__PLATFORM = CONTACT_METHOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Web Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS_FEATURE_COUNT = CONTACT_METHOD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Web Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ADDRESS_OPERATION_COUNT = CONTACT_METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.SkillMastery <em>Skill Mastery</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.SkillMastery
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getSkillMastery()
	 * @generated
	 */
	int SKILL_MASTERY = 23;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.CredentialStatus <em>Credential Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.CredentialStatus
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getCredentialStatus()
	 * @generated
	 */
	int CREDENTIAL_STATUS = 24;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.professionalknowledgegraph.EffortStatus <em>Effort Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.professionalknowledgegraph.EffortStatus
	 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getEffortStatus()
	 * @generated
	 */
	int EFFORT_STATUS = 25;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.KnowledgeGraph <em>Knowledge Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge Graph</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.KnowledgeGraph
	 * @generated
	 */
	EClass getKnowledgeGraph();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.KnowledgeGraph#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.KnowledgeGraph#getName()
	 * @see #getKnowledgeGraph()
	 * @generated
	 */
	EAttribute getKnowledgeGraph_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.KnowledgeGraph#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.KnowledgeGraph#getDescription()
	 * @see #getKnowledgeGraph()
	 * @generated
	 */
	EAttribute getKnowledgeGraph_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.professionalknowledgegraph.KnowledgeGraph#getPeople <em>People</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>People</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.KnowledgeGraph#getPeople()
	 * @see #getKnowledgeGraph()
	 * @generated
	 */
	EReference getKnowledgeGraph_People();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.professionalknowledgegraph.KnowledgeGraph#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skills</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.KnowledgeGraph#getSkills()
	 * @see #getKnowledgeGraph()
	 * @generated
	 */
	EReference getKnowledgeGraph_Skills();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.professionalknowledgegraph.KnowledgeGraph#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organizations</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.KnowledgeGraph#getOrganizations()
	 * @see #getKnowledgeGraph()
	 * @generated
	 */
	EReference getKnowledgeGraph_Organizations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.professionalknowledgegraph.KnowledgeGraph#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.KnowledgeGraph#getLocations()
	 * @see #getKnowledgeGraph()
	 * @generated
	 */
	EReference getKnowledgeGraph_Locations();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Person#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Person#getSummary()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Summary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.professionalknowledgegraph.Person#getContactMethods <em>Contact Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contact Methods</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Person#getContactMethods()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_ContactMethods();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.professionalknowledgegraph.Person#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Network</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Person#getNetwork()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Network();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.professionalknowledgegraph.Person#getPersonSkills <em>Person Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person Skills</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Person#getPersonSkills()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_PersonSkills();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.professionalknowledgegraph.Person#getCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Credentials</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Person#getCredentials()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Credentials();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.professionalknowledgegraph.Person#getEfforts <em>Efforts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Efforts</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Person#getEfforts()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Efforts();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.professionalknowledgegraph.Person#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Person#getLocations()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Locations();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.PersonSkill <em>Person Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Skill</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.PersonSkill
	 * @generated
	 */
	EClass getPersonSkill();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.professionalknowledgegraph.PersonSkill#getSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Skill</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.PersonSkill#getSkill()
	 * @see #getPersonSkill()
	 * @generated
	 */
	EReference getPersonSkill_Skill();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.PersonSkill#getMastery <em>Mastery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mastery</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.PersonSkill#getMastery()
	 * @see #getPersonSkill()
	 * @generated
	 */
	EAttribute getPersonSkill_Mastery();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.PersonSkill#isDesired <em>Desired</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desired</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.PersonSkill#isDesired()
	 * @see #getPersonSkill()
	 * @generated
	 */
	EAttribute getPersonSkill_Desired();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.PersonSkill#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.PersonSkill#getNotes()
	 * @see #getPersonSkill()
	 * @generated
	 */
	EAttribute getPersonSkill_Notes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.Skill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Skill
	 * @generated
	 */
	EClass getSkill();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Skill#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Skill#getName()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Skill#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Skill#getDescription()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.professionalknowledgegraph.Skill#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skills</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Skill#getSkills()
	 * @see #getSkill()
	 * @generated
	 */
	EReference getSkill_Skills();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.professionalknowledgegraph.Skill#getRelatedSkills <em>Related Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Skills</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Skill#getRelatedSkills()
	 * @see #getSkill()
	 * @generated
	 */
	EReference getSkill_RelatedSkills();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.professionalknowledgegraph.Skill#getPrerequisites <em>Prerequisites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Prerequisites</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Skill#getPrerequisites()
	 * @see #getSkill()
	 * @generated
	 */
	EReference getSkill_Prerequisites();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.professionalknowledgegraph.Skill#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Skill#getResources()
	 * @see #getSkill()
	 * @generated
	 */
	EReference getSkill_Resources();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.SkillResource <em>Skill Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill Resource</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.SkillResource
	 * @generated
	 */
	EClass getSkillResource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.SkillResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.SkillResource#getName()
	 * @see #getSkillResource()
	 * @generated
	 */
	EAttribute getSkillResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.SkillResource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.SkillResource#getDescription()
	 * @see #getSkillResource()
	 * @generated
	 */
	EAttribute getSkillResource_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.SkillResource#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.SkillResource#getUrl()
	 * @see #getSkillResource()
	 * @generated
	 */
	EAttribute getSkillResource_Url();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.Credential <em>Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credential</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Credential
	 * @generated
	 */
	EClass getCredential();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Credential#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Credential#getName()
	 * @see #getCredential()
	 * @generated
	 */
	EAttribute getCredential_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Credential#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Credential#getDescription()
	 * @see #getCredential()
	 * @generated
	 */
	EAttribute getCredential_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Credential#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Credential#getDate()
	 * @see #getCredential()
	 * @generated
	 */
	EAttribute getCredential_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Credential#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Credential#getUrl()
	 * @see #getCredential()
	 * @generated
	 */
	EAttribute getCredential_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Credential#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Credential#getStatus()
	 * @see #getCredential()
	 * @generated
	 */
	EAttribute getCredential_Status();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.professionalknowledgegraph.Credential#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Skills</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Credential#getSkills()
	 * @see #getCredential()
	 * @generated
	 */
	EReference getCredential_Skills();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.Education <em>Education</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Education</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Education
	 * @generated
	 */
	EClass getEducation();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Education#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Institution</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Education#getInstitution()
	 * @see #getEducation()
	 * @generated
	 */
	EAttribute getEducation_Institution();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Education#getDegree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degree</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Education#getDegree()
	 * @see #getEducation()
	 * @generated
	 */
	EAttribute getEducation_Degree();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Education#getFieldOfStudy <em>Field Of Study</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Of Study</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Education#getFieldOfStudy()
	 * @see #getEducation()
	 * @generated
	 */
	EAttribute getEducation_FieldOfStudy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Education#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Education#getStartDate()
	 * @see #getEducation()
	 * @generated
	 */
	EAttribute getEducation_StartDate();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.professionalknowledgegraph.Education#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Education#getLocation()
	 * @see #getEducation()
	 * @generated
	 */
	EReference getEducation_Location();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.Certification <em>Certification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certification</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Certification
	 * @generated
	 */
	EClass getCertification();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Certification#getIssuer <em>Issuer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issuer</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Certification#getIssuer()
	 * @see #getCertification()
	 * @generated
	 */
	EAttribute getCertification_Issuer();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Certification#getCredentialId <em>Credential Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credential Id</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Certification#getCredentialId()
	 * @see #getCertification()
	 * @generated
	 */
	EAttribute getCertification_CredentialId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Certification#getExpires <em>Expires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expires</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Certification#getExpires()
	 * @see #getCertification()
	 * @generated
	 */
	EAttribute getCertification_Expires();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.TrainingCourse <em>Training Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Training Course</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.TrainingCourse
	 * @generated
	 */
	EClass getTrainingCourse();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.TrainingCourse#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.TrainingCourse#getProvider()
	 * @see #getTrainingCourse()
	 * @generated
	 */
	EAttribute getTrainingCourse_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.TrainingCourse#getCourseUrl <em>Course Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Url</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.TrainingCourse#getCourseUrl()
	 * @see #getTrainingCourse()
	 * @generated
	 */
	EAttribute getTrainingCourse_CourseUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.TrainingCourse#getCertificateUrl <em>Certificate Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate Url</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.TrainingCourse#getCertificateUrl()
	 * @see #getTrainingCourse()
	 * @generated
	 */
	EAttribute getTrainingCourse_CertificateUrl();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.Endorsement <em>Endorsement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endorsement</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Endorsement
	 * @generated
	 */
	EClass getEndorsement();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.professionalknowledgegraph.Endorsement#getEndorsedBy <em>Endorsed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Endorsed By</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Endorsement#getEndorsedBy()
	 * @see #getEndorsement()
	 * @generated
	 */
	EReference getEndorsement_EndorsedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Endorsement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Endorsement#getText()
	 * @see #getEndorsement()
	 * @generated
	 */
	EAttribute getEndorsement_Text();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.Award <em>Award</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Award</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Award
	 * @generated
	 */
	EClass getAward();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Award#getIssuer <em>Issuer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issuer</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Award#getIssuer()
	 * @see #getAward()
	 * @generated
	 */
	EAttribute getAward_Issuer();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.Patent <em>Patent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patent</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Patent
	 * @generated
	 */
	EClass getPatent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Patent#getPatentNumber <em>Patent Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patent Number</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Patent#getPatentNumber()
	 * @see #getPatent()
	 * @generated
	 */
	EAttribute getPatent_PatentNumber();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.professionalknowledgegraph.Patent#getInventors <em>Inventors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inventors</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Patent#getInventors()
	 * @see #getPatent()
	 * @generated
	 */
	EReference getPatent_Inventors();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.Effort <em>Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effort</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Effort
	 * @generated
	 */
	EClass getEffort();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Effort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Effort#getName()
	 * @see #getEffort()
	 * @generated
	 */
	EAttribute getEffort_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Effort#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Effort#getDescription()
	 * @see #getEffort()
	 * @generated
	 */
	EAttribute getEffort_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Effort#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Effort#getStartDate()
	 * @see #getEffort()
	 * @generated
	 */
	EAttribute getEffort_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Effort#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Effort#getEndDate()
	 * @see #getEffort()
	 * @generated
	 */
	EAttribute getEffort_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Effort#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Effort#getStatus()
	 * @see #getEffort()
	 * @generated
	 */
	EAttribute getEffort_Status();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.professionalknowledgegraph.Effort#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Skills</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Effort#getSkills()
	 * @see #getEffort()
	 * @generated
	 */
	EReference getEffort_Skills();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.professionalknowledgegraph.Effort#getCollaborators <em>Collaborators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Collaborators</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Effort#getCollaborators()
	 * @see #getEffort()
	 * @generated
	 */
	EReference getEffort_Collaborators();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.professionalknowledgegraph.Effort#getPlannedRoles <em>Planned Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Planned Roles</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Effort#getPlannedRoles()
	 * @see #getEffort()
	 * @generated
	 */
	EReference getEffort_PlannedRoles();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Position#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Position#getTitle()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Title();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.professionalknowledgegraph.Position#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Position#getOrganization()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_Organization();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.professionalknowledgegraph.Position#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Position#getLocation()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.professionalknowledgegraph.Position#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Position#getActivities()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_Activities();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Activity#getOutcomes <em>Outcomes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outcomes</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Activity#getOutcomes()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Outcomes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.Publication <em>Publication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publication</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Publication
	 * @generated
	 */
	EClass getPublication();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Publication#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Publication#getPublisher()
	 * @see #getPublication()
	 * @generated
	 */
	EAttribute getPublication_Publisher();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Publication#getPublicationUrl <em>Publication Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication Url</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Publication#getPublicationUrl()
	 * @see #getPublication()
	 * @generated
	 */
	EAttribute getPublication_PublicationUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Publication#getIsbn <em>Isbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isbn</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Publication#getIsbn()
	 * @see #getPublication()
	 * @generated
	 */
	EAttribute getPublication_Isbn();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Publication#getDoi <em>Doi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doi</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Publication#getDoi()
	 * @see #getPublication()
	 * @generated
	 */
	EAttribute getPublication_Doi();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.PlannedRole <em>Planned Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planned Role</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.PlannedRole
	 * @generated
	 */
	EClass getPlannedRole();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.PlannedRole#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.PlannedRole#getTitle()
	 * @see #getPlannedRole()
	 * @generated
	 */
	EAttribute getPlannedRole_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.PlannedRole#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.PlannedRole#getDescription()
	 * @see #getPlannedRole()
	 * @generated
	 */
	EAttribute getPlannedRole_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.professionalknowledgegraph.PlannedRole#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Skills</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.PlannedRole#getSkills()
	 * @see #getPlannedRole()
	 * @generated
	 */
	EReference getPlannedRole_Skills();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.PlannedRole#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.PlannedRole#getCount()
	 * @see #getPlannedRole()
	 * @generated
	 */
	EAttribute getPlannedRole_Count();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Organization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Organization#getName()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Organization#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Organization#getDescription()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Organization#getIndustry <em>Industry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Industry</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Organization#getIndustry()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Industry();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Organization#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Organization#getUrl()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Url();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.professionalknowledgegraph.Organization#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Organization#getLocation()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Location();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Location#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Location#getCountry()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Location#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Location#getState()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_State();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Location#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Location#getCity()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_City();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.ContactMethod <em>Contact Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Method</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.ContactMethod
	 * @generated
	 */
	EClass getContactMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.ContactMethod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.ContactMethod#getName()
	 * @see #getContactMethod()
	 * @generated
	 */
	EAttribute getContactMethod_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.ContactMethod#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.ContactMethod#getDescription()
	 * @see #getContactMethod()
	 * @generated
	 */
	EAttribute getContactMethod_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.Email <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Email
	 * @generated
	 */
	EClass getEmail();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Email#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Email#getAddress()
	 * @see #getEmail()
	 * @generated
	 */
	EAttribute getEmail_Address();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.Phone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phone</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Phone
	 * @generated
	 */
	EClass getPhone();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Phone#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Phone#getCountryCode()
	 * @see #getPhone()
	 * @generated
	 */
	EAttribute getPhone_CountryCode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Phone#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Phone#getNumber()
	 * @see #getPhone()
	 * @generated
	 */
	EAttribute getPhone_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.Phone#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.Phone#getExtension()
	 * @see #getPhone()
	 * @generated
	 */
	EAttribute getPhone_Extension();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.professionalknowledgegraph.WebAddress <em>Web Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Address</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.WebAddress
	 * @generated
	 */
	EClass getWebAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.WebAddress#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.WebAddress#getUrl()
	 * @see #getWebAddress()
	 * @generated
	 */
	EAttribute getWebAddress_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.professionalknowledgegraph.WebAddress#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.WebAddress#getPlatform()
	 * @see #getWebAddress()
	 * @generated
	 */
	EAttribute getWebAddress_Platform();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.professionalknowledgegraph.SkillMastery <em>Skill Mastery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Skill Mastery</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.SkillMastery
	 * @generated
	 */
	EEnum getSkillMastery();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.professionalknowledgegraph.CredentialStatus <em>Credential Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Credential Status</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.CredentialStatus
	 * @generated
	 */
	EEnum getCredentialStatus();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.professionalknowledgegraph.EffortStatus <em>Effort Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Effort Status</em>'.
	 * @see org.nasdanika.models.professionalknowledgegraph.EffortStatus
	 * @generated
	 */
	EEnum getEffortStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProfessionalKnowledgeGraphFactory getProfessionalKnowledgeGraphFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.KnowledgeGraphImpl <em>Knowledge Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.KnowledgeGraphImpl
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getKnowledgeGraph()
		 * @generated
		 */
		EClass KNOWLEDGE_GRAPH = eINSTANCE.getKnowledgeGraph();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNOWLEDGE_GRAPH__NAME = eINSTANCE.getKnowledgeGraph_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNOWLEDGE_GRAPH__DESCRIPTION = eINSTANCE.getKnowledgeGraph_Description();

		/**
		 * The meta object literal for the '<em><b>People</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_GRAPH__PEOPLE = eINSTANCE.getKnowledgeGraph_People();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_GRAPH__SKILLS = eINSTANCE.getKnowledgeGraph_Skills();

		/**
		 * The meta object literal for the '<em><b>Organizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_GRAPH__ORGANIZATIONS = eINSTANCE.getKnowledgeGraph_Organizations();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_GRAPH__LOCATIONS = eINSTANCE.getKnowledgeGraph_Locations();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.PersonImpl
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SUMMARY = eINSTANCE.getPerson_Summary();

		/**
		 * The meta object literal for the '<em><b>Contact Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__CONTACT_METHODS = eINSTANCE.getPerson_ContactMethods();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__NETWORK = eINSTANCE.getPerson_Network();

		/**
		 * The meta object literal for the '<em><b>Person Skills</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__PERSON_SKILLS = eINSTANCE.getPerson_PersonSkills();

		/**
		 * The meta object literal for the '<em><b>Credentials</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__CREDENTIALS = eINSTANCE.getPerson_Credentials();

		/**
		 * The meta object literal for the '<em><b>Efforts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__EFFORTS = eINSTANCE.getPerson_Efforts();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__LOCATIONS = eINSTANCE.getPerson_Locations();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.PersonSkillImpl <em>Person Skill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.PersonSkillImpl
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getPersonSkill()
		 * @generated
		 */
		EClass PERSON_SKILL = eINSTANCE.getPersonSkill();

		/**
		 * The meta object literal for the '<em><b>Skill</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_SKILL__SKILL = eINSTANCE.getPersonSkill_Skill();

		/**
		 * The meta object literal for the '<em><b>Mastery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_SKILL__MASTERY = eINSTANCE.getPersonSkill_Mastery();

		/**
		 * The meta object literal for the '<em><b>Desired</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_SKILL__DESIRED = eINSTANCE.getPersonSkill_Desired();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_SKILL__NOTES = eINSTANCE.getPersonSkill_Notes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.SkillImpl <em>Skill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.SkillImpl
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getSkill()
		 * @generated
		 */
		EClass SKILL = eINSTANCE.getSkill();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL__NAME = eINSTANCE.getSkill_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL__DESCRIPTION = eINSTANCE.getSkill_Description();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL__SKILLS = eINSTANCE.getSkill_Skills();

		/**
		 * The meta object literal for the '<em><b>Related Skills</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL__RELATED_SKILLS = eINSTANCE.getSkill_RelatedSkills();

		/**
		 * The meta object literal for the '<em><b>Prerequisites</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL__PREREQUISITES = eINSTANCE.getSkill_Prerequisites();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL__RESOURCES = eINSTANCE.getSkill_Resources();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.SkillResourceImpl <em>Skill Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.SkillResourceImpl
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getSkillResource()
		 * @generated
		 */
		EClass SKILL_RESOURCE = eINSTANCE.getSkillResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL_RESOURCE__NAME = eINSTANCE.getSkillResource_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL_RESOURCE__DESCRIPTION = eINSTANCE.getSkillResource_Description();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL_RESOURCE__URL = eINSTANCE.getSkillResource_Url();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.CredentialImpl <em>Credential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.CredentialImpl
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getCredential()
		 * @generated
		 */
		EClass CREDENTIAL = eINSTANCE.getCredential();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIAL__NAME = eINSTANCE.getCredential_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIAL__DESCRIPTION = eINSTANCE.getCredential_Description();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIAL__DATE = eINSTANCE.getCredential_Date();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIAL__URL = eINSTANCE.getCredential_Url();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIAL__STATUS = eINSTANCE.getCredential_Status();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREDENTIAL__SKILLS = eINSTANCE.getCredential_Skills();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.EducationImpl <em>Education</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.EducationImpl
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getEducation()
		 * @generated
		 */
		EClass EDUCATION = eINSTANCE.getEducation();

		/**
		 * The meta object literal for the '<em><b>Institution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION__INSTITUTION = eINSTANCE.getEducation_Institution();

		/**
		 * The meta object literal for the '<em><b>Degree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION__DEGREE = eINSTANCE.getEducation_Degree();

		/**
		 * The meta object literal for the '<em><b>Field Of Study</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION__FIELD_OF_STUDY = eINSTANCE.getEducation_FieldOfStudy();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION__START_DATE = eINSTANCE.getEducation_StartDate();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDUCATION__LOCATION = eINSTANCE.getEducation_Location();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.CertificationImpl <em>Certification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.CertificationImpl
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getCertification()
		 * @generated
		 */
		EClass CERTIFICATION = eINSTANCE.getCertification();

		/**
		 * The meta object literal for the '<em><b>Issuer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATION__ISSUER = eINSTANCE.getCertification_Issuer();

		/**
		 * The meta object literal for the '<em><b>Credential Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATION__CREDENTIAL_ID = eINSTANCE.getCertification_CredentialId();

		/**
		 * The meta object literal for the '<em><b>Expires</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATION__EXPIRES = eINSTANCE.getCertification_Expires();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.TrainingCourseImpl <em>Training Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.TrainingCourseImpl
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getTrainingCourse()
		 * @generated
		 */
		EClass TRAINING_COURSE = eINSTANCE.getTrainingCourse();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING_COURSE__PROVIDER = eINSTANCE.getTrainingCourse_Provider();

		/**
		 * The meta object literal for the '<em><b>Course Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING_COURSE__COURSE_URL = eINSTANCE.getTrainingCourse_CourseUrl();

		/**
		 * The meta object literal for the '<em><b>Certificate Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING_COURSE__CERTIFICATE_URL = eINSTANCE.getTrainingCourse_CertificateUrl();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.EndorsementImpl <em>Endorsement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.EndorsementImpl
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getEndorsement()
		 * @generated
		 */
		EClass ENDORSEMENT = eINSTANCE.getEndorsement();

		/**
		 * The meta object literal for the '<em><b>Endorsed By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDORSEMENT__ENDORSED_BY = eINSTANCE.getEndorsement_EndorsedBy();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDORSEMENT__TEXT = eINSTANCE.getEndorsement_Text();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.AwardImpl <em>Award</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.AwardImpl
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getAward()
		 * @generated
		 */
		EClass AWARD = eINSTANCE.getAward();

		/**
		 * The meta object literal for the '<em><b>Issuer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWARD__ISSUER = eINSTANCE.getAward_Issuer();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.PatentImpl <em>Patent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.PatentImpl
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getPatent()
		 * @generated
		 */
		EClass PATENT = eINSTANCE.getPatent();

		/**
		 * The meta object literal for the '<em><b>Patent Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATENT__PATENT_NUMBER = eINSTANCE.getPatent_PatentNumber();

		/**
		 * The meta object literal for the '<em><b>Inventors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATENT__INVENTORS = eINSTANCE.getPatent_Inventors();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.EffortImpl <em>Effort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.EffortImpl
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getEffort()
		 * @generated
		 */
		EClass EFFORT = eINSTANCE.getEffort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFORT__NAME = eINSTANCE.getEffort_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFORT__DESCRIPTION = eINSTANCE.getEffort_Description();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFORT__START_DATE = eINSTANCE.getEffort_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFORT__END_DATE = eINSTANCE.getEffort_EndDate();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFORT__STATUS = eINSTANCE.getEffort_Status();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFORT__SKILLS = eINSTANCE.getEffort_Skills();

		/**
		 * The meta object literal for the '<em><b>Collaborators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFORT__COLLABORATORS = eINSTANCE.getEffort_Collaborators();

		/**
		 * The meta object literal for the '<em><b>Planned Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFORT__PLANNED_ROLES = eINSTANCE.getEffort_PlannedRoles();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.PositionImpl
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__TITLE = eINSTANCE.getPosition_Title();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__ORGANIZATION = eINSTANCE.getPosition_Organization();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__LOCATION = eINSTANCE.getPosition_Location();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__ACTIVITIES = eINSTANCE.getPosition_Activities();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ActivityImpl
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Outcomes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__OUTCOMES = eINSTANCE.getActivity_Outcomes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.PublicationImpl <em>Publication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.PublicationImpl
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getPublication()
		 * @generated
		 */
		EClass PUBLICATION = eINSTANCE.getPublication();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICATION__PUBLISHER = eINSTANCE.getPublication_Publisher();

		/**
		 * The meta object literal for the '<em><b>Publication Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICATION__PUBLICATION_URL = eINSTANCE.getPublication_PublicationUrl();

		/**
		 * The meta object literal for the '<em><b>Isbn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICATION__ISBN = eINSTANCE.getPublication_Isbn();

		/**
		 * The meta object literal for the '<em><b>Doi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICATION__DOI = eINSTANCE.getPublication_Doi();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.PlannedRoleImpl <em>Planned Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.PlannedRoleImpl
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getPlannedRole()
		 * @generated
		 */
		EClass PLANNED_ROLE = eINSTANCE.getPlannedRole();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANNED_ROLE__TITLE = eINSTANCE.getPlannedRole_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANNED_ROLE__DESCRIPTION = eINSTANCE.getPlannedRole_Description();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANNED_ROLE__SKILLS = eINSTANCE.getPlannedRole_Skills();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANNED_ROLE__COUNT = eINSTANCE.getPlannedRole_Count();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.OrganizationImpl
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__NAME = eINSTANCE.getOrganization_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__DESCRIPTION = eINSTANCE.getOrganization_Description();

		/**
		 * The meta object literal for the '<em><b>Industry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__INDUSTRY = eINSTANCE.getOrganization_Industry();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__URL = eINSTANCE.getOrganization_Url();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__LOCATION = eINSTANCE.getOrganization_Location();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.LocationImpl
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__COUNTRY = eINSTANCE.getLocation_Country();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__STATE = eINSTANCE.getLocation_State();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__CITY = eINSTANCE.getLocation_City();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.ContactMethod <em>Contact Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.ContactMethod
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getContactMethod()
		 * @generated
		 */
		EClass CONTACT_METHOD = eINSTANCE.getContactMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_METHOD__NAME = eINSTANCE.getContactMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_METHOD__DESCRIPTION = eINSTANCE.getContactMethod_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.EmailImpl <em>Email</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.EmailImpl
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getEmail()
		 * @generated
		 */
		EClass EMAIL = eINSTANCE.getEmail();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL__ADDRESS = eINSTANCE.getEmail_Address();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.PhoneImpl <em>Phone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.PhoneImpl
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getPhone()
		 * @generated
		 */
		EClass PHONE = eINSTANCE.getPhone();

		/**
		 * The meta object literal for the '<em><b>Country Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONE__COUNTRY_CODE = eINSTANCE.getPhone_CountryCode();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONE__NUMBER = eINSTANCE.getPhone_Number();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONE__EXTENSION = eINSTANCE.getPhone_Extension();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.impl.WebAddressImpl <em>Web Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.WebAddressImpl
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getWebAddress()
		 * @generated
		 */
		EClass WEB_ADDRESS = eINSTANCE.getWebAddress();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ADDRESS__URL = eINSTANCE.getWebAddress_Url();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ADDRESS__PLATFORM = eINSTANCE.getWebAddress_Platform();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.SkillMastery <em>Skill Mastery</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.SkillMastery
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getSkillMastery()
		 * @generated
		 */
		EEnum SKILL_MASTERY = eINSTANCE.getSkillMastery();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.CredentialStatus <em>Credential Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.CredentialStatus
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getCredentialStatus()
		 * @generated
		 */
		EEnum CREDENTIAL_STATUS = eINSTANCE.getCredentialStatus();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.professionalknowledgegraph.EffortStatus <em>Effort Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.professionalknowledgegraph.EffortStatus
		 * @see org.nasdanika.models.professionalknowledgegraph.impl.ProfessionalKnowledgeGraphPackageImpl#getEffortStatus()
		 * @generated
		 */
		EEnum EFFORT_STATUS = eINSTANCE.getEffortStatus();

	}

} //ProfessionalKnowledgeGraphPackage
