
package es.uam.sara.tfg.properties.attributes;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.Properties;


public abstract class Attribute extends Properties<FieldDeclaration> {

	public Attribute() {
	}
	
	public String print(FieldDeclaration print){
		UnitVisitor uv=Visitors.getVisitor(print);
		return "In file "+uv.getNameFile()+" the attribute "+NameCheck.getName(print) +" (line: " +uv.getLineNumber(print.getStartPosition())+")\n";
	}
}
