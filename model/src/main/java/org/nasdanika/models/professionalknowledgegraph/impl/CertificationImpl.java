/**
 */
package org.nasdanika.models.professionalknowledgegraph.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.professionalknowledgegraph.Certification;
import org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Certification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.CertificationImpl#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.CertificationImpl#getCredentialId <em>Credential Id</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.CertificationImpl#getExpires <em>Expires</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CertificationImpl extends CredentialImpl implements Certification {
	/**
	 * The default value of the '{@link #getIssuer() <em>Issuer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuer()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCredentialId() <em>Credential Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentialId()
	 * @generated
	 * @ordered
	 */
	protected static final String CREDENTIAL_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExpires() <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpires()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPIRES_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CertificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfessionalKnowledgeGraphPackage.Literals.CERTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssuer() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.CERTIFICATION__ISSUER, ProfessionalKnowledgeGraphPackage.Literals.CERTIFICATION__ISSUER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssuer(String newIssuer) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.CERTIFICATION__ISSUER, ProfessionalKnowledgeGraphPackage.Literals.CERTIFICATION__ISSUER, newIssuer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCredentialId() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.CERTIFICATION__CREDENTIAL_ID, ProfessionalKnowledgeGraphPackage.Literals.CERTIFICATION__CREDENTIAL_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCredentialId(String newCredentialId) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.CERTIFICATION__CREDENTIAL_ID, ProfessionalKnowledgeGraphPackage.Literals.CERTIFICATION__CREDENTIAL_ID, newCredentialId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExpires() {
		return (Date)eDynamicGet(ProfessionalKnowledgeGraphPackage.CERTIFICATION__EXPIRES, ProfessionalKnowledgeGraphPackage.Literals.CERTIFICATION__EXPIRES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpires(Date newExpires) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.CERTIFICATION__EXPIRES, ProfessionalKnowledgeGraphPackage.Literals.CERTIFICATION__EXPIRES, newExpires);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.CERTIFICATION__ISSUER:
				return getIssuer();
			case ProfessionalKnowledgeGraphPackage.CERTIFICATION__CREDENTIAL_ID:
				return getCredentialId();
			case ProfessionalKnowledgeGraphPackage.CERTIFICATION__EXPIRES:
				return getExpires();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.CERTIFICATION__ISSUER:
				setIssuer((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.CERTIFICATION__CREDENTIAL_ID:
				setCredentialId((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.CERTIFICATION__EXPIRES:
				setExpires((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.CERTIFICATION__ISSUER:
				setIssuer(ISSUER_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.CERTIFICATION__CREDENTIAL_ID:
				setCredentialId(CREDENTIAL_ID_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.CERTIFICATION__EXPIRES:
				setExpires(EXPIRES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.CERTIFICATION__ISSUER:
				return ISSUER_EDEFAULT == null ? getIssuer() != null : !ISSUER_EDEFAULT.equals(getIssuer());
			case ProfessionalKnowledgeGraphPackage.CERTIFICATION__CREDENTIAL_ID:
				return CREDENTIAL_ID_EDEFAULT == null ? getCredentialId() != null : !CREDENTIAL_ID_EDEFAULT.equals(getCredentialId());
			case ProfessionalKnowledgeGraphPackage.CERTIFICATION__EXPIRES:
				return EXPIRES_EDEFAULT == null ? getExpires() != null : !EXPIRES_EDEFAULT.equals(getExpires());
		}
		return super.eIsSet(featureID);
	}

} //CertificationImpl
