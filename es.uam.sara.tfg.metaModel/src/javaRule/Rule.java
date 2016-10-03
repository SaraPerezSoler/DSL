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
 *   <li>{@link javaRule.Rule#isNo <em>No</em>}</li>
 *   <li>{@link javaRule.Rule#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link javaRule.Rule#getElement <em>Element</em>}</li>
 *   <li>{@link javaRule.Rule#getFilter <em>Filter</em>}</li>
 *   <li>{@link javaRule.Rule#getSatisfy <em>Satisfy</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
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
	 * @see javaRule.JavaRulePackage#getRule_No()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isNo();

	/**
	 * Sets the value of the '{@link javaRule.Rule#isNo <em>No</em>}' attribute.
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
	 * @see javaRule.JavaRulePackage#getRule_Quantifier()
	 * @model required="true"
	 * @generated
	 */
	Quantifier getQuantifier();

	/**
	 * Sets the value of the '{@link javaRule.Rule#getQuantifier <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' attribute.
	 * @see javaRule.Quantifier
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(Quantifier value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' attribute.
	 * The literals are from the enumeration {@link javaRule.ElementJava}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' attribute.
	 * @see javaRule.ElementJava
	 * @see #setElement(ElementJava)
	 * @see javaRule.JavaRulePackage#getRule_Element()
	 * @model required="true"
	 * @generated
	 */
	ElementJava getElement();

	/**
	 * Sets the value of the '{@link javaRule.Rule#getElement <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' attribute.
	 * @see javaRule.ElementJava
	 * @see #getElement()
	 * @generated
	 */
	void setElement(ElementJava value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(Filter)
	 * @see javaRule.JavaRulePackage#getRule_Filter()
	 * @model containment="true"
	 * @generated
	 */
	Filter getFilter();

	/**
	 * Sets the value of the '{@link javaRule.Rule#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(Filter value);

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
	 * @see javaRule.JavaRulePackage#getRule_Satisfy()
	 * @model containment="true"
	 * @generated
	 */
	Or getSatisfy();

	/**
	 * Sets the value of the '{@link javaRule.Rule#getSatisfy <em>Satisfy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfy</em>' containment reference.
	 * @see #getSatisfy()
	 * @generated
	 */
	void setSatisfy(Or value);

} // Rule
