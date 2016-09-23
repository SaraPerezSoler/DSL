/**
 */
package javaRule.impl;

import javaRule.ElementJava;
import javaRule.Filter;
import javaRule.JavaRulePackage;
import javaRule.Or;
import javaRule.Quantifier;
import javaRule.Rule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaRule.impl.RuleImpl#isNo <em>No</em>}</li>
 *   <li>{@link javaRule.impl.RuleImpl#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link javaRule.impl.RuleImpl#getElement <em>Element</em>}</li>
 *   <li>{@link javaRule.impl.RuleImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link javaRule.impl.RuleImpl#getSatisfy <em>Satisfy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule {
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
	 * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected static final ElementJava ELEMENT_EDEFAULT = ElementJava.PACKAGE;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected ElementJava element = ELEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected Filter filter;

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
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaRulePackage.Literals.RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.RULE__NO, oldNo, no));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.RULE__QUANTIFIER, oldQuantifier, quantifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementJava getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(ElementJava newElement) {
		ElementJava oldElement = element;
		element = newElement == null ? ELEMENT_EDEFAULT : newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.RULE__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(Filter newFilter, NotificationChain msgs) {
		Filter oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaRulePackage.RULE__FILTER, oldFilter, newFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(Filter newFilter) {
		if (newFilter != filter) {
			NotificationChain msgs = null;
			if (filter != null)
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaRulePackage.RULE__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaRulePackage.RULE__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.RULE__FILTER, newFilter, newFilter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaRulePackage.RULE__SATISFY, oldSatisfy, newSatisfy);
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
				msgs = ((InternalEObject)satisfy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaRulePackage.RULE__SATISFY, null, msgs);
			if (newSatisfy != null)
				msgs = ((InternalEObject)newSatisfy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaRulePackage.RULE__SATISFY, null, msgs);
			msgs = basicSetSatisfy(newSatisfy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.RULE__SATISFY, newSatisfy, newSatisfy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaRulePackage.RULE__FILTER:
				return basicSetFilter(null, msgs);
			case JavaRulePackage.RULE__SATISFY:
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
			case JavaRulePackage.RULE__NO:
				return isNo();
			case JavaRulePackage.RULE__QUANTIFIER:
				return getQuantifier();
			case JavaRulePackage.RULE__ELEMENT:
				return getElement();
			case JavaRulePackage.RULE__FILTER:
				return getFilter();
			case JavaRulePackage.RULE__SATISFY:
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
			case JavaRulePackage.RULE__NO:
				setNo((Boolean)newValue);
				return;
			case JavaRulePackage.RULE__QUANTIFIER:
				setQuantifier((Quantifier)newValue);
				return;
			case JavaRulePackage.RULE__ELEMENT:
				setElement((ElementJava)newValue);
				return;
			case JavaRulePackage.RULE__FILTER:
				setFilter((Filter)newValue);
				return;
			case JavaRulePackage.RULE__SATISFY:
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
			case JavaRulePackage.RULE__NO:
				setNo(NO_EDEFAULT);
				return;
			case JavaRulePackage.RULE__QUANTIFIER:
				setQuantifier(QUANTIFIER_EDEFAULT);
				return;
			case JavaRulePackage.RULE__ELEMENT:
				setElement(ELEMENT_EDEFAULT);
				return;
			case JavaRulePackage.RULE__FILTER:
				setFilter((Filter)null);
				return;
			case JavaRulePackage.RULE__SATISFY:
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
			case JavaRulePackage.RULE__NO:
				return no != NO_EDEFAULT;
			case JavaRulePackage.RULE__QUANTIFIER:
				return quantifier != QUANTIFIER_EDEFAULT;
			case JavaRulePackage.RULE__ELEMENT:
				return element != ELEMENT_EDEFAULT;
			case JavaRulePackage.RULE__FILTER:
				return filter != null;
			case JavaRulePackage.RULE__SATISFY:
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
		result.append(", element: ");
		result.append(element);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
