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
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see javaRule.JavaRulePackage#getAttributeType_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link javaRule.AttributeType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // AttributeType
