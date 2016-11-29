/**
 */
package javaRule.impl;

import javaRule.JavaRulePackage;
import javaRule.Primitive;
import javaRule.StringProperty;
import javaRule.TypeString;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaRule.impl.TypeStringImpl#getTypeStrng <em>Type Strng</em>}</li>
 *   <li>{@link javaRule.impl.TypeStringImpl#getTypePrimitive <em>Type Primitive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeStringImpl extends TypePropertyImpl implements TypeString {
	/**
	 * The cached value of the '{@link #getTypeStrng() <em>Type Strng</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeStrng()
	 * @generated
	 * @ordered
	 */
	protected StringProperty typeStrng;

	/**
	 * The default value of the '{@link #getTypePrimitive() <em>Type Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePrimitive()
	 * @generated
	 * @ordered
	 */
	protected static final Primitive TYPE_PRIMITIVE_EDEFAULT = Primitive.BYTE;

	/**
	 * The cached value of the '{@link #getTypePrimitive() <em>Type Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePrimitive()
	 * @generated
	 * @ordered
	 */
	protected Primitive typePrimitive = TYPE_PRIMITIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeStringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaRulePackage.Literals.TYPE_STRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringProperty getTypeStrng() {
		return typeStrng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeStrng(StringProperty newTypeStrng, NotificationChain msgs) {
		StringProperty oldTypeStrng = typeStrng;
		typeStrng = newTypeStrng;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaRulePackage.TYPE_STRING__TYPE_STRNG, oldTypeStrng, newTypeStrng);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeStrng(StringProperty newTypeStrng) {
		if (newTypeStrng != typeStrng) {
			NotificationChain msgs = null;
			if (typeStrng != null)
				msgs = ((InternalEObject)typeStrng).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaRulePackage.TYPE_STRING__TYPE_STRNG, null, msgs);
			if (newTypeStrng != null)
				msgs = ((InternalEObject)newTypeStrng).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaRulePackage.TYPE_STRING__TYPE_STRNG, null, msgs);
			msgs = basicSetTypeStrng(newTypeStrng, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.TYPE_STRING__TYPE_STRNG, newTypeStrng, newTypeStrng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primitive getTypePrimitive() {
		return typePrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypePrimitive(Primitive newTypePrimitive) {
		Primitive oldTypePrimitive = typePrimitive;
		typePrimitive = newTypePrimitive == null ? TYPE_PRIMITIVE_EDEFAULT : newTypePrimitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.TYPE_STRING__TYPE_PRIMITIVE, oldTypePrimitive, typePrimitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaRulePackage.TYPE_STRING__TYPE_STRNG:
				return basicSetTypeStrng(null, msgs);
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
			case JavaRulePackage.TYPE_STRING__TYPE_STRNG:
				return getTypeStrng();
			case JavaRulePackage.TYPE_STRING__TYPE_PRIMITIVE:
				return getTypePrimitive();
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
			case JavaRulePackage.TYPE_STRING__TYPE_STRNG:
				setTypeStrng((StringProperty)newValue);
				return;
			case JavaRulePackage.TYPE_STRING__TYPE_PRIMITIVE:
				setTypePrimitive((Primitive)newValue);
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
			case JavaRulePackage.TYPE_STRING__TYPE_STRNG:
				setTypeStrng((StringProperty)null);
				return;
			case JavaRulePackage.TYPE_STRING__TYPE_PRIMITIVE:
				setTypePrimitive(TYPE_PRIMITIVE_EDEFAULT);
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
			case JavaRulePackage.TYPE_STRING__TYPE_STRNG:
				return typeStrng != null;
			case JavaRulePackage.TYPE_STRING__TYPE_PRIMITIVE:
				return typePrimitive != TYPE_PRIMITIVE_EDEFAULT;
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
		result.append(" (typePrimitive: ");
		result.append(typePrimitive);
		result.append(')');
		return result.toString();
	}

} //TypeStringImpl
