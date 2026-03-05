/**
 */
package org.nasdanika.models.professionalknowledgegraph;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Certification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A professional certification issued by an organization or authority that validates specific skills or knowledge.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Certification#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Certification#getCredentialId <em>Credential Id</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Certification#getExpires <em>Expires</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getCertification()
 * @model
 * @generated
 */
public interface Certification extends Credential {
	/**
	 * Returns the value of the '<em><b>Issuer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the organization or authority that issued this certification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issuer</em>' attribute.
	 * @see #setIssuer(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getCertification_Issuer()
	 * @model
	 * @generated
	 */
	String getIssuer();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Certification#getIssuer <em>Issuer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer</em>' attribute.
	 * @see #getIssuer()
	 * @generated
	 */
	void setIssuer(String value);

	/**
	 * Returns the value of the '<em><b>Credential Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier or credential ID assigned by the issuer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Credential Id</em>' attribute.
	 * @see #setCredentialId(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getCertification_CredentialId()
	 * @model
	 * @generated
	 */
	String getCredentialId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Certification#getCredentialId <em>Credential Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credential Id</em>' attribute.
	 * @see #getCredentialId()
	 * @generated
	 */
	void setCredentialId(String value);

	/**
	 * Returns the value of the '<em><b>Expires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expiry date of the certification, if applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expires</em>' attribute.
	 * @see #setExpires(Date)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getCertification_Expires()
	 * @model
	 * @generated
	 */
	Date getExpires();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Certification#getExpires <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expires</em>' attribute.
	 * @see #getExpires()
	 * @generated
	 */
	void setExpires(Date value);

} // Certification
