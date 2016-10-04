package es.uam.sara.tfg.dsl.generator;

import com.google.common.base.Objects;
import javaRule.AccessModifier;
import javaRule.BlendModifiers;
import javaRule.JavaDoc;
import javaRule.Language;
import javaRule.Modifiers;
import javaRule.Name;
import javaRule.NameOperator;
import javaRule.NameType;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class ComunProperties {
  private static int iMod = 1;
  
  public static CharSequence name(final Name n, final String prefix) {
    String cadena = "";
    NameType _type = n.getType();
    boolean _notEquals = (!Objects.equal(_type, NameType.NOTHING));
    if (_notEquals) {
      String _cadena = cadena;
      NameType _type_1 = n.getType();
      String _plus = ((prefix + "NameType(elements, NameCheck.Type.") + _type_1);
      String _plus_1 = (_plus + ")");
      cadena = (_cadena + _plus_1);
    }
    NameOperator _operator = n.getOperator();
    boolean _notEquals_1 = (!Objects.equal(_operator, NameOperator.NOTHING));
    if (_notEquals_1) {
      String _cadena_1 = cadena;
      NameOperator _operator_1 = n.getOperator();
      String _plus_2 = ((prefix + "NameOperation(elements,NameCheck.Operation.") + _operator_1);
      String _plus_3 = (_plus_2 + 
        ",\"");
      String _name = n.getName();
      String _plus_4 = (_plus_3 + _name);
      String _plus_5 = (_plus_4 + "\", NameCheck.");
      Language _language = n.getLanguage();
      String _plus_6 = (_plus_5 + _language);
      String _plus_7 = (_plus_6 + ")");
      cadena = (_cadena_1 + _plus_7);
    }
    return cadena;
  }
  
  public static CharSequence javaDoc(final JavaDoc jd, final String prefix) {
    boolean _isAuthor = jd.isAuthor();
    String _plus = ((prefix + "JavaDoc (elements,") + Boolean.valueOf(_isAuthor));
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
    String cadena = (_plus_10 + ")");
    return cadena;
  }
  
  public static CharSequence modifiers(final Modifiers m, final String prefix) {
    String cadena = (("ModifiersCheck mc" + Integer.valueOf(ComunProperties.iMod)) + "=new ModifiersCheck();\n");
    EList<BlendModifiers> _blend = m.getBlend();
    for (final BlendModifiers b : _blend) {
      String _cadena = cadena;
      AccessModifier _access = b.getAccess();
      String _plus = ((("mc" + Integer.valueOf(ComunProperties.iMod)) + ".addBlend(\"") + _access);
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
    cadena = (_cadena_1 + (((prefix + "Modifiers (elements, mc") + Integer.valueOf(ComunProperties.iMod)) + ")"));
    ComunProperties.iMod++;
    return cadena;
  }
}
