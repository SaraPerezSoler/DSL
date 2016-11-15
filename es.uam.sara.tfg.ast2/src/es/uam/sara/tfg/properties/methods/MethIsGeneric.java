package es.uam.sara.tfg.properties.methods;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import es.uam.sara.tfg.properties.IsGeneric;

public class MethIsGeneric extends Method{

	private IsGeneric generic = new IsGeneric();

	@Override
	public boolean checkElement(MethodDeclaration analyze) {
		return generic.check(analyze);
	}

	@Override
	public String toString() {
		return generic.toString();
	}
}
