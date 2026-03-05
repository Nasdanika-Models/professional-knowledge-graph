/**
 */
package org.nasdanika.models.professionalknowledgegraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specific project, assignment, or activity carried out as part of a position or independently. Activities are concrete deliverable-focused units of work within an engagement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Activity#getOutcomes <em>Outcomes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends Effort {
	/**
	 * Returns the value of the '<em><b>Outcomes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outcomes, results, or achievements of this activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcomes</em>' attribute.
	 * @see #setOutcomes(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getActivity_Outcomes()
	 * @model
	 * @generated
	 */
	String getOutcomes();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Activity#getOutcomes <em>Outcomes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcomes</em>' attribute.
	 * @see #getOutcomes()
	 * @generated
	 */
	void setOutcomes(String value);

} // Activity
