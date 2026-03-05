/**
 */
package org.nasdanika.models.professionalknowledgegraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.professionalknowledgegraph.PlannedRole;
import org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage;
import org.nasdanika.models.professionalknowledgegraph.Skill;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PlannedRoleImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PlannedRoleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PlannedRoleImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PlannedRoleImpl#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlannedRoleImpl extends MinimalEObjectImpl.Container implements PlannedRole {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfessionalKnowledgeGraphPackage.Literals.PLANNED_ROLE;
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
	public String getTitle() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__TITLE, ProfessionalKnowledgeGraphPackage.Literals.PLANNED_ROLE__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__TITLE, ProfessionalKnowledgeGraphPackage.Literals.PLANNED_ROLE__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__DESCRIPTION, ProfessionalKnowledgeGraphPackage.Literals.PLANNED_ROLE__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__DESCRIPTION, ProfessionalKnowledgeGraphPackage.Literals.PLANNED_ROLE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Skill> getSkills() {
		return (EList<Skill>)eDynamicGet(ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__SKILLS, ProfessionalKnowledgeGraphPackage.Literals.PLANNED_ROLE__SKILLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCount() {
		return (Integer)eDynamicGet(ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__COUNT, ProfessionalKnowledgeGraphPackage.Literals.PLANNED_ROLE__COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount(int newCount) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__COUNT, ProfessionalKnowledgeGraphPackage.Literals.PLANNED_ROLE__COUNT, newCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__TITLE:
				return getTitle();
			case ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__DESCRIPTION:
				return getDescription();
			case ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__SKILLS:
				return getSkills();
			case ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__COUNT:
				return getCount();
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
			case ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__TITLE:
				setTitle((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__SKILLS:
				getSkills().clear();
				getSkills().addAll((Collection<? extends Skill>)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__COUNT:
				setCount((Integer)newValue);
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
			case ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__SKILLS:
				getSkills().clear();
				return;
			case ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__COUNT:
				setCount(COUNT_EDEFAULT);
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
			case ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__SKILLS:
				return !getSkills().isEmpty();
			case ProfessionalKnowledgeGraphPackage.PLANNED_ROLE__COUNT:
				return getCount() != COUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //PlannedRoleImpl
