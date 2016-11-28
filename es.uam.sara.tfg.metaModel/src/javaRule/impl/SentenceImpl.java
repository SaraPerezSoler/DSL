/**
 */
package javaRule.impl;

import javaRule.Element;
import javaRule.JavaRulePackage;
import javaRule.Or;
import javaRule.Sentence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sentence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaRule.impl.SentenceImpl#getElement <em>Element</em>}</li>
 *   <li>{@link javaRule.impl.SentenceImpl#getSatisfy <em>Satisfy</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SentenceImpl extends MinimalEObjectImpl.Container implements Sentence {
	/**
	 * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected static final Element ELEMENT_EDEFAULT = Element.PACKAGE;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected Element element = ELEMENT_EDEFAULT;

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
	protected SentenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaRulePackage.Literals.SENTENCE;
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
	public void setElement(Element newElement) {
		Element oldElement = element;
		element = newElement == null ? ELEMENT_EDEFAULT : newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.SENTENCE__ELEMENT, oldElement, element));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaRulePackage.SENTENCE__SATISFY, oldSatisfy, newSatisfy);
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
				msgs = ((InternalEObject)satisfy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaRulePackage.SENTENCE__SATISFY, null, msgs);
			if (newSatisfy != null)
				msgs = ((InternalEObject)newSatisfy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaRulePackage.SENTENCE__SATISFY, null, msgs);
			msgs = basicSetSatisfy(newSatisfy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.SENTENCE__SATISFY, newSatisfy, newSatisfy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaRulePackage.SENTENCE__SATISFY:
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
			case JavaRulePackage.SENTENCE__ELEMENT:
				return getElement();
			case JavaRulePackage.SENTENCE__SATISFY:
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
			case JavaRulePackage.SENTENCE__ELEMENT:
				setElement((Element)newValue);
				return;
			case JavaRulePackage.SENTENCE__SATISFY:
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
			case JavaRulePackage.SENTENCE__ELEMENT:
				setElement(ELEMENT_EDEFAULT);
				return;
			case JavaRulePackage.SENTENCE__SATISFY:
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
			case JavaRulePackage.SENTENCE__ELEMENT:
				return element != ELEMENT_EDEFAULT;
			case JavaRulePackage.SENTENCE__SATISFY:
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
		result.append(" (element: ");
		result.append(element);
		result.append(')');
		return result.toString();
	}

} //SentenceImpl
