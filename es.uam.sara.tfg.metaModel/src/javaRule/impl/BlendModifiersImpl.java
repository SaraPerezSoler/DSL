/**
 */
package javaRule.impl;

import javaRule.AccessModifier;
import javaRule.BlendModifiers;
import javaRule.JavaRulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blend Modifiers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaRule.impl.BlendModifiersImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link javaRule.impl.BlendModifiersImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link javaRule.impl.BlendModifiersImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link javaRule.impl.BlendModifiersImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link javaRule.impl.BlendModifiersImpl#isDefault <em>Default</em>}</li>
 *   <li>{@link javaRule.impl.BlendModifiersImpl#isSynchronized <em>Synchronized</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlendModifiersImpl extends MinimalEObjectImpl.Container implements BlendModifiers {
	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final AccessModifier ACCESS_EDEFAULT = AccessModifier.NOTHING;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected AccessModifier access = ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean static_ = STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean final_ = FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean default_ = DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #isSynchronized() <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNCHRONIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSynchronized() <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronized()
	 * @generated
	 * @ordered
	 */
	protected boolean synchronized_ = SYNCHRONIZED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlendModifiersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaRulePackage.Literals.BLEND_MODIFIERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessModifier getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(AccessModifier newAccess) {
		AccessModifier oldAccess = access;
		access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.BLEND_MODIFIERS__ACCESS, oldAccess, access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(boolean newStatic) {
		boolean oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.BLEND_MODIFIERS__STATIC, oldStatic, static_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		boolean oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.BLEND_MODIFIERS__FINAL, oldFinal, final_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.BLEND_MODIFIERS__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(boolean newDefault) {
		boolean oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.BLEND_MODIFIERS__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSynchronized() {
		return synchronized_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronized(boolean newSynchronized) {
		boolean oldSynchronized = synchronized_;
		synchronized_ = newSynchronized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRulePackage.BLEND_MODIFIERS__SYNCHRONIZED, oldSynchronized, synchronized_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaRulePackage.BLEND_MODIFIERS__ACCESS:
				return getAccess();
			case JavaRulePackage.BLEND_MODIFIERS__STATIC:
				return isStatic();
			case JavaRulePackage.BLEND_MODIFIERS__FINAL:
				return isFinal();
			case JavaRulePackage.BLEND_MODIFIERS__ABSTRACT:
				return isAbstract();
			case JavaRulePackage.BLEND_MODIFIERS__DEFAULT:
				return isDefault();
			case JavaRulePackage.BLEND_MODIFIERS__SYNCHRONIZED:
				return isSynchronized();
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
			case JavaRulePackage.BLEND_MODIFIERS__ACCESS:
				setAccess((AccessModifier)newValue);
				return;
			case JavaRulePackage.BLEND_MODIFIERS__STATIC:
				setStatic((Boolean)newValue);
				return;
			case JavaRulePackage.BLEND_MODIFIERS__FINAL:
				setFinal((Boolean)newValue);
				return;
			case JavaRulePackage.BLEND_MODIFIERS__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case JavaRulePackage.BLEND_MODIFIERS__DEFAULT:
				setDefault((Boolean)newValue);
				return;
			case JavaRulePackage.BLEND_MODIFIERS__SYNCHRONIZED:
				setSynchronized((Boolean)newValue);
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
			case JavaRulePackage.BLEND_MODIFIERS__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case JavaRulePackage.BLEND_MODIFIERS__STATIC:
				setStatic(STATIC_EDEFAULT);
				return;
			case JavaRulePackage.BLEND_MODIFIERS__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case JavaRulePackage.BLEND_MODIFIERS__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case JavaRulePackage.BLEND_MODIFIERS__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case JavaRulePackage.BLEND_MODIFIERS__SYNCHRONIZED:
				setSynchronized(SYNCHRONIZED_EDEFAULT);
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
			case JavaRulePackage.BLEND_MODIFIERS__ACCESS:
				return access != ACCESS_EDEFAULT;
			case JavaRulePackage.BLEND_MODIFIERS__STATIC:
				return static_ != STATIC_EDEFAULT;
			case JavaRulePackage.BLEND_MODIFIERS__FINAL:
				return final_ != FINAL_EDEFAULT;
			case JavaRulePackage.BLEND_MODIFIERS__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case JavaRulePackage.BLEND_MODIFIERS__DEFAULT:
				return default_ != DEFAULT_EDEFAULT;
			case JavaRulePackage.BLEND_MODIFIERS__SYNCHRONIZED:
				return synchronized_ != SYNCHRONIZED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}



	@Override
	public String toString() {
		String and="";
		String cad="";
		if(this.getAccess()!=ACCESS_EDEFAULT){
			cad+=this.getAccess();
			and=" and ";
		}
		if (static_){
			cad+=and+"static";
			and=" and ";
		}
		if (final_){
			cad+=and+"final";
			and=" and ";
		}
		if (abstract_){
			cad+=and+"abstract";
			and=" and ";
		}
		if (default_){
			cad+=and+"default";
			and=" and ";
		}
		if (synchronized_){
			cad+=and+"synchronized";
		}
		return cad;
	}
} //BlendModifiersImpl
