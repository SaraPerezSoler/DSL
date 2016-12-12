package es.uam.sara.tfg.dsl.generator;

import es.uam.sara.tfg.dsl.generator.ComunSatisfy;
import javaRule.Contains;
import javaRule.Empty;
import javaRule.File;
import javaRule.NameOperation;
import javaRule.NameType;
import javaRule.Tamanio;

@SuppressWarnings("all")
public class FileSatisfy {
  private final static String TYPE = "MFile";
  
  public static CharSequence getPropertie(final File s, final String sufix) {
    if ((s instanceof NameOperation)) {
      return ComunSatisfy.nameOperation(((NameOperation) s), FileSatisfy.TYPE, sufix);
    } else {
      if ((s instanceof NameType)) {
        return ComunSatisfy.nameType(((NameType) s), FileSatisfy.TYPE, sufix);
      } else {
        if ((s instanceof Empty)) {
          return ComunSatisfy.empty(((Empty) s), FileSatisfy.TYPE, sufix);
        } else {
          if ((s instanceof Contains)) {
            return ComunSatisfy.contains(((Contains) s), FileSatisfy.TYPE, sufix);
          } else {
            if ((s instanceof Tamanio)) {
              return ComunSatisfy.size(((Tamanio) s), FileSatisfy.TYPE, sufix);
            }
          }
        }
      }
    }
    return null;
  }
}
