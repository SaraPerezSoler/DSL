package es.uam.sara.tfg.properties.classes;

import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.NameCheck.Type;

public class ClassNameType extends Class{

	NameCheck nCheck;

	public ClassNameType( Type type) {
		super();
		nCheck = new NameCheck(type);
	}

	@Override
	public String toString() {
		return "name type="+nCheck.getType();
	}

	@Override
	public boolean checkElement(TypeDeclaration analyze) {
		return nCheck.checkNameType(analyze);
	}
}
