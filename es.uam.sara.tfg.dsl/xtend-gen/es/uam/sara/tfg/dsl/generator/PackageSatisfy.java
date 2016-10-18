package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.ComunSatisfy;
import javaRule.Name;
import javaRule.NoEmpty;
import javaRule.Satisfy;

@SuppressWarnings("all")
public class PackageSatisfy {
  private final static String END = ");\n";
  
  private final static String PREFIX = "Pack";
  
  public static CharSequence getPropertie(final Satisfy s, final String sufix) {
    String start = (("and" + sufix) + ".addPropertie (new ");
    if ((s instanceof Name)) {
      return ComunSatisfy.name(((Name) s), PackageSatisfy.PREFIX, start, PackageSatisfy.END);
    } else {
      if ((s instanceof NoEmpty)) {
        CharSequence _noEmpty = ComunSatisfy.noEmpty(((NoEmpty) s), PackageSatisfy.PREFIX);
        String _plus = (start + _noEmpty);
        return (_plus + PackageSatisfy.END);
      }
    }
    return null;
  }
}
