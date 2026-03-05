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

import org.nasdanika.models.professionalknowledgegraph.ContactMethod;
import org.nasdanika.models.professionalknowledgegraph.Credential;
import org.nasdanika.models.professionalknowledgegraph.Effort;
import org.nasdanika.models.professionalknowledgegraph.Location;
import org.nasdanika.models.professionalknowledgegraph.Person;
import org.nasdanika.models.professionalknowledgegraph.PersonSkill;
import org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PersonImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PersonImpl#getContactMethods <em>Contact Methods</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PersonImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PersonImpl#getPersonSkills <em>Person Skills</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PersonImpl#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PersonImpl#getEfforts <em>Efforts</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PersonImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
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
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfessionalKnowledgeGraphPackage.Literals.PERSON;
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
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.PERSON__NAME, ProfessionalKnowledgeGraphPackage.Literals.PERSON__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.PERSON__NAME, ProfessionalKnowledgeGraphPackage.Literals.PERSON__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSummary() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.PERSON__SUMMARY, ProfessionalKnowledgeGraphPackage.Literals.PERSON__SUMMARY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSummary(String newSummary) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.PERSON__SUMMARY, ProfessionalKnowledgeGraphPackage.Literals.PERSON__SUMMARY, newSummary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ContactMethod> getContactMethods() {
		return (EList<ContactMethod>)eDynamicGet(ProfessionalKnowledgeGraphPackage.PERSON__CONTACT_METHODS, ProfessionalKnowledgeGraphPackage.Literals.PERSON__CONTACT_METHODS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Person> getNetwork() {
		return (EList<Person>)eDynamicGet(ProfessionalKnowledgeGraphPackage.PERSON__NETWORK, ProfessionalKnowledgeGraphPackage.Literals.PERSON__NETWORK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PersonSkill> getPersonSkills() {
		return (EList<PersonSkill>)eDynamicGet(ProfessionalKnowledgeGraphPackage.PERSON__PERSON_SKILLS, ProfessionalKnowledgeGraphPackage.Literals.PERSON__PERSON_SKILLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Credential> getCredentials() {
		return (EList<Credential>)eDynamicGet(ProfessionalKnowledgeGraphPackage.PERSON__CREDENTIALS, ProfessionalKnowledgeGraphPackage.Literals.PERSON__CREDENTIALS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Effort> getEfforts() {
		return (EList<Effort>)eDynamicGet(ProfessionalKnowledgeGraphPackage.PERSON__EFFORTS, ProfessionalKnowledgeGraphPackage.Literals.PERSON__EFFORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Location> getLocations() {
		return (EList<Location>)eDynamicGet(ProfessionalKnowledgeGraphPackage.PERSON__LOCATIONS, ProfessionalKnowledgeGraphPackage.Literals.PERSON__LOCATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.PERSON__CONTACT_METHODS:
				return ((InternalEList<?>)getContactMethods()).basicRemove(otherEnd, msgs);
			case ProfessionalKnowledgeGraphPackage.PERSON__PERSON_SKILLS:
				return ((InternalEList<?>)getPersonSkills()).basicRemove(otherEnd, msgs);
			case ProfessionalKnowledgeGraphPackage.PERSON__CREDENTIALS:
				return ((InternalEList<?>)getCredentials()).basicRemove(otherEnd, msgs);
			case ProfessionalKnowledgeGraphPackage.PERSON__EFFORTS:
				return ((InternalEList<?>)getEfforts()).basicRemove(otherEnd, msgs);
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
			case ProfessionalKnowledgeGraphPackage.PERSON__NAME:
				return getName();
			case ProfessionalKnowledgeGraphPackage.PERSON__SUMMARY:
				return getSummary();
			case ProfessionalKnowledgeGraphPackage.PERSON__CONTACT_METHODS:
				return getContactMethods();
			case ProfessionalKnowledgeGraphPackage.PERSON__NETWORK:
				return getNetwork();
			case ProfessionalKnowledgeGraphPackage.PERSON__PERSON_SKILLS:
				return getPersonSkills();
			case ProfessionalKnowledgeGraphPackage.PERSON__CREDENTIALS:
				return getCredentials();
			case ProfessionalKnowledgeGraphPackage.PERSON__EFFORTS:
				return getEfforts();
			case ProfessionalKnowledgeGraphPackage.PERSON__LOCATIONS:
				return getLocations();
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
			case ProfessionalKnowledgeGraphPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.PERSON__SUMMARY:
				setSummary((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.PERSON__CONTACT_METHODS:
				getContactMethods().clear();
				getContactMethods().addAll((Collection<? extends ContactMethod>)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.PERSON__NETWORK:
				getNetwork().clear();
				getNetwork().addAll((Collection<? extends Person>)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.PERSON__PERSON_SKILLS:
				getPersonSkills().clear();
				getPersonSkills().addAll((Collection<? extends PersonSkill>)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.PERSON__CREDENTIALS:
				getCredentials().clear();
				getCredentials().addAll((Collection<? extends Credential>)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.PERSON__EFFORTS:
				getEfforts().clear();
				getEfforts().addAll((Collection<? extends Effort>)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.PERSON__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
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
			case ProfessionalKnowledgeGraphPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.PERSON__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.PERSON__CONTACT_METHODS:
				getContactMethods().clear();
				return;
			case ProfessionalKnowledgeGraphPackage.PERSON__NETWORK:
				getNetwork().clear();
				return;
			case ProfessionalKnowledgeGraphPackage.PERSON__PERSON_SKILLS:
				getPersonSkills().clear();
				return;
			case ProfessionalKnowledgeGraphPackage.PERSON__CREDENTIALS:
				getCredentials().clear();
				return;
			case ProfessionalKnowledgeGraphPackage.PERSON__EFFORTS:
				getEfforts().clear();
				return;
			case ProfessionalKnowledgeGraphPackage.PERSON__LOCATIONS:
				getLocations().clear();
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
			case ProfessionalKnowledgeGraphPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ProfessionalKnowledgeGraphPackage.PERSON__SUMMARY:
				return SUMMARY_EDEFAULT == null ? getSummary() != null : !SUMMARY_EDEFAULT.equals(getSummary());
			case ProfessionalKnowledgeGraphPackage.PERSON__CONTACT_METHODS:
				return !getContactMethods().isEmpty();
			case ProfessionalKnowledgeGraphPackage.PERSON__NETWORK:
				return !getNetwork().isEmpty();
			case ProfessionalKnowledgeGraphPackage.PERSON__PERSON_SKILLS:
				return !getPersonSkills().isEmpty();
			case ProfessionalKnowledgeGraphPackage.PERSON__CREDENTIALS:
				return !getCredentials().isEmpty();
			case ProfessionalKnowledgeGraphPackage.PERSON__EFFORTS:
				return !getEfforts().isEmpty();
			case ProfessionalKnowledgeGraphPackage.PERSON__LOCATIONS:
				return !getLocations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PersonImpl
