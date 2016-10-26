/**
 * generated by Xtext 2.10.0
 */
package es.uam.sara.tfg.dsl.validation;

import com.google.common.base.Objects;
import es.uam.sara.tfg.dsl.validation.AbstractJRulesValidator;
import javaRule.AccessModifier;
import javaRule.And;
import javaRule.Attribute;
import javaRule.BlendModifiers;
import javaRule.Contains;
import javaRule.ElementJava;
import javaRule.Enumeration;
import javaRule.Filter;
import javaRule.Implements;
import javaRule.Interface;
import javaRule.JavaDoc;
import javaRule.JavaRulePackage;
import javaRule.Language;
import javaRule.Method;
import javaRule.NameOperation;
import javaRule.NameOperator;
import javaRule.Or;
import javaRule.Parameter;
import javaRule.Rule;
import javaRule.RuleSet;
import javaRule.Satisfy;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class JRulesValidator extends AbstractJRulesValidator {
  public final static String INVALID_SATISFY = "invalidSatisfy";
  
  @Check
  public void checkSatisfyExists(final Rule r) {
    if (((r.eContainer() instanceof RuleSet) && Objects.equal(r.getSatisfy(), null))) {
      this.error("\"Satisfy\" is required", 
        JavaRulePackage.Literals.RULE__QUANTIFIER, "invalidRule");
    }
    if ((Objects.equal(r.getSatisfy(), null) && (!Objects.equal(r.getFilter(), null)))) {
      this.error("\"Satisfy\" is required after clause \"which\"", 
        JavaRulePackage.Literals.RULE__FILTER, "invalidRule");
    }
  }
  
  @Check
  public void checkFilterValido(final Rule r) {
    Filter _filter = r.getFilter();
    Or _filter_1 = _filter.getFilter();
    ElementJava _element = r.getElement();
    boolean _comprobarPropiedades = this.comprobarPropiedades(_filter_1, _element);
    boolean _equals = (_comprobarPropiedades == false);
    if (_equals) {
      ElementJava _element_1 = r.getElement();
      String _literal = _element_1.getLiteral();
      String _lowerCase = _literal.toLowerCase();
      String _plus = ("The filter is not valid for " + _lowerCase);
      this.error(_plus, 
        JavaRulePackage.Literals.RULE__ELEMENT, JRulesValidator.INVALID_SATISFY);
    }
  }
  
  @Check
  public void checkSatisfyType(final Rule r) {
    Or _satisfy = r.getSatisfy();
    ElementJava _element = r.getElement();
    boolean _comprobarPropiedades = this.comprobarPropiedades(_satisfy, _element);
    boolean _equals = (_comprobarPropiedades == false);
    if (_equals) {
      ElementJava _element_1 = r.getElement();
      String _literal = _element_1.getLiteral();
      String _lowerCase = _literal.toLowerCase();
      String _plus = ("The property is not valid for " + _lowerCase);
      this.error(_plus, 
        JavaRulePackage.Literals.RULE__ELEMENT, 
        JRulesValidator.INVALID_SATISFY);
    }
  }
  
  public boolean comprobarPropiedades(final Or or, final ElementJava e) {
    EList<And> _op = or.getOp();
    for (final And a : _op) {
      EList<Satisfy> _op_1 = a.getOp();
      for (final Satisfy s : _op_1) {
        boolean _comprobarSatisfy = this.comprobarSatisfy(e, s);
        boolean _equals = (_comprobarSatisfy == false);
        if (_equals) {
          return false;
        }
      }
    }
    return true;
  }
  
  public boolean comprobarSatisfy(final ElementJava e, final Satisfy s) {
    if ((Objects.equal(e, ElementJava.PACKAGE) && (s instanceof javaRule.Package))) {
      return true;
    } else {
      if ((Objects.equal(e, ElementJava.INTERFACE) && (s instanceof Interface))) {
        return true;
      } else {
        if ((Objects.equal(e, ElementJava.CLASS) && (s instanceof javaRule.Class))) {
          return true;
        } else {
          if ((Objects.equal(e, ElementJava.ENUM) && (s instanceof Enumeration))) {
            return true;
          } else {
            if ((Objects.equal(e, ElementJava.METHOD) && (s instanceof Method))) {
              return true;
            } else {
              if ((Objects.equal(e, ElementJava.ATTRIBUTE) && (s instanceof Attribute))) {
                return true;
              } else {
                return false;
              }
            }
          }
        }
      }
    }
  }
  
  @Check
  public void checkNameLanguage(final NameOperation n) {
    if ((Objects.equal(n.getOperator(), NameOperator.LIKE) && Objects.equal(n.getLanguage(), Language.EMPTY))) {
      this.error(
        "Language must be define for Like operator", 
        JavaRulePackage.Literals.NAME_OPERATION__OPERATOR, 
        "invalidLanguage");
    }
    if (((!Objects.equal(n.getOperator(), NameOperator.LIKE)) && (!Objects.equal(n.getLanguage(), Language.EMPTY)))) {
      this.error(
        "Language is only for Like operator", 
        JavaRulePackage.Literals.NAME_OPERATION__LANGUAGE, 
        "invalidLanguage");
    }
  }
  
  @Check
  public void checkJavaDoc(final JavaDoc jd) {
    Rule rule = this.getRule(jd);
    if (((!Objects.equal(rule.getElement(), ElementJava.METHOD)) && jd.isParameter())) {
      this.warning("The tag @parameter is used for methods", JavaRulePackage.Literals.JAVA_DOC__PARAMETER, 
        "inadvisableJavaDoc");
    }
    if (((!Objects.equal(rule.getElement(), ElementJava.METHOD)) && jd.isReturn())) {
      this.warning("The tag @return is used for methods", JavaRulePackage.Literals.JAVA_DOC__RETURN, 
        "inadvisableJavaDoc");
    }
    if (((!Objects.equal(rule.getElement(), ElementJava.METHOD)) && jd.isThrows())) {
      this.warning("The tag @throws is used for methods", JavaRulePackage.Literals.JAVA_DOC__THROWS, 
        "inadvisableJavaDoc");
    }
  }
  
  public Rule getRule(final JavaDoc jd) {
    EObject _eContainer = jd.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    EObject aux1 = _eContainer_1.eContainer();
    EObject _eContainer_2 = jd.eContainer();
    EObject _eContainer_3 = _eContainer_2.eContainer();
    EObject _eContainer_4 = _eContainer_3.eContainer();
    EObject aux2 = _eContainer_4.eContainer();
    if ((aux1 instanceof Rule)) {
      Rule rule = ((Rule) aux1);
      return rule;
    } else {
      if ((aux2 instanceof Rule)) {
        Rule rule_1 = ((Rule) aux2);
        return rule_1;
      }
    }
    return null;
  }
  
  public Rule getRule(final BlendModifiers b) {
    EObject _eContainer = b.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    EObject _eContainer_2 = _eContainer_1.eContainer();
    EObject aux1 = _eContainer_2.eContainer();
    EObject _eContainer_3 = b.eContainer();
    EObject _eContainer_4 = _eContainer_3.eContainer();
    EObject _eContainer_5 = _eContainer_4.eContainer();
    EObject _eContainer_6 = _eContainer_5.eContainer();
    EObject aux2 = _eContainer_6.eContainer();
    if ((aux1 instanceof Rule)) {
      Rule rule = ((Rule) aux1);
      return rule;
    } else {
      if ((aux2 instanceof Rule)) {
        Rule rule_1 = ((Rule) aux2);
        return rule_1;
      }
    }
    return null;
  }
  
  @Check
  public void checkModifiers(final BlendModifiers b) {
    Rule r = this.getRule(b);
    boolean _accessPrivateProtecte = this.accessPrivateProtecte(b);
    if (_accessPrivateProtecte) {
      if (((Objects.equal(r.getElement(), ElementJava.CLASS) || Objects.equal(r.getElement(), ElementJava.INTERFACE)) || Objects.equal(r.getElement(), ElementJava.ENUM))) {
        this.warning("The private and protected modifiers are for classes, interfaces and enumeration internal", 
          JavaRulePackage.Literals.BLEND_MODIFIERS__ACCESS, "inadvisableModifier");
      }
    }
    boolean _isAbstract = b.isAbstract();
    if (_isAbstract) {
      ElementJava _element = r.getElement();
      boolean _equals = Objects.equal(_element, ElementJava.INTERFACE);
      if (_equals) {
        this.warning("The interfaces are implicitly abstract, its not necessary add the modifier", 
          JavaRulePackage.Literals.BLEND_MODIFIERS__ABSTRACT, "inadvisableModifier");
      } else {
        if (((!Objects.equal(r.getElement(), ElementJava.CLASS)) && (!Objects.equal(r.getElement(), ElementJava.METHOD)))) {
          this.error("Abstract is for methods and class", 
            JavaRulePackage.Literals.BLEND_MODIFIERS__ABSTRACT, "invalidModifier");
        } else {
          boolean _isFinal = b.isFinal();
          if (_isFinal) {
            this.error("Methods and Class can\'t be abstract and final simultaneously", 
              JavaRulePackage.Literals.BLEND_MODIFIERS__ABSTRACT, "invalidModifier");
          }
        }
      }
    }
    boolean _isFinal_1 = b.isFinal();
    if (_isFinal_1) {
      if ((Objects.equal(r.getElement(), ElementJava.INTERFACE) || Objects.equal(r.getElement(), ElementJava.ENUM))) {
        this.error("Final is for methods, class and attributes", 
          JavaRulePackage.Literals.BLEND_MODIFIERS__FINAL, "invalidModifier");
      }
    }
    boolean _isStatic = b.isStatic();
    if (_isStatic) {
      if (((Objects.equal(r.getElement(), ElementJava.CLASS) || Objects.equal(r.getElement(), ElementJava.INTERFACE)) || Objects.equal(r.getElement(), ElementJava.ENUM))) {
        this.warning("Static is for classes, interfaces and enumeration internal", 
          JavaRulePackage.Literals.BLEND_MODIFIERS__ACCESS, "inadvisableModifier");
      }
    }
    if ((b.isSynchronized() && (!Objects.equal(r.getElement(), ElementJava.METHOD)))) {
      this.error("Synchronized is for methods", 
        JavaRulePackage.Literals.BLEND_MODIFIERS__SYNCHRONIZED, "invalidModifier");
    }
  }
  
  public boolean accessPrivateProtecte(final BlendModifiers b) {
    if ((Objects.equal(b.getAccess(), AccessModifier.PRIVATE) || Objects.equal(b.getAccess(), AccessModifier.PROTECTED))) {
      return true;
    }
    return false;
  }
  
  @Check
  public void checkContains(final Contains c) {
    Rule r = this.getRule(c);
    ElementJava _element = r.getElement();
    boolean _equals = Objects.equal(_element, ElementJava.PACKAGE);
    if (_equals) {
      if (((Objects.equal(c.getWhich().getElement(), ElementJava.METHOD) || Objects.equal(c.getWhich().getElement(), ElementJava.ATTRIBUTE)) || Objects.equal(c.getWhich().getElement(), ElementJava.PACKAGE))) {
        this.error("Package contains Class, Interfaces or Enumerations", 
          JavaRulePackage.Literals.CONTAINS__WHICH, "invalidContains");
      }
    }
  }
  
  public Rule getRule(final Contains c) {
    EObject _eContainer = c.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    EObject aux1 = _eContainer_1.eContainer();
    EObject _eContainer_2 = c.eContainer();
    EObject _eContainer_3 = _eContainer_2.eContainer();
    EObject _eContainer_4 = _eContainer_3.eContainer();
    EObject aux2 = _eContainer_4.eContainer();
    if ((aux1 instanceof Rule)) {
      Rule rule = ((Rule) aux1);
      return rule;
    } else {
      if ((aux2 instanceof Rule)) {
        Rule rule_1 = ((Rule) aux2);
        return rule_1;
      }
    }
    return null;
  }
  
  @Check
  public void checkImplements(final Implements i) {
    int _minInterface = i.getMinInterface();
    boolean _lessThan = (_minInterface < 0);
    if (_lessThan) {
      this.error("The minimum of interfaces must be greater than 0", 
        JavaRulePackage.Literals.IMPLEMENTS__MIN_INTERFACE, "invalidMin");
    }
    int _maxInterface = i.getMaxInterface();
    boolean _lessThan_1 = (_maxInterface < 0);
    if (_lessThan_1) {
      this.error("The maximum of interfaces must be greater than 0", 
        JavaRulePackage.Literals.IMPLEMENTS__MAX_INTERFACE, "invalidMin");
    }
    int _minInterface_1 = i.getMinInterface();
    int _maxInterface_1 = i.getMaxInterface();
    boolean _greaterThan = (_minInterface_1 > _maxInterface_1);
    if (_greaterThan) {
      this.error("The minimum of interfaces can\'t be greater than the maximum", 
        JavaRulePackage.Literals.IMPLEMENTS__MIN_INTERFACE, "invalidMin");
    }
  }
  
  @Check
  public void checkParameters(final Parameter p) {
    EList<String> _typesParam = p.getTypesParam();
    int _length = ((Object[])Conversions.unwrapArray(_typesParam, Object.class)).length;
    boolean _notEquals = (_length != 0);
    if (_notEquals) {
      EList<String> _typesParam_1 = p.getTypesParam();
      int _length_1 = ((Object[])Conversions.unwrapArray(_typesParam_1, Object.class)).length;
      int _numParam = p.getNumParam();
      boolean _notEquals_1 = (_length_1 != _numParam);
      if (_notEquals_1) {
        this.error("The number of parameters should be equal to the number of types", 
          JavaRulePackage.Literals.PARAMETER__NUM_PARAM, "invalidMin");
      }
    }
  }
}
