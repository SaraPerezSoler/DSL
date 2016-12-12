package es.uam.sara.tfg.properties.type;

//import java.util.ArrayList;
//import java.util.List;
//
//import org.eclipse.jdt.core.dom.ArrayType;
//import org.eclipse.jdt.core.dom.ParameterizedType;
//import org.eclipse.jdt.core.dom.Type;

public class TypeProperty{
//
//	public enum Primitive {
//		BYTE, SHORT, INT, LONG, FLOAT, DOUBLE, BOOLEAN, CHAR, STRING
//	}
//
//	public default List<String> getString(List<Type> types) {
//		List<String> ret = new ArrayList<String>();
//		if (types == null) {
//			return ret;
//		}
//		for (Type o : types) {
//			ret.addAll(getString(o));
//		}
//		return ret;
//	}
//
//	public default List<String> getString(Type type) {
//		List<String> ret = new ArrayList<String>();
//		if (type == null) {
//			return ret;
//		}
//		if (type instanceof ParameterizedType) {
//			String name = ((ParameterizedType) type).getType().toString().toLowerCase();
//			ret.add(name);
//			String nameType = ((ParameterizedType) type).toString().toLowerCase();
//			ret.add(nameType);
//		} else {
//			ret.add(type.toString().toLowerCase());
//		}
//		return ret;
//	}
//
//	public default boolean listContainElement(List<Type> types, String t) {
//		List<String> list = getString(types);
//		return list.contains(t.toLowerCase());
//	}
//
//	public default boolean equalType(Type types, String t) {
//		List<String> list = getString(types);
//		return list.contains(t.toLowerCase());
//	}
//
//	public default boolean isPrimitiveType(Type type) {
//		if (type.toString().equals("String")) {
//			return true;
//		}
//		if (type.isArrayType()) {
//			return ((ArrayType) type).getElementType().isPrimitiveType();
//		}
//		return type.isPrimitiveType();
//	}
//
//	public default boolean isPrimitiveType(Type type, Primitive equals) {
//		if (equals == Primitive.STRING) {
//			if (type.toString().equals("String")) {
//				return true;
//			}
//		} else if (type.isPrimitiveType() && type.toString().equalsIgnoreCase(equals.name())) {
//			return true;
//		} else if (type.isArrayType()) {
//			return isPrimitiveType(((ArrayType) type).getElementType(), equals);
//		}
//		return false;
//	}
//
//	public default boolean isCollectionOf(Type type) {
//		if (type.isArrayType()) {
//			return true;
//
//		} else if (type.isParameterizedType()) {
//
//		}
//		return false;
//	}
}
