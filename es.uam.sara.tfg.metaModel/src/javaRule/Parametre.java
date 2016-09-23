/**
 */
package javaRule;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.Parametre#getNumParam <em>Num Param</em>}</li>
 *   <li>{@link javaRule.Parametre#getTypesParam <em>Types Param</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getParametre()
 * @model
 * @generated
 */
public interface Parametre extends Method {
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
	 * @see javaRule.JavaRulePackage#getParametre_NumParam()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getNumParam();

	/**
	 * Sets the value of the '{@link javaRule.Parametre#getNumParam <em>Num Param</em>}' attribute.
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
	 * @see javaRule.JavaRulePackage#getParametre_TypesParam()
	 * @model
	 * @generated
	 */
	EList<String> getTypesParam();

} // Parametre
