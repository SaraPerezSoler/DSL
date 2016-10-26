package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.ComunSatisfy;
import javaRule.Constructor;
import javaRule.JavaDoc;
import javaRule.Method;
import javaRule.Modifiers;
import javaRule.NameOperation;
import javaRule.NameType;
import javaRule.NoEmpty;
import javaRule.Parameter;
import javaRule.Return;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class MethodsSatisfy {
  private final static String PREFIX = "Meth";
  
  private final static String PROPERTY = "Properties<MethodDeclaration> p";
  
  public static CharSequence getPropertie(final Method s, final String sufix) {
    if ((s instanceof NameOperation)) {
      return ComunSatisfy.nameOperation(((NameOperation) s), MethodsSatisfy.PREFIX, sufix, MethodsSatisfy.PROPERTY);
    } else {
      if ((s instanceof NameType)) {
        return ComunSatisfy.nameType(((NameType) s), MethodsSatisfy.PREFIX, sufix, MethodsSatisfy.PROPERTY);
      } else {
        if ((s instanceof JavaDoc)) {
          return ComunSatisfy.javaDoc(((JavaDoc) s), MethodsSatisfy.PREFIX, sufix, MethodsSatisfy.PROPERTY);
        } else {
          if ((s instanceof Modifiers)) {
            return ComunSatisfy.modifiers(((Modifiers) s), MethodsSatisfy.PREFIX, sufix, MethodsSatisfy.PROPERTY);
          } else {
            if ((s instanceof NoEmpty)) {
              return ComunSatisfy.noEmpty(((NoEmpty) s), MethodsSatisfy.PREFIX, sufix, MethodsSatisfy.PROPERTY);
            } else {
              if ((s instanceof Constructor)) {
                return ((MethodsSatisfy.PROPERTY + sufix) + "= new Constructor ();");
              } else {
                if ((s instanceof Parameter)) {
                  Parameter p = ((Parameter) s);
                  EList<String> _typesParam = p.getTypesParam();
                  boolean _isEmpty = _typesParam.isEmpty();
                  if (_isEmpty) {
                    int _numParam = p.getNumParam();
                    String _plus = (((MethodsSatisfy.PROPERTY + sufix) + "= new Parameters (") + Integer.valueOf(_numParam));
                    return (_plus + ");");
                  } else {
                    String cadena = (("List<String> param" + sufix) + "= new ArrayList<String>();\n");
                    EList<String> _typesParam_1 = p.getTypesParam();
                    for (final String tp : _typesParam_1) {
                      String _cadena = cadena;
                      cadena = (_cadena + (((("param" + sufix) + ".add(\"") + tp) + "\");\n"));
                    }
                    String _cadena_1 = cadena;
                    cadena = (_cadena_1 + ((((MethodsSatisfy.PROPERTY + sufix) + "= new Parameters (param") + sufix) + ");"));
                    return cadena;
                  }
                } else {
                  if ((s instanceof Return)) {
                    Return r = ((Return) s);
                    String _returnType = r.getReturnType();
                    String _plus_1 = (((MethodsSatisfy.PROPERTY + sufix) + "= new Return (\"") + _returnType);
                    return (_plus_1 + "\");");
                  }
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
