package es.uam.sara.tfg.properties.interfaces;

import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.properties.IsGeneric;

public class InterIsGeneric extends Interface{

	private IsGeneric generic= new IsGeneric();
	
	@Override
	public boolean checkElement(TypeDeclaration analyze) {
		return generic.check(analyze);
	}
	@Override
	public String toString() {
		return generic.toString();
	}

}
