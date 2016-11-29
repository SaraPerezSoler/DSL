/**
 */
package javaRule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.Property#isNo <em>No</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getProperty()
 * @model abstract="true"
 * @generated
 */
public interface Property extends EObject {
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
	 * @see javaRule.JavaRulePackage#getProperty_No()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isNo();

	/**
	 * Sets the value of the '{@link javaRule.Property#isNo <em>No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No</em>' attribute.
	 * @see #isNo()
	 * @generated
	 */
	void setNo(boolean value);

} // Property
