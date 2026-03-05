/**
 */
package org.nasdanika.models.professionalknowledgegraph.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.professionalknowledgegraph.Award;
import org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Award</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.AwardImpl#getIssuer <em>Issuer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AwardImpl extends CredentialImpl implements Award {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AwardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfessionalKnowledgeGraphPackage.Literals.AWARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssuer() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.AWARD__ISSUER, ProfessionalKnowledgeGraphPackage.Literals.AWARD__ISSUER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssuer(String newIssuer) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.AWARD__ISSUER, ProfessionalKnowledgeGraphPackage.Literals.AWARD__ISSUER, newIssuer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.AWARD__ISSUER:
				return getIssuer();
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
			case ProfessionalKnowledgeGraphPackage.AWARD__ISSUER:
				setIssuer((String)newValue);
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
			case ProfessionalKnowledgeGraphPackage.AWARD__ISSUER:
				setIssuer(ISSUER_EDEFAULT);
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
			case ProfessionalKnowledgeGraphPackage.AWARD__ISSUER:
				return ISSUER_EDEFAULT == null ? getIssuer() != null : !ISSUER_EDEFAULT.equals(getIssuer());
		}
		return super.eIsSet(featureID);
	}

} //AwardImpl
