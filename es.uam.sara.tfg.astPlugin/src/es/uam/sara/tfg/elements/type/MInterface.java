package es.uam.sara.tfg.elements.type;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.elements.ClassInterface;

public class MInterface extends ClassInterface{
	
	
	public MInterface(TypeDeclaration tp, UnitVisitor uv) {
		super(tp, uv);		
	}		
}
