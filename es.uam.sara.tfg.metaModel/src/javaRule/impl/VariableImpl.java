/**
 */
package javaRule.impl;

import javaRule.JavaRulePackage;
import javaRule.Variable;
import javaRule.VariableSubtype;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Variable</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class VariableImpl extends SentenceImpl implements Variable {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaRulePackage.Literals.VARIABLE;
	}

	public String toString() {
		String ins = "";
		if (this.in != null) {
			for (Variable i : this.in) {
				ins += i.getName();
			}
		}
		String usings = "";
		if (this.using != null) {
			for (VariableSubtype i : this.using) {
				usings += i.toString();
			}
		}
		String from="";
		if (this.from!=null){
			from=this.from.getName();
		}
		return this.name + ": " + this.element + " from " + from + " in " + ins + " usings " + usings
				+ " satisfy " + this.satisfy;
	}

} // VariableImpl
