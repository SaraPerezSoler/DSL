package es.uam.sara.tfg.properties.enumerations;

import es.uam.sara.tfg.elements.Enumeration;
import es.uam.sara.tfg.properties.ModifiersCheck;


public class EnumModifiers extends EnumerationProperty{

	private ModifiersCheck mc;
	public EnumModifiers(ModifiersCheck mc) {
		super();
		this.mc=mc;
	}


	@Override
	public String toString() {
		return mc.toString();
	}

	@Override
	public boolean checkElement(Enumeration analyze) {
		return mc.check(analyze.getModifiers());
	}

}
