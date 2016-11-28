/**
 */
package javaRule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rango Names</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.RangoNames#getMin <em>Min</em>}</li>
 *   <li>{@link javaRule.RangoNames#getMax <em>Max</em>}</li>
 *   <li>{@link javaRule.RangoNames#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getRangoNames()
 * @model
 * @generated
 */
public interface RangoNames extends EObject {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see javaRule.JavaRulePackage#getRangoNames_Min()
	 * @model default="1"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link javaRule.RangoNames#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * The default value is <code>"2147483647"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see javaRule.JavaRulePackage#getRangoNames_Max()
	 * @model default="2147483647"
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link javaRule.RangoNames#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link javaRule.StringProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see javaRule.JavaRulePackage#getRangoNames_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<StringProperty> getTypes();

} // RangoNames
