/**
 */
package javaRule.impl;

import javaRule.JavaRulePackage;
import javaRule.RangoNames;
import javaRule.isImplemented;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>is Implemented</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaRule.impl.isImplementedImpl#getValores <em>Valores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class isImplementedImpl extends InterfaceImpl implements isImplemented {
	/**
	 * The cached value of the '{@link #getValores() <em>Valores</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValores()
	 * @generated
	 * @ordered
	 */
	protected RangoNames valores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected isImplementedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaRulePackage.Literals.IS_IMPLEMENTED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangoNames getValores() {
		return valores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValores(RangoNames newValores, NotificationChain msgs) {
		RangoNames oldValores = valores;
		valores = newValores;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaRulePackage.IS_IMPLEMENTED__VALORES, oldValores, newValores);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValores(RangoNames newValores) {
		if (newValores != valores) {
			NotificationChain msgs = null;
			if (valores != null)
				msgs = ((InternalEObject)valores).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaRulePackage.IS_IMPLEMENTED__VALORES, null, msgs);
			if (newValores != null)
				msgs = ((InternalEObject)newValores).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaRulePackage.IS_IMPLEMENTED__VALORES, null, msgs);
			msgs = basicSetValores(newValores, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.IS_IMPLEMENTED__VALORES, newValores, newValores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaRulePackage.IS_IMPLEMENTED__VALORES:
				return basicSetValores(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaRulePackage.IS_IMPLEMENTED__VALORES:
				return getValores();
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
			case JavaRulePackage.IS_IMPLEMENTED__VALORES:
				setValores((RangoNames)newValue);
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
			case JavaRulePackage.IS_IMPLEMENTED__VALORES:
				setValores((RangoNames)null);
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
			case JavaRulePackage.IS_IMPLEMENTED__VALORES:
				return valores != null;
		}
		return super.eIsSet(featureID);
	}

} //isImplementedImpl
