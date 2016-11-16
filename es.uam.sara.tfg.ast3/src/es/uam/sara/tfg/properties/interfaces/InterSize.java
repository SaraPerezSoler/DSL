package es.uam.sara.tfg.properties.interfaces;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.properties.Size;

public class InterSize extends Interface {

	private Size size;
	
	public InterSize(int min, int max) {
		size= new Size(min, max);
	}

	@Override
	public boolean checkElement(TypeDeclaration analyze) {
		return size.checkElement(analyze);
	}

	@Override
	public String toString() {
		return size.toString();
	}
}
