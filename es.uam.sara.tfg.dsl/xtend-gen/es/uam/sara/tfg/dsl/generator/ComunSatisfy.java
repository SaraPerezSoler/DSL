package es.uam.sara.tfg.dsl.generator;

import javaRule.AccessModifier;
import javaRule.BlendModifiers;
import javaRule.Contains;
import javaRule.Empty;
import javaRule.IsGeneric;
import javaRule.JavaDoc;
import javaRule.Language;
import javaRule.Modifiers;
import javaRule.NameCheck;
import javaRule.NameOperation;
import javaRule.NameOperator;
import javaRule.NameType;
import javaRule.StringProperty;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class ComunSatisfy {
  public static CharSequence nameOperation(final NameOperation n, final String type, final String sufix, final String property) {
    NameOperator _operator = n.getOperator();
    String _plus = (((((property + sufix) + "= new NameOperation<") + type) + ">(NameCheck.Operation.") + _operator);
    String _plus_1 = (_plus + ",\"");
    StringProperty _name = n.getName();
    String _plus_2 = (_plus_1 + _name);
    String _plus_3 = (_plus_2 + "\", NameCheck.");
    Language _language = n.getLanguage();
    String _plus_4 = (_plus_3 + _language);
    return (_plus_4 + ");");
  }
  
  public static CharSequence nameType(final NameType n, final String prefix, final String sufix, final String property) {
    NameCheck _type = n.getType();
    String _plus = (((((property + sufix) + "= new ") + prefix) + "NameType(NameCheck.Type.") + _type);
    return (_plus + ");");
  }
  
  public static CharSequence javaDoc(final JavaDoc jd, final String type, final String sufix, final String property) {
    boolean _isNo = jd.isNo();
    String _plus = (((((property + sufix) + "= new JavaDoc <") + type) + "> (") + Boolean.valueOf(_isNo));
    boolean _isAuthor = jd.isAuthor();
    String _plus_1 = (_plus + Boolean.valueOf(_isAuthor));
    String _plus_2 = (_plus_1 + ",");
    boolean _isParameter = jd.isParameter();
    String _plus_3 = (_plus_2 + Boolean.valueOf(_isParameter));
    String _plus_4 = (_plus_3 + ",");
    boolean _isReturn = jd.isReturn();
    String _plus_5 = (_plus_4 + Boolean.valueOf(_isReturn));
    String _plus_6 = (_plus_5 + 
      ",");
    boolean _isVersion = jd.isVersion();
    String _plus_7 = (_plus_6 + Boolean.valueOf(_isVersion));
    String _plus_8 = (_plus_7 + ",");
    boolean _isThrows = jd.isThrows();
    String _plus_9 = (_plus_8 + Boolean.valueOf(_isThrows));
    String _plus_10 = (_plus_9 + ",");
    boolean _isSee = jd.isSee();
    String _plus_11 = (_plus_10 + Boolean.valueOf(_isSee));
    return (_plus_11 + ");");
  }
  
  public static CharSequence modifiers(final Modifiers m, final String type, final String sufix, final String property) {
    boolean _isNo = m.isNo();
    String _plus = (((((property + sufix) + "= new Modifiers<") + type) + "> (") + Boolean.valueOf(_isNo));
    String cadena = (_plus + ")\n");
    EList<BlendModifiers> _blend = m.getBlend();
    for (final BlendModifiers b : _blend) {
      String _cadena = cadena;
      AccessModifier _access = b.getAccess();
      String _plus_1 = (".addBlend(\"" + _access);
      String _plus_2 = (_plus_1 + "\",");
      boolean _isStatic = b.isStatic();
      String _plus_3 = (_plus_2 + Boolean.valueOf(_isStatic));
      String _plus_4 = (_plus_3 + ",");
      boolean _isFinal = b.isFinal();
      String _plus_5 = (_plus_4 + Boolean.valueOf(_isFinal));
      String _plus_6 = (_plus_5 + ",");
      boolean _isAbstract = b.isAbstract();
      String _plus_7 = (_plus_6 + Boolean.valueOf(_isAbstract));
      String _plus_8 = (_plus_7 + ",");
      boolean _isSynchronized = b.isSynchronized();
      String _plus_9 = (_plus_8 + Boolean.valueOf(_isSynchronized));
      String _plus_10 = (_plus_9 + ")\n");
      cadena = (_cadena + _plus_10);
    }
    String _cadena_1 = cadena;
    cadena = (_cadena_1 + ";\n");
    return cadena;
  }
  
  public static CharSequence empty(final Empty ne, final String type, final String sufix, final String property) {
    boolean _isNo = ne.isNo();
    String _plus = (((((property + sufix) + "= new Empty<") + type) + "> (") + Boolean.valueOf(_isNo));
    return (_plus + ");");
  }
  
  public static CharSequence contains(final Contains c, final String prefix, final String sufix, final String property) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getAnalize(Object) is undefined for the type Class<JRulesGenerator>"
      + "\nThe method or field which is undefined for the type Contains"
      + "\nelement cannot be resolved"
      + "\ntoFirstUpper cannot be resolved");
  }
  
  public static CharSequence isGeneric(final IsGeneric g, final String prefix, final String sufix, final String property) {
    return ((((property + sufix) + "= new ") + prefix) + "IsGeneric();\n");
  }
}
