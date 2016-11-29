/**
 */
package javaRule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contains</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.Contains#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getContains()
 * @model
 * @generated
 */
public interface Contains extends javaRule.Class, Enumeration, File, Interface, javaRule.Package {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(Rule)
	 * @see javaRule.JavaRulePackage#getContains_Rule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link javaRule.Contains#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

} // Contains
