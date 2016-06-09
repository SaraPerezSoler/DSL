/**
 */
package javaRule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.Rule#getAction <em>Action</em>}</li>
 *   <li>{@link javaRule.Rule#getOn <em>On</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link javaRule.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see javaRule.Action
	 * @see #setAction(Action)
	 * @see javaRule.JavaRulePackage#getRule_Action()
	 * @model required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link javaRule.Rule#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see javaRule.Action
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' containment reference.
	 * @see #setOn(Testing)
	 * @see javaRule.JavaRulePackage#getRule_On()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Testing getOn();

	/**
	 * Sets the value of the '{@link javaRule.Rule#getOn <em>On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' containment reference.
	 * @see #getOn()
	 * @generated
	 */
	void setOn(Testing value);

} // Rule
