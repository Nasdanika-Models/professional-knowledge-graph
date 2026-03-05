/**
 */
package org.nasdanika.models.professionalknowledgegraph.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.professionalknowledgegraph.Credential;
import org.nasdanika.models.professionalknowledgegraph.CredentialStatus;
import org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage;
import org.nasdanika.models.professionalknowledgegraph.Skill;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credential</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.CredentialImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.CredentialImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.CredentialImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.CredentialImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.CredentialImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.CredentialImpl#getSkills <em>Skills</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CredentialImpl extends MinimalEObjectImpl.Container implements Credential {
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
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final CredentialStatus STATUS_EDEFAULT = CredentialStatus.PLANNED;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CredentialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfessionalKnowledgeGraphPackage.Literals.CREDENTIAL;
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
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.CREDENTIAL__NAME, ProfessionalKnowledgeGraphPackage.Literals.CREDENTIAL__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.CREDENTIAL__NAME, ProfessionalKnowledgeGraphPackage.Literals.CREDENTIAL__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.CREDENTIAL__DESCRIPTION, ProfessionalKnowledgeGraphPackage.Literals.CREDENTIAL__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.CREDENTIAL__DESCRIPTION, ProfessionalKnowledgeGraphPackage.Literals.CREDENTIAL__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return (Date)eDynamicGet(ProfessionalKnowledgeGraphPackage.CREDENTIAL__DATE, ProfessionalKnowledgeGraphPackage.Literals.CREDENTIAL__DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.CREDENTIAL__DATE, ProfessionalKnowledgeGraphPackage.Literals.CREDENTIAL__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.CREDENTIAL__URL, ProfessionalKnowledgeGraphPackage.Literals.CREDENTIAL__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.CREDENTIAL__URL, ProfessionalKnowledgeGraphPackage.Literals.CREDENTIAL__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CredentialStatus getStatus() {
		return (CredentialStatus)eDynamicGet(ProfessionalKnowledgeGraphPackage.CREDENTIAL__STATUS, ProfessionalKnowledgeGraphPackage.Literals.CREDENTIAL__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(CredentialStatus newStatus) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.CREDENTIAL__STATUS, ProfessionalKnowledgeGraphPackage.Literals.CREDENTIAL__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Skill> getSkills() {
		return (EList<Skill>)eDynamicGet(ProfessionalKnowledgeGraphPackage.CREDENTIAL__SKILLS, ProfessionalKnowledgeGraphPackage.Literals.CREDENTIAL__SKILLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__NAME:
				return getName();
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__DESCRIPTION:
				return getDescription();
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__DATE:
				return getDate();
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__URL:
				return getUrl();
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__STATUS:
				return getStatus();
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__SKILLS:
				return getSkills();
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
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__NAME:
				setName((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__DATE:
				setDate((Date)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__URL:
				setUrl((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__STATUS:
				setStatus((CredentialStatus)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__SKILLS:
				getSkills().clear();
				getSkills().addAll((Collection<? extends Skill>)newValue);
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
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__URL:
				setUrl(URL_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__SKILLS:
				getSkills().clear();
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
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__STATUS:
				return getStatus() != STATUS_EDEFAULT;
			case ProfessionalKnowledgeGraphPackage.CREDENTIAL__SKILLS:
				return !getSkills().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CredentialImpl
