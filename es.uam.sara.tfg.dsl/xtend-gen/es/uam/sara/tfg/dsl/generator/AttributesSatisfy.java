package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.ComunSatisfy;
import javaRule.Attribute;
import javaRule.AttributeType;
import javaRule.Initialize;
import javaRule.JavaDoc;
import javaRule.Modifiers;
import javaRule.NameOperation;
import javaRule.NameType;

@SuppressWarnings("all")
public class AttributesSatisfy {
  private final static String PREFIX = "Attr";
  
  private final static String PROPERTY = "Properties<FieldDeclaration> p";
  
  public static CharSequence getPropertie(final Attribute s, final String sufix) {
    if ((s instanceof NameOperation)) {
      return ComunSatisfy.nameOperation(((NameOperation) s), AttributesSatisfy.PREFIX, sufix, AttributesSatisfy.PROPERTY);
    } else {
      if ((s instanceof NameType)) {
        return ComunSatisfy.nameType(((NameType) s), AttributesSatisfy.PREFIX, sufix, AttributesSatisfy.PROPERTY);
      } else {
        if ((s instanceof JavaDoc)) {
          return ComunSatisfy.javaDoc(((JavaDoc) s), AttributesSatisfy.PREFIX, sufix, AttributesSatisfy.PROPERTY);
        } else {
          if ((s instanceof Modifiers)) {
            return ComunSatisfy.modifiers(((Modifiers) s), AttributesSatisfy.PREFIX, sufix, AttributesSatisfy.PROPERTY);
          } else {
            if ((s instanceof Initialize)) {
              return ((AttributesSatisfy.PROPERTY + sufix) + "= new Initialize();");
            } else {
              if ((s instanceof AttributeType)) {
                AttributeType at = ((AttributeType) s);
                String _type = at.getType();
                String _plus = (((AttributesSatisfy.PROPERTY + sufix) + "= new Type(\"") + _type);
                return (_plus + "\");");
              }
            }
          }
        }
      }
    }
    return null;
  }
}
