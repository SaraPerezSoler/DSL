/**
 */
package javaRule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.PropertyLiteral#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getPropertyLiteral()
 * @model
 * @generated
 */
public interface PropertyLiteral extends PrimaryOp {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(Property)
	 * @see javaRule.JavaRulePackage#getPropertyLiteral_Property()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link javaRule.PropertyLiteral#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

} // PropertyLiteral
