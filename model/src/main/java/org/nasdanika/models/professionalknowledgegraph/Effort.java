/**
 */
package org.nasdanika.models.professionalknowledgegraph;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base for something that a person did, is doing, or is planning to do. An effort may use skills and involve collaboration with others. An effort can be planned (an idea) listing required skills and roles for others.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Effort#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Effort#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Effort#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Effort#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Effort#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Effort#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Effort#getCollaborators <em>Collaborators</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Effort#getPlannedRoles <em>Planned Roles</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getEffort()
 * @model abstract="true"
 * @generated
 */
public interface Effort extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name or title of the effort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getEffort_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Effort#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the effort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getEffort_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Effort#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start date of the effort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getEffort_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Effort#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * End date of the effort. Null if still ongoing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getEffort_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Effort#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.professionalknowledgegraph.EffortStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current status of the effort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.professionalknowledgegraph.EffortStatus
	 * @see #setStatus(EffortStatus)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getEffort_Status()
	 * @model
	 * @generated
	 */
	EffortStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Effort#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.professionalknowledgegraph.EffortStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EffortStatus value);

	/**
	 * Returns the value of the '<em><b>Skills</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.professionalknowledgegraph.Skill}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Skills used or required in this effort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skills</em>' reference list.
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getEffort_Skills()
	 * @model
	 * @generated
	 */
	EList<Skill> getSkills();

	/**
	 * Returns the value of the '<em><b>Collaborators</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.professionalknowledgegraph.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * People the person collaborated with on this effort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collaborators</em>' reference list.
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getEffort_Collaborators()
	 * @model
	 * @generated
	 */
	EList<Person> getCollaborators();

	/**
	 * Returns the value of the '<em><b>Planned Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.professionalknowledgegraph.PlannedRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles needed from others for this effort. Useful for planned/future efforts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Planned Roles</em>' containment reference list.
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getEffort_PlannedRoles()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlannedRole> getPlannedRoles();

} // Effort
