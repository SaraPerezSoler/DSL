package es.uam.sara.tfg.properties.interfaces;

import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.properties.ModifiersCheck;


public class InterModifiers extends InterfaceProperty{

	private ModifiersCheck mc;

	public InterModifiers( ModifiersCheck mc) {
		super();
		this.mc = mc;
	}	
	@Override
	public String toString() {
		return mc.toString();
	}

	@Override
	public boolean checkElement(ClassInterface analyze) {
		return mc.check(analyze.getModifiers());
	}
}
