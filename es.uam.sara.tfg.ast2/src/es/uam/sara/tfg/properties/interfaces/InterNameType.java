package es.uam.sara.tfg.properties.interfaces;

import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.NameCheck.Type;


public class InterNameType extends InterfaceProperty{

	private NameCheck nCheck;
	public InterNameType( Type type) {
		super();
		nCheck= new NameCheck(type);
	}

	@Override
	public String toString() {
		return "name type="+nCheck.getType();
	}

	@Override
	public boolean checkElement(ClassInterface analyze) {
		// TODO Auto-generated method stub
		return nCheck.checkNameType(analyze.getName());
	}
}
