/**
 */
package javaRule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.NameType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getNameType()
 * @model
 * @generated
 */
public interface NameType extends Attribute, javaRule.Class, Method, javaRule.Package, Interface, Enumeration {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"nothing"</code>.
	 * The literals are from the enumeration {@link javaRule.NameCheck}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see javaRule.NameCheck
	 * @see #setType(NameCheck)
	 * @see javaRule.JavaRulePackage#getNameType_Type()
	 * @model default="nothing" required="true"
	 * @generated
	 */
	NameCheck getType();

	/**
	 * Sets the value of the '{@link javaRule.NameType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see javaRule.NameCheck
	 * @see #getType()
	 * @generated
	 */
	void setType(NameCheck value);

} // NameType
