package es.uam.sara.tfg.properties.enumconstant;

import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.NameCheck.Type;


public class EnumConstNameType extends EnumConstant{

	private NameCheck nCheck;

	public EnumConstNameType(Type type) {
		super();
		nCheck = new NameCheck(type);
	}
	
	@Override
	public String toString() {
		return "name type="+nCheck.getType();
	}

	@Override
	public boolean checkElement(EnumConstantDeclaration analyze) {
		return nCheck.checkNameType(analyze);
	}
}
