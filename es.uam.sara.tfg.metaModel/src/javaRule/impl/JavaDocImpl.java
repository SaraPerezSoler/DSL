/**
 */
package javaRule.impl;

import javaRule.JavaDoc;
import javaRule.JavaRulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Doc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaRule.impl.JavaDocImpl#isAuthor <em>Author</em>}</li>
 *   <li>{@link javaRule.impl.JavaDocImpl#isParameter <em>Parameter</em>}</li>
 *   <li>{@link javaRule.impl.JavaDocImpl#isReturn <em>Return</em>}</li>
 *   <li>{@link javaRule.impl.JavaDocImpl#isVersion <em>Version</em>}</li>
 *   <li>{@link javaRule.impl.JavaDocImpl#isThrows <em>Throws</em>}</li>
 *   <li>{@link javaRule.impl.JavaDocImpl#isSee <em>See</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaDocImpl extends AttributeImpl implements JavaDoc {
	/**
	 * The default value of the '{@link #isAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTHOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthor()
	 * @generated
	 * @ordered
	 */
	protected boolean author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParameter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARAMETER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParameter()
	 * @generated
	 * @ordered
	 */
	protected boolean parameter = PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #isReturn() <em>Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETURN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReturn() <em>Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturn()
	 * @generated
	 * @ordered
	 */
	protected boolean return_ = RETURN_EDEFAULT;

	/**
	 * The default value of the '{@link #isVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVersion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVersion()
	 * @generated
	 * @ordered
	 */
	protected boolean version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isThrows() <em>Throws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThrows()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THROWS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isThrows() <em>Throws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThrows()
	 * @generated
	 * @ordered
	 */
	protected boolean throws_ = THROWS_EDEFAULT;

	/**
	 * The default value of the '{@link #isSee() <em>See</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSee()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSee() <em>See</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSee()
	 * @generated
	 * @ordered
	 */
	protected boolean see = SEE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaDocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaRulePackage.Literals.JAVA_DOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(boolean newAuthor) {
		boolean oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.JAVA_DOC__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(boolean newParameter) {
		boolean oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.JAVA_DOC__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReturn() {
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturn(boolean newReturn) {
		boolean oldReturn = return_;
		return_ = newReturn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.JAVA_DOC__RETURN, oldReturn, return_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(boolean newVersion) {
		boolean oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.JAVA_DOC__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isThrows() {
		return throws_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThrows(boolean newThrows) {
		boolean oldThrows = throws_;
		throws_ = newThrows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.JAVA_DOC__THROWS, oldThrows, throws_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSee() {
		return see;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSee(boolean newSee) {
		boolean oldSee = see;
		see = newSee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.JAVA_DOC__SEE, oldSee, see));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaRulePackage.JAVA_DOC__AUTHOR:
				return isAuthor();
			case JavaRulePackage.JAVA_DOC__PARAMETER:
				return isParameter();
			case JavaRulePackage.JAVA_DOC__RETURN:
				return isReturn();
			case JavaRulePackage.JAVA_DOC__VERSION:
				return isVersion();
			case JavaRulePackage.JAVA_DOC__THROWS:
				return isThrows();
			case JavaRulePackage.JAVA_DOC__SEE:
				return isSee();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaRulePackage.JAVA_DOC__AUTHOR:
				setAuthor((Boolean)newValue);
				return;
			case JavaRulePackage.JAVA_DOC__PARAMETER:
				setParameter((Boolean)newValue);
				return;
			case JavaRulePackage.JAVA_DOC__RETURN:
				setReturn((Boolean)newValue);
				return;
			case JavaRulePackage.JAVA_DOC__VERSION:
				setVersion((Boolean)newValue);
				return;
			case JavaRulePackage.JAVA_DOC__THROWS:
				setThrows((Boolean)newValue);
				return;
			case JavaRulePackage.JAVA_DOC__SEE:
				setSee((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JavaRulePackage.JAVA_DOC__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case JavaRulePackage.JAVA_DOC__PARAMETER:
				setParameter(PARAMETER_EDEFAULT);
				return;
			case JavaRulePackage.JAVA_DOC__RETURN:
				setReturn(RETURN_EDEFAULT);
				return;
			case JavaRulePackage.JAVA_DOC__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case JavaRulePackage.JAVA_DOC__THROWS:
				setThrows(THROWS_EDEFAULT);
				return;
			case JavaRulePackage.JAVA_DOC__SEE:
				setSee(SEE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JavaRulePackage.JAVA_DOC__AUTHOR:
				return author != AUTHOR_EDEFAULT;
			case JavaRulePackage.JAVA_DOC__PARAMETER:
				return parameter != PARAMETER_EDEFAULT;
			case JavaRulePackage.JAVA_DOC__RETURN:
				return return_ != RETURN_EDEFAULT;
			case JavaRulePackage.JAVA_DOC__VERSION:
				return version != VERSION_EDEFAULT;
			case JavaRulePackage.JAVA_DOC__THROWS:
				return throws_ != THROWS_EDEFAULT;
			case JavaRulePackage.JAVA_DOC__SEE:
				return see != SEE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (author: ");
		result.append(author);
		result.append(", parameter: ");
		result.append(parameter);
		result.append(", return: ");
		result.append(return_);
		result.append(", version: ");
		result.append(version);
		result.append(", throws: ");
		result.append(throws_);
		result.append(", see: ");
		result.append(see);
		result.append(')');
		return result.toString();
	}

} //JavaDocImpl
