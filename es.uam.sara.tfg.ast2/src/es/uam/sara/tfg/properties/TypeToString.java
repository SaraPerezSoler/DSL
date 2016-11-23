package es.uam.sara.tfg.properties;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ArrayType;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;

public class TypeToString {

	public enum Primitive {
		BYTE, SHORT, INT, LONG, FLOAT, DOUBLE, BOOLEAN, CHAR, STRING
	}
	
	public static List<String> getString(List<?> types) {
		List<String> ret = new ArrayList<String>();
		if (types == null) {
			return ret;
		}
		for (Object o : types) {
			if (o instanceof Type) {
				ret.addAll(getString((Type) o));
			} else if (o instanceof SingleVariableDeclaration) {
				ret.addAll(getString(((SingleVariableDeclaration) o).getType()));
			}
		}
		return ret;
	}

	public static List<String> getString(Type type) {
		List<String> ret = new ArrayList<String>();
		if (type == null) {
			return ret;
		}
		if (type instanceof ParameterizedType) {
			String name = ((ParameterizedType) type).getType().toString().toLowerCase();
			ret.add(name);
			String nameType = ((ParameterizedType) type).toString().toLowerCase();
			ret.add(nameType);
		} else {
			ret.add(type.toString().toLowerCase());
		}
		return ret;
	}

	public static boolean isPrimitiveType(Type type) {
		if (type.toString().equals("String")) {
			return true;
		}
		if(type.isArrayType()){
			return ((ArrayType) type).getElementType().isPrimitiveType();
		}
		return type.isPrimitiveType();
	}

	public static boolean isPrimitiveType(Type type, Primitive equals) {
		if (equals == Primitive.STRING) {
			if (type.toString().equals("String")) {
				return true;
			}
		} else if (type.isPrimitiveType() && type.toString().equalsIgnoreCase(equals.name())) {
			return true;
		}else if(type.isArrayType()){
			return isPrimitiveType(((ArrayType) type).getElementType(), equals);
		}
		return false;
	}
	public static boolean isCollectionOf(Type type) {
		if (type.isArrayType()){
			return true;
				
		}else if (type.isParameterizedType()){
			
		}
		return false;
	}
}
