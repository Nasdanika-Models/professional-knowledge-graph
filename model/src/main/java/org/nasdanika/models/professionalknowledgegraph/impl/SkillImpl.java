/**
 */
package org.nasdanika.models.professionalknowledgegraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage;
import org.nasdanika.models.professionalknowledgegraph.Skill;
import org.nasdanika.models.professionalknowledgegraph.SkillResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.SkillImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.SkillImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.SkillImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.SkillImpl#getRelatedSkills <em>Related Skills</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.SkillImpl#getPrerequisites <em>Prerequisites</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.SkillImpl#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkillImpl extends MinimalEObjectImpl.Container implements Skill {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfessionalKnowledgeGraphPackage.Literals.SKILL;
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
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.SKILL__NAME, ProfessionalKnowledgeGraphPackage.Literals.SKILL__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.SKILL__NAME, ProfessionalKnowledgeGraphPackage.Literals.SKILL__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.SKILL__DESCRIPTION, ProfessionalKnowledgeGraphPackage.Literals.SKILL__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.SKILL__DESCRIPTION, ProfessionalKnowledgeGraphPackage.Literals.SKILL__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Skill> getSkills() {
		return (EList<Skill>)eDynamicGet(ProfessionalKnowledgeGraphPackage.SKILL__SKILLS, ProfessionalKnowledgeGraphPackage.Literals.SKILL__SKILLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Skill> getRelatedSkills() {
		return (EList<Skill>)eDynamicGet(ProfessionalKnowledgeGraphPackage.SKILL__RELATED_SKILLS, ProfessionalKnowledgeGraphPackage.Literals.SKILL__RELATED_SKILLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Skill> getPrerequisites() {
		return (EList<Skill>)eDynamicGet(ProfessionalKnowledgeGraphPackage.SKILL__PREREQUISITES, ProfessionalKnowledgeGraphPackage.Literals.SKILL__PREREQUISITES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SkillResource> getResources() {
		return (EList<SkillResource>)eDynamicGet(ProfessionalKnowledgeGraphPackage.SKILL__RESOURCES, ProfessionalKnowledgeGraphPackage.Literals.SKILL__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.SKILL__SKILLS:
				return ((InternalEList<?>)getSkills()).basicRemove(otherEnd, msgs);
			case ProfessionalKnowledgeGraphPackage.SKILL__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
			case ProfessionalKnowledgeGraphPackage.SKILL__NAME:
				return getName();
			case ProfessionalKnowledgeGraphPackage.SKILL__DESCRIPTION:
				return getDescription();
			case ProfessionalKnowledgeGraphPackage.SKILL__SKILLS:
				return getSkills();
			case ProfessionalKnowledgeGraphPackage.SKILL__RELATED_SKILLS:
				return getRelatedSkills();
			case ProfessionalKnowledgeGraphPackage.SKILL__PREREQUISITES:
				return getPrerequisites();
			case ProfessionalKnowledgeGraphPackage.SKILL__RESOURCES:
				return getResources();
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
			case ProfessionalKnowledgeGraphPackage.SKILL__NAME:
				setName((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.SKILL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.SKILL__SKILLS:
				getSkills().clear();
				getSkills().addAll((Collection<? extends Skill>)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.SKILL__RELATED_SKILLS:
				getRelatedSkills().clear();
				getRelatedSkills().addAll((Collection<? extends Skill>)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.SKILL__PREREQUISITES:
				getPrerequisites().clear();
				getPrerequisites().addAll((Collection<? extends Skill>)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.SKILL__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends SkillResource>)newValue);
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
			case ProfessionalKnowledgeGraphPackage.SKILL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.SKILL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.SKILL__SKILLS:
				getSkills().clear();
				return;
			case ProfessionalKnowledgeGraphPackage.SKILL__RELATED_SKILLS:
				getRelatedSkills().clear();
				return;
			case ProfessionalKnowledgeGraphPackage.SKILL__PREREQUISITES:
				getPrerequisites().clear();
				return;
			case ProfessionalKnowledgeGraphPackage.SKILL__RESOURCES:
				getResources().clear();
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
			case ProfessionalKnowledgeGraphPackage.SKILL__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ProfessionalKnowledgeGraphPackage.SKILL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case ProfessionalKnowledgeGraphPackage.SKILL__SKILLS:
				return !getSkills().isEmpty();
			case ProfessionalKnowledgeGraphPackage.SKILL__RELATED_SKILLS:
				return !getRelatedSkills().isEmpty();
			case ProfessionalKnowledgeGraphPackage.SKILL__PREREQUISITES:
				return !getPrerequisites().isEmpty();
			case ProfessionalKnowledgeGraphPackage.SKILL__RESOURCES:
				return !getResources().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SkillImpl
