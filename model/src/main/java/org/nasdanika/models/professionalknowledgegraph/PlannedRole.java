/**
 */
package org.nasdanika.models.professionalknowledgegraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planned Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A role needed from collaborators for a planned or future effort.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.PlannedRole#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.PlannedRole#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.PlannedRole#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.PlannedRole#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPlannedRole()
 * @model
 * @generated
 */
public interface PlannedRole extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Title or description of the needed role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPlannedRole_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.PlannedRole#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detailed description of responsibilities for this role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPlannedRole_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.PlannedRole#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Skills</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.professionalknowledgegraph.Skill}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Skills required for this role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skills</em>' reference list.
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPlannedRole_Skills()
	 * @model
	 * @generated
	 */
	EList<Skill> getSkills();

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of people needed for this role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPlannedRole_Count()
	 * @model default="1"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.PlannedRole#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

} // PlannedRole
