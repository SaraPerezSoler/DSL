package es.uam.sara.tfg.properties.enumerations;


import es.uam.sara.tfg.elements.Enumeration;


public class EnumEmpty extends EnumerationProperty{


	public EnumEmpty() {
		super();
	}

	@Override
	public String toString() {
		return "is empty";
	}

	@Override
	public boolean checkElement(Enumeration analize) {
		return analize.isEmpty();
	}
}
