package es.uam.sara.tfg.properties.enumerations;

import org.eclipse.jdt.core.dom.EnumDeclaration;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.NameCheck.Type;


public class EnumNameType extends Enumeration{

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
	public boolean checkElement(EnumDeclaration analyze) {
		return nCheck.checkNameType(analyze);
	}
}
