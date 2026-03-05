/**
 */
package org.nasdanika.models.professionalknowledgegraph.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.professionalknowledgegraph.Location;
import org.nasdanika.models.professionalknowledgegraph.Organization;
import org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.OrganizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.OrganizationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.OrganizationImpl#getIndustry <em>Industry</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.OrganizationImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.OrganizationImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationImpl extends MinimalEObjectImpl.Container implements Organization {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIndustry() <em>Industry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndustry()
	 * @generated
	 * @ordered
	 */
	protected static final String INDUSTRY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfessionalKnowledgeGraphPackage.Literals.ORGANIZATION;
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
	public String getName() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.ORGANIZATION__NAME, ProfessionalKnowledgeGraphPackage.Literals.ORGANIZATION__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.ORGANIZATION__NAME, ProfessionalKnowledgeGraphPackage.Literals.ORGANIZATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.ORGANIZATION__DESCRIPTION, ProfessionalKnowledgeGraphPackage.Literals.ORGANIZATION__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.ORGANIZATION__DESCRIPTION, ProfessionalKnowledgeGraphPackage.Literals.ORGANIZATION__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIndustry() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.ORGANIZATION__INDUSTRY, ProfessionalKnowledgeGraphPackage.Literals.ORGANIZATION__INDUSTRY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndustry(String newIndustry) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.ORGANIZATION__INDUSTRY, ProfessionalKnowledgeGraphPackage.Literals.ORGANIZATION__INDUSTRY, newIndustry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.ORGANIZATION__URL, ProfessionalKnowledgeGraphPackage.Literals.ORGANIZATION__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.ORGANIZATION__URL, ProfessionalKnowledgeGraphPackage.Literals.ORGANIZATION__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location getLocation() {
		return (Location)eDynamicGet(ProfessionalKnowledgeGraphPackage.ORGANIZATION__LOCATION, ProfessionalKnowledgeGraphPackage.Literals.ORGANIZATION__LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return (Location)eDynamicGet(ProfessionalKnowledgeGraphPackage.ORGANIZATION__LOCATION, ProfessionalKnowledgeGraphPackage.Literals.ORGANIZATION__LOCATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(Location newLocation) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.ORGANIZATION__LOCATION, ProfessionalKnowledgeGraphPackage.Literals.ORGANIZATION__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.ORGANIZATION__NAME:
				return getName();
			case ProfessionalKnowledgeGraphPackage.ORGANIZATION__DESCRIPTION:
				return getDescription();
			case ProfessionalKnowledgeGraphPackage.ORGANIZATION__INDUSTRY:
				return getIndustry();
			case ProfessionalKnowledgeGraphPackage.ORGANIZATION__URL:
				return getUrl();
			case ProfessionalKnowledgeGraphPackage.ORGANIZATION__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
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
			case ProfessionalKnowledgeGraphPackage.ORGANIZATION__NAME:
				setName((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.ORGANIZATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.ORGANIZATION__INDUSTRY:
				setIndustry((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.ORGANIZATION__URL:
				setUrl((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.ORGANIZATION__LOCATION:
				setLocation((Location)newValue);
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
			case ProfessionalKnowledgeGraphPackage.ORGANIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.ORGANIZATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.ORGANIZATION__INDUSTRY:
				setIndustry(INDUSTRY_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.ORGANIZATION__URL:
				setUrl(URL_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.ORGANIZATION__LOCATION:
				setLocation((Location)null);
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
			case ProfessionalKnowledgeGraphPackage.ORGANIZATION__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ProfessionalKnowledgeGraphPackage.ORGANIZATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case ProfessionalKnowledgeGraphPackage.ORGANIZATION__INDUSTRY:
				return INDUSTRY_EDEFAULT == null ? getIndustry() != null : !INDUSTRY_EDEFAULT.equals(getIndustry());
			case ProfessionalKnowledgeGraphPackage.ORGANIZATION__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
			case ProfessionalKnowledgeGraphPackage.ORGANIZATION__LOCATION:
				return basicGetLocation() != null;
		}
		return super.eIsSet(featureID);
	}

} //OrganizationImpl
