/**
 */
package javaRule.impl;

import javaRule.Constructor;
import javaRule.JavaRulePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConstructorImpl extends MethodImpl implements Constructor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaRulePackage.Literals.CONSTRUCTOR;
	}
	
	public String toString(){
		if (no){
			return "is not constructor";
		}else{
			return "is constructor";
		}
	}

} //ConstructorImpl
