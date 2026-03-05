/**
 */
package org.nasdanika.models.professionalknowledgegraph.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage;
import org.nasdanika.models.professionalknowledgegraph.TrainingCourse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Training Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.TrainingCourseImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.TrainingCourseImpl#getCourseUrl <em>Course Url</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.TrainingCourseImpl#getCertificateUrl <em>Certificate Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrainingCourseImpl extends CredentialImpl implements TrainingCourse {
	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCourseUrl() <em>Course Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCertificateUrl() <em>Certificate Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String CERTIFICATE_URL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainingCourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfessionalKnowledgeGraphPackage.Literals.TRAINING_COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProvider() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.TRAINING_COURSE__PROVIDER, ProfessionalKnowledgeGraphPackage.Literals.TRAINING_COURSE__PROVIDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvider(String newProvider) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.TRAINING_COURSE__PROVIDER, ProfessionalKnowledgeGraphPackage.Literals.TRAINING_COURSE__PROVIDER, newProvider);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCourseUrl() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.TRAINING_COURSE__COURSE_URL, ProfessionalKnowledgeGraphPackage.Literals.TRAINING_COURSE__COURSE_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseUrl(String newCourseUrl) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.TRAINING_COURSE__COURSE_URL, ProfessionalKnowledgeGraphPackage.Literals.TRAINING_COURSE__COURSE_URL, newCourseUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCertificateUrl() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.TRAINING_COURSE__CERTIFICATE_URL, ProfessionalKnowledgeGraphPackage.Literals.TRAINING_COURSE__CERTIFICATE_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCertificateUrl(String newCertificateUrl) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.TRAINING_COURSE__CERTIFICATE_URL, ProfessionalKnowledgeGraphPackage.Literals.TRAINING_COURSE__CERTIFICATE_URL, newCertificateUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.TRAINING_COURSE__PROVIDER:
				return getProvider();
			case ProfessionalKnowledgeGraphPackage.TRAINING_COURSE__COURSE_URL:
				return getCourseUrl();
			case ProfessionalKnowledgeGraphPackage.TRAINING_COURSE__CERTIFICATE_URL:
				return getCertificateUrl();
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
			case ProfessionalKnowledgeGraphPackage.TRAINING_COURSE__PROVIDER:
				setProvider((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.TRAINING_COURSE__COURSE_URL:
				setCourseUrl((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.TRAINING_COURSE__CERTIFICATE_URL:
				setCertificateUrl((String)newValue);
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
			case ProfessionalKnowledgeGraphPackage.TRAINING_COURSE__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.TRAINING_COURSE__COURSE_URL:
				setCourseUrl(COURSE_URL_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.TRAINING_COURSE__CERTIFICATE_URL:
				setCertificateUrl(CERTIFICATE_URL_EDEFAULT);
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
			case ProfessionalKnowledgeGraphPackage.TRAINING_COURSE__PROVIDER:
				return PROVIDER_EDEFAULT == null ? getProvider() != null : !PROVIDER_EDEFAULT.equals(getProvider());
			case ProfessionalKnowledgeGraphPackage.TRAINING_COURSE__COURSE_URL:
				return COURSE_URL_EDEFAULT == null ? getCourseUrl() != null : !COURSE_URL_EDEFAULT.equals(getCourseUrl());
			case ProfessionalKnowledgeGraphPackage.TRAINING_COURSE__CERTIFICATE_URL:
				return CERTIFICATE_URL_EDEFAULT == null ? getCertificateUrl() != null : !CERTIFICATE_URL_EDEFAULT.equals(getCertificateUrl());
		}
		return super.eIsSet(featureID);
	}

} //TrainingCourseImpl
