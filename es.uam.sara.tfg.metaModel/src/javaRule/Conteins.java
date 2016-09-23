/**
 */
package javaRule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conteins</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.Conteins#getWhich <em>Which</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getConteins()
 * @model
 * @generated
 */
public interface Conteins extends javaRule.Package, Interface, Enumeration, javaRule.Class {
	/**
	 * Returns the value of the '<em><b>Which</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Which</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Which</em>' containment reference.
	 * @see #setWhich(Rule)
	 * @see javaRule.JavaRulePackage#getConteins_Which()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Rule getWhich();

	/**
	 * Sets the value of the '{@link javaRule.Conteins#getWhich <em>Which</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Which</em>' containment reference.
	 * @see #getWhich()
	 * @generated
	 */
	void setWhich(Rule value);

} // Conteins
