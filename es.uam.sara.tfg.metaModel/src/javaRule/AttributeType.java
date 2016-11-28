/**
 */
package javaRule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.AttributeType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getAttributeType()
 * @model
 * @generated
 */
public interface AttributeType extends Attribute {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(StringProperty)
	 * @see javaRule.JavaRulePackage#getAttributeType_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StringProperty getType();

	/**
	 * Sets the value of the '{@link javaRule.AttributeType#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(StringProperty value);

} // AttributeType
