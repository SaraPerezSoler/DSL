package es.uam.sara.tfg.properties.enumerations;

import org.eclipse.jdt.core.dom.EnumDeclaration;
import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.Properties;


public abstract class Enumeration extends Properties<EnumDeclaration> {

	public Enumeration() {
		super();
	}
	
	public String print(EnumDeclaration print){
		UnitVisitor uv=Visitors.getVisitor(print);
		return "In file "+uv.getNameFile()+" the enumeration "+NameCheck.getName(print) +" (line: " +uv.getLineNumber(print.getStartPosition())+")\n";
	}
}
