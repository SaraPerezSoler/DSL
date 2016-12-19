package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.ComunSatisfy;
import javaRule.Contains;
import javaRule.Empty;
import javaRule.Implements;
import javaRule.IsGeneric;
import javaRule.IsSubClass;
import javaRule.IsSuperClass;
import javaRule.JavaDoc;
import javaRule.Modifiers;
import javaRule.NameOperation;
import javaRule.NameType;
import javaRule.RangoNames;
import javaRule.StringProperty;
import javaRule.Tamanio;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class ClassesSatisfy {
  private final static String TYPE = "MClass";
  
  public static CharSequence getPropertie(final javaRule.Class s, final String sufix) {
    if ((s instanceof JavaDoc)) {
      return ComunSatisfy.javaDoc(((JavaDoc) s), ClassesSatisfy.TYPE, sufix);
    } else {
      if ((s instanceof Modifiers)) {
        return ComunSatisfy.modifiers(((Modifiers) s), ClassesSatisfy.TYPE, sufix);
      } else {
        if ((s instanceof NameOperation)) {
          return ComunSatisfy.nameOperation(((NameOperation) s), ClassesSatisfy.TYPE, sufix);
        } else {
          if ((s instanceof NameType)) {
            return ComunSatisfy.nameType(((NameType) s), ClassesSatisfy.TYPE, sufix);
          } else {
            if ((s instanceof Empty)) {
              return ComunSatisfy.empty(((Empty) s), ClassesSatisfy.TYPE, sufix);
            } else {
              if ((s instanceof Implements)) {
                Implements p = ((Implements) s);
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
                String _plus = ((((((((("Property<" + ClassesSatisfy.TYPE) + "> p") + sufix) + "= new PropertyStringVariable<") + ClassesSatisfy.TYPE) + ",Implements<") + ClassesSatisfy.TYPE) + ">>(") + Boolean.valueOf(_isNo));
                String _plus_1 = (_plus + 
                  ",listV");
                String _plus_2 = (_plus_1 + sufix);
                String _plus_3 = (_plus_2 + ", listT");
                String _plus_4 = (_plus_3 + sufix);
                String _plus_5 = (_plus_4 + ", new Implements<");
                String _plus_6 = (_plus_5 + ClassesSatisfy.TYPE);
                String _plus_7 = (_plus_6 + ">(");
                boolean _isNo_1 = ((Implements)s).isNo();
                String _plus_8 = (_plus_7 + Boolean.valueOf(_isNo_1));
                String _plus_9 = (_plus_8 + ",");
                String _plus_10 = (_plus_9 + Integer.valueOf(min));
                String _plus_11 = (_plus_10 + ",");
                String _plus_12 = (_plus_11 + Integer.valueOf(max));
                String _plus_13 = (_plus_12 + 
                  ", types");
                String _plus_14 = (_plus_13 + sufix);
                String _plus_15 = (_plus_14 + "));\n");
                cad = (_cad_2 + _plus_15);
                return cad;
              } else {
                if ((s instanceof IsSubClass)) {
                  IsSubClass p_1 = ((IsSubClass) s);
                  StringProperty _of = p_1.getOf();
                  String cad_1 = ComunSatisfy.getType(_of, sufix);
                  String _cad_3 = cad_1;
                  StringProperty _of_1 = p_1.getOf();
                  String _propertyStringVariable = ComunSatisfy.propertyStringVariable(_of_1, sufix);
                  cad_1 = (_cad_3 + _propertyStringVariable);
                  String _cad_4 = cad_1;
                  boolean _isNo_2 = p_1.isNo();
                  String _plus_16 = ((((((("Property<" + ClassesSatisfy.TYPE) + "> p") + sufix) + "= new PropertyStringVariable<") + ClassesSatisfy.TYPE) + ",IsSubClass>(") + Boolean.valueOf(_isNo_2));
                  String _plus_17 = (_plus_16 + 
                    ",listV");
                  String _plus_18 = (_plus_17 + sufix);
                  String _plus_19 = (_plus_18 + ", listT");
                  String _plus_20 = (_plus_19 + sufix);
                  String _plus_21 = (_plus_20 + ", new IsSubClass(");
                  boolean _isNo_3 = ((IsSubClass)s).isNo();
                  String _plus_22 = (_plus_21 + Boolean.valueOf(_isNo_3));
                  String _plus_23 = (_plus_22 + ",type");
                  String _plus_24 = (_plus_23 + sufix);
                  String _plus_25 = (_plus_24 + "));\n");
                  cad_1 = (_cad_4 + _plus_25);
                  return cad_1;
                } else {
                  if ((s instanceof IsSuperClass)) {
                    IsSuperClass p_2 = ((IsSuperClass) s);
                    RangoNames _valores_4 = p_2.getValores();
                    int min_1 = _valores_4.getMin();
                    RangoNames _valores_5 = p_2.getValores();
                    int max_1 = _valores_5.getMax();
                    int i_1 = 1;
                    String cad_2 = (("List <TypeString> types" + sufix) + "=new ArrayList<TypeString>();\n");
                    RangoNames _valores_6 = p_2.getValores();
                    EList<StringProperty> _types_2 = _valores_6.getTypes();
                    for (final StringProperty tp_2 : _types_2) {
                      {
                        String _cad_5 = cad_2;
                        String _type = ComunSatisfy.getType(tp_2, (sufix + Integer.valueOf(i_1)));
                        cad_2 = (_cad_5 + _type);
                        String _cad_6 = cad_2;
                        cad_2 = (_cad_6 + ((((("types" + sufix) + ".add(type") + sufix) + Integer.valueOf(i_1)) + ");\n"));
                        i_1++;
                      }
                    }
                    String _cad_5 = cad_2;
                    String _declaraVariable_1 = ComunSatisfy.declaraVariable(sufix);
                    cad_2 = (_cad_5 + _declaraVariable_1);
                    RangoNames _valores_7 = p_2.getValores();
                    EList<StringProperty> _types_3 = _valores_7.getTypes();
                    for (final StringProperty tp_3 : _types_3) {
                      String _cad_6 = cad_2;
                      String _añadeVariable_1 = ComunSatisfy.añadeVariable(tp_3, sufix);
                      cad_2 = (_cad_6 + _añadeVariable_1);
                    }
                    String _cad_7 = cad_2;
                    boolean _isNo_4 = p_2.isNo();
                    String _plus_26 = ((((((("Property<" + ClassesSatisfy.TYPE) + "> p") + sufix) + "= new PropertyStringVariable<") + ClassesSatisfy.TYPE) + ",IsSuperClass>(") + Boolean.valueOf(_isNo_4));
                    String _plus_27 = (_plus_26 + ",listV");
                    String _plus_28 = (_plus_27 + sufix);
                    String _plus_29 = (_plus_28 + ", listT");
                    String _plus_30 = (_plus_29 + sufix);
                    String _plus_31 = (_plus_30 + ", new IsSuperClass(");
                    boolean _isNo_5 = ((IsSuperClass)s).isNo();
                    String _plus_32 = (_plus_31 + Boolean.valueOf(_isNo_5));
                    String _plus_33 = (_plus_32 + 
                      ",visitors.getClasses(),");
                    String _plus_34 = (_plus_33 + Integer.valueOf(min_1));
                    String _plus_35 = (_plus_34 + ",");
                    String _plus_36 = (_plus_35 + Integer.valueOf(max_1));
                    String _plus_37 = (_plus_36 + ", types");
                    String _plus_38 = (_plus_37 + sufix);
                    String _plus_39 = (_plus_38 + "));\n");
                    cad_2 = (_cad_7 + _plus_39);
                    return cad_2;
                  } else {
                    if ((s instanceof Tamanio)) {
                      return ComunSatisfy.size(((Tamanio) s), ClassesSatisfy.TYPE, sufix);
                    } else {
                      if ((s instanceof Contains)) {
                        return ComunSatisfy.contains(((Contains) s), ClassesSatisfy.TYPE, sufix);
                      } else {
                        if ((s instanceof IsGeneric)) {
                          return ComunSatisfy.isGeneric(((IsGeneric) s), ClassesSatisfy.TYPE, sufix);
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
