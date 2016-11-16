package es.uam.sara.tfg.properties.methods;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import es.uam.sara.tfg.properties.ModifiersCheck;


public class MethModifiers extends Method{

	private ModifiersCheck mc;
	public MethModifiers(ModifiersCheck mc) {
		super();
		this.mc=mc;
	}
	
	@Override
	public String toString() {
		return mc.toString();
	}

	@Override
	public boolean checkElement(MethodDeclaration analyze) {
		return mc.modifiers(ModifiersCheck.getList(analyze));
	}

}
