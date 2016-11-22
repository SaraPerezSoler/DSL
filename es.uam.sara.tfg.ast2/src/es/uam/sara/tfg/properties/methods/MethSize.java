package es.uam.sara.tfg.properties.methods;

import es.uam.sara.tfg.elements.Method;
import es.uam.sara.tfg.properties.Size;

public class MethSize extends MethodProperty {

	private Size size;
	
	public MethSize(int min, int max) {
		size= new Size(min, max);
	}

	@Override
	public boolean checkElement(Method analyze) {
		return size.checkElement(analyze.getBodyDeclarations(), analyze.getVisitor());
	}

	@Override
	public String toString() {
		return size.toString();
	}
}
