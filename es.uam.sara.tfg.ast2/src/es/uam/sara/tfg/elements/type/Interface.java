package es.uam.sara.tfg.elements.type;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.elements.ClassInterface;

public class Interface extends ClassInterface{
	
	
	public Interface(TypeDeclaration tp, UnitVisitor uv) {
		super(tp, uv);		
	}		
}
