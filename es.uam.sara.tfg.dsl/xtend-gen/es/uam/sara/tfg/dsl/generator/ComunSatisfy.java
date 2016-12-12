package es.uam.sara.tfg.dsl.generator;

import com.google.common.base.Objects;
import es.uam.sara.tfg.dsl.generator.JRulesGenerator;
import javaRule.AccessModifier;
import javaRule.BlendModifiers;
import javaRule.Contains;
import javaRule.Element;
import javaRule.ElementString;
import javaRule.Empty;
import javaRule.IsCollectionType;
import javaRule.IsGeneric;
import javaRule.IsPrimitiveFuntion;
import javaRule.JavaDoc;
import javaRule.Language;
import javaRule.Modifiers;
import javaRule.NameCheck;
import javaRule.NameOperation;
import javaRule.NameOperator;
import javaRule.NameType;
import javaRule.Primitive;
import javaRule.Rule;
import javaRule.StringProperty;
import javaRule.StringValue;
import javaRule.StringVariable;
import javaRule.Tamanio;
import javaRule.TypePrimitive;
import javaRule.TypeProperty;
import javaRule.Variable;
import javaRule.VariableSubtype;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class ComunSatisfy {
  public static CharSequence nameOperation(final NameOperation n, final String type, final String sufix) {
    StringProperty _name = n.getName();
    String cad = ComunSatisfy.propertyStringVariable(_name, sufix);
    String _cad = cad;
    boolean _isNo = n.isNo();
    String _plus = ((((((((("Property<" + type) + "> p") + sufix) + "= new PropertyStringVariable<") + type) + ",NameOperation<") + type) + ">>(") + Boolean.valueOf(_isNo));
    String _plus_1 = (_plus + ",listV");
    String _plus_2 = (_plus_1 + sufix);
    String _plus_3 = (_plus_2 + 
      ", listT");
    String _plus_4 = (_plus_3 + sufix);
    String _plus_5 = (_plus_4 + ", new NameOperation<");
    String _plus_6 = (_plus_5 + type);
    String _plus_7 = (_plus_6 + ">(");
    boolean _isNo_1 = n.isNo();
    String _plus_8 = (_plus_7 + Boolean.valueOf(_isNo_1));
    String _plus_9 = (_plus_8 + ",NameOperation.Operation.");
    NameOperator _operator = n.getOperator();
    String _plus_10 = (_plus_9 + _operator);
    String _plus_11 = (_plus_10 + ", NameOperation.");
    Language _language = n.getLanguage();
    String _plus_12 = (_plus_11 + _language);
    String _plus_13 = (_plus_12 + "));");
    cad = (_cad + _plus_13);
    return cad;
  }
  
  public static CharSequence nameType(final NameType n, final String type, final String sufix) {
    NameCheck _type = n.getType();
    String _plus = ((((((("Property<" + type) + "> p") + sufix) + "= new NameType<") + type) + ">(NameType.Type.") + _type);
    return (_plus + ");\n");
  }
  
  public static CharSequence javaDoc(final JavaDoc jd, final String type, final String sufix) {
    boolean _isNo = jd.isNo();
    String _plus = ((((((("Property<" + type) + "> p") + sufix) + "= new JavaDoc <") + type) + "> (") + Boolean.valueOf(_isNo));
    boolean _isAuthor = jd.isAuthor();
    String _plus_1 = (_plus + Boolean.valueOf(_isAuthor));
    String _plus_2 = (_plus_1 + ",");
    boolean _isParameter = jd.isParameter();
    String _plus_3 = (_plus_2 + Boolean.valueOf(_isParameter));
    String _plus_4 = (_plus_3 + ",");
    boolean _isReturn = jd.isReturn();
    String _plus_5 = (_plus_4 + Boolean.valueOf(_isReturn));
    String _plus_6 = (_plus_5 + 
      ",");
    boolean _isVersion = jd.isVersion();
    String _plus_7 = (_plus_6 + Boolean.valueOf(_isVersion));
    String _plus_8 = (_plus_7 + ",");
    boolean _isThrows = jd.isThrows();
    String _plus_9 = (_plus_8 + Boolean.valueOf(_isThrows));
    String _plus_10 = (_plus_9 + ",");
    boolean _isSee = jd.isSee();
    String _plus_11 = (_plus_10 + Boolean.valueOf(_isSee));
    return (_plus_11 + ");\n");
  }
  
  public static CharSequence modifiers(final Modifiers m, final String type, final String sufix) {
    boolean _isNo = m.isNo();
    String _plus = ((((((("Property<" + type) + "> p") + sufix) + "= new Modifiers<") + type) + "> (") + Boolean.valueOf(_isNo));
    String cadena = (_plus + ")\n");
    EList<BlendModifiers> _blend = m.getBlend();
    for (final BlendModifiers b : _blend) {
      String _cadena = cadena;
      AccessModifier _access = b.getAccess();
      String _string = _access.toString();
      String _upperCase = _string.toUpperCase();
      String _plus_1 = (".addBlend(BlendModifiers.Acceso." + _upperCase);
      String _plus_2 = (_plus_1 + ",");
      boolean _isStatic = b.isStatic();
      String _plus_3 = (_plus_2 + Boolean.valueOf(_isStatic));
      String _plus_4 = (_plus_3 + ",");
      boolean _isFinal = b.isFinal();
      String _plus_5 = (_plus_4 + Boolean.valueOf(_isFinal));
      String _plus_6 = (_plus_5 + ",");
      boolean _isAbstract = b.isAbstract();
      String _plus_7 = (_plus_6 + Boolean.valueOf(_isAbstract));
      String _plus_8 = (_plus_7 + ",");
      boolean _isDefault = b.isDefault();
      String _plus_9 = (_plus_8 + Boolean.valueOf(_isDefault));
      String _plus_10 = (_plus_9 + ",");
      boolean _isSynchronized = b.isSynchronized();
      String _plus_11 = (_plus_10 + Boolean.valueOf(_isSynchronized));
      String _plus_12 = (_plus_11 + ")\n");
      cadena = (_cadena + _plus_12);
    }
    String _cadena_1 = cadena;
    cadena = (_cadena_1 + ";\n");
    return cadena;
  }
  
  public static CharSequence empty(final Empty ne, final String type, final String sufix) {
    boolean _isNo = ne.isNo();
    String _plus = ((((((("Property<" + type) + "> p") + sufix) + "= new Empty<") + type) + "> (") + Boolean.valueOf(_isNo));
    return (_plus + ");\n");
  }
  
  public static CharSequence contains(final Contains c, final String type, final String sufix) {
    Rule _rule = c.getRule();
    String cadena = JRulesGenerator.genetateRule(_rule, sufix);
    String _cadena = cadena;
    Rule _rule_1 = c.getRule();
    Element _element = _rule_1.getElement();
    String _type = JRulesGenerator.getType(_element);
    String _plus = ((((("Property<" + type) + "> p") + sufix) + "= new Contain") + _type);
    String _plus_1 = (_plus + "<");
    String _plus_2 = (_plus_1 + type);
    String _plus_3 = (_plus_2 + ">");
    String _plus_4 = (_plus_3 + "(r");
    String _plus_5 = (_plus_4 + sufix);
    String _plus_6 = (_plus_5 + ");\n");
    cadena = (_cadena + _plus_6);
    return cadena;
  }
  
  public static CharSequence isGeneric(final IsGeneric g, final String type, final String sufix) {
    boolean _isNo = g.isNo();
    String _plus = ((((((("Property<" + type) + "> p") + sufix) + "= new IsGeneric<") + type) + ">(") + Boolean.valueOf(_isNo));
    return (_plus + ");\n");
  }
  
  public static CharSequence size(final Tamanio t, final String type, final String sufix) {
    int min = t.getMin();
    int max = t.getMax();
    int _exact = t.getExact();
    boolean _notEquals = (_exact != (-2147483647));
    if (_notEquals) {
      int _exact_1 = t.getExact();
      min = _exact_1;
      int _exact_2 = t.getExact();
      max = _exact_2;
    }
    return (((((((((("Property<" + type) + "> p") + sufix) + "= new Size<") + type) + ">(") + Integer.valueOf(min)) + ",") + Integer.valueOf(max)) + ");\n");
  }
  
  public static String propertyStringVariable(final StringProperty property, final String string) {
    String _declaraVariable = ComunSatisfy.declaraVariable(string);
    String _añadeVariable = ComunSatisfy.añadeVariable(property, string);
    return (_declaraVariable + _añadeVariable);
  }
  
  public static String declaraVariable(final String sufix) {
    String cad = ((((("List<String> listV" + sufix) + "= new ArrayList<String>();\n") + "List<StringType> listT") + sufix) + "= new ArrayList<StringType>();\n");
    return cad;
  }
  
  public static String añadeVariable(final StringProperty stp, final String sufix) {
    String cad = "";
    if ((stp instanceof StringVariable)) {
      StringVariable stv = ((StringVariable) stp);
      String varName = "";
      VariableSubtype _variable = stv.getVariable();
      Element _subtype = _variable.getSubtype();
      boolean _equals = Objects.equal(_subtype, Element.NULL);
      if (_equals) {
        VariableSubtype _variable_1 = stv.getVariable();
        Variable _variable_2 = _variable_1.getVariable();
        String _name = _variable_2.getName();
        varName = _name;
      } else {
        VariableSubtype _variable_3 = stv.getVariable();
        Variable _variable_4 = _variable_3.getVariable();
        String _name_1 = _variable_4.getName();
        VariableSubtype _variable_5 = stv.getVariable();
        Element _subtype_1 = _variable_5.getSubtype();
        String _type = JRulesGenerator.getType(_subtype_1);
        String _plus = (_name_1 + _type);
        varName = _plus;
      }
      cad = (((("listV" + sufix) + ".add(\"") + varName) + "\");\n");
      String _cad = cad;
      ElementString _strings = stv.getStrings();
      String _string = _strings.toString();
      String _upperCase = _string.toUpperCase();
      String _plus_1 = (((" listT" + sufix) + ".add(StringType.") + _upperCase);
      String _plus_2 = (_plus_1 + ");\n");
      cad = (_cad + _plus_2);
    }
    return cad;
  }
  
  public static String getType(final TypeProperty tp, final String sufix) {
    String cad = "";
    boolean _equals = Objects.equal(tp, null);
    if (_equals) {
      cad = (("TypeString type" + sufix) + "=null;\n");
    }
    if ((tp instanceof StringProperty)) {
      if ((tp instanceof StringVariable)) {
        cad = (("TypeString type" + sufix) + "= new TypeString();\n");
      } else {
        String _value = ((StringValue) tp).getValue();
        String _plus = ((("TypeString type" + sufix) + "= new TypeString(\"") + _value);
        String _plus_1 = (_plus + "\");\n");
        cad = _plus_1;
      }
    } else {
      if ((tp instanceof TypePrimitive)) {
        TypePrimitive tpr = ((TypePrimitive) tp);
        Primitive _typePrimitive = tpr.getTypePrimitive();
        String _plus_2 = ((("TypePrimitive type" + sufix) + "= new TypePrimitive(TypePrimitive.Primitive.") + _typePrimitive);
        String _plus_3 = (_plus_2 + ");\n");
        cad = _plus_3;
      } else {
        if ((tp instanceof IsCollectionType)) {
          IsCollectionType ict = ((IsCollectionType) tp);
          TypeProperty _of = ict.getOf();
          boolean _notEquals = (!Objects.equal(_of, null));
          if (_notEquals) {
            TypeProperty _of_1 = ict.getOf();
            String _type = ComunSatisfy.getType(_of_1, (sufix + "1"));
            cad = _type;
            String _cad = cad;
            cad = (_cad + (((("TypeIsCollection type" + sufix) + "= new TypeIsCollection(type") + sufix) + "1);\n"));
          } else {
            String _cad_1 = cad;
            cad = (_cad_1 + (("TypeIsCollection type" + sufix) + "= new TypeIsCollection();\n"));
          }
        } else {
          if ((tp instanceof IsPrimitiveFuntion)) {
            cad = (("TypeIsPrimitive type" + sufix) + "= new TypeIsPrimitive();\n");
          }
        }
      }
    }
    return cad;
  }
}
