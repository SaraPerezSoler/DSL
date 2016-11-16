package es.uam.sara.tfg.properties.methods;
import org.eclipse.jdt.core.dom.MethodDeclaration;

import es.uam.sara.tfg.properties.Size;

public class MethSize extends Method {

	private Size size;
	
	public MethSize(int min, int max) {
		size= new Size(min, max);
	}

	@Override
	public boolean checkElement(MethodDeclaration analyze) {
		return size.checkElement(analyze);
	}

	@Override
	public String toString() {
		return size.toString();
	}
}
