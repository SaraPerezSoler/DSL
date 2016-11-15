package es.uam.sara.tfg.properties.attributes;

import org.eclipse.jdt.core.dom.FieldDeclaration;

import es.uam.sara.tfg.properties.ModifiersCheck;


public class AttrModifiers extends Attribute{

	private ModifiersCheck mc;

	public AttrModifiers(ModifiersCheck mc) {
		super();
		this.mc = mc;
	}

	@Override
	public String toString() {
		return  mc.toString();
	}

	@Override
	public boolean checkElement(FieldDeclaration analize) {
		return mc.modifiers(ModifiersCheck.getList(analize));
	}

}
