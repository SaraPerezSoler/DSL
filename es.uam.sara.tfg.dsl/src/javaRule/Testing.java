/**
 */
package javaRule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Testing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.Testing#isNo <em>No</em>}</li>
 *   <li>{@link javaRule.Testing#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link javaRule.Testing#getElement <em>Element</em>}</li>
 *   <li>{@link javaRule.Testing#getSatisfy <em>Satisfy</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getTesting()
 * @model
 * @generated
 */
public interface Testing extends EObject {
	/**
	 * Returns the value of the '<em><b>No</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No</em>' attribute.
	 * @see #setNo(boolean)
	 * @see javaRule.JavaRulePackage#getTesting_No()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isNo();

	/**
	 * Sets the value of the '{@link javaRule.Testing#isNo <em>No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No</em>' attribute.
	 * @see #isNo()
	 * @generated
	 */
	void setNo(boolean value);

	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
	 * The literals are from the enumeration {@link javaRule.Quantifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier</em>' attribute.
	 * @see javaRule.Quantifier
	 * @see #setQuantifier(Quantifier)
	 * @see javaRule.JavaRulePackage#getTesting_Quantifier()
	 * @model required="true"
	 * @generated
	 */
	Quantifier getQuantifier();

	/**
	 * Sets the value of the '{@link javaRule.Testing#getQuantifier <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' attribute.
	 * @see javaRule.Quantifier
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(Quantifier value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(Element)
	 * @see javaRule.JavaRulePackage#getTesting_Element()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Element getElement();

	/**
	 * Sets the value of the '{@link javaRule.Testing#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Element value);

	/**
	 * Returns the value of the '<em><b>Satisfy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satisfy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfy</em>' containment reference.
	 * @see #setSatisfy(Or)
	 * @see javaRule.JavaRulePackage#getTesting_Satisfy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Or getSatisfy();

	/**
	 * Sets the value of the '{@link javaRule.Testing#getSatisfy <em>Satisfy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfy</em>' containment reference.
	 * @see #getSatisfy()
	 * @generated
	 */
	void setSatisfy(Or value);

} // Testing
