/**
 */
package javaRule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.TypePrimitive#getTypePrimitive <em>Type Primitive</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getTypePrimitive()
 * @model
 * @generated
 */
public interface TypePrimitive extends TypeProperty {
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
	 * @see javaRule.JavaRulePackage#getTypePrimitive_TypePrimitive()
	 * @model
	 * @generated
	 */
	Primitive getTypePrimitive();

	/**
	 * Sets the value of the '{@link javaRule.TypePrimitive#getTypePrimitive <em>Type Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Primitive</em>' attribute.
	 * @see javaRule.Primitive
	 * @see #getTypePrimitive()
	 * @generated
	 */
	void setTypePrimitive(Primitive value);

} // TypePrimitive
