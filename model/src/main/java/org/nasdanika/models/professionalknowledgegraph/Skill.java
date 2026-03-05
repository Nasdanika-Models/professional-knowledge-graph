/**
 */
package org.nasdanika.models.professionalknowledgegraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A capability or ability to achieve something. Skills can form a hierarchy (sub-skills) and a graph (related/prerequisite skills). Skills may require tools or other resources. Examples: Java, JDBC, Spring Boot, Public Speaking, Project Management.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Skill#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Skill#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Skill#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Skill#getRelatedSkills <em>Related Skills</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Skill#getPrerequisites <em>Prerequisites</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Skill#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getSkill()
 * @model
 * @generated
 */
public interface Skill extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the skill.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getSkill_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Skill#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the skill.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getSkill_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Skill#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Skills</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.professionalknowledgegraph.Skill}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sub-skills forming a hierarchy. For example, the Java skill may contain JDBC, Spring, Jakarta EE as sub-skills.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skills</em>' containment reference list.
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getSkill_Skills()
	 * @model containment="true"
	 * @generated
	 */
	EList<Skill> getSkills();

	/**
	 * Returns the value of the '<em><b>Related Skills</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.professionalknowledgegraph.Skill}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Skills that are closely related to this skill (graph relationship). For example, C and C++ are related; Python and R are related for data science.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Skills</em>' reference list.
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getSkill_RelatedSkills()
	 * @model
	 * @generated
	 */
	EList<Skill> getRelatedSkills();

	/**
	 * Returns the value of the '<em><b>Prerequisites</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.professionalknowledgegraph.Skill}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Skills that simplify learning this skill. Having a prerequisite skill makes it easier to acquire this skill. For example, knowing C simplifies learning C++; knowing Java simplifies learning Kotlin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prerequisites</em>' reference list.
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getSkill_Prerequisites()
	 * @model
	 * @generated
	 */
	EList<Skill> getPrerequisites();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.professionalknowledgegraph.SkillResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tools and other resources required or commonly used when applying this skill.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getSkill_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<SkillResource> getResources();

} // Skill
