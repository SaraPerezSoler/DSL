package es.uam.sara.tfg.properties.attributes;

import es.uam.sara.tfg.elements.type.MAttribute;
import es.uam.sara.tfg.properties.StringProperty;


public class AttributeType extends StringProperty<MAttribute>{

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
	public boolean checkElement(MAttribute a) {
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
