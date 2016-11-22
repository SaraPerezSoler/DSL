package es.uam.sara.tfg.properties.methods;

import es.uam.sara.tfg.elements.Method;
import es.uam.sara.tfg.properties.IsGeneric;

public class MethIsGeneric extends MethodProperty{

	private IsGeneric generic = new IsGeneric();

	@Override
	public boolean checkElement(Method analyze) {
		return generic.check(analyze.getBodyDeclarations());
	}

	@Override
	public String toString() {
		return generic.toString();
	}
}
