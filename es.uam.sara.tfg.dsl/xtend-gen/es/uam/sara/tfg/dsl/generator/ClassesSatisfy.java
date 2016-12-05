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
import javaRule.Tamanio;

@SuppressWarnings("all")
public class ClassesSatisfy {
  private final static String TYPE = "Class";
  
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
              } else {
                if ((s instanceof IsSubClass)) {
                } else {
                  if ((s instanceof IsSuperClass)) {
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
