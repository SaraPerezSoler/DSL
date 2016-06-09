/**
 */
package javaRule.impl;

import javaRule.Element;
import javaRule.JavaRulePackage;
import javaRule.Or;
import javaRule.Quantifier;
import javaRule.Testing;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Testing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaRule.impl.TestingImpl#isNo <em>No</em>}</li>
 *   <li>{@link javaRule.impl.TestingImpl#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link javaRule.impl.TestingImpl#getElement <em>Element</em>}</li>
 *   <li>{@link javaRule.impl.TestingImpl#getSatisfy <em>Satisfy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestingImpl extends MinimalEObjectImpl.Container implements Testing {
	/**
	 * The default value of the '{@link #isNo() <em>No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNo() <em>No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNo()
	 * @generated
	 * @ordered
	 */
	protected boolean no = NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifier()
	 * @generated
	 * @ordered
	 */
	protected static final Quantifier QUANTIFIER_EDEFAULT = Quantifier.ONE;

	/**
	 * The cached value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifier()
	 * @generated
	 * @ordered
	 */
	protected Quantifier quantifier = QUANTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected Element element;

	/**
	 * The cached value of the '{@link #getSatisfy() <em>Satisfy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfy()
	 * @generated
	 * @ordered
	 */
	protected Or satisfy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaRulePackage.Literals.TESTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNo() {
		return no;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNo(boolean newNo) {
		boolean oldNo = no;
		no = newNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.TESTING__NO, oldNo, no));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantifier getQuantifier() {
		return quantifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantifier(Quantifier newQuantifier) {
		Quantifier oldQuantifier = quantifier;
		quantifier = newQuantifier == null ? QUANTIFIER_EDEFAULT : newQuantifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.TESTING__QUANTIFIER, oldQuantifier, quantifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(Element newElement, NotificationChain msgs) {
		Element oldElement = element;
		element = newElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaRulePackage.TESTING__ELEMENT, oldElement, newElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(Element newElement) {
		if (newElement != element) {
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaRulePackage.TESTING__ELEMENT, null, msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaRulePackage.TESTING__ELEMENT, null, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.TESTING__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or getSatisfy() {
		return satisfy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSatisfy(Or newSatisfy, NotificationChain msgs) {
		Or oldSatisfy = satisfy;
		satisfy = newSatisfy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaRulePackage.TESTING__SATISFY, oldSatisfy, newSatisfy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfy(Or newSatisfy) {
		if (newSatisfy != satisfy) {
			NotificationChain msgs = null;
			if (satisfy != null)
				msgs = ((InternalEObject)satisfy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaRulePackage.TESTING__SATISFY, null, msgs);
			if (newSatisfy != null)
				msgs = ((InternalEObject)newSatisfy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaRulePackage.TESTING__SATISFY, null, msgs);
			msgs = basicSetSatisfy(newSatisfy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.TESTING__SATISFY, newSatisfy, newSatisfy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaRulePackage.TESTING__ELEMENT:
				return basicSetElement(null, msgs);
			case JavaRulePackage.TESTING__SATISFY:
				return basicSetSatisfy(null, msgs);
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
			case JavaRulePackage.TESTING__NO:
				return isNo();
			case JavaRulePackage.TESTING__QUANTIFIER:
				return getQuantifier();
			case JavaRulePackage.TESTING__ELEMENT:
				return getElement();
			case JavaRulePackage.TESTING__SATISFY:
				return getSatisfy();
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
			case JavaRulePackage.TESTING__NO:
				setNo((Boolean)newValue);
				return;
			case JavaRulePackage.TESTING__QUANTIFIER:
				setQuantifier((Quantifier)newValue);
				return;
			case JavaRulePackage.TESTING__ELEMENT:
				setElement((Element)newValue);
				return;
			case JavaRulePackage.TESTING__SATISFY:
				setSatisfy((Or)newValue);
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
			case JavaRulePackage.TESTING__NO:
				setNo(NO_EDEFAULT);
				return;
			case JavaRulePackage.TESTING__QUANTIFIER:
				setQuantifier(QUANTIFIER_EDEFAULT);
				return;
			case JavaRulePackage.TESTING__ELEMENT:
				setElement((Element)null);
				return;
			case JavaRulePackage.TESTING__SATISFY:
				setSatisfy((Or)null);
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
			case JavaRulePackage.TESTING__NO:
				return no != NO_EDEFAULT;
			case JavaRulePackage.TESTING__QUANTIFIER:
				return quantifier != QUANTIFIER_EDEFAULT;
			case JavaRulePackage.TESTING__ELEMENT:
				return element != null;
			case JavaRulePackage.TESTING__SATISFY:
				return satisfy != null;
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
		result.append(" (no: ");
		result.append(no);
		result.append(", quantifier: ");
		result.append(quantifier);
		result.append(')');
		return result.toString();
	}

} //TestingImpl
