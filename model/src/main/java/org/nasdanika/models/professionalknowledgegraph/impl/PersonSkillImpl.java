/**
 */
package org.nasdanika.models.professionalknowledgegraph.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.professionalknowledgegraph.PersonSkill;
import org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage;
import org.nasdanika.models.professionalknowledgegraph.Skill;
import org.nasdanika.models.professionalknowledgegraph.SkillMastery;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Skill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PersonSkillImpl#getSkill <em>Skill</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PersonSkillImpl#getMastery <em>Mastery</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PersonSkillImpl#isDesired <em>Desired</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PersonSkillImpl#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonSkillImpl extends MinimalEObjectImpl.Container implements PersonSkill {
	/**
	 * The default value of the '{@link #getMastery() <em>Mastery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMastery()
	 * @generated
	 * @ordered
	 */
	protected static final SkillMastery MASTERY_EDEFAULT = SkillMastery.HEARD_OF;

	/**
	 * The default value of the '{@link #isDesired() <em>Desired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDesired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DESIRED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonSkillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfessionalKnowledgeGraphPackage.Literals.PERSON_SKILL;
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
	public Skill getSkill() {
		return (Skill)eDynamicGet(ProfessionalKnowledgeGraphPackage.PERSON_SKILL__SKILL, ProfessionalKnowledgeGraphPackage.Literals.PERSON_SKILL__SKILL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Skill basicGetSkill() {
		return (Skill)eDynamicGet(ProfessionalKnowledgeGraphPackage.PERSON_SKILL__SKILL, ProfessionalKnowledgeGraphPackage.Literals.PERSON_SKILL__SKILL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkill(Skill newSkill) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.PERSON_SKILL__SKILL, ProfessionalKnowledgeGraphPackage.Literals.PERSON_SKILL__SKILL, newSkill);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkillMastery getMastery() {
		return (SkillMastery)eDynamicGet(ProfessionalKnowledgeGraphPackage.PERSON_SKILL__MASTERY, ProfessionalKnowledgeGraphPackage.Literals.PERSON_SKILL__MASTERY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMastery(SkillMastery newMastery) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.PERSON_SKILL__MASTERY, ProfessionalKnowledgeGraphPackage.Literals.PERSON_SKILL__MASTERY, newMastery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDesired() {
		return (Boolean)eDynamicGet(ProfessionalKnowledgeGraphPackage.PERSON_SKILL__DESIRED, ProfessionalKnowledgeGraphPackage.Literals.PERSON_SKILL__DESIRED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesired(boolean newDesired) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.PERSON_SKILL__DESIRED, ProfessionalKnowledgeGraphPackage.Literals.PERSON_SKILL__DESIRED, newDesired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotes() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.PERSON_SKILL__NOTES, ProfessionalKnowledgeGraphPackage.Literals.PERSON_SKILL__NOTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotes(String newNotes) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.PERSON_SKILL__NOTES, ProfessionalKnowledgeGraphPackage.Literals.PERSON_SKILL__NOTES, newNotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.PERSON_SKILL__SKILL:
				if (resolve) return getSkill();
				return basicGetSkill();
			case ProfessionalKnowledgeGraphPackage.PERSON_SKILL__MASTERY:
				return getMastery();
			case ProfessionalKnowledgeGraphPackage.PERSON_SKILL__DESIRED:
				return isDesired();
			case ProfessionalKnowledgeGraphPackage.PERSON_SKILL__NOTES:
				return getNotes();
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
			case ProfessionalKnowledgeGraphPackage.PERSON_SKILL__SKILL:
				setSkill((Skill)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.PERSON_SKILL__MASTERY:
				setMastery((SkillMastery)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.PERSON_SKILL__DESIRED:
				setDesired((Boolean)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.PERSON_SKILL__NOTES:
				setNotes((String)newValue);
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
			case ProfessionalKnowledgeGraphPackage.PERSON_SKILL__SKILL:
				setSkill((Skill)null);
				return;
			case ProfessionalKnowledgeGraphPackage.PERSON_SKILL__MASTERY:
				setMastery(MASTERY_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.PERSON_SKILL__DESIRED:
				setDesired(DESIRED_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.PERSON_SKILL__NOTES:
				setNotes(NOTES_EDEFAULT);
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
			case ProfessionalKnowledgeGraphPackage.PERSON_SKILL__SKILL:
				return basicGetSkill() != null;
			case ProfessionalKnowledgeGraphPackage.PERSON_SKILL__MASTERY:
				return getMastery() != MASTERY_EDEFAULT;
			case ProfessionalKnowledgeGraphPackage.PERSON_SKILL__DESIRED:
				return isDesired() != DESIRED_EDEFAULT;
			case ProfessionalKnowledgeGraphPackage.PERSON_SKILL__NOTES:
				return NOTES_EDEFAULT == null ? getNotes() != null : !NOTES_EDEFAULT.equals(getNotes());
		}
		return super.eIsSet(featureID);
	}

} //PersonSkillImpl
