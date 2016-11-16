package es.uam.sara.tfg.properties.interfaces;

import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.properties.Empty;


public class InterEmpty extends Interface{


	public InterEmpty() {
		super();
	}
	@Override
	public String toString() {
		return "no empty";
	}

	@Override
	public boolean checkElement(TypeDeclaration analyze) {
		// TODO Auto-generated method stub
		return Empty.isEmpty(analyze);
	}
}
