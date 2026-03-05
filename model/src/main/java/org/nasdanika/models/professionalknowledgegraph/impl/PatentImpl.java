/**
 */
package org.nasdanika.models.professionalknowledgegraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.professionalknowledgegraph.Patent;
import org.nasdanika.models.professionalknowledgegraph.Person;
import org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PatentImpl#getPatentNumber <em>Patent Number</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PatentImpl#getInventors <em>Inventors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatentImpl extends CredentialImpl implements Patent {
	/**
	 * The default value of the '{@link #getPatentNumber() <em>Patent Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatentNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PATENT_NUMBER_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfessionalKnowledgeGraphPackage.Literals.PATENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPatentNumber() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.PATENT__PATENT_NUMBER, ProfessionalKnowledgeGraphPackage.Literals.PATENT__PATENT_NUMBER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatentNumber(String newPatentNumber) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.PATENT__PATENT_NUMBER, ProfessionalKnowledgeGraphPackage.Literals.PATENT__PATENT_NUMBER, newPatentNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Person> getInventors() {
		return (EList<Person>)eDynamicGet(ProfessionalKnowledgeGraphPackage.PATENT__INVENTORS, ProfessionalKnowledgeGraphPackage.Literals.PATENT__INVENTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.PATENT__PATENT_NUMBER:
				return getPatentNumber();
			case ProfessionalKnowledgeGraphPackage.PATENT__INVENTORS:
				return getInventors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.PATENT__PATENT_NUMBER:
				setPatentNumber((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.PATENT__INVENTORS:
				getInventors().clear();
				getInventors().addAll((Collection<? extends Person>)newValue);
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
			case ProfessionalKnowledgeGraphPackage.PATENT__PATENT_NUMBER:
				setPatentNumber(PATENT_NUMBER_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.PATENT__INVENTORS:
				getInventors().clear();
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
			case ProfessionalKnowledgeGraphPackage.PATENT__PATENT_NUMBER:
				return PATENT_NUMBER_EDEFAULT == null ? getPatentNumber() != null : !PATENT_NUMBER_EDEFAULT.equals(getPatentNumber());
			case ProfessionalKnowledgeGraphPackage.PATENT__INVENTORS:
				return !getInventors().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PatentImpl
