/**
 */
package org.nasdanika.models.professionalknowledgegraph.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage;
import org.nasdanika.models.professionalknowledgegraph.Publication;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PublicationImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PublicationImpl#getPublicationUrl <em>Publication Url</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PublicationImpl#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.PublicationImpl#getDoi <em>Doi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublicationImpl extends EffortImpl implements Publication {
	/**
	 * The default value of the '{@link #getPublisher() <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPublicationUrl() <em>Publication Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLICATION_URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIsbn() <em>Isbn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsbn()
	 * @generated
	 * @ordered
	 */
	protected static final String ISBN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDoi() <em>Doi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoi()
	 * @generated
	 * @ordered
	 */
	protected static final String DOI_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfessionalKnowledgeGraphPackage.Literals.PUBLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPublisher() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.PUBLICATION__PUBLISHER, ProfessionalKnowledgeGraphPackage.Literals.PUBLICATION__PUBLISHER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublisher(String newPublisher) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.PUBLICATION__PUBLISHER, ProfessionalKnowledgeGraphPackage.Literals.PUBLICATION__PUBLISHER, newPublisher);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPublicationUrl() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.PUBLICATION__PUBLICATION_URL, ProfessionalKnowledgeGraphPackage.Literals.PUBLICATION__PUBLICATION_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicationUrl(String newPublicationUrl) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.PUBLICATION__PUBLICATION_URL, ProfessionalKnowledgeGraphPackage.Literals.PUBLICATION__PUBLICATION_URL, newPublicationUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIsbn() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.PUBLICATION__ISBN, ProfessionalKnowledgeGraphPackage.Literals.PUBLICATION__ISBN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsbn(String newIsbn) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.PUBLICATION__ISBN, ProfessionalKnowledgeGraphPackage.Literals.PUBLICATION__ISBN, newIsbn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDoi() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.PUBLICATION__DOI, ProfessionalKnowledgeGraphPackage.Literals.PUBLICATION__DOI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoi(String newDoi) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.PUBLICATION__DOI, ProfessionalKnowledgeGraphPackage.Literals.PUBLICATION__DOI, newDoi);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.PUBLICATION__PUBLISHER:
				return getPublisher();
			case ProfessionalKnowledgeGraphPackage.PUBLICATION__PUBLICATION_URL:
				return getPublicationUrl();
			case ProfessionalKnowledgeGraphPackage.PUBLICATION__ISBN:
				return getIsbn();
			case ProfessionalKnowledgeGraphPackage.PUBLICATION__DOI:
				return getDoi();
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
			case ProfessionalKnowledgeGraphPackage.PUBLICATION__PUBLISHER:
				setPublisher((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.PUBLICATION__PUBLICATION_URL:
				setPublicationUrl((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.PUBLICATION__ISBN:
				setIsbn((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.PUBLICATION__DOI:
				setDoi((String)newValue);
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
			case ProfessionalKnowledgeGraphPackage.PUBLICATION__PUBLISHER:
				setPublisher(PUBLISHER_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.PUBLICATION__PUBLICATION_URL:
				setPublicationUrl(PUBLICATION_URL_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.PUBLICATION__ISBN:
				setIsbn(ISBN_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.PUBLICATION__DOI:
				setDoi(DOI_EDEFAULT);
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
			case ProfessionalKnowledgeGraphPackage.PUBLICATION__PUBLISHER:
				return PUBLISHER_EDEFAULT == null ? getPublisher() != null : !PUBLISHER_EDEFAULT.equals(getPublisher());
			case ProfessionalKnowledgeGraphPackage.PUBLICATION__PUBLICATION_URL:
				return PUBLICATION_URL_EDEFAULT == null ? getPublicationUrl() != null : !PUBLICATION_URL_EDEFAULT.equals(getPublicationUrl());
			case ProfessionalKnowledgeGraphPackage.PUBLICATION__ISBN:
				return ISBN_EDEFAULT == null ? getIsbn() != null : !ISBN_EDEFAULT.equals(getIsbn());
			case ProfessionalKnowledgeGraphPackage.PUBLICATION__DOI:
				return DOI_EDEFAULT == null ? getDoi() != null : !DOI_EDEFAULT.equals(getDoi());
		}
		return super.eIsSet(featureID);
	}

} //PublicationImpl
