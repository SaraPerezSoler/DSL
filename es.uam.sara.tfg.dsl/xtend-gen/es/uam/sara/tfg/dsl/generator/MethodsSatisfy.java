package es.uam.sara.tfg.dsl.generator;

import com.google.common.base.Objects;
import javaRule.AccessModifier;
import javaRule.BlendModifiers;
import javaRule.Constructor;
import javaRule.JavaDoc;
import javaRule.Language;
import javaRule.Modifiers;
import javaRule.Name;
import javaRule.NameOperator;
import javaRule.NameType;
import javaRule.NoEmpty;
import javaRule.Parameter;
import javaRule.Return;
import javaRule.Satisfy;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class MethodsSatisfy {
  public CharSequence getPropertieMethod(final Satisfy s, final String cad, final int i) {
    String cadena = "";
    String start = ((("and" + cad) + Integer.valueOf(i)) + ".addPropertie (new ");
    String end = "));\n";
    if ((s instanceof Name)) {
      Name n = ((Name) s);
      NameType _type = n.getType();
      boolean _notEquals = (!Objects.equal(_type, NameType.NOTHING));
      if (_notEquals) {
        String _cadena = cadena;
        NameType _type_1 = n.getType();
        String _plus = ((start + "MethNameType(elements, NameCheck.Type.") + _type_1);
        String _plus_1 = (_plus + end);
        cadena = (_cadena + _plus_1);
      }
      NameOperator _operator = n.getOperator();
      boolean _notEquals_1 = (!Objects.equal(_operator, NameOperator.NOTHING));
      if (_notEquals_1) {
        String _cadena_1 = cadena;
        NameOperator _operator_1 = n.getOperator();
        String _plus_2 = ((start + "MethNameOperation(elements,NameCheck.Operation.") + _operator_1);
        String _plus_3 = (_plus_2 + 
          ",\"");
        String _name = ((Name)s).getName();
        String _plus_4 = (_plus_3 + _name);
        String _plus_5 = (_plus_4 + "\", NameCheck.");
        Language _language = ((Name)s).getLanguage();
        String _plus_6 = (_plus_5 + _language);
        String _plus_7 = (_plus_6 + end);
        cadena = (_cadena_1 + _plus_7);
      }
    } else {
      if ((s instanceof JavaDoc)) {
        JavaDoc jd = ((JavaDoc) s);
        String _cadena_2 = cadena;
        boolean _isAuthor = jd.isAuthor();
        String _plus_8 = ((start + "MethJavaDoc (elements,") + Boolean.valueOf(_isAuthor));
        String _plus_9 = (_plus_8 + ",");
        boolean _isParameter = jd.isParameter();
        String _plus_10 = (_plus_9 + Boolean.valueOf(_isParameter));
        String _plus_11 = (_plus_10 + ",");
        boolean _isReturn = jd.isReturn();
        String _plus_12 = (_plus_11 + Boolean.valueOf(_isReturn));
        String _plus_13 = (_plus_12 + ",");
        boolean _isVersion = jd.isVersion();
        String _plus_14 = (_plus_13 + Boolean.valueOf(_isVersion));
        String _plus_15 = (_plus_14 + ",");
        boolean _isThrows = jd.isThrows();
        String _plus_16 = (_plus_15 + Boolean.valueOf(_isThrows));
        String _plus_17 = (_plus_16 + ",");
        boolean _isSee = jd.isSee();
        String _plus_18 = (_plus_17 + Boolean.valueOf(_isSee));
        String _plus_19 = (_plus_18 + end);
        cadena = (_cadena_2 + _plus_19);
      } else {
        if ((s instanceof Modifiers)) {
          Modifiers m = ((Modifiers) s);
          String _cadena_3 = cadena;
          cadena = (_cadena_3 + "ModifiersCheck mc=new ModifiersCheck();\n");
          EList<BlendModifiers> _blend = m.getBlend();
          for (final BlendModifiers b : _blend) {
            String _cadena_4 = cadena;
            AccessModifier _access = b.getAccess();
            String _plus_20 = ("mc.addBlend(\"" + _access);
            String _plus_21 = (_plus_20 + "\",");
            boolean _isStatic = b.isStatic();
            String _plus_22 = (_plus_21 + Boolean.valueOf(_isStatic));
            String _plus_23 = (_plus_22 + ",");
            boolean _isFinal = b.isFinal();
            String _plus_24 = (_plus_23 + Boolean.valueOf(_isFinal));
            String _plus_25 = (_plus_24 + ",");
            boolean _isAbstract = b.isAbstract();
            String _plus_26 = (_plus_25 + Boolean.valueOf(_isAbstract));
            String _plus_27 = (_plus_26 + ",");
            boolean _isSynchronized = b.isSynchronized();
            String _plus_28 = (_plus_27 + Boolean.valueOf(_isSynchronized));
            String _plus_29 = (_plus_28 + ");\n");
            cadena = (_cadena_4 + _plus_29);
          }
          String _cadena_5 = cadena;
          cadena = (_cadena_5 + ((start + "MethModifiers (elements, mc") + end));
        } else {
          if ((s instanceof NoEmpty)) {
            String _cadena_6 = cadena;
            cadena = (_cadena_6 + ((start + "MethoNoEmty (elements") + end));
          } else {
            if ((s instanceof Constructor)) {
              String _cadena_7 = cadena;
              cadena = (_cadena_7 + ((start + "Constructor (elements") + end));
            } else {
              if ((s instanceof Parameter)) {
                Parameter p = ((Parameter) s);
                EList<String> _typesParam = p.getTypesParam();
                boolean _isEmpty = _typesParam.isEmpty();
                if (_isEmpty) {
                  String _cadena_8 = cadena;
                  int _numParam = p.getNumParam();
                  String _plus_30 = ((start + "Parameters (elements,") + Integer.valueOf(_numParam));
                  String _plus_31 = (_plus_30 + end);
                  cadena = (_cadena_8 + _plus_31);
                } else {
                  String _cadena_9 = cadena;
                  cadena = (_cadena_9 + "List<String> param= new ArrayList<String>();\n");
                  EList<String> _typesParam_1 = p.getTypesParam();
                  for (final String tp : _typesParam_1) {
                    String _cadena_10 = cadena;
                    cadena = (_cadena_10 + (("param.add(\"" + tp) + "\");\n"));
                  }
                  String _cadena_11 = cadena;
                  cadena = (_cadena_11 + ((start + "Parameters (elements, param") + end));
                }
              } else {
                if ((s instanceof Return)) {
                  Return r = ((Return) s);
                  String _cadena_12 = cadena;
                  String _returnType = r.getReturnType();
                  String _plus_32 = ((start + "Return (elements,\"") + _returnType);
                  String _plus_33 = (_plus_32 + "\"");
                  String _plus_34 = (_plus_33 + end);
                  cadena = (_cadena_12 + _plus_34);
                }
              }
            }
          }
        }
      }
    }
    return cadena;
  }
}
