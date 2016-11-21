package es.uam.sara.tfg.properties.classes;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.properties.Empty;


public class ClassEmpty extends ClassProperty{


	public ClassEmpty() {
		super();
	}

	@Override
	public String toString() {
		
		return " empty";

	}

	@Override
	public boolean checkElement(ClassInterface analize) {
		return Empty.isEmpty(analize);
	}

}
