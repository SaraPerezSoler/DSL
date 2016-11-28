/**
 */
package javaRule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.StringVariable#getVariable <em>Variable</em>}</li>
 *   <li>{@link javaRule.StringVariable#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link javaRule.StringVariable#getStrings <em>Strings</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getStringVariable()
 * @model
 * @generated
 */
public interface StringVariable extends StringProperty {
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
	 * @see javaRule.JavaRulePackage#getStringVariable_Variable()
	 * @model
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link javaRule.StringVariable#getVariable <em>Variable</em>}' reference.
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
	 * @see javaRule.JavaRulePackage#getStringVariable_Subtype()
	 * @model
	 * @generated
	 */
	Element getSubtype();

	/**
	 * Sets the value of the '{@link javaRule.StringVariable#getSubtype <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype</em>' attribute.
	 * @see javaRule.Element
	 * @see #getSubtype()
	 * @generated
	 */
	void setSubtype(Element value);

	/**
	 * Returns the value of the '<em><b>Strings</b></em>' attribute.
	 * The literals are from the enumeration {@link javaRule.ElementString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strings</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strings</em>' attribute.
	 * @see javaRule.ElementString
	 * @see #setStrings(ElementString)
	 * @see javaRule.JavaRulePackage#getStringVariable_Strings()
	 * @model required="true"
	 * @generated
	 */
	ElementString getStrings();

	/**
	 * Sets the value of the '{@link javaRule.StringVariable#getStrings <em>Strings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strings</em>' attribute.
	 * @see javaRule.ElementString
	 * @see #getStrings()
	 * @generated
	 */
	void setStrings(ElementString value);

} // StringVariable
