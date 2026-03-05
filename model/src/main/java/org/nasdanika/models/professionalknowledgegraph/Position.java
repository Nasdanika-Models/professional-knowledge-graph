/**
 */
package org.nasdanika.models.professionalknowledgegraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A professional position or role held at an organization. Contains the activities and projects carried out in that role.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Position#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Position#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Position#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Position#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends Effort {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Job title or role title (e.g., Senior Software Engineer, Principal Architect).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPosition_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Position#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organization where this position was held.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' reference.
	 * @see #setOrganization(Organization)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPosition_Organization()
	 * @model
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Position#getOrganization <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Location where this position was based.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPosition_Location()
	 * @model
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Position#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.professionalknowledgegraph.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activities, projects and assignments carried out within this position.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPosition_Activities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getActivities();

} // Position
