/**
 */
package org.nasdanika.models.professionalknowledgegraph;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Education</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An educational credential such as a degree, diploma, or certificate from an educational institution.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Education#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Education#getDegree <em>Degree</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Education#getFieldOfStudy <em>Field Of Study</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Education#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Education#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getEducation()
 * @model
 * @generated
 */
public interface Education extends Credential {
	/**
	 * Returns the value of the '<em><b>Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the educational institution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Institution</em>' attribute.
	 * @see #setInstitution(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getEducation_Institution()
	 * @model
	 * @generated
	 */
	String getInstitution();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Education#getInstitution <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution</em>' attribute.
	 * @see #getInstitution()
	 * @generated
	 */
	void setInstitution(String value);

	/**
	 * Returns the value of the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Degree awarded (e.g., Bachelor of Science, Master of Arts, Ph.D.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Degree</em>' attribute.
	 * @see #setDegree(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getEducation_Degree()
	 * @model
	 * @generated
	 */
	String getDegree();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Education#getDegree <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' attribute.
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(String value);

	/**
	 * Returns the value of the '<em><b>Field Of Study</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Field or major area of study (e.g., Computer Science, Electrical Engineering).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field Of Study</em>' attribute.
	 * @see #setFieldOfStudy(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getEducation_FieldOfStudy()
	 * @model
	 * @generated
	 */
	String getFieldOfStudy();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Education#getFieldOfStudy <em>Field Of Study</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Of Study</em>' attribute.
	 * @see #getFieldOfStudy()
	 * @generated
	 */
	void setFieldOfStudy(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date when the person started this educational program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getEducation_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Education#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Location of the educational institution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getEducation_Location()
	 * @model
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Education#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

} // Education
