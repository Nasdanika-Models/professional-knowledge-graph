/**
 */
package org.nasdanika.models.professionalknowledgegraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A person in the professional knowledge graph. Captures the person's network, skills, credentials, and work history.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Person#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Person#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Person#getContactMethods <em>Contact Methods</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Person#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Person#getPersonSkills <em>Person Skills</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Person#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Person#getEfforts <em>Efforts</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.Person#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full name of the person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Professional summary or bio of the person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPerson_Summary()
	 * @model
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.professionalknowledgegraph.Person#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Contact Methods</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.professionalknowledgegraph.ContactMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact methods for this person (email, phone, web addresses, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Methods</em>' containment reference list.
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPerson_ContactMethods()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContactMethod> getContactMethods();

	/**
	 * Returns the value of the '<em><b>Network</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.professionalknowledgegraph.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Professional network - people this person has interacted with in some way.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network</em>' reference list.
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPerson_Network()
	 * @model
	 * @generated
	 */
	EList<Person> getNetwork();

	/**
	 * Returns the value of the '<em><b>Person Skills</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.professionalknowledgegraph.PersonSkill}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Skills the person has or would like to have, with mastery levels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Skills</em>' containment reference list.
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPerson_PersonSkills()
	 * @model containment="true"
	 * @generated
	 */
	EList<PersonSkill> getPersonSkills();

	/**
	 * Returns the value of the '<em><b>Credentials</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.professionalknowledgegraph.Credential}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Credentials: education, certifications, training, endorsements, awards, patents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Credentials</em>' containment reference list.
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPerson_Credentials()
	 * @model containment="true"
	 * @generated
	 */
	EList<Credential> getCredentials();

	/**
	 * Returns the value of the '<em><b>Efforts</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.professionalknowledgegraph.Effort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Work and engagement history: positions held, projects, activities, and publications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Efforts</em>' containment reference list.
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPerson_Efforts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Effort> getEfforts();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.professionalknowledgegraph.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Locations where this person has lived or worked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getPerson_Locations()
	 * @model
	 * @generated
	 */
	EList<Location> getLocations();

} // Person
