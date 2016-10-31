package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.ComunSatisfy;
import javaRule.Contains;
import javaRule.Empty;
import javaRule.Implements;
import javaRule.IsExtended;
import javaRule.IsInheritor;
import javaRule.JavaDoc;
import javaRule.Modifiers;
import javaRule.NameOperation;
import javaRule.NameType;

@SuppressWarnings("all")
public class ClassesSatisfy {
  private final static String PREFIX = "Class";
  
  private final static String PROPERTY = "Properties<TypeDeclaration> p";
  
  public static CharSequence getPropertie(final javaRule.Class s, final String sufix) {
    if ((s instanceof JavaDoc)) {
      return ComunSatisfy.javaDoc(((JavaDoc) s), ClassesSatisfy.PREFIX, sufix, ClassesSatisfy.PROPERTY);
    } else {
      if ((s instanceof Modifiers)) {
        return ComunSatisfy.modifiers(((Modifiers) s), ClassesSatisfy.PREFIX, sufix, ClassesSatisfy.PROPERTY);
      } else {
        if ((s instanceof NameOperation)) {
          return ComunSatisfy.nameOperation(((NameOperation) s), ClassesSatisfy.PREFIX, sufix, ClassesSatisfy.PROPERTY);
        } else {
          if ((s instanceof NameType)) {
            return ComunSatisfy.nameType(((NameType) s), ClassesSatisfy.PREFIX, sufix, ClassesSatisfy.PROPERTY);
          } else {
            if ((s instanceof Empty)) {
              return ComunSatisfy.empty(((Empty) s), ClassesSatisfy.PREFIX, sufix, ClassesSatisfy.PROPERTY);
            } else {
              if ((s instanceof Implements)) {
                Implements imp = ((Implements) s);
                int _minInterface = imp.getMinInterface();
                String _plus = (((ClassesSatisfy.PROPERTY + sufix) + "= new Implements(") + Integer.valueOf(_minInterface));
                String _plus_1 = (_plus + ", ");
                int _maxInterface = imp.getMaxInterface();
                String _plus_2 = (_plus_1 + Integer.valueOf(_maxInterface));
                return (_plus_2 + ");");
              } else {
                if ((s instanceof IsExtended)) {
                  return ((ClassesSatisfy.PROPERTY + sufix) + "= new isExtended(Visitors.getClasses());");
                } else {
                  if ((s instanceof IsInheritor)) {
                    return ((ClassesSatisfy.PROPERTY + sufix) + "= new IsInheritor();");
                  } else {
                    if ((s instanceof Contains)) {
                      return ComunSatisfy.contains(((Contains) s), ClassesSatisfy.PREFIX, sufix, ClassesSatisfy.PROPERTY);
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
