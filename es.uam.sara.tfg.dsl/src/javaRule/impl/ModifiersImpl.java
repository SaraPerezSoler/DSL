/**
 */
package javaRule.impl;

import java.util.Collection;

import javaRule.BlendModifiers;
import javaRule.JavaRulePackage;
import javaRule.Modifiers;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifiers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaRule.impl.ModifiersImpl#getBlend <em>Blend</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifiersImpl extends AttributeImpl implements Modifiers {
	/**
	 * The cached value of the '{@link #getBlend() <em>Blend</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlend()
	 * @generated
	 * @ordered
	 */
	protected EList<BlendModifiers> blend;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifiersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaRulePackage.Literals.MODIFIERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BlendModifiers> getBlend() {
		if (blend == null) {
			blend = new EObjectContainmentEList<BlendModifiers>(BlendModifiers.class, this, JavaRulePackage.MODIFIERS__BLEND);
		}
		return blend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaRulePackage.MODIFIERS__BLEND:
				return ((InternalEList<?>)getBlend()).basicRemove(otherEnd, msgs);
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
			case JavaRulePackage.MODIFIERS__BLEND:
				return getBlend();
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
			case JavaRulePackage.MODIFIERS__BLEND:
				getBlend().clear();
				getBlend().addAll((Collection<? extends BlendModifiers>)newValue);
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
			case JavaRulePackage.MODIFIERS__BLEND:
				getBlend().clear();
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
			case JavaRulePackage.MODIFIERS__BLEND:
				return blend != null && !blend.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModifiersImpl
