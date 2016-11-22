package es.uam.sara.tfg.properties.interfaces;

import es.uam.sara.tfg.elements.ClassInterface;


public class InterEmpty extends InterfaceProperty{


	public InterEmpty() {
		super();
	}
	@Override
	public String toString() {
		return "no empty";
	}

	@Override
	public boolean checkElement(ClassInterface analyze) {
		// TODO Auto-generated method stub
		return analyze.isEmpty();
	}
}
