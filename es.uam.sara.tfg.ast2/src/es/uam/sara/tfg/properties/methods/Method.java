/**
 * 
 */
package es.uam.sara.tfg.properties.methods;

import org.eclipse.jdt.core.dom.MethodDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.Properties;


/**
 * @author Sara
 *
 */
public abstract class Method extends Properties<MethodDeclaration> {

	public Method() {
		super();
	}

	public String print(MethodDeclaration print){
		UnitVisitor uv=Visitors.getVisitor(print);
		return "In file "+uv.getNameFile()+" the class "+NameCheck.getName(print) +" (line: " +uv.getLineNumber(print.getStartPosition())+")\n";
	}
}
