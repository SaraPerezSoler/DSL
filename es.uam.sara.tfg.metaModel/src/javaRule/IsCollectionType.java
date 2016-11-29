/**
 */
package javaRule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.IsCollectionType#getOf <em>Of</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getIsCollectionType()
 * @model
 * @generated
 */
public interface IsCollectionType extends TypeProperty {
	/**
	 * Returns the value of the '<em><b>Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of</em>' containment reference.
	 * @see #setOf(TypeProperty)
	 * @see javaRule.JavaRulePackage#getIsCollectionType_Of()
	 * @model containment="true"
	 * @generated
	 */
	TypeProperty getOf();

	/**
	 * Sets the value of the '{@link javaRule.IsCollectionType#getOf <em>Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Of</em>' containment reference.
	 * @see #getOf()
	 * @generated
	 */
	void setOf(TypeProperty value);

} // IsCollectionType
