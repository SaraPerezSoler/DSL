package es.uam.sara.tfg.properties.attributes;

import es.uam.sara.tfg.elements.Attribute;
import es.uam.sara.tfg.properties.NameCheck;


public class AttrNameType extends AttributeProperty{

	private NameCheck nCheck;
	
	public AttrNameType(NameCheck.Type type) {
		super();
		nCheck= new NameCheck(type);
	}

	@Override
	public String toString() {
		return "name type="+nCheck.getType();
	}

	@Override
	public boolean checkElement(Attribute analyze) {
		return nCheck.checkNameType(analyze.getName());
	}

}
