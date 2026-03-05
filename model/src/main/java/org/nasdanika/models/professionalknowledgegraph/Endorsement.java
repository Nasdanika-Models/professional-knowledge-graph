/**
 */
package org.nasdanika.models.professionalknowledgegraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endorsement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An endorsement of a skill by another person, such as a LinkedIn skill endorsement or a letter of recommendation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Endorsement#getEndorsedBy <em>Endorsed By</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Endorsement#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getEndorsement()
 * @model
 * @generated
 */
public interface Endorsement extends Credential {
	/**
	 * Returns the value of the '<em><b>Endorsed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person who provided this endorsement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endorsed By</em>' reference.
	 * @see #setEndorsedBy(Person)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getEndorsement_EndorsedBy()
	 * @model
	 * @generated
	 */
	Person getEndorsedBy();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Endorsement#getEndorsedBy <em>Endorsed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endorsed By</em>' reference.
	 * @see #getEndorsedBy()
	 * @generated
	 */
	void setEndorsedBy(Person value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text of the endorsement or recommendation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getEndorsement_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Endorsement#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Endorsement
