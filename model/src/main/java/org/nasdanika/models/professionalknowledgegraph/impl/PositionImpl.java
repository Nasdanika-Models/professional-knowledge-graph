/**
 */
package org.nasdanika.models.professionalknowledgegraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.professionalknowledgegraph.Activity;
import org.nasdanika.models.professionalknowledgegraph.Location;
import org.nasdanika.models.professionalknowledgegraph.Organization;
import org.nasdanika.models.professionalknowledgegraph.Position;
import org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PositionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PositionImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PositionImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PositionImpl#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionImpl extends EffortImpl implements Position {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfessionalKnowledgeGraphPackage.Literals.POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.POSITION__TITLE, ProfessionalKnowledgeGraphPackage.Literals.POSITION__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.POSITION__TITLE, ProfessionalKnowledgeGraphPackage.Literals.POSITION__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Organization getOrganization() {
		return (Organization)eDynamicGet(ProfessionalKnowledgeGraphPackage.POSITION__ORGANIZATION, ProfessionalKnowledgeGraphPackage.Literals.POSITION__ORGANIZATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetOrganization() {
		return (Organization)eDynamicGet(ProfessionalKnowledgeGraphPackage.POSITION__ORGANIZATION, ProfessionalKnowledgeGraphPackage.Literals.POSITION__ORGANIZATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganization(Organization newOrganization) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.POSITION__ORGANIZATION, ProfessionalKnowledgeGraphPackage.Literals.POSITION__ORGANIZATION, newOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location getLocation() {
		return (Location)eDynamicGet(ProfessionalKnowledgeGraphPackage.POSITION__LOCATION, ProfessionalKnowledgeGraphPackage.Literals.POSITION__LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return (Location)eDynamicGet(ProfessionalKnowledgeGraphPackage.POSITION__LOCATION, ProfessionalKnowledgeGraphPackage.Literals.POSITION__LOCATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(Location newLocation) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.POSITION__LOCATION, ProfessionalKnowledgeGraphPackage.Literals.POSITION__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Activity> getActivities() {
		return (EList<Activity>)eDynamicGet(ProfessionalKnowledgeGraphPackage.POSITION__ACTIVITIES, ProfessionalKnowledgeGraphPackage.Literals.POSITION__ACTIVITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.POSITION__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.POSITION__TITLE:
				return getTitle();
			case ProfessionalKnowledgeGraphPackage.POSITION__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case ProfessionalKnowledgeGraphPackage.POSITION__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case ProfessionalKnowledgeGraphPackage.POSITION__ACTIVITIES:
				return getActivities();
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
			case ProfessionalKnowledgeGraphPackage.POSITION__TITLE:
				setTitle((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.POSITION__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.POSITION__LOCATION:
				setLocation((Location)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.POSITION__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
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
			case ProfessionalKnowledgeGraphPackage.POSITION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.POSITION__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case ProfessionalKnowledgeGraphPackage.POSITION__LOCATION:
				setLocation((Location)null);
				return;
			case ProfessionalKnowledgeGraphPackage.POSITION__ACTIVITIES:
				getActivities().clear();
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
			case ProfessionalKnowledgeGraphPackage.POSITION__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case ProfessionalKnowledgeGraphPackage.POSITION__ORGANIZATION:
				return basicGetOrganization() != null;
			case ProfessionalKnowledgeGraphPackage.POSITION__LOCATION:
				return basicGetLocation() != null;
			case ProfessionalKnowledgeGraphPackage.POSITION__ACTIVITIES:
				return !getActivities().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PositionImpl
