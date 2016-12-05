package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.ComunSatisfy;
import javaRule.Contains;
import javaRule.Empty;
import javaRule.Extends;
import javaRule.Interface;
import javaRule.IsGeneric;
import javaRule.IsSuperInterface;
import javaRule.JavaDoc;
import javaRule.Modifiers;
import javaRule.NameOperation;
import javaRule.NameType;
import javaRule.Tamanio;
import javaRule.isImplemented;

@SuppressWarnings("all")
public class InterfaceSatisfy {
  private final static String TYPE = "Interface";
  
  public static CharSequence getPropertie(final Interface s, final String sufix) {
    Object _xifexpression = null;
    if ((s instanceof JavaDoc)) {
      return ComunSatisfy.javaDoc(((JavaDoc) s), InterfaceSatisfy.TYPE, sufix);
    } else {
      Object _xifexpression_1 = null;
      if ((s instanceof Modifiers)) {
        return ComunSatisfy.modifiers(((Modifiers) s), InterfaceSatisfy.TYPE, sufix);
      } else {
        Object _xifexpression_2 = null;
        if ((s instanceof NameOperation)) {
          return ComunSatisfy.nameOperation(((NameOperation) s), InterfaceSatisfy.TYPE, sufix);
        } else {
          Object _xifexpression_3 = null;
          if ((s instanceof NameType)) {
            return ComunSatisfy.nameType(((NameType) s), InterfaceSatisfy.TYPE, sufix);
          } else {
            Object _xifexpression_4 = null;
            if ((s instanceof Empty)) {
              return ComunSatisfy.empty(((Empty) s), InterfaceSatisfy.TYPE, sufix);
            } else {
              Object _xifexpression_5 = null;
              if ((s instanceof isImplemented)) {
                return (((("Properties<" + InterfaceSatisfy.TYPE) + "> p") + sufix) + "= new IsImplemented(es.uam.sara.tfg.ast.Visitors.getTypes());");
              } else {
                Object _xifexpression_6 = null;
                if ((s instanceof IsSuperInterface)) {
                  _xifexpression_6 = null;
                } else {
                  Object _xifexpression_7 = null;
                  if ((s instanceof Extends)) {
                    _xifexpression_7 = null;
                  } else {
                    Object _xifexpression_8 = null;
                    if ((s instanceof IsGeneric)) {
                      _xifexpression_8 = null;
                    } else {
                      Object _xifexpression_9 = null;
                      if ((s instanceof Tamanio)) {
                        _xifexpression_9 = null;
                      } else {
                        if ((s instanceof Contains)) {
                          return ComunSatisfy.contains(((Contains) s), InterfaceSatisfy.TYPE, sufix);
                        }
                      }
                      _xifexpression_8 = _xifexpression_9;
                    }
                    _xifexpression_7 = _xifexpression_8;
                  }
                  _xifexpression_6 = _xifexpression_7;
                }
                _xifexpression_5 = _xifexpression_6;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return ((CharSequence)_xifexpression);
  }
}
