/**
 */
package javaRule.impl;

import java.util.Collection;

import javaRule.JavaRulePackage;
import javaRule.RuleSet;
import javaRule.Sentence;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaRule.impl.RuleSetImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link javaRule.impl.RuleSetImpl#getSentences <em>Sentences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleSetImpl extends MinimalEObjectImpl.Container implements RuleSet {
	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> projectName;

	/**
	 * The cached value of the '{@link #getSentences() <em>Sentences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentences()
	 * @generated
	 * @ordered
	 */
	protected EList<Sentence> sentences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaRulePackage.Literals.RULE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getProjectName() {
		if (projectName == null) {
			projectName = new EDataTypeUniqueEList<String>(String.class, this, JavaRulePackage.RULE_SET__PROJECT_NAME);
		}
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sentence> getSentences() {
		if (sentences == null) {
			sentences = new EObjectContainmentEList<Sentence>(Sentence.class, this, JavaRulePackage.RULE_SET__SENTENCES);
		}
		return sentences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaRulePackage.RULE_SET__SENTENCES:
				return ((InternalEList<?>)getSentences()).basicRemove(otherEnd, msgs);
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
			case JavaRulePackage.RULE_SET__PROJECT_NAME:
				return getProjectName();
			case JavaRulePackage.RULE_SET__SENTENCES:
				return getSentences();
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
			case JavaRulePackage.RULE_SET__PROJECT_NAME:
				getProjectName().clear();
				getProjectName().addAll((Collection<? extends String>)newValue);
				return;
			case JavaRulePackage.RULE_SET__SENTENCES:
				getSentences().clear();
				getSentences().addAll((Collection<? extends Sentence>)newValue);
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
			case JavaRulePackage.RULE_SET__PROJECT_NAME:
				getProjectName().clear();
				return;
			case JavaRulePackage.RULE_SET__SENTENCES:
				getSentences().clear();
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
			case JavaRulePackage.RULE_SET__PROJECT_NAME:
				return projectName != null && !projectName.isEmpty();
			case JavaRulePackage.RULE_SET__SENTENCES:
				return sentences != null && !sentences.isEmpty();
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
		result.append(" (ProjectName: ");
		result.append(projectName);
		result.append(')');
		return result.toString();
	}

} //RuleSetImpl
