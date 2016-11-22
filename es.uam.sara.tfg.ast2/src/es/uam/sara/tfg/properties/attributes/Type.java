package es.uam.sara.tfg.properties.attributes;

import es.uam.sara.tfg.elements.Attribute;


public class Type extends AttributeProperty{

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
