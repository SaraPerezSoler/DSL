/**
 */
package javaRule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.Element#getElement <em>Element</em>}</li>
 *   <li>{@link javaRule.Element#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
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
	 * @see javaRule.JavaRulePackage#getElement_Element()
	 * @model required="true"
	 * @generated
	 */
	ElementJava getElement();

	/**
	 * Sets the value of the '{@link javaRule.Element#getElement <em>Element</em>}' attribute.
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
	 * @see #setFilter(Or)
	 * @see javaRule.JavaRulePackage#getElement_Filter()
	 * @model containment="true"
	 * @generated
	 */
	Or getFilter();

	/**
	 * Sets the value of the '{@link javaRule.Element#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(Or value);

} // Element
