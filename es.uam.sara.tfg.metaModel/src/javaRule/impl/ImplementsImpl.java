/**
 */
package javaRule.impl;

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
 *   <li>{@link javaRule.impl.ImplementsImpl#getMinInterface <em>Min Interface</em>}</li>
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
	protected static final int MAX_INTERFACE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxInterface() <em>Max Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInterface()
	 * @generated
	 * @ordered
	 */
	protected int maxInterface = MAX_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinInterface() <em>Min Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInterface()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_INTERFACE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinInterface() <em>Min Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInterface()
	 * @generated
	 * @ordered
	 */
	protected int minInterface = MIN_INTERFACE_EDEFAULT;

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
	public int getMaxInterface() {
		return maxInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInterface(int newMaxInterface) {
		int oldMaxInterface = maxInterface;
		maxInterface = newMaxInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.IMPLEMENTS__MAX_INTERFACE, oldMaxInterface, maxInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinInterface() {
		return minInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInterface(int newMinInterface) {
		int oldMinInterface = minInterface;
		minInterface = newMinInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.IMPLEMENTS__MIN_INTERFACE, oldMinInterface, minInterface));
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
			case JavaRulePackage.IMPLEMENTS__MIN_INTERFACE:
				return getMinInterface();
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
				setMaxInterface((Integer)newValue);
				return;
			case JavaRulePackage.IMPLEMENTS__MIN_INTERFACE:
				setMinInterface((Integer)newValue);
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
			case JavaRulePackage.IMPLEMENTS__MIN_INTERFACE:
				setMinInterface(MIN_INTERFACE_EDEFAULT);
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
				return maxInterface != MAX_INTERFACE_EDEFAULT;
			case JavaRulePackage.IMPLEMENTS__MIN_INTERFACE:
				return minInterface != MIN_INTERFACE_EDEFAULT;
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
		result.append(", minInterface: ");
		result.append(minInterface);
		result.append(')');
		return result.toString();
	}

} //ImplementsImpl
