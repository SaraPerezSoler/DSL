package es.uam.sara.tfg.properties.enumerations;
import org.eclipse.jdt.core.dom.EnumDeclaration;

import es.uam.sara.tfg.properties.Size;

public class EnumSize extends Enumeration {

	private Size size;
	
	public EnumSize(int min, int max) {
		size= new Size(min, max);
	}

	@Override
	public boolean checkElement(EnumDeclaration analyze) {
		return size.checkElement(analyze);
	}

	@Override
	public String toString() {
		return size.toString();
	}
}
