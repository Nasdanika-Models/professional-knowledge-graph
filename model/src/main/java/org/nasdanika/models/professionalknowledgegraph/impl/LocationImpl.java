/**
 */
package org.nasdanika.models.professionalknowledgegraph.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.professionalknowledgegraph.Location;
import org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.LocationImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.LocationImpl#getState <em>State</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.LocationImpl#getCity <em>City</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends MinimalEObjectImpl.Container implements Location {
	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfessionalKnowledgeGraphPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountry() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.LOCATION__COUNTRY, ProfessionalKnowledgeGraphPackage.Literals.LOCATION__COUNTRY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountry(String newCountry) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.LOCATION__COUNTRY, ProfessionalKnowledgeGraphPackage.Literals.LOCATION__COUNTRY, newCountry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getState() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.LOCATION__STATE, ProfessionalKnowledgeGraphPackage.Literals.LOCATION__STATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(String newState) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.LOCATION__STATE, ProfessionalKnowledgeGraphPackage.Literals.LOCATION__STATE, newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCity() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.LOCATION__CITY, ProfessionalKnowledgeGraphPackage.Literals.LOCATION__CITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(String newCity) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.LOCATION__CITY, ProfessionalKnowledgeGraphPackage.Literals.LOCATION__CITY, newCity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.LOCATION__COUNTRY:
				return getCountry();
			case ProfessionalKnowledgeGraphPackage.LOCATION__STATE:
				return getState();
			case ProfessionalKnowledgeGraphPackage.LOCATION__CITY:
				return getCity();
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
			case ProfessionalKnowledgeGraphPackage.LOCATION__COUNTRY:
				setCountry((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.LOCATION__STATE:
				setState((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.LOCATION__CITY:
				setCity((String)newValue);
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
			case ProfessionalKnowledgeGraphPackage.LOCATION__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.LOCATION__STATE:
				setState(STATE_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.LOCATION__CITY:
				setCity(CITY_EDEFAULT);
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
			case ProfessionalKnowledgeGraphPackage.LOCATION__COUNTRY:
				return COUNTRY_EDEFAULT == null ? getCountry() != null : !COUNTRY_EDEFAULT.equals(getCountry());
			case ProfessionalKnowledgeGraphPackage.LOCATION__STATE:
				return STATE_EDEFAULT == null ? getState() != null : !STATE_EDEFAULT.equals(getState());
			case ProfessionalKnowledgeGraphPackage.LOCATION__CITY:
				return CITY_EDEFAULT == null ? getCity() != null : !CITY_EDEFAULT.equals(getCity());
		}
		return super.eIsSet(featureID);
	}

} //LocationImpl
