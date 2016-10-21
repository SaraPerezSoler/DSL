package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.ComunSatisfy;
import javaRule.Implements;
import javaRule.IsExtended;
import javaRule.IsInheritor;
import javaRule.JavaDoc;
import javaRule.Modifiers;
import javaRule.Name;
import javaRule.NoEmpty;

@SuppressWarnings("all")
public class ClassesSatisfy {
  private final static String END = ");\n";
  
  private final static String PREFIX = "Class";
  
  public static CharSequence getPropertie(final javaRule.Class s, final String sufix) {
    String start = (("and" + sufix) + ".addPropertie (new ");
    if ((s instanceof JavaDoc)) {
      CharSequence _javaDoc = ComunSatisfy.javaDoc(((JavaDoc) s), ClassesSatisfy.PREFIX);
      String _plus = (start + _javaDoc);
      return (_plus + ClassesSatisfy.END);
    } else {
      if ((s instanceof Modifiers)) {
        return ComunSatisfy.modifiers(((Modifiers) s), ClassesSatisfy.PREFIX, start, ClassesSatisfy.END);
      } else {
        if ((s instanceof Name)) {
          return ComunSatisfy.name(((Name) s), ClassesSatisfy.PREFIX, start, ClassesSatisfy.END);
        } else {
          if ((s instanceof NoEmpty)) {
            CharSequence _noEmpty = ComunSatisfy.noEmpty(((NoEmpty) s), ClassesSatisfy.PREFIX);
            String _plus_1 = (start + _noEmpty);
            return (_plus_1 + ClassesSatisfy.END);
          } else {
            if ((s instanceof Implements)) {
              Implements imp = ((Implements) s);
              int _minInterface = imp.getMinInterface();
              String _plus_2 = ((start + "Implements(") + Integer.valueOf(_minInterface));
              String _plus_3 = (_plus_2 + ", ");
              int _maxInterface = imp.getMaxInterface();
              String _plus_4 = (_plus_3 + Integer.valueOf(_maxInterface));
              String _plus_5 = (_plus_4 + ")");
              return (_plus_5 + ClassesSatisfy.END);
            } else {
              if ((s instanceof IsExtended)) {
                return ((start + "isExtended(Visitors.getClasses())") + ClassesSatisfy.END);
              } else {
                if ((s instanceof IsInheritor)) {
                  return ((start + "IsInheritor()") + ClassesSatisfy.END);
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
