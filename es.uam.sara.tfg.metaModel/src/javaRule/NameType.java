/**
 */
package javaRule;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Name Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see javaRule.JavaRulePackage#getNameType()
 * @model
 * @generated
 */
public enum NameType implements Enumerator {
	/**
	 * The '<em><b>Upper Case</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPER_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	UPPER_CASE(1, "upperCase", "upperCase"),

	/**
	 * The '<em><b>Lower Case</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWER_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	LOWER_CASE(2, "lowerCase", "lowerCase"),

	/**
	 * The '<em><b>Upper Camel Case</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPER_CAMEL_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	UPPER_CAMEL_CASE(3, "upperCamelCase", "upperCamelCase"),

	/**
	 * The '<em><b>Lower Camel Case</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWER_CAMEL_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	LOWER_CAMEL_CASE(4, "lowerCamelCase", "lowerCamelCase"),

	/**
	 * The '<em><b>Start Upper Case</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_UPPER_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	START_UPPER_CASE(5, "startUpperCase", "startUpperCase");

	/**
	 * The '<em><b>Upper Case</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upper Case</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPPER_CASE
	 * @model name="upperCase"
	 * @generated
	 * @ordered
	 */
	public static final int UPPER_CASE_VALUE = 1;

	/**
	 * The '<em><b>Lower Case</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lower Case</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWER_CASE
	 * @model name="lowerCase"
	 * @generated
	 * @ordered
	 */
	public static final int LOWER_CASE_VALUE = 2;

	/**
	 * The '<em><b>Upper Camel Case</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upper Camel Case</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPPER_CAMEL_CASE
	 * @model name="upperCamelCase"
	 * @generated
	 * @ordered
	 */
	public static final int UPPER_CAMEL_CASE_VALUE = 3;

	/**
	 * The '<em><b>Lower Camel Case</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lower Camel Case</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWER_CAMEL_CASE
	 * @model name="lowerCamelCase"
	 * @generated
	 * @ordered
	 */
	public static final int LOWER_CAMEL_CASE_VALUE = 4;

	/**
	 * The '<em><b>Start Upper Case</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Start Upper Case</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #START_UPPER_CASE
	 * @model name="startUpperCase"
	 * @generated
	 * @ordered
	 */
	public static final int START_UPPER_CASE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Name Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NameType[] VALUES_ARRAY =
		new NameType[] {
			UPPER_CASE,
			LOWER_CASE,
			UPPER_CAMEL_CASE,
			LOWER_CAMEL_CASE,
			START_UPPER_CASE,
		};

	/**
	 * A public read-only list of all the '<em><b>Name Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NameType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Name Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NameType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NameType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Name Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NameType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NameType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Name Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NameType get(int value) {
		switch (value) {
			case UPPER_CASE_VALUE: return UPPER_CASE;
			case LOWER_CASE_VALUE: return LOWER_CASE;
			case UPPER_CAMEL_CASE_VALUE: return UPPER_CAMEL_CASE;
			case LOWER_CAMEL_CASE_VALUE: return LOWER_CAMEL_CASE;
			case START_UPPER_CASE_VALUE: return START_UPPER_CASE;
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
	private NameType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //NameType
