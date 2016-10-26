package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.JRulesGenerator;
import javaRule.AccessModifier;
import javaRule.BlendModifiers;
import javaRule.Contains;
import javaRule.ElementJava;
import javaRule.JavaDoc;
import javaRule.Language;
import javaRule.Modifiers;
import javaRule.NameCheck;
import javaRule.NameOperation;
import javaRule.NameOperator;
import javaRule.NameType;
import javaRule.NoEmpty;
import javaRule.Rule;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ComunSatisfy {
  public static CharSequence nameOperation(final NameOperation n, final String prefix, final String sufix, final String property) {
    NameOperator _operator = n.getOperator();
    String _plus = (((((property + sufix) + "= new ") + prefix) + "NameOperation(NameCheck.Operation.") + _operator);
    String _plus_1 = (_plus + ",\"");
    String _name = n.getName();
    String _plus_2 = (_plus_1 + _name);
    String _plus_3 = (_plus_2 + 
      "\", NameCheck.");
    Language _language = n.getLanguage();
    String _plus_4 = (_plus_3 + _language);
    return (_plus_4 + ");");
  }
  
  public static CharSequence nameType(final NameType n, final String prefix, final String sufix, final String property) {
    NameCheck _type = n.getType();
    String _plus = (((((property + sufix) + "= new ") + prefix) + "NameType(NameCheck.Type.") + _type);
    return (_plus + ");");
  }
  
  public static CharSequence javaDoc(final JavaDoc jd, final String prefix, final String sufix, final String property) {
    boolean _isAuthor = jd.isAuthor();
    String _plus = (((((property + sufix) + "= new ") + prefix) + "JavaDoc (") + Boolean.valueOf(_isAuthor));
    String _plus_1 = (_plus + ",");
    boolean _isParameter = jd.isParameter();
    String _plus_2 = (_plus_1 + Boolean.valueOf(_isParameter));
    String _plus_3 = (_plus_2 + ",");
    boolean _isReturn = jd.isReturn();
    String _plus_4 = (_plus_3 + Boolean.valueOf(_isReturn));
    String _plus_5 = (_plus_4 + ",");
    boolean _isVersion = jd.isVersion();
    String _plus_6 = (_plus_5 + Boolean.valueOf(_isVersion));
    String _plus_7 = (_plus_6 + ",");
    boolean _isThrows = jd.isThrows();
    String _plus_8 = (_plus_7 + Boolean.valueOf(_isThrows));
    String _plus_9 = (_plus_8 + ",");
    boolean _isSee = jd.isSee();
    String _plus_10 = (_plus_9 + Boolean.valueOf(_isSee));
    return (_plus_10 + ");");
  }
  
  public static CharSequence modifiers(final Modifiers m, final String prefix, final String sufix, final String property) {
    String cadena = (("ModifiersCheck mc" + sufix) + "=new ModifiersCheck();\n");
    EList<BlendModifiers> _blend = m.getBlend();
    for (final BlendModifiers b : _blend) {
      String _cadena = cadena;
      AccessModifier _access = b.getAccess();
      String _plus = ((("mc" + sufix) + ".addBlend(\"") + _access);
      String _plus_1 = (_plus + "\",");
      boolean _isStatic = b.isStatic();
      String _plus_2 = (_plus_1 + Boolean.valueOf(_isStatic));
      String _plus_3 = (_plus_2 + ",");
      boolean _isFinal = b.isFinal();
      String _plus_4 = (_plus_3 + Boolean.valueOf(_isFinal));
      String _plus_5 = (_plus_4 + ",");
      boolean _isAbstract = b.isAbstract();
      String _plus_6 = (_plus_5 + Boolean.valueOf(_isAbstract));
      String _plus_7 = (_plus_6 + ",");
      boolean _isSynchronized = b.isSynchronized();
      String _plus_8 = (_plus_7 + Boolean.valueOf(_isSynchronized));
      String _plus_9 = (_plus_8 + ");\n");
      cadena = (_cadena + _plus_9);
    }
    String _cadena_1 = cadena;
    cadena = (_cadena_1 + ((((((property + sufix) + "= new ") + prefix) + "Modifiers (mc") + sufix) + ");"));
    return cadena;
  }
  
  public static CharSequence noEmpty(final NoEmpty ne, final String prefix, final String sufix, final String property) {
    return ((((property + sufix) + "= new ") + prefix) + "NoEmpty ();");
  }
  
  public static CharSequence contains(final Contains c, final String prefix, final String sufix, final String property) {
    Rule _which = c.getWhich();
    String cadena = JRulesGenerator.genetateRule(_which, sufix);
    String _cadena = cadena;
    Rule _which_1 = c.getWhich();
    ElementJava _element = _which_1.getElement();
    String _analize = JRulesGenerator.getAnalize(_element);
    String _firstUpper = StringExtensions.toFirstUpper(_analize);
    String _plus = (((((property + sufix) + "= new ") + prefix) + "Contain") + _firstUpper);
    String _plus_1 = (_plus + "(r");
    String _plus_2 = (_plus_1 + sufix);
    String _plus_3 = (_plus_2 + ");");
    cadena = (_cadena + _plus_3);
    return cadena;
  }
}
