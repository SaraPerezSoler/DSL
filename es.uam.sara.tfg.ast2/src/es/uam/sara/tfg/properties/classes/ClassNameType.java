package es.uam.sara.tfg.properties.classes;

import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.NameCheck.Type;

public class ClassNameType extends ClassProperty{

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
	public boolean checkElement(ClassInterface analyze) {
		return nCheck.checkNameType(analyze.getName());
	}
}
