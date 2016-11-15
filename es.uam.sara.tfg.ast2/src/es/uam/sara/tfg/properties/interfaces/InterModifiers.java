package es.uam.sara.tfg.properties.interfaces;

import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.properties.ModifiersCheck;


public class InterModifiers extends Interface{

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
	public boolean checkElement(TypeDeclaration analyze) {
		return mc.modifiers(ModifiersCheck.getList(analyze));
	}
}
