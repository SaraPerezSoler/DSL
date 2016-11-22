package es.uam.sara.tfg.properties.methods;

import es.uam.sara.tfg.elements.Method;
import es.uam.sara.tfg.properties.ModifiersCheck;


public class MethModifiers extends MethodProperty{

	private ModifiersCheck mc;
	public MethModifiers(ModifiersCheck mc) {
		super();
		this.mc=mc;
	}
	
	@Override
	public String toString() {
		return mc.toString();
	}

	@Override
	public boolean checkElement(Method analyze) {
		return mc.check(analyze.getModifiers());
	}

}
