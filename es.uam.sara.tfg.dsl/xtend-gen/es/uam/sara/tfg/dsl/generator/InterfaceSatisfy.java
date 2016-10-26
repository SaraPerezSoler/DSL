package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.ComunSatisfy;
import javaRule.Contains;
import javaRule.Interface;
import javaRule.JavaDoc;
import javaRule.Modifiers;
import javaRule.NameOperation;
import javaRule.NameType;
import javaRule.NoEmpty;
import javaRule.isImplemented;

@SuppressWarnings("all")
public class InterfaceSatisfy {
  private final static String PREFIX = "Inter";
  
  private final static String PROPERTY = "Properties<TypeDeclaration> p";
  
  public static CharSequence getPropertie(final Interface s, final String sufix) {
    if ((s instanceof JavaDoc)) {
      return ComunSatisfy.javaDoc(((JavaDoc) s), InterfaceSatisfy.PREFIX, sufix, InterfaceSatisfy.PROPERTY);
    } else {
      if ((s instanceof Modifiers)) {
        return ComunSatisfy.modifiers(((Modifiers) s), InterfaceSatisfy.PREFIX, sufix, InterfaceSatisfy.PROPERTY);
      } else {
        if ((s instanceof NameOperation)) {
          return ComunSatisfy.nameOperation(((NameOperation) s), InterfaceSatisfy.PREFIX, sufix, InterfaceSatisfy.PROPERTY);
        } else {
          if ((s instanceof NameType)) {
            return ComunSatisfy.nameType(((NameType) s), InterfaceSatisfy.PREFIX, sufix, InterfaceSatisfy.PROPERTY);
          } else {
            if ((s instanceof NoEmpty)) {
              return ComunSatisfy.noEmpty(((NoEmpty) s), InterfaceSatisfy.PREFIX, sufix, InterfaceSatisfy.PROPERTY);
            } else {
              if ((s instanceof isImplemented)) {
                return ((InterfaceSatisfy.PROPERTY + sufix) + "= new IsImplemented(es.uam.sara.tfg.ast.Visitors.getTypes());");
              } else {
                if ((s instanceof Contains)) {
                  return ComunSatisfy.contains(((Contains) s), InterfaceSatisfy.PREFIX, sufix, InterfaceSatisfy.PROPERTY);
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
