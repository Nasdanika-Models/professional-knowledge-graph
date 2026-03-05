/**
 */
package org.nasdanika.models.professionalknowledgegraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A patent or invention associated with the person.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Patent#getPatentNumber <em>Patent Number</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Patent#getInventors <em>Inventors</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPatent()
 * @model
 * @generated
 */
public interface Patent extends Credential {
	/**
	 * Returns the value of the '<em><b>Patent Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Official patent number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patent Number</em>' attribute.
	 * @see #setPatentNumber(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPatent_PatentNumber()
	 * @model
	 * @generated
	 */
	String getPatentNumber();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Patent#getPatentNumber <em>Patent Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patent Number</em>' attribute.
	 * @see #getPatentNumber()
	 * @generated
	 */
	void setPatentNumber(String value);

	/**
	 * Returns the value of the '<em><b>Inventors</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.professionalknowledgegraph.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Co-inventors of this patent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inventors</em>' reference list.
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPatent_Inventors()
	 * @model
	 * @generated
	 */
	EList<Person> getInventors();

} // Patent
