/**
 */
package javaRule.impl;

import javaRule.Conteins;
import javaRule.JavaRulePackage;
import javaRule.Testing;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conteins</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaRule.impl.ConteinsImpl#getWhich <em>Which</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConteinsImpl extends PackageImpl implements Conteins {
	/**
	 * The cached value of the '{@link #getWhich() <em>Which</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhich()
	 * @generated
	 * @ordered
	 */
	protected Testing which;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConteinsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaRulePackage.Literals.CONTEINS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Testing getWhich() {
		return which;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhich(Testing newWhich, NotificationChain msgs) {
		Testing oldWhich = which;
		which = newWhich;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaRulePackage.CONTEINS__WHICH, oldWhich, newWhich);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhich(Testing newWhich) {
		if (newWhich != which) {
			NotificationChain msgs = null;
			if (which != null)
				msgs = ((InternalEObject)which).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaRulePackage.CONTEINS__WHICH, null, msgs);
			if (newWhich != null)
				msgs = ((InternalEObject)newWhich).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaRulePackage.CONTEINS__WHICH, null, msgs);
			msgs = basicSetWhich(newWhich, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.CONTEINS__WHICH, newWhich, newWhich));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaRulePackage.CONTEINS__WHICH:
				return basicSetWhich(null, msgs);
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
			case JavaRulePackage.CONTEINS__WHICH:
				return getWhich();
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
			case JavaRulePackage.CONTEINS__WHICH:
				setWhich((Testing)newValue);
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
			case JavaRulePackage.CONTEINS__WHICH:
				setWhich((Testing)null);
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
			case JavaRulePackage.CONTEINS__WHICH:
				return which != null;
		}
		return super.eIsSet(featureID);
	}

} //ConteinsImpl
