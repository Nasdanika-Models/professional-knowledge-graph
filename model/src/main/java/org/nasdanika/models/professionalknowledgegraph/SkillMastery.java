/**
 */
package org.nasdanika.models.professionalknowledgegraph;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Skill Mastery</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Level of mastery a person has in a skill, ranging from minimal awareness to deep expertise.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage#getSkillMastery()
 * @model
 * @generated
 */
public enum SkillMastery implements Enumerator {
	/**
	 * The '<em><b>HEARD OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person has heard of the skill but has no hands-on experience.
	 * <!-- end-model-doc -->
	 * @see #HEARD_OF_VALUE
	 * @generated
	 * @ordered
	 */
	HEARD_OF(0, "HEARD_OF", "HEARD_OF"),

	/**
	 * The '<em><b>AWARE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person is aware of the skill and understands its general purpose and capabilities.
	 * <!-- end-model-doc -->
	 * @see #AWARE_VALUE
	 * @generated
	 * @ordered
	 */
	AWARE(1, "AWARE", "AWARE"),

	/**
	 * The '<em><b>FAMILIAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person has some hands-on experience with the skill.
	 * <!-- end-model-doc -->
	 * @see #FAMILIAR_VALUE
	 * @generated
	 * @ordered
	 */
	FAMILIAR(2, "FAMILIAR", "FAMILIAR"),

	/**
	 * The '<em><b>PROFICIENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person uses the skill regularly and effectively in professional contexts.
	 * <!-- end-model-doc -->
	 * @see #PROFICIENT_VALUE
	 * @generated
	 * @ordered
	 */
	PROFICIENT(3, "PROFICIENT", "PROFICIENT"),

	/**
	 * The '<em><b>EXPERT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person has deep, comprehensive expertise in the skill and can guide others.
	 * <!-- end-model-doc -->
	 * @see #EXPERT_VALUE
	 * @generated
	 * @ordered
	 */
	EXPERT(4, "EXPERT", "EXPERT");

	/**
	 * The '<em><b>HEARD OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person has heard of the skill but has no hands-on experience.
	 * <!-- end-model-doc -->
	 * @see #HEARD_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEARD_OF_VALUE = 0;

	/**
	 * The '<em><b>AWARE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person is aware of the skill and understands its general purpose and capabilities.
	 * <!-- end-model-doc -->
	 * @see #AWARE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AWARE_VALUE = 1;

	/**
	 * The '<em><b>FAMILIAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person has some hands-on experience with the skill.
	 * <!-- end-model-doc -->
	 * @see #FAMILIAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FAMILIAR_VALUE = 2;

	/**
	 * The '<em><b>PROFICIENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person uses the skill regularly and effectively in professional contexts.
	 * <!-- end-model-doc -->
	 * @see #PROFICIENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROFICIENT_VALUE = 3;

	/**
	 * The '<em><b>EXPERT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person has deep, comprehensive expertise in the skill and can guide others.
	 * <!-- end-model-doc -->
	 * @see #EXPERT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPERT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Skill Mastery</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SkillMastery[] VALUES_ARRAY =
		new SkillMastery[] {
			HEARD_OF,
			AWARE,
			FAMILIAR,
			PROFICIENT,
			EXPERT,
		};

	/**
	 * A public read-only list of all the '<em><b>Skill Mastery</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SkillMastery> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Skill Mastery</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SkillMastery get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SkillMastery result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Skill Mastery</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SkillMastery getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SkillMastery result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Skill Mastery</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SkillMastery get(int value) {
		switch (value) {
			case HEARD_OF_VALUE: return HEARD_OF;
			case AWARE_VALUE: return AWARE;
			case FAMILIAR_VALUE: return FAMILIAR;
			case PROFICIENT_VALUE: return PROFICIENT;
			case EXPERT_VALUE: return EXPERT;
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
	private SkillMastery(int value, String name, String literal) {
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
	
} //SkillMastery
