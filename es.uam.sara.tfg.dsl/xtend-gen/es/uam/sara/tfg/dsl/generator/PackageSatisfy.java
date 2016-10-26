package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.ComunSatisfy;
import javaRule.Contains;
import javaRule.NameOperation;
import javaRule.NameType;
import javaRule.NoEmpty;
import javaRule.Satisfy;

@SuppressWarnings("all")
public class PackageSatisfy {
  private final static String PREFIX = "Pack";
  
  private final static String PROPERTY = "Properties<String> p";
  
  public static CharSequence getPropertie(final Satisfy s, final String sufix) {
    if ((s instanceof NameOperation)) {
      return ComunSatisfy.nameOperation(((NameOperation) s), PackageSatisfy.PREFIX, sufix, PackageSatisfy.PROPERTY);
    } else {
      if ((s instanceof NameType)) {
        return ComunSatisfy.nameType(((NameType) s), PackageSatisfy.PREFIX, sufix, PackageSatisfy.PROPERTY);
      } else {
        if ((s instanceof NoEmpty)) {
          return ComunSatisfy.noEmpty(((NoEmpty) s), PackageSatisfy.PREFIX, sufix, PackageSatisfy.PROPERTY);
        } else {
          if ((s instanceof Contains)) {
            return ComunSatisfy.contains(((Contains) s), PackageSatisfy.PREFIX, sufix, PackageSatisfy.PROPERTY);
          }
        }
      }
    }
    return null;
  }
}
