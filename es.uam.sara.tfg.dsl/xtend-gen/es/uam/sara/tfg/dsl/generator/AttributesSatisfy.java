package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.ComunSatisfy;
import javaRule.Attribute;
import javaRule.AttributeType;
import javaRule.Initialize;
import javaRule.IsGeneric;
import javaRule.JavaDoc;
import javaRule.Modifiers;
import javaRule.NameOperation;
import javaRule.NameType;
import javaRule.StringProperty;
import javaRule.TypeProperty;

@SuppressWarnings("all")
public class AttributesSatisfy {
  private final static String TYPE = "MAttribute";
  
  public static CharSequence getPropertie(final Attribute s, final String sufix) {
    if ((s instanceof NameOperation)) {
      return ComunSatisfy.nameOperation(((NameOperation) s), AttributesSatisfy.TYPE, sufix);
    } else {
      if ((s instanceof NameType)) {
        return ComunSatisfy.nameType(((NameType) s), AttributesSatisfy.TYPE, sufix);
      } else {
        if ((s instanceof JavaDoc)) {
          return ComunSatisfy.javaDoc(((JavaDoc) s), AttributesSatisfy.TYPE, sufix);
        } else {
          if ((s instanceof Modifiers)) {
            return ComunSatisfy.modifiers(((Modifiers) s), AttributesSatisfy.TYPE, sufix);
          } else {
            if ((s instanceof Initialize)) {
              boolean _isNo = ((Initialize)s).isNo();
              String _plus = ((((("Property<" + AttributesSatisfy.TYPE) + "> p") + sufix) + "= new Initialize(") + Boolean.valueOf(_isNo));
              return (_plus + ");\n");
            } else {
              if ((s instanceof AttributeType)) {
                AttributeType a = ((AttributeType) s);
                TypeProperty _type = a.getType();
                String cad = ComunSatisfy.getType(_type, sufix);
                TypeProperty _type_1 = a.getType();
                if ((_type_1 instanceof StringProperty)) {
                  TypeProperty _type_2 = a.getType();
                  StringProperty spa = ((StringProperty) _type_2);
                  String _cad = cad;
                  String _propertyStringVariable = ComunSatisfy.propertyStringVariable(spa, sufix);
                  cad = (_cad + _propertyStringVariable);
                  String _cad_1 = cad;
                  boolean _isNo_1 = a.isNo();
                  String _plus_1 = ((((((("Property<" + AttributesSatisfy.TYPE) + "> p") + sufix) + "= new PropertyStringVariable<") + AttributesSatisfy.TYPE) + ",AttributeType>(") + Boolean.valueOf(_isNo_1));
                  String _plus_2 = (_plus_1 + ",listV");
                  String _plus_3 = (_plus_2 + sufix);
                  String _plus_4 = (_plus_3 + 
                    ", listT");
                  String _plus_5 = (_plus_4 + sufix);
                  String _plus_6 = (_plus_5 + ", new AttributeType(");
                  boolean _isNo_2 = a.isNo();
                  String _plus_7 = (_plus_6 + Boolean.valueOf(_isNo_2));
                  String _plus_8 = (_plus_7 + ",type");
                  String _plus_9 = (_plus_8 + sufix);
                  String _plus_10 = (_plus_9 + "));");
                  cad = (_cad_1 + _plus_10);
                  return cad;
                }
                String _cad_2 = cad;
                boolean _isNo_3 = a.isNo();
                String _plus_11 = ((((("Property<" + AttributesSatisfy.TYPE) + "> p") + sufix) + "=new AttributeType(") + Boolean.valueOf(_isNo_3));
                String _plus_12 = (_plus_11 + ",type");
                String _plus_13 = (_plus_12 + sufix);
                String _plus_14 = (_plus_13 + ");\n");
                cad = (_cad_2 + _plus_14);
                return cad;
              } else {
                if ((s instanceof IsGeneric)) {
                  return ComunSatisfy.isGeneric(((IsGeneric) s), AttributesSatisfy.TYPE, sufix);
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
