/**
 */
package javaRule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.TypeString#getTypeStrng <em>Type Strng</em>}</li>
 *   <li>{@link javaRule.TypeString#getTypePrimitive <em>Type Primitive</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getTypeString()
 * @model
 * @generated
 */
public interface TypeString extends TypeProperty {
	/**
	 * Returns the value of the '<em><b>Type Strng</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Strng</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Strng</em>' containment reference.
	 * @see #setTypeStrng(StringProperty)
	 * @see javaRule.JavaRulePackage#getTypeString_TypeStrng()
	 * @model containment="true"
	 * @generated
	 */
	StringProperty getTypeStrng();

	/**
	 * Sets the value of the '{@link javaRule.TypeString#getTypeStrng <em>Type Strng</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Strng</em>' containment reference.
	 * @see #getTypeStrng()
	 * @generated
	 */
	void setTypeStrng(StringProperty value);

	/**
	 * Returns the value of the '<em><b>Type Primitive</b></em>' attribute.
	 * The literals are from the enumeration {@link javaRule.Primitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Primitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Primitive</em>' attribute.
	 * @see javaRule.Primitive
	 * @see #setTypePrimitive(Primitive)
	 * @see javaRule.JavaRulePackage#getTypeString_TypePrimitive()
	 * @model
	 * @generated
	 */
	Primitive getTypePrimitive();

	/**
	 * Sets the value of the '{@link javaRule.TypeString#getTypePrimitive <em>Type Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Primitive</em>' attribute.
	 * @see javaRule.Primitive
	 * @see #getTypePrimitive()
	 * @generated
	 */
	void setTypePrimitive(Primitive value);

} // TypeString
