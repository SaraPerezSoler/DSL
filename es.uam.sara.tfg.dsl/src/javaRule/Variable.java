/**
 */
package javaRule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.Variable#isPosition <em>Position</em>}</li>
 *   <li>{@link javaRule.Variable#isInitialize <em>Initialize</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Method {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(boolean)
	 * @see javaRule.JavaRulePackage#getVariable_Position()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isPosition();

	/**
	 * Sets the value of the '{@link javaRule.Variable#isPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #isPosition()
	 * @generated
	 */
	void setPosition(boolean value);

	/**
	 * Returns the value of the '<em><b>Initialize</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialize</em>' attribute.
	 * @see #setInitialize(boolean)
	 * @see javaRule.JavaRulePackage#getVariable_Initialize()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isInitialize();

	/**
	 * Sets the value of the '{@link javaRule.Variable#isInitialize <em>Initialize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialize</em>' attribute.
	 * @see #isInitialize()
	 * @generated
	 */
	void setInitialize(boolean value);

} // Variable
