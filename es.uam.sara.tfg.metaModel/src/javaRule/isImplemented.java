/**
 */
package javaRule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>is Implemented</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.isImplemented#getValores <em>Valores</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getisImplemented()
 * @model
 * @generated
 */
public interface isImplemented extends Interface {
	/**
	 * Returns the value of the '<em><b>Valores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valores</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valores</em>' containment reference.
	 * @see #setValores(RangoNames)
	 * @see javaRule.JavaRulePackage#getisImplemented_Valores()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RangoNames getValores();

	/**
	 * Sets the value of the '{@link javaRule.isImplemented#getValores <em>Valores</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valores</em>' containment reference.
	 * @see #getValores()
	 * @generated
	 */
	void setValores(RangoNames value);

} // isImplemented
