/**
 */
package org.nasdanika.models.professionalknowledgegraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Training Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A training course completed by the person, such as an online course on Udemy, Coursera, or an in-person training.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.TrainingCourse#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.TrainingCourse#getCourseUrl <em>Course Url</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.TrainingCourse#getCertificateUrl <em>Certificate Url</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getTrainingCourse()
 * @model
 * @generated
 */
public interface TrainingCourse extends Credential {
	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the course provider or platform (e.g., Udemy, Coursera, Pluralsight).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getTrainingCourse_Provider()
	 * @model
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.TrainingCourse#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

	/**
	 * Returns the value of the '<em><b>Course Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL of the course.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Course Url</em>' attribute.
	 * @see #setCourseUrl(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getTrainingCourse_CourseUrl()
	 * @model
	 * @generated
	 */
	String getCourseUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.TrainingCourse#getCourseUrl <em>Course Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Url</em>' attribute.
	 * @see #getCourseUrl()
	 * @generated
	 */
	void setCourseUrl(String value);

	/**
	 * Returns the value of the '<em><b>Certificate Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL of the completion certificate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certificate Url</em>' attribute.
	 * @see #setCertificateUrl(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getTrainingCourse_CertificateUrl()
	 * @model
	 * @generated
	 */
	String getCertificateUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.TrainingCourse#getCertificateUrl <em>Certificate Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Url</em>' attribute.
	 * @see #getCertificateUrl()
	 * @generated
	 */
	void setCertificateUrl(String value);

} // TrainingCourse
