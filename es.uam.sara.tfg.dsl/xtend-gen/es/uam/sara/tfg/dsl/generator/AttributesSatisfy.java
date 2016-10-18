package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.ComunSatisfy;
import javaRule.Attribute;
import javaRule.AttributeType;
import javaRule.Initialize;
import javaRule.JavaDoc;
import javaRule.Modifiers;
import javaRule.Name;

@SuppressWarnings("all")
public class AttributesSatisfy {
  private final static String END = ");\n";
  
  private final static String PREFIX = "Attr";
  
  public static CharSequence getPropertie(final Attribute s, final String sufix) {
    String start = (("and" + sufix) + ".addPropertie (new ");
    if ((s instanceof Name)) {
      return ComunSatisfy.name(((Name) s), AttributesSatisfy.PREFIX, start, AttributesSatisfy.END);
    } else {
      if ((s instanceof JavaDoc)) {
        CharSequence _javaDoc = ComunSatisfy.javaDoc(((JavaDoc) s), AttributesSatisfy.PREFIX);
        String _plus = (start + _javaDoc);
        return (_plus + AttributesSatisfy.END);
      } else {
        if ((s instanceof Modifiers)) {
          return ComunSatisfy.modifiers(((Modifiers) s), AttributesSatisfy.PREFIX, start, AttributesSatisfy.END);
        } else {
          if ((s instanceof Initialize)) {
            return ((start + "Initialize(elements)") + AttributesSatisfy.END);
          } else {
            if ((s instanceof AttributeType)) {
              AttributeType at = ((AttributeType) s);
              String _type = at.getType();
              String _plus_1 = ((start + "Type(elements, \"") + _type);
              String _plus_2 = (_plus_1 + "\")");
              return (_plus_2 + AttributesSatisfy.END);
            }
          }
        }
      }
    }
    return null;
  }
}
