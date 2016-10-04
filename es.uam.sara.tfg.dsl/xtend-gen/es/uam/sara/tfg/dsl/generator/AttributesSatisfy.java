package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.ComunProperties;
import javaRule.AttributeType;
import javaRule.Initialize;
import javaRule.JavaDoc;
import javaRule.Modifiers;
import javaRule.Name;
import javaRule.Satisfy;

@SuppressWarnings("all")
public class AttributesSatisfy {
  private final static String END = ");\n";
  
  private final static String PREFIX = "Attr";
  
  public CharSequence getPropertieAttributes(final Satisfy s, final String sufix) {
    String start = (("and" + sufix) + ".addPropertie (new ");
    if ((s instanceof Name)) {
      CharSequence _name = ComunProperties.name(((Name) s), AttributesSatisfy.PREFIX);
      String _plus = (start + _name);
      return (_plus + AttributesSatisfy.END);
    } else {
      if ((s instanceof JavaDoc)) {
        CharSequence _javaDoc = ComunProperties.javaDoc(((JavaDoc) s), AttributesSatisfy.PREFIX);
        String _plus_1 = (start + _javaDoc);
        return (_plus_1 + AttributesSatisfy.END);
      } else {
        if ((s instanceof Modifiers)) {
          CharSequence _modifiers = ComunProperties.modifiers(((Modifiers) s), AttributesSatisfy.PREFIX);
          String _plus_2 = (start + _modifiers);
          return (_plus_2 + AttributesSatisfy.END);
        } else {
          if ((s instanceof Initialize)) {
            return ((start + "Initialize(elements)") + AttributesSatisfy.END);
          } else {
            if ((s instanceof AttributeType)) {
              AttributeType at = ((AttributeType) s);
              String _type = at.getType();
              String _plus_3 = ((start + "Type(elements, \"") + _type);
              String _plus_4 = (_plus_3 + "\")");
              return (_plus_4 + AttributesSatisfy.END);
            }
          }
        }
      }
    }
    return null;
  }
}
