package es.uam.sara.tfg.properties.classes;


import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.Properties;


public abstract class Class extends Properties<TypeDeclaration> {

	public Class() {
		super();
	}

	public String print(TypeDeclaration print){
		UnitVisitor uv=Visitors.getVisitor(print);
		return "In file "+uv.getNameFile()+" the class "+NameCheck.getName(print) +" (line: " +uv.getLineNumber(print.getStartPosition())+")\n";
	}
}
