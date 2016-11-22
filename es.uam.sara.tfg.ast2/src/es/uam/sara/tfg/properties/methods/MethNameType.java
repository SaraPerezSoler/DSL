package es.uam.sara.tfg.properties.methods;

import es.uam.sara.tfg.elements.Method;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.NameCheck.Type;


public class MethNameType extends MethodProperty{

	private NameCheck nCheck;
	public MethNameType(Type type) {
		super();
		nCheck= new NameCheck(type);
	}
	@Override
	public String toString() {
		return "name type="+nCheck.getType();
	}

	@Override
	public boolean checkElement(Method analyze) {
		return nCheck.checkNameType(analyze.getName());
	}
}
