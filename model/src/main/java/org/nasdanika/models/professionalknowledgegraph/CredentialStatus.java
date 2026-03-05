/**
 */
package org.nasdanika.models.professionalknowledgegraph;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Credential Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Status of a credential such as a certification, degree, or course completion.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getCredentialStatus()
 * @model
 * @generated
 */
public enum CredentialStatus implements Enumerator {
	/**
	 * The '<em><b>PLANNED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The credential is desired/planned but not yet started.
	 * <!-- end-model-doc -->
	 * @see #PLANNED_VALUE
	 * @generated
	 * @ordered
	 */
	PLANNED(0, "PLANNED", "PLANNED"),

	/**
	 * The '<em><b>IN PROGRESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person is currently working toward obtaining this credential.
	 * <!-- end-model-doc -->
	 * @see #IN_PROGRESS_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PROGRESS(1, "IN_PROGRESS", "IN_PROGRESS"),

	/**
	 * The '<em><b>OBTAINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The credential has been obtained.
	 * <!-- end-model-doc -->
	 * @see #OBTAINED_VALUE
	 * @generated
	 * @ordered
	 */
	OBTAINED(2, "OBTAINED", "OBTAINED"),

	/**
	 * The '<em><b>ACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The credential is currently active (for credentials with expiry).
	 * <!-- end-model-doc -->
	 * @see #ACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVE(3, "ACTIVE", "ACTIVE"),

	/**
	 * The '<em><b>EXPIRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The credential has expired.
	 * <!-- end-model-doc -->
	 * @see #EXPIRED_VALUE
	 * @generated
	 * @ordered
	 */
	EXPIRED(4, "EXPIRED", "EXPIRED");

	/**
	 * The '<em><b>PLANNED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The credential is desired/planned but not yet started.
	 * <!-- end-model-doc -->
	 * @see #PLANNED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_VALUE = 0;

	/**
	 * The '<em><b>IN PROGRESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person is currently working toward obtaining this credential.
	 * <!-- end-model-doc -->
	 * @see #IN_PROGRESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_PROGRESS_VALUE = 1;

	/**
	 * The '<em><b>OBTAINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The credential has been obtained.
	 * <!-- end-model-doc -->
	 * @see #OBTAINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OBTAINED_VALUE = 2;

	/**
	 * The '<em><b>ACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The credential is currently active (for credentials with expiry).
	 * <!-- end-model-doc -->
	 * @see #ACTIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_VALUE = 3;

	/**
	 * The '<em><b>EXPIRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The credential has expired.
	 * <!-- end-model-doc -->
	 * @see #EXPIRED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPIRED_VALUE = 4;

	/**
	 * An array of all the '<em><b>Credential Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CredentialStatus[] VALUES_ARRAY =
		new CredentialStatus[] {
			PLANNED,
			IN_PROGRESS,
			OBTAINED,
			ACTIVE,
			EXPIRED,
		};

	/**
	 * A public read-only list of all the '<em><b>Credential Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CredentialStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Credential Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CredentialStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CredentialStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Credential Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CredentialStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CredentialStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Credential Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CredentialStatus get(int value) {
		switch (value) {
			case PLANNED_VALUE: return PLANNED;
			case IN_PROGRESS_VALUE: return IN_PROGRESS;
			case OBTAINED_VALUE: return OBTAINED;
			case ACTIVE_VALUE: return ACTIVE;
			case EXPIRED_VALUE: return EXPIRED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CredentialStatus(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CredentialStatus
