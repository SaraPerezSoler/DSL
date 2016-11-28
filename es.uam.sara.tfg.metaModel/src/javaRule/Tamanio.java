/**
 */
package javaRule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tamanio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.Tamanio#getMin <em>Min</em>}</li>
 *   <li>{@link javaRule.Tamanio#getMax <em>Max</em>}</li>
 *   <li>{@link javaRule.Tamanio#getExact <em>Exact</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getTamanio()
 * @model
 * @generated
 */
public interface Tamanio extends Method {
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
	 * @see javaRule.JavaRulePackage#getTamanio_Min()
	 * @model default="1"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link javaRule.Tamanio#getMin <em>Min</em>}' attribute.
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
	 * @see javaRule.JavaRulePackage#getTamanio_Max()
	 * @model default="2147483647"
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link javaRule.Tamanio#getMax <em>Max</em>}' attribute.
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
	 * @see javaRule.JavaRulePackage#getTamanio_Exact()
	 * @model
	 * @generated
	 */
	int getExact();

	/**
	 * Sets the value of the '{@link javaRule.Tamanio#getExact <em>Exact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exact</em>' attribute.
	 * @see #getExact()
	 * @generated
	 */
	void setExact(int value);

} // Tamanio
