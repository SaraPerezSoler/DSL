/**
 */
package javaRule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blend Modifiers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.BlendModifiers#getAccess <em>Access</em>}</li>
 *   <li>{@link javaRule.BlendModifiers#isStatic <em>Static</em>}</li>
 *   <li>{@link javaRule.BlendModifiers#isFinal <em>Final</em>}</li>
 *   <li>{@link javaRule.BlendModifiers#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link javaRule.BlendModifiers#isSynchronized <em>Synchronized</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getBlendModifiers()
 * @model
 * @generated
 */
public interface BlendModifiers extends EObject {
	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * The literals are from the enumeration {@link javaRule.AccessModifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see javaRule.AccessModifier
	 * @see #setAccess(AccessModifier)
	 * @see javaRule.JavaRulePackage#getBlendModifiers_Access()
	 * @model
	 * @generated
	 */
	AccessModifier getAccess();

	/**
	 * Sets the value of the '{@link javaRule.BlendModifiers#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see javaRule.AccessModifier
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(AccessModifier value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see javaRule.JavaRulePackage#getBlendModifiers_Static()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link javaRule.BlendModifiers#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see javaRule.JavaRulePackage#getBlendModifiers_Final()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link javaRule.BlendModifiers#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see javaRule.JavaRulePackage#getBlendModifiers_Abstract()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link javaRule.BlendModifiers#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Synchronized</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronized</em>' attribute.
	 * @see #setSynchronized(boolean)
	 * @see javaRule.JavaRulePackage#getBlendModifiers_Synchronized()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isSynchronized();

	/**
	 * Sets the value of the '{@link javaRule.BlendModifiers#isSynchronized <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronized</em>' attribute.
	 * @see #isSynchronized()
	 * @generated
	 */
	void setSynchronized(boolean value);

} // BlendModifiers
