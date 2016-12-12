package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.ComunSatisfy;
import javaRule.Contains;
import javaRule.Empty;
import javaRule.NameOperation;
import javaRule.NameType;

@SuppressWarnings("all")
public class PackageSatisfy {
  private final static String TYPE = "MPackage";
  
  public static CharSequence getPropertie(final javaRule.Package s, final String sufix) {
    if ((s instanceof NameOperation)) {
      return ComunSatisfy.nameOperation(((NameOperation) s), PackageSatisfy.TYPE, sufix);
    } else {
      if ((s instanceof NameType)) {
        return ComunSatisfy.nameType(((NameType) s), PackageSatisfy.TYPE, sufix);
      } else {
        if ((s instanceof Empty)) {
          return ComunSatisfy.empty(((Empty) s), PackageSatisfy.TYPE, sufix);
        } else {
          if ((s instanceof Contains)) {
            return ComunSatisfy.contains(((Contains) s), PackageSatisfy.TYPE, sufix);
          }
        }
      }
    }
    return null;
  }
}
