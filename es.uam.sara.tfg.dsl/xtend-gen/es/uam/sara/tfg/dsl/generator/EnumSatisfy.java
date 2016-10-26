package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.ComunSatisfy;
import javaRule.Contains;
import javaRule.Enumeration;
import javaRule.JavaDoc;
import javaRule.Modifiers;
import javaRule.NameOperation;
import javaRule.NameType;
import javaRule.NoEmpty;

@SuppressWarnings("all")
public class EnumSatisfy {
  private final static String PREFIX = "Enum";
  
  private final static String PROPERTY = "Properties<EnumDeclaration> p";
  
  public static CharSequence getPropertie(final Enumeration s, final String sufix) {
    if ((s instanceof JavaDoc)) {
      return ComunSatisfy.javaDoc(((JavaDoc) s), EnumSatisfy.PREFIX, sufix, EnumSatisfy.PROPERTY);
    } else {
      if ((s instanceof Modifiers)) {
        return ComunSatisfy.modifiers(((Modifiers) s), EnumSatisfy.PREFIX, sufix, EnumSatisfy.PROPERTY);
      } else {
        if ((s instanceof NameOperation)) {
          return ComunSatisfy.nameOperation(((NameOperation) s), EnumSatisfy.PREFIX, sufix, EnumSatisfy.PROPERTY);
        } else {
          if ((s instanceof NameType)) {
            return ComunSatisfy.nameType(((NameType) s), EnumSatisfy.PREFIX, sufix, EnumSatisfy.PROPERTY);
          } else {
            if ((s instanceof NoEmpty)) {
              return ComunSatisfy.noEmpty(((NoEmpty) s), EnumSatisfy.PREFIX, sufix, EnumSatisfy.PROPERTY);
            } else {
              if ((s instanceof Contains)) {
                return ComunSatisfy.contains(((Contains) s), EnumSatisfy.PREFIX, sufix, EnumSatisfy.PROPERTY);
              }
            }
          }
        }
      }
    }
    return null;
  }
}
