/**
 */
package javaRule.impl;

import java.math.BigInteger;

import java.util.Collection;

import javaRule.JavaRulePackage;
import javaRule.Parameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaRule.impl.ParameterImpl#getNumParam <em>Num Param</em>}</li>
 *   <li>{@link javaRule.impl.ParameterImpl#getTypesParam <em>Types Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends MethodImpl implements Parameter {
	/**
	 * The default value of the '{@link #getNumParam() <em>Num Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumParam()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUM_PARAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumParam() <em>Num Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumParam()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numParam = NUM_PARAM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypesParam() <em>Types Param</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypesParam()
	 * @generated
	 * @ordered
	 */
	protected EList<String> typesParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaRulePackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumParam() {
		return numParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumParam(BigInteger newNumParam) {
		BigInteger oldNumParam = numParam;
		numParam = newNumParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.PARAMETER__NUM_PARAM, oldNumParam, numParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTypesParam() {
		if (typesParam == null) {
			typesParam = new EDataTypeUniqueEList<String>(String.class, this, JavaRulePackage.PARAMETER__TYPES_PARAM);
		}
		return typesParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaRulePackage.PARAMETER__NUM_PARAM:
				return getNumParam();
			case JavaRulePackage.PARAMETER__TYPES_PARAM:
				return getTypesParam();
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
			case JavaRulePackage.PARAMETER__NUM_PARAM:
				setNumParam((BigInteger)newValue);
				return;
			case JavaRulePackage.PARAMETER__TYPES_PARAM:
				getTypesParam().clear();
				getTypesParam().addAll((Collection<? extends String>)newValue);
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
			case JavaRulePackage.PARAMETER__NUM_PARAM:
				setNumParam(NUM_PARAM_EDEFAULT);
				return;
			case JavaRulePackage.PARAMETER__TYPES_PARAM:
				getTypesParam().clear();
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
			case JavaRulePackage.PARAMETER__NUM_PARAM:
				return NUM_PARAM_EDEFAULT == null ? numParam != null : !NUM_PARAM_EDEFAULT.equals(numParam);
			case JavaRulePackage.PARAMETER__TYPES_PARAM:
				return typesParam != null && !typesParam.isEmpty();
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
		result.append(" (numParam: ");
		result.append(numParam);
		result.append(", typesParam: ");
		result.append(typesParam);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
