package es.uam.sara.tfg.properties.classes;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.properties.IsGeneric;

public class ClassIsGeneric extends Class{

	private IsGeneric generic= new IsGeneric();

	@Override
	public boolean checkElement(TypeDeclaration analize) {
		return generic.check(analize);
	}

	@Override
	public String toString() {
		return generic.toString();
	}

}
