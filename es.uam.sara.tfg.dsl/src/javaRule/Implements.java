/**
 */
package javaRule;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.Implements#getMaxInterface <em>Max Interface</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getImplements()
 * @model
 * @generated
 */
public interface Implements extends javaRule.Class {
	/**
	 * Returns the value of the '<em><b>Max Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Interface</em>' attribute.
	 * @see #setMaxInterface(BigInteger)
	 * @see javaRule.JavaRulePackage#getImplements_MaxInterface()
	 * @model
	 * @generated
	 */
	BigInteger getMaxInterface();

	/**
	 * Sets the value of the '{@link javaRule.Implements#getMaxInterface <em>Max Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Interface</em>' attribute.
	 * @see #getMaxInterface()
	 * @generated
	 */
	void setMaxInterface(BigInteger value);

} // Implements
