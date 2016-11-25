package es.uam.sara.tfg.properties.attributes;

import es.uam.sara.tfg.elements.type.Attribute;
import es.uam.sara.tfg.properties.TypeProperty;


public class Type extends AttributeProperty implements TypeProperty{

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
		return this.equalType(a.getType(), type);
	}

}
