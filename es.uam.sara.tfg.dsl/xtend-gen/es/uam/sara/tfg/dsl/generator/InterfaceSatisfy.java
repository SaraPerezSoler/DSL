package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.ComunSatisfy;
import javaRule.Contains;
import javaRule.Empty;
import javaRule.Extends;
import javaRule.Interface;
import javaRule.IsGeneric;
import javaRule.IsImplemented;
import javaRule.IsSuperInterface;
import javaRule.JavaDoc;
import javaRule.Modifiers;
import javaRule.NameOperation;
import javaRule.NameType;
import javaRule.RangoNames;
import javaRule.StringProperty;
import javaRule.Tamanio;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class InterfaceSatisfy {
  private final static String TYPE = "MInterface";
  
  public static CharSequence getPropertie(final Interface s, final String sufix) {
    if ((s instanceof JavaDoc)) {
      return ComunSatisfy.javaDoc(((JavaDoc) s), InterfaceSatisfy.TYPE, sufix);
    } else {
      if ((s instanceof Modifiers)) {
        return ComunSatisfy.modifiers(((Modifiers) s), InterfaceSatisfy.TYPE, sufix);
      } else {
        if ((s instanceof NameOperation)) {
          return ComunSatisfy.nameOperation(((NameOperation) s), InterfaceSatisfy.TYPE, sufix);
        } else {
          if ((s instanceof NameType)) {
            return ComunSatisfy.nameType(((NameType) s), InterfaceSatisfy.TYPE, sufix);
          } else {
            if ((s instanceof Empty)) {
              return ComunSatisfy.empty(((Empty) s), InterfaceSatisfy.TYPE, sufix);
            } else {
              if ((s instanceof IsImplemented)) {
                IsImplemented p = ((IsImplemented) s);
                RangoNames _valores = p.getValores();
                int min = _valores.getMin();
                RangoNames _valores_1 = p.getValores();
                int max = _valores_1.getMax();
                int i = 1;
                String cad = (("List <TypeString> types" + sufix) + "=new ArrayList<TypeString>();\n");
                RangoNames _valores_2 = p.getValores();
                EList<StringProperty> _types = _valores_2.getTypes();
                for (final StringProperty tp : _types) {
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
                RangoNames _valores_3 = p.getValores();
                EList<StringProperty> _types_1 = _valores_3.getTypes();
                for (final StringProperty tp_1 : _types_1) {
                  String _cad_1 = cad;
                  String _añadeVariable = ComunSatisfy.añadeVariable(tp_1, sufix);
                  cad = (_cad_1 + _añadeVariable);
                }
                String _cad_2 = cad;
                boolean _isNo = p.isNo();
                String _plus = ((((((("Property<" + InterfaceSatisfy.TYPE) + "> p") + sufix) + "= new PropertyStringVariable<") + InterfaceSatisfy.TYPE) + ",IsImplemented>(") + Boolean.valueOf(_isNo));
                String _plus_1 = (_plus + ",listV");
                String _plus_2 = (_plus_1 + sufix);
                String _plus_3 = (_plus_2 + 
                  ", listT");
                String _plus_4 = (_plus_3 + sufix);
                String _plus_5 = (_plus_4 + ", new IsImplemented(");
                boolean _isNo_1 = ((IsImplemented)s).isNo();
                String _plus_6 = (_plus_5 + Boolean.valueOf(_isNo_1));
                String _plus_7 = (_plus_6 + ",visitors.getEnumClass(),");
                String _plus_8 = (_plus_7 + Integer.valueOf(min));
                String _plus_9 = (_plus_8 + ",");
                String _plus_10 = (_plus_9 + Integer.valueOf(max));
                String _plus_11 = (_plus_10 + ", types");
                String _plus_12 = (_plus_11 + sufix);
                String _plus_13 = (_plus_12 + "));\n");
                cad = (_cad_2 + _plus_13);
                return cad;
              } else {
                if ((s instanceof IsSuperInterface)) {
                  IsSuperInterface p_1 = ((IsSuperInterface) s);
                  RangoNames _valores_4 = p_1.getValores();
                  int min_1 = _valores_4.getMin();
                  RangoNames _valores_5 = p_1.getValores();
                  int max_1 = _valores_5.getMax();
                  int i_1 = 1;
                  String cad_1 = (("List <TypeString> types" + sufix) + "=new ArrayList<TypeString>();\n");
                  RangoNames _valores_6 = p_1.getValores();
                  EList<StringProperty> _types_2 = _valores_6.getTypes();
                  for (final StringProperty tp_2 : _types_2) {
                    {
                      String _cad_3 = cad_1;
                      String _type = ComunSatisfy.getType(tp_2, (sufix + Integer.valueOf(i_1)));
                      cad_1 = (_cad_3 + _type);
                      String _cad_4 = cad_1;
                      cad_1 = (_cad_4 + ((((("types" + sufix) + ".add(type") + sufix) + Integer.valueOf(i_1)) + ");\n"));
                      i_1++;
                    }
                  }
                  String _cad_3 = cad_1;
                  String _declaraVariable_1 = ComunSatisfy.declaraVariable(sufix);
                  cad_1 = (_cad_3 + _declaraVariable_1);
                  RangoNames _valores_7 = p_1.getValores();
                  EList<StringProperty> _types_3 = _valores_7.getTypes();
                  for (final StringProperty tp_3 : _types_3) {
                    String _cad_4 = cad_1;
                    String _añadeVariable_1 = ComunSatisfy.añadeVariable(tp_3, sufix);
                    cad_1 = (_cad_4 + _añadeVariable_1);
                  }
                  String _cad_5 = cad_1;
                  boolean _isNo_2 = p_1.isNo();
                  String _plus_14 = ((((((("Property<" + InterfaceSatisfy.TYPE) + "> p") + sufix) + "= new PropertyStringVariable<") + InterfaceSatisfy.TYPE) + ",IsSuperInterface>(") + Boolean.valueOf(_isNo_2));
                  String _plus_15 = (_plus_14 + ",listV");
                  String _plus_16 = (_plus_15 + sufix);
                  String _plus_17 = (_plus_16 + 
                    ", listT");
                  String _plus_18 = (_plus_17 + sufix);
                  String _plus_19 = (_plus_18 + ", new IsSuperInterface(");
                  boolean _isNo_3 = ((IsSuperInterface)s).isNo();
                  String _plus_20 = (_plus_19 + Boolean.valueOf(_isNo_3));
                  String _plus_21 = (_plus_20 + ",visitors.getInterfaces(),");
                  String _plus_22 = (_plus_21 + Integer.valueOf(min_1));
                  String _plus_23 = (_plus_22 + ",");
                  String _plus_24 = (_plus_23 + Integer.valueOf(max_1));
                  String _plus_25 = (_plus_24 + ", types");
                  String _plus_26 = (_plus_25 + sufix);
                  String _plus_27 = (_plus_26 + "));\n");
                  cad_1 = (_cad_5 + _plus_27);
                  return cad_1;
                } else {
                  if ((s instanceof Extends)) {
                    Extends p_2 = ((Extends) s);
                    RangoNames _valores_8 = p_2.getValores();
                    int min_2 = _valores_8.getMin();
                    RangoNames _valores_9 = p_2.getValores();
                    int max_2 = _valores_9.getMax();
                    int i_2 = 1;
                    String cad_2 = (("List <TypeString> types" + sufix) + "=new ArrayList<TypeString>();\n");
                    RangoNames _valores_10 = p_2.getValores();
                    EList<StringProperty> _types_4 = _valores_10.getTypes();
                    for (final StringProperty tp_4 : _types_4) {
                      {
                        String _cad_6 = cad_2;
                        String _type = ComunSatisfy.getType(tp_4, (sufix + Integer.valueOf(i_2)));
                        cad_2 = (_cad_6 + _type);
                        String _cad_7 = cad_2;
                        cad_2 = (_cad_7 + ((((("types" + sufix) + ".add(type") + sufix) + Integer.valueOf(i_2)) + ");\n"));
                        i_2++;
                      }
                    }
                    String _cad_6 = cad_2;
                    String _declaraVariable_2 = ComunSatisfy.declaraVariable(sufix);
                    cad_2 = (_cad_6 + _declaraVariable_2);
                    RangoNames _valores_11 = p_2.getValores();
                    EList<StringProperty> _types_5 = _valores_11.getTypes();
                    for (final StringProperty tp_5 : _types_5) {
                      String _cad_7 = cad_2;
                      String _añadeVariable_2 = ComunSatisfy.añadeVariable(tp_5, sufix);
                      cad_2 = (_cad_7 + _añadeVariable_2);
                    }
                    String _cad_8 = cad_2;
                    boolean _isNo_4 = p_2.isNo();
                    String _plus_28 = ((((((((("Property<" + InterfaceSatisfy.TYPE) + "> p") + sufix) + "= new PropertyStringVariable<") + InterfaceSatisfy.TYPE) + ",Implements<") + InterfaceSatisfy.TYPE) + ">>(") + Boolean.valueOf(_isNo_4));
                    String _plus_29 = (_plus_28 + ",listV");
                    String _plus_30 = (_plus_29 + sufix);
                    String _plus_31 = (_plus_30 + 
                      ", listT");
                    String _plus_32 = (_plus_31 + sufix);
                    String _plus_33 = (_plus_32 + ", new Implements<");
                    String _plus_34 = (_plus_33 + InterfaceSatisfy.TYPE);
                    String _plus_35 = (_plus_34 + ">(");
                    boolean _isNo_5 = ((Extends)s).isNo();
                    String _plus_36 = (_plus_35 + Boolean.valueOf(_isNo_5));
                    String _plus_37 = (_plus_36 + ",");
                    String _plus_38 = (_plus_37 + Integer.valueOf(min_2));
                    String _plus_39 = (_plus_38 + ",");
                    String _plus_40 = (_plus_39 + Integer.valueOf(max_2));
                    String _plus_41 = (_plus_40 + ", types");
                    String _plus_42 = (_plus_41 + sufix);
                    String _plus_43 = (_plus_42 + "));\n");
                    cad_2 = (_cad_8 + _plus_43);
                    return cad_2;
                  } else {
                    if ((s instanceof IsGeneric)) {
                      return ComunSatisfy.isGeneric(((IsGeneric) s), InterfaceSatisfy.TYPE, sufix);
                    } else {
                      if ((s instanceof Tamanio)) {
                        return ComunSatisfy.size(((Tamanio) s), InterfaceSatisfy.TYPE, sufix);
                      } else {
                        if ((s instanceof Contains)) {
                          return ComunSatisfy.contains(((Contains) s), InterfaceSatisfy.TYPE, sufix);
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
    }
    return null;
  }
}
