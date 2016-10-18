package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.ComunSatisfy;
import javaRule.Enumeration;
import javaRule.JavaDoc;
import javaRule.Modifiers;
import javaRule.Name;
import javaRule.NoEmpty;

@SuppressWarnings("all")
public class EnumSatisfy {
  private final static String END = ");\n";
  
  private final static String PREFIX = "Enum";
  
  public static CharSequence getPropertie(final Enumeration s, final String sufix) {
    String start = (("and" + sufix) + ".addPropertie (new ");
    if ((s instanceof JavaDoc)) {
      CharSequence _javaDoc = ComunSatisfy.javaDoc(((JavaDoc) s), EnumSatisfy.PREFIX);
      String _plus = (start + _javaDoc);
      return (_plus + EnumSatisfy.END);
    } else {
      if ((s instanceof Modifiers)) {
        return ComunSatisfy.modifiers(((Modifiers) s), EnumSatisfy.PREFIX, start, EnumSatisfy.END);
      } else {
        if ((s instanceof Name)) {
          return ComunSatisfy.name(((Name) s), EnumSatisfy.PREFIX, start, EnumSatisfy.END);
        } else {
          if ((s instanceof NoEmpty)) {
            CharSequence _noEmpty = ComunSatisfy.noEmpty(((NoEmpty) s), EnumSatisfy.PREFIX);
            String _plus_1 = (start + _noEmpty);
            return (_plus_1 + EnumSatisfy.END);
          }
        }
      }
    }
    return null;
  }
}
