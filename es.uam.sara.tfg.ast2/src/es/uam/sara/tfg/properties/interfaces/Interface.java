package es.uam.sara.tfg.properties.interfaces;

import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.Properties;


public abstract class Interface extends Properties<TypeDeclaration> {

	public Interface() {
		super();
	}
	
	public String print(TypeDeclaration print){
		UnitVisitor uv=Visitors.getVisitor(print);
		return "In file "+uv.getNameFile()+" the interface "+NameCheck.getName(print) +" (line: " +uv.getLineNumber(print.getStartPosition())+")\n";
	}
	
}
