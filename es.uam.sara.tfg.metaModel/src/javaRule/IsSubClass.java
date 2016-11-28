/**
 */
package javaRule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Sub Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.IsSubClass#getOf <em>Of</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getIsSubClass()
 * @model
 * @generated
 */
public interface IsSubClass extends javaRule.Class {
	/**
	 * Returns the value of the '<em><b>Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Of</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of</em>' containment reference.
	 * @see #setOf(StringProperty)
	 * @see javaRule.JavaRulePackage#getIsSubClass_Of()
	 * @model containment="true"
	 * @generated
	 */
	StringProperty getOf();

	/**
	 * Sets the value of the '{@link javaRule.IsSubClass#getOf <em>Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Of</em>' containment reference.
	 * @see #getOf()
	 * @generated
	 */
	void setOf(StringProperty value);

} // IsSubClass
