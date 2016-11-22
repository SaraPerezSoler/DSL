package es.uam.sara.tfg.properties.attributes;

import es.uam.sara.tfg.elements.Attribute;
import es.uam.sara.tfg.properties.IsGeneric;

public class AttrIsGeneric extends AttributeProperty{

	private IsGeneric generic;
	public AttrIsGeneric() {
		generic= new IsGeneric();
	}

	@Override
	public boolean checkElement(Attribute analize) {
		// TODO Auto-generated method stub
		return generic.check(analize.getBodyDeclarations());
	}

	@Override
	public String toString() {
		return generic.toString();
	}

}
