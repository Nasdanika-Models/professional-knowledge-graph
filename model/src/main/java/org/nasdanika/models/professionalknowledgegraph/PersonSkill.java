/**
 */
package org.nasdanika.models.professionalknowledgegraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Skill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Associates a skill with a person, capturing mastery level and whether improvement is desired.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.PersonSkill#getSkill <em>Skill</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.PersonSkill#getMastery <em>Mastery</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.PersonSkill#isDesired <em>Desired</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.PersonSkill#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPersonSkill()
 * @model
 * @generated
 */
public interface PersonSkill extends EObject {
	/**
	 * Returns the value of the '<em><b>Skill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The skill this entry refers to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skill</em>' reference.
	 * @see #setSkill(Skill)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPersonSkill_Skill()
	 * @model required="true"
	 * @generated
	 */
	Skill getSkill();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.PersonSkill#getSkill <em>Skill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill</em>' reference.
	 * @see #getSkill()
	 * @generated
	 */
	void setSkill(Skill value);

	/**
	 * Returns the value of the '<em><b>Mastery</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.professionalknowledgegraph.SkillMastery}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current level of mastery the person has in this skill.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mastery</em>' attribute.
	 * @see org.nasdanika.models.professionalknowledgegraph.SkillMastery
	 * @see #setMastery(SkillMastery)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPersonSkill_Mastery()
	 * @model
	 * @generated
	 */
	SkillMastery getMastery();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.PersonSkill#getMastery <em>Mastery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mastery</em>' attribute.
	 * @see org.nasdanika.models.professionalknowledgegraph.SkillMastery
	 * @see #getMastery()
	 * @generated
	 */
	void setMastery(SkillMastery value);

	/**
	 * Returns the value of the '<em><b>Desired</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the person desires to improve their mastery in this skill. False means the person has no plans to improve (e.g. they know of JavaScript but have no plans to improve).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Desired</em>' attribute.
	 * @see #setDesired(boolean)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPersonSkill_Desired()
	 * @model
	 * @generated
	 */
	boolean isDesired();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.PersonSkill#isDesired <em>Desired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired</em>' attribute.
	 * @see #isDesired()
	 * @generated
	 */
	void setDesired(boolean value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional notes about the person's experience or plans with this skill.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPersonSkill_Notes()
	 * @model
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.PersonSkill#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

} // PersonSkill
