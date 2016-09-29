/**
 */
package javaRule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.Filter#getFilter <em>Filter</em>}</li>
 *   <li>{@link javaRule.Filter#isNo <em>No</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends EObject {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(Or)
	 * @see javaRule.JavaRulePackage#getFilter_Filter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Or getFilter();

	/**
	 * Sets the value of the '{@link javaRule.Filter#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(Or value);

	/**
	 * Returns the value of the '<em><b>No</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No</em>' attribute.
	 * @see #setNo(boolean)
	 * @see javaRule.JavaRulePackage#getFilter_No()
	 * @model default="false"
	 * @generated
	 */
	boolean isNo();

	/**
	 * Sets the value of the '{@link javaRule.Filter#isNo <em>No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No</em>' attribute.
	 * @see #isNo()
	 * @generated
	 */
	void setNo(boolean value);

} // Filter
