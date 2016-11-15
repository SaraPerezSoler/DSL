package es.uam.sara.tfg.properties.classes;

import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.properties.ModifiersCheck;


public class ClassModifiers extends Class{

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
	public boolean checkElement(TypeDeclaration analize) {
		return mc.modifiers(ModifiersCheck.getList(analize));
	}


}
