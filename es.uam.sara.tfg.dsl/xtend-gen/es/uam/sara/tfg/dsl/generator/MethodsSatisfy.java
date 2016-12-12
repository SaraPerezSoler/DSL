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
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class MethodsSatisfy {
  private final static String TYPE = "MMethod";
  
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
                String _plus = ((((("Property<" + MethodsSatisfy.TYPE) + "> p") + sufix) + "= new Constructor (") + Boolean.valueOf(_isNo));
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
                  int i = 1;
                  String cad = (("List <Type> types" + sufix) + "=new ArrayList<Type>();\n");
                  EList<TypeProperty> _types = p.getTypes();
                  for (final TypeProperty tp : _types) {
                    {
                      String _cad = cad;
                      String _type = ComunSatisfy.getType(tp, (sufix + Integer.valueOf(i)));
                      cad = (_cad + _type);
                      String _cad_1 = cad;
                      cad = (_cad_1 + ((((("types" + sufix) + ".add(type") + sufix) + Integer.valueOf(i)) + ");\n"));
                      i++;
                    }
                  }
                  String _cad = cad;
                  String _declaraVariable = ComunSatisfy.declaraVariable(sufix);
                  cad = (_cad + _declaraVariable);
                  EList<TypeProperty> _types_1 = p.getTypes();
                  for (final TypeProperty tp_1 : _types_1) {
                    if ((tp_1 instanceof StringProperty)) {
                      String _cad_1 = cad;
                      String _añadeVariable = ComunSatisfy.añadeVariable(((StringProperty) tp_1), sufix);
                      cad = (_cad_1 + _añadeVariable);
                    }
                  }
                  String _cad_2 = cad;
                  boolean _isNo_1 = p.isNo();
                  String _plus_1 = ((((((("Property<" + MethodsSatisfy.TYPE) + "> p") + sufix) + "= new PropertyStringVariable<") + MethodsSatisfy.TYPE) + ",Parameters>(") + Boolean.valueOf(_isNo_1));
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
                  String _plus_12 = (_plus_11 + ", types");
                  String _plus_13 = (_plus_12 + sufix);
                  String _plus_14 = (_plus_13 + "));\n");
                  cad = (_cad_2 + _plus_14);
                  return cad;
                } else {
                  if ((s instanceof Return)) {
                    Return r = ((Return) s);
                    TypeProperty _type = r.getType();
                    String cad_1 = ComunSatisfy.getType(_type, sufix);
                    TypeProperty _type_1 = r.getType();
                    if ((_type_1 instanceof StringProperty)) {
                      TypeProperty _type_2 = r.getType();
                      StringProperty spa = ((StringProperty) _type_2);
                      String _cad_3 = cad_1;
                      String _propertyStringVariable = ComunSatisfy.propertyStringVariable(spa, sufix);
                      cad_1 = (_cad_3 + _propertyStringVariable);
                      String _cad_4 = cad_1;
                      boolean _isNo_3 = r.isNo();
                      String _plus_15 = ((((((("Property<" + MethodsSatisfy.TYPE) + "> p") + sufix) + "= new PropertyStringVariable<") + MethodsSatisfy.TYPE) + ",Return>(") + Boolean.valueOf(_isNo_3));
                      String _plus_16 = (_plus_15 + ",listV");
                      String _plus_17 = (_plus_16 + sufix);
                      String _plus_18 = (_plus_17 + 
                        ", listT");
                      String _plus_19 = (_plus_18 + sufix);
                      String _plus_20 = (_plus_19 + ", new Return(");
                      boolean _isNo_4 = r.isNo();
                      String _plus_21 = (_plus_20 + Boolean.valueOf(_isNo_4));
                      String _plus_22 = (_plus_21 + ",type");
                      String _plus_23 = (_plus_22 + sufix);
                      String _plus_24 = (_plus_23 + "));\n");
                      cad_1 = (_cad_4 + _plus_24);
                      return cad_1;
                    }
                    String _cad_5 = cad_1;
                    boolean _isNo_5 = r.isNo();
                    String _plus_25 = ((((("Property<" + MethodsSatisfy.TYPE) + "> p") + sufix) + "=new Return(") + Boolean.valueOf(_isNo_5));
                    String _plus_26 = (_plus_25 + ",type");
                    String _plus_27 = (_plus_26 + sufix);
                    String _plus_28 = (_plus_27 + ");\n");
                    cad_1 = (_cad_5 + _plus_28);
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
