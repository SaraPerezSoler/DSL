/**
 */
package javaRule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Subtype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.VariableSubtype#getVariable <em>Variable</em>}</li>
 *   <li>{@link javaRule.VariableSubtype#getSubtype <em>Subtype</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getVariableSubtype()
 * @model
 * @generated
 */
public interface VariableSubtype extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see javaRule.JavaRulePackage#getVariableSubtype_Variable()
	 * @model
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link javaRule.VariableSubtype#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' attribute.
	 * The literals are from the enumeration {@link javaRule.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' attribute.
	 * @see javaRule.Element
	 * @see #setSubtype(Element)
	 * @see javaRule.JavaRulePackage#getVariableSubtype_Subtype()
	 * @model
	 * @generated
	 */
	Element getSubtype();

	/**
	 * Sets the value of the '{@link javaRule.VariableSubtype#getSubtype <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype</em>' attribute.
	 * @see javaRule.Element
	 * @see #getSubtype()
	 * @generated
	 */
	void setSubtype(Element value);

} // VariableSubtype
