package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.ComunSatisfy;
import javaRule.Contains;
import javaRule.Empty;
import javaRule.Enumeration;
import javaRule.Implements;
import javaRule.JavaDoc;
import javaRule.Modifiers;
import javaRule.NameOperation;
import javaRule.NameType;
import javaRule.RangoNames;
import javaRule.StringProperty;
import javaRule.Tamanio;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class EnumSatisfy {
  private final static String TYPE = "MEnumeration";
  
  public static CharSequence getPropertie(final Enumeration s, final String sufix) {
    if ((s instanceof JavaDoc)) {
      return ComunSatisfy.javaDoc(((JavaDoc) s), EnumSatisfy.TYPE, sufix);
    } else {
      if ((s instanceof Modifiers)) {
        return ComunSatisfy.modifiers(((Modifiers) s), EnumSatisfy.TYPE, sufix);
      } else {
        if ((s instanceof NameOperation)) {
          return ComunSatisfy.nameOperation(((NameOperation) s), EnumSatisfy.TYPE, sufix);
        } else {
          if ((s instanceof NameType)) {
            return ComunSatisfy.nameType(((NameType) s), EnumSatisfy.TYPE, sufix);
          } else {
            if ((s instanceof Empty)) {
              return ComunSatisfy.empty(((Empty) s), EnumSatisfy.TYPE, sufix);
            } else {
              if ((s instanceof Contains)) {
                return ComunSatisfy.contains(((Contains) s), EnumSatisfy.TYPE, sufix);
              } else {
                if ((s instanceof Tamanio)) {
                  return ComunSatisfy.size(((Tamanio) s), EnumSatisfy.TYPE, sufix);
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
                    String _plus = ((((((((("Property<" + EnumSatisfy.TYPE) + "> p") + sufix) + "= new PropertyStringVariable<") + EnumSatisfy.TYPE) + ",Implements<") + EnumSatisfy.TYPE) + ">>(") + Boolean.valueOf(_isNo));
                    String _plus_1 = (_plus + ",listV");
                    String _plus_2 = (_plus_1 + sufix);
                    String _plus_3 = (_plus_2 + 
                      ", listT");
                    String _plus_4 = (_plus_3 + sufix);
                    String _plus_5 = (_plus_4 + ", new Implements<");
                    String _plus_6 = (_plus_5 + EnumSatisfy.TYPE);
                    String _plus_7 = (_plus_6 + ">(");
                    boolean _isNo_1 = ((Implements)s).isNo();
                    String _plus_8 = (_plus_7 + Boolean.valueOf(_isNo_1));
                    String _plus_9 = (_plus_8 + ",");
                    String _plus_10 = (_plus_9 + Integer.valueOf(min));
                    String _plus_11 = (_plus_10 + ",");
                    String _plus_12 = (_plus_11 + Integer.valueOf(max));
                    String _plus_13 = (_plus_12 + ", types");
                    String _plus_14 = (_plus_13 + sufix);
                    String _plus_15 = (_plus_14 + "));\n");
                    cad = (_cad_2 + _plus_15);
                    return cad;
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
