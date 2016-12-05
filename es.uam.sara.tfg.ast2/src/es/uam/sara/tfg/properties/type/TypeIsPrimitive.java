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

}
