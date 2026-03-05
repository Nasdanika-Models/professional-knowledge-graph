/**
 */
package org.nasdanika.models.professionalknowledgegraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Award</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An award or recognition received by the person.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Award#getIssuer <em>Issuer</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getAward()
 * @model
 * @generated
 */
public interface Award extends Credential {
	/**
	 * Returns the value of the '<em><b>Issuer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organization or authority that issued the award.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issuer</em>' attribute.
	 * @see #setIssuer(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getAward_Issuer()
	 * @model
	 * @generated
	 */
	String getIssuer();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Award#getIssuer <em>Issuer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer</em>' attribute.
	 * @see #getIssuer()
	 * @generated
	 */
	void setIssuer(String value);

} // Award
