package es.uam.sara.tfg.properties.interfaces;

import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.properties.IsGeneric;

public class InterIsGeneric extends InterfaceProperty{

	private IsGeneric generic= new IsGeneric();
	
	@Override
	public boolean checkElement(ClassInterface analyze) {
		return generic.check(analyze.getBodyDeclarations());
	}
	@Override
	public String toString() {
		return generic.toString();
	}

}
