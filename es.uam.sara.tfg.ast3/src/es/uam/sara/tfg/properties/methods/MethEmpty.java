package es.uam.sara.tfg.properties.methods;

import org.eclipse.jdt.core.dom.MethodDeclaration;

import es.uam.sara.tfg.properties.Empty;

public class MethEmpty extends Method {



	public MethEmpty() {
		super();
	}


	@Override
	public String toString() {
		return " empty";
	}

	@Override
	public boolean checkElement(MethodDeclaration analize) {
		return Empty.isEmpty(analize);
	}
}
