/**
 */
package javaRule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifiers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.Modifiers#getBlend <em>Blend</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getModifiers()
 * @model
 * @generated
 */
public interface Modifiers extends Attribute, javaRule.Class, Method, Enumeration, Interface {
	/**
	 * Returns the value of the '<em><b>Blend</b></em>' containment reference list.
	 * The list contents are of type {@link javaRule.BlendModifiers}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blend</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blend</em>' containment reference list.
	 * @see javaRule.JavaRulePackage#getModifiers_Blend()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BlendModifiers> getBlend();

} // Modifiers
