package es.uam.sara.tfg.properties.methods;

import es.uam.sara.tfg.elements.Method;

public class MethEmpty extends MethodProperty {



	public MethEmpty() {
		super();
	}


	@Override
	public String toString() {
		return " empty";
	}

	@Override
	public boolean checkElement(Method analize) {
		return analize.isEmpty();
	}
}
