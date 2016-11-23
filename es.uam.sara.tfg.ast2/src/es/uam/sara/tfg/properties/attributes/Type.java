package es.uam.sara.tfg.properties.attributes;

import es.uam.sara.tfg.elements.Attribute;
import es.uam.sara.tfg.properties.StringProperty;


public class Type extends AttributeProperty implements StringProperty{

	private String type;

	public Type(String type) {
		
		super();
		this.type = type;
	}
	@Override
	public String toString() {
		return "type=" + type ;
	}

	@Override
	public boolean checkElement(Attribute a) {
		String types=a.getType();
		return types.equalsIgnoreCase(type);
	}

}
