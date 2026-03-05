/**
 */
package org.nasdanika.models.professionalknowledgegraph;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Effort Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Status of an effort such as a project, position, or activity.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getEffortStatus()
 * @model
 * @generated
 */
public enum EffortStatus implements Enumerator {
	/**
	 * The '<em><b>IDEA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The effort is an idea or concept that has not been committed to.
	 * <!-- end-model-doc -->
	 * @see #IDEA_VALUE
	 * @generated
	 * @ordered
	 */
	IDEA(0, "IDEA", "IDEA"),

	/**
	 * The '<em><b>PLANNED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The effort is planned and committed to but not yet started.
	 * <!-- end-model-doc -->
	 * @see #PLANNED_VALUE
	 * @generated
	 * @ordered
	 */
	PLANNED(1, "PLANNED", "PLANNED"),

	/**
	 * The '<em><b>IN PROGRESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The effort is currently in progress.
	 * <!-- end-model-doc -->
	 * @see #IN_PROGRESS_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PROGRESS(2, "IN_PROGRESS", "IN_PROGRESS"),

	/**
	 * The '<em><b>COMPLETED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The effort has been completed.
	 * <!-- end-model-doc -->
	 * @see #COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED(3, "COMPLETED", "COMPLETED"),

	/**
	 * The '<em><b>ABANDONED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The effort was abandoned before completion.
	 * <!-- end-model-doc -->
	 * @see #ABANDONED_VALUE
	 * @generated
	 * @ordered
	 */
	ABANDONED(4, "ABANDONED", "ABANDONED");

	/**
	 * The '<em><b>IDEA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The effort is an idea or concept that has not been committed to.
	 * <!-- end-model-doc -->
	 * @see #IDEA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IDEA_VALUE = 0;

	/**
	 * The '<em><b>PLANNED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The effort is planned and committed to but not yet started.
	 * <!-- end-model-doc -->
	 * @see #PLANNED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_VALUE = 1;

	/**
	 * The '<em><b>IN PROGRESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The effort is currently in progress.
	 * <!-- end-model-doc -->
	 * @see #IN_PROGRESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_PROGRESS_VALUE = 2;

	/**
	 * The '<em><b>COMPLETED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The effort has been completed.
	 * <!-- end-model-doc -->
	 * @see #COMPLETED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED_VALUE = 3;

	/**
	 * The '<em><b>ABANDONED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The effort was abandoned before completion.
	 * <!-- end-model-doc -->
	 * @see #ABANDONED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABANDONED_VALUE = 4;

	/**
	 * An array of all the '<em><b>Effort Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EffortStatus[] VALUES_ARRAY =
		new EffortStatus[] {
			IDEA,
			PLANNED,
			IN_PROGRESS,
			COMPLETED,
			ABANDONED,
		};

	/**
	 * A public read-only list of all the '<em><b>Effort Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EffortStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Effort Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EffortStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EffortStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Effort Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EffortStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EffortStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Effort Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EffortStatus get(int value) {
		switch (value) {
			case IDEA_VALUE: return IDEA;
			case PLANNED_VALUE: return PLANNED;
			case IN_PROGRESS_VALUE: return IN_PROGRESS;
			case COMPLETED_VALUE: return COMPLETED;
			case ABANDONED_VALUE: return ABANDONED;
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
	private EffortStatus(int value, String name, String literal) {
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
	
} //EffortStatus
