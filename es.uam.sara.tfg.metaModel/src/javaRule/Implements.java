/**
 */
package javaRule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.Implements#getMinInterface <em>Min Interface</em>}</li>
 *   <li>{@link javaRule.Implements#getMaxInterface <em>Max Interface</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getImplements()
 * @model
 * @generated
 */
public interface Implements extends javaRule.Class {
	/**
	 * Returns the value of the '<em><b>Min Interface</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Interface</em>' attribute.
	 * @see #setMinInterface(int)
	 * @see javaRule.JavaRulePackage#getImplements_MinInterface()
	 * @model default="1"
	 * @generated
	 */
	int getMinInterface();

	/**
	 * Sets the value of the '{@link javaRule.Implements#getMinInterface <em>Min Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Interface</em>' attribute.
	 * @see #getMinInterface()
	 * @generated
	 */
	void setMinInterface(int value);

	/**
	 * Returns the value of the '<em><b>Max Interface</b></em>' attribute.
	 * The default value is <code>"2147483647"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Interface</em>' attribute.
	 * @see #setMaxInterface(int)
	 * @see javaRule.JavaRulePackage#getImplements_MaxInterface()
	 * @model default="2147483647"
	 * @generated
	 */
	int getMaxInterface();

	/**
	 * Sets the value of the '{@link javaRule.Implements#getMaxInterface <em>Max Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Interface</em>' attribute.
	 * @see #getMaxInterface()
	 * @generated
	 */
	void setMaxInterface(int value);

} // Implements
