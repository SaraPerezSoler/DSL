package es.uam.sara.tfg.elements;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

import es.uam.sara.tfg.properties.ModifiersCheck;
import es.uam.sara.tfg.properties.TypeToString;

public class Attribute extends Elements{

	private FieldDeclaration fd;
	
	public Attribute(FieldDeclaration fd) {
		super(ModifiersCheck.getBlend(fd));
		this.fd=fd;
	}
	
	public String getName (){
		if (fd.fragments().get(0) instanceof VariableDeclarationFragment) {
			VariableDeclarationFragment declaration = (VariableDeclarationFragment) fd.fragments().get(0);
			return declaration.getName().toString();
		}
		return "";
	}
	
	
	public String getType(){
		return TypeToString.getString(fd.getType()).get(0);
	}


}
