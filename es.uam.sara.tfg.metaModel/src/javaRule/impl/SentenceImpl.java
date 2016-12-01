/**
 */
package javaRule.impl;

import java.util.Collection;

import javaRule.Element;
import javaRule.JavaRulePackage;
import javaRule.Or;
import javaRule.Sentence;
import javaRule.Variable;
import javaRule.VariableSubtype;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sentence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaRule.impl.SentenceImpl#getElement <em>Element</em>}</li>
 *   <li>{@link javaRule.impl.SentenceImpl#getFrom <em>From</em>}</li>
 *   <li>{@link javaRule.impl.SentenceImpl#getIn <em>In</em>}</li>
 *   <li>{@link javaRule.impl.SentenceImpl#getSatisfy <em>Satisfy</em>}</li>
 *   <li>{@link javaRule.impl.SentenceImpl#getUsing <em>Using</em>}</li>
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
	protected static final Element ELEMENT_EDEFAULT = Element.NULL;

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
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Variable from;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> in;

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
	 * The cached value of the '{@link #getUsing() <em>Using</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsing()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableSubtype> using;

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
	public Variable getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Variable)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaRulePackage.SENTENCE__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Variable newFrom) {
		Variable oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.SENTENCE__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getIn() {
		if (in == null) {
			in = new EObjectResolvingEList<Variable>(Variable.class, this, JavaRulePackage.SENTENCE__IN);
		}
		return in;
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
	public EList<VariableSubtype> getUsing() {
		if (using == null) {
			using = new EObjectContainmentEList<VariableSubtype>(VariableSubtype.class, this, JavaRulePackage.SENTENCE__USING);
		}
		return using;
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
			case JavaRulePackage.SENTENCE__USING:
				return ((InternalEList<?>)getUsing()).basicRemove(otherEnd, msgs);
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
			case JavaRulePackage.SENTENCE__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case JavaRulePackage.SENTENCE__IN:
				return getIn();
			case JavaRulePackage.SENTENCE__SATISFY:
				return getSatisfy();
			case JavaRulePackage.SENTENCE__USING:
				return getUsing();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaRulePackage.SENTENCE__ELEMENT:
				setElement((Element)newValue);
				return;
			case JavaRulePackage.SENTENCE__FROM:
				setFrom((Variable)newValue);
				return;
			case JavaRulePackage.SENTENCE__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Variable>)newValue);
				return;
			case JavaRulePackage.SENTENCE__SATISFY:
				setSatisfy((Or)newValue);
				return;
			case JavaRulePackage.SENTENCE__USING:
				getUsing().clear();
				getUsing().addAll((Collection<? extends VariableSubtype>)newValue);
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
			case JavaRulePackage.SENTENCE__FROM:
				setFrom((Variable)null);
				return;
			case JavaRulePackage.SENTENCE__IN:
				getIn().clear();
				return;
			case JavaRulePackage.SENTENCE__SATISFY:
				setSatisfy((Or)null);
				return;
			case JavaRulePackage.SENTENCE__USING:
				getUsing().clear();
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
			case JavaRulePackage.SENTENCE__FROM:
				return from != null;
			case JavaRulePackage.SENTENCE__IN:
				return in != null && !in.isEmpty();
			case JavaRulePackage.SENTENCE__SATISFY:
				return satisfy != null;
			case JavaRulePackage.SENTENCE__USING:
				return using != null && !using.isEmpty();
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
