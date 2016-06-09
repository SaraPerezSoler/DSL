/**
 */
package javaRule.impl;

import javaRule.JavaRulePackage;
import javaRule.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaRule.impl.VariableImpl#isPosition <em>Position</em>}</li>
 *   <li>{@link javaRule.impl.VariableImpl#isInitialize <em>Initialize</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends MethodImpl implements Variable {
	/**
	 * The default value of the '{@link #isPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPosition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POSITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPosition()
	 * @generated
	 * @ordered
	 */
	protected boolean position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isInitialize() <em>Initialize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialize()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIALIZE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitialize() <em>Initialize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialize()
	 * @generated
	 * @ordered
	 */
	protected boolean initialize = INITIALIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaRulePackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(boolean newPosition) {
		boolean oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.VARIABLE__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialize() {
		return initialize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialize(boolean newInitialize) {
		boolean oldInitialize = initialize;
		initialize = newInitialize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.VARIABLE__INITIALIZE, oldInitialize, initialize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaRulePackage.VARIABLE__POSITION:
				return isPosition();
			case JavaRulePackage.VARIABLE__INITIALIZE:
				return isInitialize();
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
			case JavaRulePackage.VARIABLE__POSITION:
				setPosition((Boolean)newValue);
				return;
			case JavaRulePackage.VARIABLE__INITIALIZE:
				setInitialize((Boolean)newValue);
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
			case JavaRulePackage.VARIABLE__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case JavaRulePackage.VARIABLE__INITIALIZE:
				setInitialize(INITIALIZE_EDEFAULT);
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
			case JavaRulePackage.VARIABLE__POSITION:
				return position != POSITION_EDEFAULT;
			case JavaRulePackage.VARIABLE__INITIALIZE:
				return initialize != INITIALIZE_EDEFAULT;
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
		result.append(" (position: ");
		result.append(position);
		result.append(", initialize: ");
		result.append(initialize);
		result.append(')');
		return result.toString();
	}

} //VariableImpl
