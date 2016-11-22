package es.uam.sara.tfg.properties.interfaces;

import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.properties.Size;

public class InterSize extends InterfaceProperty {

	private Size size;
	
	public InterSize(int min, int max) {
		size= new Size(min, max);
	}

	@Override
	public boolean checkElement(ClassInterface analyze) {
		return size.checkElement(analyze.getBodyDeclarations(), analyze.getVisitor());
	}

	@Override
	public String toString() {
		return size.toString();
	}
}
