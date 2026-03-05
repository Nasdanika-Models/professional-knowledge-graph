/**
 */
package org.nasdanika.models.professionalknowledgegraph.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.professionalknowledgegraph.Effort;
import org.nasdanika.models.professionalknowledgegraph.EffortStatus;
import org.nasdanika.models.professionalknowledgegraph.Person;
import org.nasdanika.models.professionalknowledgegraph.PlannedRole;
import org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage;
import org.nasdanika.models.professionalknowledgegraph.Skill;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.EffortImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.EffortImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.EffortImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.EffortImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.EffortImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.EffortImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.EffortImpl#getCollaborators <em>Collaborators</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.EffortImpl#getPlannedRoles <em>Planned Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EffortImpl extends MinimalEObjectImpl.Container implements Effort {
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
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final EffortStatus STATUS_EDEFAULT = EffortStatus.IDEA;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfessionalKnowledgeGraphPackage.Literals.EFFORT;
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
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.EFFORT__NAME, ProfessionalKnowledgeGraphPackage.Literals.EFFORT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.EFFORT__NAME, ProfessionalKnowledgeGraphPackage.Literals.EFFORT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.EFFORT__DESCRIPTION, ProfessionalKnowledgeGraphPackage.Literals.EFFORT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.EFFORT__DESCRIPTION, ProfessionalKnowledgeGraphPackage.Literals.EFFORT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return (Date)eDynamicGet(ProfessionalKnowledgeGraphPackage.EFFORT__START_DATE, ProfessionalKnowledgeGraphPackage.Literals.EFFORT__START_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.EFFORT__START_DATE, ProfessionalKnowledgeGraphPackage.Literals.EFFORT__START_DATE, newStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEndDate() {
		return (Date)eDynamicGet(ProfessionalKnowledgeGraphPackage.EFFORT__END_DATE, ProfessionalKnowledgeGraphPackage.Literals.EFFORT__END_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(Date newEndDate) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.EFFORT__END_DATE, ProfessionalKnowledgeGraphPackage.Literals.EFFORT__END_DATE, newEndDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EffortStatus getStatus() {
		return (EffortStatus)eDynamicGet(ProfessionalKnowledgeGraphPackage.EFFORT__STATUS, ProfessionalKnowledgeGraphPackage.Literals.EFFORT__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(EffortStatus newStatus) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.EFFORT__STATUS, ProfessionalKnowledgeGraphPackage.Literals.EFFORT__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Skill> getSkills() {
		return (EList<Skill>)eDynamicGet(ProfessionalKnowledgeGraphPackage.EFFORT__SKILLS, ProfessionalKnowledgeGraphPackage.Literals.EFFORT__SKILLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Person> getCollaborators() {
		return (EList<Person>)eDynamicGet(ProfessionalKnowledgeGraphPackage.EFFORT__COLLABORATORS, ProfessionalKnowledgeGraphPackage.Literals.EFFORT__COLLABORATORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PlannedRole> getPlannedRoles() {
		return (EList<PlannedRole>)eDynamicGet(ProfessionalKnowledgeGraphPackage.EFFORT__PLANNED_ROLES, ProfessionalKnowledgeGraphPackage.Literals.EFFORT__PLANNED_ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.EFFORT__PLANNED_ROLES:
				return ((InternalEList<?>)getPlannedRoles()).basicRemove(otherEnd, msgs);
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
			case ProfessionalKnowledgeGraphPackage.EFFORT__NAME:
				return getName();
			case ProfessionalKnowledgeGraphPackage.EFFORT__DESCRIPTION:
				return getDescription();
			case ProfessionalKnowledgeGraphPackage.EFFORT__START_DATE:
				return getStartDate();
			case ProfessionalKnowledgeGraphPackage.EFFORT__END_DATE:
				return getEndDate();
			case ProfessionalKnowledgeGraphPackage.EFFORT__STATUS:
				return getStatus();
			case ProfessionalKnowledgeGraphPackage.EFFORT__SKILLS:
				return getSkills();
			case ProfessionalKnowledgeGraphPackage.EFFORT__COLLABORATORS:
				return getCollaborators();
			case ProfessionalKnowledgeGraphPackage.EFFORT__PLANNED_ROLES:
				return getPlannedRoles();
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
			case ProfessionalKnowledgeGraphPackage.EFFORT__NAME:
				setName((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.EFFORT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.EFFORT__START_DATE:
				setStartDate((Date)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.EFFORT__END_DATE:
				setEndDate((Date)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.EFFORT__STATUS:
				setStatus((EffortStatus)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.EFFORT__SKILLS:
				getSkills().clear();
				getSkills().addAll((Collection<? extends Skill>)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.EFFORT__COLLABORATORS:
				getCollaborators().clear();
				getCollaborators().addAll((Collection<? extends Person>)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.EFFORT__PLANNED_ROLES:
				getPlannedRoles().clear();
				getPlannedRoles().addAll((Collection<? extends PlannedRole>)newValue);
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
			case ProfessionalKnowledgeGraphPackage.EFFORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.EFFORT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.EFFORT__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.EFFORT__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.EFFORT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.EFFORT__SKILLS:
				getSkills().clear();
				return;
			case ProfessionalKnowledgeGraphPackage.EFFORT__COLLABORATORS:
				getCollaborators().clear();
				return;
			case ProfessionalKnowledgeGraphPackage.EFFORT__PLANNED_ROLES:
				getPlannedRoles().clear();
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
			case ProfessionalKnowledgeGraphPackage.EFFORT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ProfessionalKnowledgeGraphPackage.EFFORT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case ProfessionalKnowledgeGraphPackage.EFFORT__START_DATE:
				return START_DATE_EDEFAULT == null ? getStartDate() != null : !START_DATE_EDEFAULT.equals(getStartDate());
			case ProfessionalKnowledgeGraphPackage.EFFORT__END_DATE:
				return END_DATE_EDEFAULT == null ? getEndDate() != null : !END_DATE_EDEFAULT.equals(getEndDate());
			case ProfessionalKnowledgeGraphPackage.EFFORT__STATUS:
				return getStatus() != STATUS_EDEFAULT;
			case ProfessionalKnowledgeGraphPackage.EFFORT__SKILLS:
				return !getSkills().isEmpty();
			case ProfessionalKnowledgeGraphPackage.EFFORT__COLLABORATORS:
				return !getCollaborators().isEmpty();
			case ProfessionalKnowledgeGraphPackage.EFFORT__PLANNED_ROLES:
				return !getPlannedRoles().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EffortImpl
