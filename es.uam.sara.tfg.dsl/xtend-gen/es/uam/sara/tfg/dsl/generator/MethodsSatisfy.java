package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.ComunSatisfy;
import javaRule.Constructor;
import javaRule.JavaDoc;
import javaRule.Method;
import javaRule.Modifiers;
import javaRule.Name;
import javaRule.NoEmpty;
import javaRule.Parameter;
import javaRule.Return;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class MethodsSatisfy {
  private final static String END = ");\n";
  
  private final static String PREFIX = "Meth";
  
  public static CharSequence getPropertie(final Method s, final String sufix) {
    String start = (("and" + sufix) + ".addPropertie (new ");
    if ((s instanceof Name)) {
      return ComunSatisfy.name(((Name) s), MethodsSatisfy.PREFIX, start, MethodsSatisfy.END);
    } else {
      if ((s instanceof JavaDoc)) {
        CharSequence _javaDoc = ComunSatisfy.javaDoc(((JavaDoc) s), MethodsSatisfy.PREFIX);
        String _plus = (start + _javaDoc);
        return (_plus + MethodsSatisfy.END);
      } else {
        if ((s instanceof Modifiers)) {
          return ComunSatisfy.modifiers(((Modifiers) s), MethodsSatisfy.PREFIX, start, MethodsSatisfy.END);
        } else {
          if ((s instanceof NoEmpty)) {
            CharSequence _noEmpty = ComunSatisfy.noEmpty(((NoEmpty) s), MethodsSatisfy.PREFIX);
            String _plus_1 = (start + _noEmpty);
            return (_plus_1 + MethodsSatisfy.END);
          } else {
            if ((s instanceof Constructor)) {
              return ((start + "Constructor (elements)") + MethodsSatisfy.END);
            } else {
              if ((s instanceof Parameter)) {
                Parameter p = ((Parameter) s);
                EList<String> _typesParam = p.getTypesParam();
                boolean _isEmpty = _typesParam.isEmpty();
                if (_isEmpty) {
                  int _numParam = p.getNumParam();
                  String _plus_2 = ((start + "Parameters (elements,") + Integer.valueOf(_numParam));
                  String _plus_3 = (_plus_2 + ")");
                  return (_plus_3 + MethodsSatisfy.END);
                } else {
                  String cadena = "List<String> param= new ArrayList<String>();\n";
                  EList<String> _typesParam_1 = p.getTypesParam();
                  for (final String tp : _typesParam_1) {
                    String _cadena = cadena;
                    cadena = (_cadena + (("param.add(\"" + tp) + "\");\n"));
                  }
                  String _cadena_1 = cadena;
                  cadena = (_cadena_1 + ((start + "Parameters (elements, param)") + MethodsSatisfy.END));
                  return cadena;
                }
              } else {
                if ((s instanceof Return)) {
                  Return r = ((Return) s);
                  String _returnType = r.getReturnType();
                  String _plus_4 = ((start + "Return (elements,\"") + _returnType);
                  String _plus_5 = (_plus_4 + "\")");
                  return (_plus_5 + MethodsSatisfy.END);
                }
              }
            }
          }
        }
      }
    }
    return null;
  }
}
