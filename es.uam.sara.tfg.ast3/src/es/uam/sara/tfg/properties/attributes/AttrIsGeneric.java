
package es.uam.sara.tfg.properties.attributes;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import es.uam.sara.tfg.properties.IsGeneric;

public class AttrIsGeneric extends Attribute{

	private IsGeneric generic;
	public AttrIsGeneric() {
		generic= new IsGeneric();
	}

	@Override
	public boolean checkElement(FieldDeclaration analize) {
		// TODO Auto-generated method stub
		return generic.check(analize);
	}

	@Override
	public String toString() {
		return generic.toString();
	}

}
