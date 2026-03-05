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

import org.nasdanika.models.professionalknowledgegraph.KnowledgeGraph;
import org.nasdanika.models.professionalknowledgegraph.Location;
import org.nasdanika.models.professionalknowledgegraph.Organization;
import org.nasdanika.models.professionalknowledgegraph.Person;
import org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage;
import org.nasdanika.models.professionalknowledgegraph.Skill;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knowledge Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.KnowledgeGraphImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.KnowledgeGraphImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.KnowledgeGraphImpl#getPeople <em>People</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.KnowledgeGraphImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.KnowledgeGraphImpl#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.KnowledgeGraphImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KnowledgeGraphImpl extends MinimalEObjectImpl.Container implements KnowledgeGraph {
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
	protected KnowledgeGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfessionalKnowledgeGraphPackage.Literals.KNOWLEDGE_GRAPH;
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
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__NAME, ProfessionalKnowledgeGraphPackage.Literals.KNOWLEDGE_GRAPH__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__NAME, ProfessionalKnowledgeGraphPackage.Literals.KNOWLEDGE_GRAPH__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__DESCRIPTION, ProfessionalKnowledgeGraphPackage.Literals.KNOWLEDGE_GRAPH__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__DESCRIPTION, ProfessionalKnowledgeGraphPackage.Literals.KNOWLEDGE_GRAPH__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Person> getPeople() {
		return (EList<Person>)eDynamicGet(ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__PEOPLE, ProfessionalKnowledgeGraphPackage.Literals.KNOWLEDGE_GRAPH__PEOPLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Skill> getSkills() {
		return (EList<Skill>)eDynamicGet(ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__SKILLS, ProfessionalKnowledgeGraphPackage.Literals.KNOWLEDGE_GRAPH__SKILLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Organization> getOrganizations() {
		return (EList<Organization>)eDynamicGet(ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__ORGANIZATIONS, ProfessionalKnowledgeGraphPackage.Literals.KNOWLEDGE_GRAPH__ORGANIZATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Location> getLocations() {
		return (EList<Location>)eDynamicGet(ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__LOCATIONS, ProfessionalKnowledgeGraphPackage.Literals.KNOWLEDGE_GRAPH__LOCATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__PEOPLE:
				return ((InternalEList<?>)getPeople()).basicRemove(otherEnd, msgs);
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__SKILLS:
				return ((InternalEList<?>)getSkills()).basicRemove(otherEnd, msgs);
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__ORGANIZATIONS:
				return ((InternalEList<?>)getOrganizations()).basicRemove(otherEnd, msgs);
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
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
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__NAME:
				return getName();
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__DESCRIPTION:
				return getDescription();
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__PEOPLE:
				return getPeople();
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__SKILLS:
				return getSkills();
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__ORGANIZATIONS:
				return getOrganizations();
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__LOCATIONS:
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
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__NAME:
				setName((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__PEOPLE:
				getPeople().clear();
				getPeople().addAll((Collection<? extends Person>)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__SKILLS:
				getSkills().clear();
				getSkills().addAll((Collection<? extends Skill>)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__ORGANIZATIONS:
				getOrganizations().clear();
				getOrganizations().addAll((Collection<? extends Organization>)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__LOCATIONS:
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
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__PEOPLE:
				getPeople().clear();
				return;
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__SKILLS:
				getSkills().clear();
				return;
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__ORGANIZATIONS:
				getOrganizations().clear();
				return;
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__LOCATIONS:
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
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__PEOPLE:
				return !getPeople().isEmpty();
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__SKILLS:
				return !getSkills().isEmpty();
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__ORGANIZATIONS:
				return !getOrganizations().isEmpty();
			case ProfessionalKnowledgeGraphPackage.KNOWLEDGE_GRAPH__LOCATIONS:
				return !getLocations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KnowledgeGraphImpl
