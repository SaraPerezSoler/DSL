package es.uam.sara.tfg.properties.type;

import java.util.List;

public class TypePrimitive implements Type{
	public enum Primitive {
		BYTE, SHORT, INT, LONG, FLOAT, DOUBLE, BOOLEAN, CHAR, STRING
		
		
	}
	private Primitive type;
	
	public TypePrimitive(Primitive type) {
		super();
		this.type = type;
	}

	@Override
	public boolean compare(org.eclipse.jdt.core.dom.Type other) {
		List<String> strings= this.getString(other);
		return strings.contains(type.toString().toLowerCase());
	}
}
