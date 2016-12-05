package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.ComunSatisfy;
import javaRule.Constructor;
import javaRule.Empty;
import javaRule.IsGeneric;
import javaRule.JavaDoc;
import javaRule.Method;
import javaRule.Modifiers;
import javaRule.NameOperation;
import javaRule.NameType;
import javaRule.Parameter;
import javaRule.Return;
import javaRule.StringProperty;
import javaRule.Tamanio;
import javaRule.TypeProperty;
import javaRule.TypeString;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class MethodsSatisfy {
  private final static String TYPE = "Method";
  
  public static CharSequence getPropertie(final Method s, final String sufix) {
    if ((s instanceof NameOperation)) {
      return ComunSatisfy.nameOperation(((NameOperation) s), MethodsSatisfy.TYPE, sufix);
    } else {
      if ((s instanceof NameType)) {
        return ComunSatisfy.nameType(((NameType) s), MethodsSatisfy.TYPE, sufix);
      } else {
        if ((s instanceof JavaDoc)) {
          return ComunSatisfy.javaDoc(((JavaDoc) s), MethodsSatisfy.TYPE, sufix);
        } else {
          if ((s instanceof Modifiers)) {
            return ComunSatisfy.modifiers(((Modifiers) s), MethodsSatisfy.TYPE, sufix);
          } else {
            if ((s instanceof Empty)) {
              return ComunSatisfy.empty(((Empty) s), MethodsSatisfy.TYPE, sufix);
            } else {
              if ((s instanceof Constructor)) {
                boolean _isNo = ((Constructor)s).isNo();
                String _plus = ((((("Properties<" + MethodsSatisfy.TYPE) + "> p") + sufix) + "= new Constructor (") + Boolean.valueOf(_isNo));
                return (_plus + ");\n");
              } else {
                if ((s instanceof Parameter)) {
                  Parameter p = ((Parameter) s);
                  int min = p.getMin();
                  int max = p.getMax();
                  int _exact = p.getExact();
                  boolean _notEquals = (_exact != (-2147483647));
                  if (_notEquals) {
                    int _exact_1 = p.getExact();
                    min = _exact_1;
                    int _exact_2 = p.getExact();
                    max = _exact_2;
                  }
                  int i = 0;
                  String cad = "List <Type> types=new ArrayList<Type>();\n";
                  EList<TypeProperty> _types = p.getTypes();
                  for (final TypeProperty tp : _types) {
                    {
                      String _cad = cad;
                      String _type = ComunSatisfy.getType(tp, (sufix + Integer.valueOf(i)));
                      cad = (_cad + _type);
                      String _cad_1 = cad;
                      cad = (_cad_1 + ((("types.add(type" + sufix) + Integer.valueOf(i)) + ");\n"));
                      i++;
                    }
                  }
                  String _cad = cad;
                  String _declaraVariable = ComunSatisfy.declaraVariable(sufix);
                  cad = (_cad + _declaraVariable);
                  EList<TypeProperty> _types_1 = p.getTypes();
                  for (final TypeProperty tp_1 : _types_1) {
                    if ((tp_1 instanceof TypeString)) {
                      StringProperty _typeStrng = ((TypeString) tp_1).getTypeStrng();
                      ComunSatisfy.añadeVariable(_typeStrng, sufix);
                    }
                  }
                  String _cad_1 = cad;
                  boolean _isNo_1 = p.isNo();
                  String _plus_1 = ((((((("Properties<" + MethodsSatisfy.TYPE) + "> p") + sufix) + "= new PropertyStringVariable<") + MethodsSatisfy.TYPE) + ",Parameters>(") + Boolean.valueOf(_isNo_1));
                  String _plus_2 = (_plus_1 + ",listV");
                  String _plus_3 = (_plus_2 + sufix);
                  String _plus_4 = (_plus_3 + 
                    ", listT");
                  String _plus_5 = (_plus_4 + sufix);
                  String _plus_6 = (_plus_5 + ", new Parameters(");
                  boolean _isNo_2 = ((Parameter)s).isNo();
                  String _plus_7 = (_plus_6 + Boolean.valueOf(_isNo_2));
                  String _plus_8 = (_plus_7 + ",");
                  String _plus_9 = (_plus_8 + Integer.valueOf(min));
                  String _plus_10 = (_plus_9 + ",");
                  String _plus_11 = (_plus_10 + Integer.valueOf(max));
                  String _plus_12 = (_plus_11 + ", types));\n");
                  cad = (_cad_1 + _plus_12);
                  return cad;
                } else {
                  if ((s instanceof Return)) {
                    Return r = ((Return) s);
                    TypeProperty _type = r.getType();
                    String cad_1 = ComunSatisfy.getType(_type, sufix);
                    TypeProperty _type_1 = r.getType();
                    if ((_type_1 instanceof TypeString)) {
                      TypeProperty _type_2 = r.getType();
                      TypeString spa = ((TypeString) _type_2);
                      String _cad_2 = cad_1;
                      StringProperty _typeStrng_1 = spa.getTypeStrng();
                      String _propertyStringVariable = ComunSatisfy.propertyStringVariable(_typeStrng_1, sufix);
                      cad_1 = (_cad_2 + _propertyStringVariable);
                      String _cad_3 = cad_1;
                      boolean _isNo_3 = r.isNo();
                      String _plus_13 = ((((((("Properties<" + MethodsSatisfy.TYPE) + "> p") + sufix) + "= new PropertyStringVariable<") + MethodsSatisfy.TYPE) + ",Return>(") + Boolean.valueOf(_isNo_3));
                      String _plus_14 = (_plus_13 + ",listV");
                      String _plus_15 = (_plus_14 + sufix);
                      String _plus_16 = (_plus_15 + 
                        ", listT");
                      String _plus_17 = (_plus_16 + sufix);
                      String _plus_18 = (_plus_17 + ", new Return(");
                      boolean _isNo_4 = r.isNo();
                      String _plus_19 = (_plus_18 + Boolean.valueOf(_isNo_4));
                      String _plus_20 = (_plus_19 + ",type");
                      String _plus_21 = (_plus_20 + sufix);
                      String _plus_22 = (_plus_21 + "));\n");
                      cad_1 = (_cad_3 + _plus_22);
                      return cad_1;
                    }
                    String _cad_4 = cad_1;
                    boolean _isNo_5 = r.isNo();
                    String _plus_23 = ((((("Properties<" + MethodsSatisfy.TYPE) + "> p") + sufix) + "=new Return(") + Boolean.valueOf(_isNo_5));
                    String _plus_24 = (_plus_23 + ",type");
                    String _plus_25 = (_plus_24 + sufix);
                    String _plus_26 = (_plus_25 + ");\n");
                    cad_1 = (_cad_4 + _plus_26);
                    return cad_1;
                  } else {
                    if ((s instanceof Tamanio)) {
                      return ComunSatisfy.size(((Tamanio) s), MethodsSatisfy.TYPE, sufix);
                    } else {
                      if ((s instanceof IsGeneric)) {
                        return ComunSatisfy.isGeneric(((IsGeneric) s), MethodsSatisfy.TYPE, sufix);
                      }
                    }
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
