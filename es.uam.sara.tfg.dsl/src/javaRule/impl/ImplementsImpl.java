/**
 */
package javaRule.impl;

import java.math.BigInteger;

import javaRule.Implements;
import javaRule.JavaRulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaRule.impl.ImplementsImpl#getMaxInterface <em>Max Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementsImpl extends ClassImpl implements Implements {
	/**
	 * The default value of the '{@link #getMaxInterface() <em>Max Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInterface()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_INTERFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxInterface() <em>Max Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInterface()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxInterface = MAX_INTERFACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaRulePackage.Literals.IMPLEMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxInterface() {
		return maxInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInterface(BigInteger newMaxInterface) {
		BigInteger oldMaxInterface = maxInterface;
		maxInterface = newMaxInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.IMPLEMENTS__MAX_INTERFACE, oldMaxInterface, maxInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaRulePackage.IMPLEMENTS__MAX_INTERFACE:
				return getMaxInterface();
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
			case JavaRulePackage.IMPLEMENTS__MAX_INTERFACE:
				setMaxInterface((BigInteger)newValue);
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
			case JavaRulePackage.IMPLEMENTS__MAX_INTERFACE:
				setMaxInterface(MAX_INTERFACE_EDEFAULT);
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
			case JavaRulePackage.IMPLEMENTS__MAX_INTERFACE:
				return MAX_INTERFACE_EDEFAULT == null ? maxInterface != null : !MAX_INTERFACE_EDEFAULT.equals(maxInterface);
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
		result.append(" (maxInterface: ");
		result.append(maxInterface);
		result.append(')');
		return result.toString();
	}

} //ImplementsImpl
