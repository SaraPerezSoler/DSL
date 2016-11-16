package es.uam.sara.tfg.properties.enumerations;

import java.util.List;

import org.eclipse.jdt.core.dom.EnumDeclaration;

import es.uam.sara.tfg.properties.ModifiersCheck;


public class EnumModifiers extends Enumeration{

	private ModifiersCheck mc;
	public EnumModifiers(List<EnumDeclaration> analyce, ModifiersCheck mc) {
		super();
		this.mc=mc;
	}


	@Override
	public String toString() {
		return mc.toString();
	}

	@Override
	public boolean checkElement(EnumDeclaration analyze) {
		return mc.modifiers(ModifiersCheck.getList(analyze));
	}

}
