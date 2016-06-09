/**
 */
package javaRule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.Or#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getOr()
 * @model
 * @generated
 */
public interface Or extends EObject {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference list.
	 * The list contents are of type {@link javaRule.And}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference list.
	 * @see javaRule.JavaRulePackage#getOr_Op()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<And> getOp();

} // Or
