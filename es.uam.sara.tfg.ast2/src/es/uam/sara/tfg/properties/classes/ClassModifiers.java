package es.uam.sara.tfg.properties.classes;

import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.properties.ModifiersCheck;


public class ClassModifiers extends ClassProperty{

	private ModifiersCheck mc;
	public ClassModifiers(ModifiersCheck mc) {
		super();
		this.mc=mc;
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
