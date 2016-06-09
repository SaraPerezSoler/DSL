/**
 */
package javaRule.impl;

import java.math.BigInteger;

import javaRule.IsInheritor;
import javaRule.JavaRulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Is Inheritor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaRule.impl.IsInheritorImpl#getMaxLevel <em>Max Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IsInheritorImpl extends ClassImpl implements IsInheritor {
	/**
	 * The default value of the '{@link #getMaxLevel() <em>Max Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxLevel() <em>Max Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLevel()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxLevel = MAX_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsInheritorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaRulePackage.Literals.IS_INHERITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxLevel() {
		return maxLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLevel(BigInteger newMaxLevel) {
		BigInteger oldMaxLevel = maxLevel;
		maxLevel = newMaxLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.IS_INHERITOR__MAX_LEVEL, oldMaxLevel, maxLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaRulePackage.IS_INHERITOR__MAX_LEVEL:
				return getMaxLevel();
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
			case JavaRulePackage.IS_INHERITOR__MAX_LEVEL:
				setMaxLevel((BigInteger)newValue);
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
			case JavaRulePackage.IS_INHERITOR__MAX_LEVEL:
				setMaxLevel(MAX_LEVEL_EDEFAULT);
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
			case JavaRulePackage.IS_INHERITOR__MAX_LEVEL:
				return MAX_LEVEL_EDEFAULT == null ? maxLevel != null : !MAX_LEVEL_EDEFAULT.equals(maxLevel);
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
		result.append(" (maxLevel: ");
		result.append(maxLevel);
		result.append(')');
		return result.toString();
	}

} //IsInheritorImpl
