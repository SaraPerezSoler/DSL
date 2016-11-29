/**
 */
package javaRule;

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
 *   <li>{@link javaRule.Parameter#getMin <em>Min</em>}</li>
 *   <li>{@link javaRule.Parameter#getMax <em>Max</em>}</li>
 *   <li>{@link javaRule.Parameter#getExact <em>Exact</em>}</li>
 *   <li>{@link javaRule.Parameter#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Method {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see javaRule.JavaRulePackage#getParameter_Min()
	 * @model default="1"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link javaRule.Parameter#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * The default value is <code>"2147483647"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see javaRule.JavaRulePackage#getParameter_Max()
	 * @model default="2147483647"
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link javaRule.Parameter#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * Returns the value of the '<em><b>Exact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exact</em>' attribute.
	 * @see #setExact(int)
	 * @see javaRule.JavaRulePackage#getParameter_Exact()
	 * @model
	 * @generated
	 */
	int getExact();

	/**
	 * Sets the value of the '{@link javaRule.Parameter#getExact <em>Exact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exact</em>' attribute.
	 * @see #getExact()
	 * @generated
	 */
	void setExact(int value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link javaRule.TypeProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see javaRule.JavaRulePackage#getParameter_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeProperty> getTypes();

} // Parameter
