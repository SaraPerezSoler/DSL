package es.uam.sara.tfg.properties.classes;

import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.properties.Size;

public class ClassSize extends ClassProperty {

	private Size size;
	
	public ClassSize(int min, int max) {
		size= new Size(min, max);
	}

	@Override
	public boolean checkElement(ClassInterface analyze) {
		return size.checkElement(analyze.getBodyDeclarations(),analyze.getVisitor());
	}

	@Override
	public String toString() {
		return size.toString();
	}
}
