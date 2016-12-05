package es.uam.sara.tfg.properties.attributes;

import es.uam.sara.tfg.elements.type.Attribute;
import es.uam.sara.tfg.properties.StringProperty;


public class AttributeType extends StringProperty<Attribute>{

	private es.uam.sara.tfg.properties.type.Type type;

	public AttributeType(boolean no,es.uam.sara.tfg.properties.type.Type type) {
		
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
		org.eclipse.jdt.core.dom.Type returnType = a.getType();
		if (type.compare(returnType)) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public void setString(String string, int i) {
		type.setString(string);	
	}
	@Override
	public void deleteString(String string, int i) {
		type.deleteString(string);
	}

}
