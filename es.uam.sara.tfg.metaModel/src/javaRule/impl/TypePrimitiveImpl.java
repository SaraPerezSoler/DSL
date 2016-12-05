/**
 */
package javaRule.impl;

import javaRule.JavaRulePackage;
import javaRule.Primitive;
import javaRule.TypePrimitive;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Primitive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaRule.impl.TypePrimitiveImpl#getTypePrimitive <em>Type Primitive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypePrimitiveImpl extends TypePropertyImpl implements TypePrimitive {
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
	protected TypePrimitiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaRulePackage.Literals.TYPE_PRIMITIVE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.TYPE_PRIMITIVE__TYPE_PRIMITIVE, oldTypePrimitive, typePrimitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaRulePackage.TYPE_PRIMITIVE__TYPE_PRIMITIVE:
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
			case JavaRulePackage.TYPE_PRIMITIVE__TYPE_PRIMITIVE:
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
			case JavaRulePackage.TYPE_PRIMITIVE__TYPE_PRIMITIVE:
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
			case JavaRulePackage.TYPE_PRIMITIVE__TYPE_PRIMITIVE:
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

} //TypePrimitiveImpl
