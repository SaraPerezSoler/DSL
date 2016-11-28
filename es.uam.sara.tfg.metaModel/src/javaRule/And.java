/**
 */
package javaRule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.And#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getAnd()
 * @model
 * @generated
 */
public interface And extends EObject {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference list.
	 * The list contents are of type {@link javaRule.PrimaryOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference list.
	 * @see javaRule.JavaRulePackage#getAnd_Op()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PrimaryOp> getOp();

} // And
