package es.uam.sara.tfg.properties.enumerations;

import es.uam.sara.tfg.elements.Enumeration;
import es.uam.sara.tfg.properties.Size;

public class EnumSize extends EnumerationProperty {

	private Size size;
	
	public EnumSize(int min, int max) {
		size= new Size(min, max);
	}

	@Override
	public boolean checkElement(Enumeration analyze) {
		return size.checkElement(analyze.getBodyDeclarations(), analyze.getVisitor());
	}

	@Override
	public String toString() {
		return size.toString();
	}
}
