/**
 */
package org.nasdanika.models.professionalknowledgegraph.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.professionalknowledgegraph.Endorsement;
import org.nasdanika.models.professionalknowledgegraph.Person;
import org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endorsement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.EndorsementImpl#getEndorsedBy <em>Endorsed By</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.EndorsementImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndorsementImpl extends CredentialImpl implements Endorsement {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndorsementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfessionalKnowledgeGraphPackage.Literals.ENDORSEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getEndorsedBy() {
		return (Person)eDynamicGet(ProfessionalKnowledgeGraphPackage.ENDORSEMENT__ENDORSED_BY, ProfessionalKnowledgeGraphPackage.Literals.ENDORSEMENT__ENDORSED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetEndorsedBy() {
		return (Person)eDynamicGet(ProfessionalKnowledgeGraphPackage.ENDORSEMENT__ENDORSED_BY, ProfessionalKnowledgeGraphPackage.Literals.ENDORSEMENT__ENDORSED_BY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndorsedBy(Person newEndorsedBy) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.ENDORSEMENT__ENDORSED_BY, ProfessionalKnowledgeGraphPackage.Literals.ENDORSEMENT__ENDORSED_BY, newEndorsedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.ENDORSEMENT__TEXT, ProfessionalKnowledgeGraphPackage.Literals.ENDORSEMENT__TEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.ENDORSEMENT__TEXT, ProfessionalKnowledgeGraphPackage.Literals.ENDORSEMENT__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.ENDORSEMENT__ENDORSED_BY:
				if (resolve) return getEndorsedBy();
				return basicGetEndorsedBy();
			case ProfessionalKnowledgeGraphPackage.ENDORSEMENT__TEXT:
				return getText();
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
			case ProfessionalKnowledgeGraphPackage.ENDORSEMENT__ENDORSED_BY:
				setEndorsedBy((Person)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.ENDORSEMENT__TEXT:
				setText((String)newValue);
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
			case ProfessionalKnowledgeGraphPackage.ENDORSEMENT__ENDORSED_BY:
				setEndorsedBy((Person)null);
				return;
			case ProfessionalKnowledgeGraphPackage.ENDORSEMENT__TEXT:
				setText(TEXT_EDEFAULT);
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
			case ProfessionalKnowledgeGraphPackage.ENDORSEMENT__ENDORSED_BY:
				return basicGetEndorsedBy() != null;
			case ProfessionalKnowledgeGraphPackage.ENDORSEMENT__TEXT:
				return TEXT_EDEFAULT == null ? getText() != null : !TEXT_EDEFAULT.equals(getText());
		}
		return super.eIsSet(featureID);
	}

} //EndorsementImpl
