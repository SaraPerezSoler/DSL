/**
 */
package javaRule;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.Parameter#getNumParam <em>Num Param</em>}</li>
 *   <li>{@link javaRule.Parameter#getTypesParam <em>Types Param</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Method {
	/**
	 * Returns the value of the '<em><b>Num Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Param</em>' attribute.
	 * @see #setNumParam(BigInteger)
	 * @see javaRule.JavaRulePackage#getParameter_NumParam()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getNumParam();

	/**
	 * Sets the value of the '{@link javaRule.Parameter#getNumParam <em>Num Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Param</em>' attribute.
	 * @see #getNumParam()
	 * @generated
	 */
	void setNumParam(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Types Param</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types Param</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types Param</em>' attribute list.
	 * @see javaRule.JavaRulePackage#getParameter_TypesParam()
	 * @model
	 * @generated
	 */
	EList<String> getTypesParam();

} // Parameter
