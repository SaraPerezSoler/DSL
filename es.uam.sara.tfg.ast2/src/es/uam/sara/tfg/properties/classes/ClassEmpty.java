package es.uam.sara.tfg.properties.classes;

import es.uam.sara.tfg.elements.ClassInterface;


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
		return analize.isEmpty();
	}

}
