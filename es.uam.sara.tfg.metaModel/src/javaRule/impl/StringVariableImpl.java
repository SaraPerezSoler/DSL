/**
 */
package javaRule.impl;

import javaRule.Element;
import javaRule.ElementString;
import javaRule.JavaRulePackage;
import javaRule.StringVariable;
import javaRule.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaRule.impl.StringVariableImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link javaRule.impl.StringVariableImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link javaRule.impl.StringVariableImpl#getStrings <em>Strings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringVariableImpl extends StringPropertyImpl implements StringVariable {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * The default value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected static final Element SUBTYPE_EDEFAULT = Element.PACKAGE;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected Element subtype = SUBTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrings() <em>Strings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrings()
	 * @generated
	 * @ordered
	 */
	protected static final ElementString STRINGS_EDEFAULT = ElementString.NAME;

	/**
	 * The cached value of the '{@link #getStrings() <em>Strings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrings()
	 * @generated
	 * @ordered
	 */
	protected ElementString strings = STRINGS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaRulePackage.Literals.STRING_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Variable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaRulePackage.STRING_VARIABLE__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.STRING_VARIABLE__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getSubtype() {
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtype(Element newSubtype) {
		Element oldSubtype = subtype;
		subtype = newSubtype == null ? SUBTYPE_EDEFAULT : newSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.STRING_VARIABLE__SUBTYPE, oldSubtype, subtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementString getStrings() {
		return strings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrings(ElementString newStrings) {
		ElementString oldStrings = strings;
		strings = newStrings == null ? STRINGS_EDEFAULT : newStrings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.STRING_VARIABLE__STRINGS, oldStrings, strings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaRulePackage.STRING_VARIABLE__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case JavaRulePackage.STRING_VARIABLE__SUBTYPE:
				return getSubtype();
			case JavaRulePackage.STRING_VARIABLE__STRINGS:
				return getStrings();
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
			case JavaRulePackage.STRING_VARIABLE__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case JavaRulePackage.STRING_VARIABLE__SUBTYPE:
				setSubtype((Element)newValue);
				return;
			case JavaRulePackage.STRING_VARIABLE__STRINGS:
				setStrings((ElementString)newValue);
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
			case JavaRulePackage.STRING_VARIABLE__VARIABLE:
				setVariable((Variable)null);
				return;
			case JavaRulePackage.STRING_VARIABLE__SUBTYPE:
				setSubtype(SUBTYPE_EDEFAULT);
				return;
			case JavaRulePackage.STRING_VARIABLE__STRINGS:
				setStrings(STRINGS_EDEFAULT);
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
			case JavaRulePackage.STRING_VARIABLE__VARIABLE:
				return variable != null;
			case JavaRulePackage.STRING_VARIABLE__SUBTYPE:
				return subtype != SUBTYPE_EDEFAULT;
			case JavaRulePackage.STRING_VARIABLE__STRINGS:
				return strings != STRINGS_EDEFAULT;
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
		result.append(" (subtype: ");
		result.append(subtype);
		result.append(", strings: ");
		result.append(strings);
		result.append(')');
		return result.toString();
	}

} //StringVariableImpl
