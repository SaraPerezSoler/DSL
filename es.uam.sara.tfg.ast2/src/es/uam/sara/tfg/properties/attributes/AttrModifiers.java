package es.uam.sara.tfg.properties.attributes;

import es.uam.sara.tfg.elements.Attribute;
import es.uam.sara.tfg.properties.ModifiersCheck;


public class AttrModifiers extends AttributeProperty{

	private ModifiersCheck mc;

	public AttrModifiers(ModifiersCheck mc) {
		super();
		this.mc = mc;
	}

	@Override
	public String toString() {
		return  mc.toString();
	}

	@Override
	public boolean checkElement(Attribute analize) {
		return mc.check(analize.getModifiers());
	}

}
