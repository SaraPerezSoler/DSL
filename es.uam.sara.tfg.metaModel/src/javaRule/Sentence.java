/**
 */
package javaRule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sentence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.Sentence#getElement <em>Element</em>}</li>
 *   <li>{@link javaRule.Sentence#getSatisfy <em>Satisfy</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getSentence()
 * @model abstract="true"
 * @generated
 */
public interface Sentence extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' attribute.
	 * The literals are from the enumeration {@link javaRule.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' attribute.
	 * @see javaRule.Element
	 * @see #setElement(Element)
	 * @see javaRule.JavaRulePackage#getSentence_Element()
	 * @model required="true"
	 * @generated
	 */
	Element getElement();

	/**
	 * Sets the value of the '{@link javaRule.Sentence#getElement <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' attribute.
	 * @see javaRule.Element
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
	 * @see javaRule.JavaRulePackage#getSentence_Satisfy()
	 * @model containment="true"
	 * @generated
	 */
	Or getSatisfy();

	/**
	 * Sets the value of the '{@link javaRule.Sentence#getSatisfy <em>Satisfy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfy</em>' containment reference.
	 * @see #getSatisfy()
	 * @generated
	 */
	void setSatisfy(Or value);

} // Sentence
