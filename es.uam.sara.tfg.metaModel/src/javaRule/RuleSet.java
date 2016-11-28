/**
 */
package javaRule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.RuleSet#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link javaRule.RuleSet#getSentences <em>Sentences</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getRuleSet()
 * @model
 * @generated
 */
public interface RuleSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute list.
	 * @see javaRule.JavaRulePackage#getRuleSet_ProjectName()
	 * @model
	 * @generated
	 */
	EList<String> getProjectName();

	/**
	 * Returns the value of the '<em><b>Sentences</b></em>' containment reference list.
	 * The list contents are of type {@link javaRule.Sentence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sentences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentences</em>' containment reference list.
	 * @see javaRule.JavaRulePackage#getRuleSet_Sentences()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sentence> getSentences();

} // RuleSet
