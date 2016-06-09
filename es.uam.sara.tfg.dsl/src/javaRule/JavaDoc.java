/**
 */
package javaRule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Doc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.JavaDoc#isAuthor <em>Author</em>}</li>
 *   <li>{@link javaRule.JavaDoc#isParametre <em>Parametre</em>}</li>
 *   <li>{@link javaRule.JavaDoc#isReturn <em>Return</em>}</li>
 *   <li>{@link javaRule.JavaDoc#isVersion <em>Version</em>}</li>
 *   <li>{@link javaRule.JavaDoc#isThrows <em>Throws</em>}</li>
 *   <li>{@link javaRule.JavaDoc#isSee <em>See</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getJavaDoc()
 * @model
 * @generated
 */
public interface JavaDoc extends Attribute, javaRule.Class, Method, javaRule.Package, Interface, Enumeration {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(boolean)
	 * @see javaRule.JavaRulePackage#getJavaDoc_Author()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isAuthor();

	/**
	 * Sets the value of the '{@link javaRule.JavaDoc#isAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #isAuthor()
	 * @generated
	 */
	void setAuthor(boolean value);

	/**
	 * Returns the value of the '<em><b>Parametre</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametre</em>' attribute.
	 * @see #setParametre(boolean)
	 * @see javaRule.JavaRulePackage#getJavaDoc_Parametre()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isParametre();

	/**
	 * Sets the value of the '{@link javaRule.JavaDoc#isParametre <em>Parametre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametre</em>' attribute.
	 * @see #isParametre()
	 * @generated
	 */
	void setParametre(boolean value);

	/**
	 * Returns the value of the '<em><b>Return</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' attribute.
	 * @see #setReturn(boolean)
	 * @see javaRule.JavaRulePackage#getJavaDoc_Return()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isReturn();

	/**
	 * Sets the value of the '{@link javaRule.JavaDoc#isReturn <em>Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' attribute.
	 * @see #isReturn()
	 * @generated
	 */
	void setReturn(boolean value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(boolean)
	 * @see javaRule.JavaRulePackage#getJavaDoc_Version()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isVersion();

	/**
	 * Sets the value of the '{@link javaRule.JavaDoc#isVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isVersion()
	 * @generated
	 */
	void setVersion(boolean value);

	/**
	 * Returns the value of the '<em><b>Throws</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throws</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throws</em>' attribute.
	 * @see #setThrows(boolean)
	 * @see javaRule.JavaRulePackage#getJavaDoc_Throws()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isThrows();

	/**
	 * Sets the value of the '{@link javaRule.JavaDoc#isThrows <em>Throws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throws</em>' attribute.
	 * @see #isThrows()
	 * @generated
	 */
	void setThrows(boolean value);

	/**
	 * Returns the value of the '<em><b>See</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>See</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>See</em>' attribute.
	 * @see #setSee(boolean)
	 * @see javaRule.JavaRulePackage#getJavaDoc_See()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isSee();

	/**
	 * Sets the value of the '{@link javaRule.JavaDoc#isSee <em>See</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>See</em>' attribute.
	 * @see #isSee()
	 * @generated
	 */
	void setSee(boolean value);

} // JavaDoc
