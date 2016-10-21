package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.ComunSatisfy;
import javaRule.Interface;
import javaRule.JavaDoc;
import javaRule.Modifiers;
import javaRule.Name;
import javaRule.NoEmpty;
import javaRule.isImplemented;

@SuppressWarnings("all")
public class InterfaceSatisfy {
  private final static String END = ");\n";
  
  private final static String PREFIX = "Inter";
  
  public static CharSequence getPropertie(final Interface s, final String sufix) {
    String start = (("and" + sufix) + ".addPropertie (new ");
    if ((s instanceof JavaDoc)) {
      CharSequence _javaDoc = ComunSatisfy.javaDoc(((JavaDoc) s), InterfaceSatisfy.PREFIX);
      String _plus = (start + _javaDoc);
      return (_plus + InterfaceSatisfy.END);
    } else {
      if ((s instanceof Modifiers)) {
        return ComunSatisfy.modifiers(((Modifiers) s), InterfaceSatisfy.PREFIX, start, InterfaceSatisfy.END);
      } else {
        if ((s instanceof Name)) {
          return ComunSatisfy.name(((Name) s), InterfaceSatisfy.PREFIX, start, InterfaceSatisfy.END);
        } else {
          if ((s instanceof NoEmpty)) {
            CharSequence _noEmpty = ComunSatisfy.noEmpty(((NoEmpty) s), InterfaceSatisfy.PREFIX);
            String _plus_1 = (start + _noEmpty);
            return (_plus_1 + InterfaceSatisfy.END);
          } else {
            if ((s instanceof isImplemented)) {
              return ((start + "IsImplemented(es.uam.sara.tfg.ast.Visitors.getTypes())") + InterfaceSatisfy.END);
            }
          }
        }
      }
    }
    return null;
  }
}
