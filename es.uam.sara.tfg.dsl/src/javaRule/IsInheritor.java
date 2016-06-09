/**
 */
package javaRule;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Inheritor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.IsInheritor#getMaxLevel <em>Max Level</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getIsInheritor()
 * @model
 * @generated
 */
public interface IsInheritor extends javaRule.Class {
	/**
	 * Returns the value of the '<em><b>Max Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Level</em>' attribute.
	 * @see #setMaxLevel(BigInteger)
	 * @see javaRule.JavaRulePackage#getIsInheritor_MaxLevel()
	 * @model
	 * @generated
	 */
	BigInteger getMaxLevel();

	/**
	 * Sets the value of the '{@link javaRule.IsInheritor#getMaxLevel <em>Max Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Level</em>' attribute.
	 * @see #getMaxLevel()
	 * @generated
	 */
	void setMaxLevel(BigInteger value);

} // IsInheritor
