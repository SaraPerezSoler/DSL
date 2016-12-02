/**
 */
package javaRule;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link javaRule.Sentence#getFrom <em>From</em>}</li>
 *   <li>{@link javaRule.Sentence#getIn <em>In</em>}</li>
 *   <li>{@link javaRule.Sentence#getSatisfy <em>Satisfy</em>}</li>
 *   <li>{@link javaRule.Sentence#getUsing <em>Using</em>}</li>
 *   <li>{@link javaRule.Sentence#getName <em>Name</em>}</li>
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
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Variable)
	 * @see javaRule.JavaRulePackage#getSentence_From()
	 * @model
	 * @generated
	 */
	Variable getFrom();

	/**
	 * Sets the value of the '{@link javaRule.Sentence#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Variable value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link javaRule.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see javaRule.JavaRulePackage#getSentence_In()
	 * @model
	 * @generated
	 */
	EList<Variable> getIn();

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

	/**
	 * Returns the value of the '<em><b>Using</b></em>' containment reference list.
	 * The list contents are of type {@link javaRule.VariableSubtype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Using</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using</em>' containment reference list.
	 * @see javaRule.JavaRulePackage#getSentence_Using()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableSubtype> getUsing();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see javaRule.JavaRulePackage#getSentence_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link javaRule.Sentence#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Sentence
