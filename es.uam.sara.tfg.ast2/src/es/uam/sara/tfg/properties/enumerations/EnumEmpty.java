package es.uam.sara.tfg.properties.enumerations;

import org.eclipse.jdt.core.dom.EnumDeclaration;

import es.uam.sara.tfg.properties.Empty;


public class EnumEmpty extends Enumeration{


	public EnumEmpty() {
		super();
	}

	@Override
	public String toString() {
		return " empty";
	}

	@Override
	public boolean checkElement(EnumDeclaration analize) {
		return Empty.isEmpty(analize);
	}
}
