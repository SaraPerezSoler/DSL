package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.ComunSatisfy;
import javaRule.Contains;
import javaRule.Empty;
import javaRule.Enumeration;
import javaRule.Implements;
import javaRule.JavaDoc;
import javaRule.Modifiers;
import javaRule.NameOperation;
import javaRule.NameType;
import javaRule.Tamanio;

@SuppressWarnings("all")
public class EnumSatisfy {
  private final static String TYPE = "Enumeration";
  
  public static CharSequence getPropertie(final Enumeration s, final String sufix) {
    Object _xifexpression = null;
    if ((s instanceof JavaDoc)) {
      return ComunSatisfy.javaDoc(((JavaDoc) s), EnumSatisfy.TYPE, sufix);
    } else {
      Object _xifexpression_1 = null;
      if ((s instanceof Modifiers)) {
        return ComunSatisfy.modifiers(((Modifiers) s), EnumSatisfy.TYPE, sufix);
      } else {
        Object _xifexpression_2 = null;
        if ((s instanceof NameOperation)) {
          return ComunSatisfy.nameOperation(((NameOperation) s), EnumSatisfy.TYPE, sufix);
        } else {
          Object _xifexpression_3 = null;
          if ((s instanceof NameType)) {
            return ComunSatisfy.nameType(((NameType) s), EnumSatisfy.TYPE, sufix);
          } else {
            Object _xifexpression_4 = null;
            if ((s instanceof Empty)) {
              return ComunSatisfy.empty(((Empty) s), EnumSatisfy.TYPE, sufix);
            } else {
              Object _xifexpression_5 = null;
              if ((s instanceof Contains)) {
                return ComunSatisfy.contains(((Contains) s), EnumSatisfy.TYPE, sufix);
              } else {
                Object _xifexpression_6 = null;
                if ((s instanceof Tamanio)) {
                  _xifexpression_6 = null;
                } else {
                  Object _xifexpression_7 = null;
                  if ((s instanceof Implements)) {
                    _xifexpression_7 = null;
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
