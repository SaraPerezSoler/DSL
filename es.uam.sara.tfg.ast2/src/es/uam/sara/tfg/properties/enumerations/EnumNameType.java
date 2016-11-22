package es.uam.sara.tfg.properties.enumerations;

import es.uam.sara.tfg.elements.Enumeration;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.NameCheck.Type;


public class EnumNameType extends EnumerationProperty{

	private NameCheck nCheck;

	public EnumNameType(Type type) {
		super();
		nCheck = new NameCheck(type);
	}
	
	@Override
	public String toString() {
		return "name type="+nCheck.getType();
	}

	@Override
	public boolean checkElement(Enumeration analyze) {
		return nCheck.checkNameType(analyze.getName());
	}
}
