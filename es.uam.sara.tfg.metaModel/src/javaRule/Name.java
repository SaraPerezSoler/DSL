/**
 */
package javaRule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.Name#getType <em>Type</em>}</li>
 *   <li>{@link javaRule.Name#getName <em>Name</em>}</li>
 *   <li>{@link javaRule.Name#getOperator <em>Operator</em>}</li>
 *   <li>{@link javaRule.Name#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getName_()
 * @model
 * @generated
 */
public interface Name extends Attribute, javaRule.Class, Method, javaRule.Package, Interface, Enumeration {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"nothing"</code>.
	 * The literals are from the enumeration {@link javaRule.NameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see javaRule.NameType
	 * @see #setType(NameType)
	 * @see javaRule.JavaRulePackage#getName_Type()
	 * @model default="nothing"
	 * @generated
	 */
	NameType getType();

	/**
	 * Sets the value of the '{@link javaRule.Name#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see javaRule.NameType
	 * @see #getType()
	 * @generated
	 */
	void setType(NameType value);

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
	 * @see javaRule.JavaRulePackage#getName_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link javaRule.Name#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"nothing"</code>.
	 * The literals are from the enumeration {@link javaRule.NameOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see javaRule.NameOperator
	 * @see #setOperator(NameOperator)
	 * @see javaRule.JavaRulePackage#getName_Operator()
	 * @model default="nothing"
	 * @generated
	 */
	NameOperator getOperator();

	/**
	 * Sets the value of the '{@link javaRule.Name#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see javaRule.NameOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(NameOperator value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The default value is <code>"EMPTY"</code>.
	 * The literals are from the enumeration {@link javaRule.Language}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see javaRule.Language
	 * @see #setLanguage(Language)
	 * @see javaRule.JavaRulePackage#getName_Language()
	 * @model default="EMPTY"
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link javaRule.Name#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see javaRule.Language
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

} // Name
