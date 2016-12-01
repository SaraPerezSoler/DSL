package es.uam.sara.tfg.properties.attributes;

import es.uam.sara.tfg.elements.type.Attribute;
import es.uam.sara.tfg.properties.type.TypeProperty;


public class Type extends AttributeProperty implements TypeProperty{

	private String type;

	public Type(boolean no,String type) {
		
		super(no);
		this.type = type;
	}
	@Override
	public String toString() {
		if (no){
			return "type <>" + type ;
		}
		return "type =" + type ;
	}

	@Override
	public boolean checkElement(Attribute a) {
		return this.equalType(a.getType(), type);
	}

}
