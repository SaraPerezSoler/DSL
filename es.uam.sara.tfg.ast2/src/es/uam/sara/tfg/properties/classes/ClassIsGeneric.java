package es.uam.sara.tfg.properties.classes;

import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.properties.IsGeneric;

public class ClassIsGeneric extends ClassProperty{

	private IsGeneric generic= new IsGeneric();

	@Override
	public boolean checkElement(ClassInterface analize) {
		return generic.check(analize.getBodyDeclarations());
	}

	@Override
	public String toString() {
		return generic.toString();
	}

}
