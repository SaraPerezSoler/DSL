package es.uam.sara.tfg.properties.methods;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.NameCheck.Type;


public class MethNameType extends Method{

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
	public boolean checkElement(MethodDeclaration analyze) {
		return nCheck.checkNameType(analyze);
	}
}
