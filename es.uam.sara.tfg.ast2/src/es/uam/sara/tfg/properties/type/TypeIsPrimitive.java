package es.uam.sara.tfg.properties.type;

import org.eclipse.jdt.core.dom.ArrayType;
import org.eclipse.jdt.core.dom.Type;

public class TypeIsPrimitive implements TypeFunction{

	@Override
	public boolean compare(Type other) {
		if (other.toString().equals("String")) {
			return true;
		}
		if (other.isArrayType()) {
			return ((ArrayType) other).getElementType().isPrimitiveType();
		}
		return other.isPrimitiveType();
	}

	@Override
	public String getString() {
		return "isPrimitive()";
	}

	@Override
	public void setString(String s) {
		
	}

	@Override
	public void deleteString(String s) {
		
	}

	@Override
	public boolean compare(String other) {
		
		if (other.equalsIgnoreCase(TypePrimitive.Primitive.BOOLEAN.toString())){
			return true;
		}
		if (other.equalsIgnoreCase(TypePrimitive.Primitive.BYTE.toString())){
			return true;
		}
		if (other.equalsIgnoreCase(TypePrimitive.Primitive.CHAR.toString())){
			return true;
		}
		if (other.equalsIgnoreCase(TypePrimitive.Primitive.DOUBLE.toString())){
			return true;
		}
		if (other.equalsIgnoreCase(TypePrimitive.Primitive.FLOAT.toString())){
			return true;
		}
		if (other.equalsIgnoreCase(TypePrimitive.Primitive.INT.toString())){
			return true;
		}
		if (other.equalsIgnoreCase(TypePrimitive.Primitive.LONG.toString())){
			return true;
		}
		if (other.equalsIgnoreCase(TypePrimitive.Primitive.SHORT.toString())){
			return true;
		}
		if (other.equalsIgnoreCase(TypePrimitive.Primitive.STRING.toString())){
			return true;
		}
		return false;
	}

}
