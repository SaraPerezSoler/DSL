package es.uam.sara.tfg.properties.classes;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.properties.Empty;


public class ClassEmpty extends Class{


	public ClassEmpty() {
		super();
	}

	@Override
	public String toString() {
		
		return " empty";

	}

	@Override
	public boolean checkElement(TypeDeclaration analize) {
		return Empty.isEmpty(analize);
	}

}
