/**
 */
package javaRule.impl;

import javaRule.IsExtended;
import javaRule.JavaRulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Is Extended</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaRule.impl.IsExtendedImpl#isIsExtends <em>Is Extends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IsExtendedImpl extends ClassImpl implements IsExtended {
	/**
	 * The default value of the '{@link #isIsExtends() <em>Is Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExtends()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXTENDS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsExtends() <em>Is Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExtends()
	 * @generated
	 * @ordered
	 */
	protected boolean isExtends = IS_EXTENDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsExtendedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaRulePackage.Literals.IS_EXTENDED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsExtends() {
		return isExtends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExtends(boolean newIsExtends) {
		boolean oldIsExtends = isExtends;
		isExtends = newIsExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.IS_EXTENDED__IS_EXTENDS, oldIsExtends, isExtends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaRulePackage.IS_EXTENDED__IS_EXTENDS:
				return isIsExtends();
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
			case JavaRulePackage.IS_EXTENDED__IS_EXTENDS:
				setIsExtends((Boolean)newValue);
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
			case JavaRulePackage.IS_EXTENDED__IS_EXTENDS:
				setIsExtends(IS_EXTENDS_EDEFAULT);
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
			case JavaRulePackage.IS_EXTENDED__IS_EXTENDS:
				return isExtends != IS_EXTENDS_EDEFAULT;
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
		result.append(" (isExtends: ");
		result.append(isExtends);
		result.append(')');
		return result.toString();
	}

} //IsExtendedImpl
