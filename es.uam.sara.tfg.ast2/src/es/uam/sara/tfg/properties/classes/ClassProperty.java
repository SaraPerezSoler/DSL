package es.uam.sara.tfg.properties.classes;


import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.properties.Properties;


public abstract class ClassProperty extends Properties<ClassInterface> {

	public ClassProperty() {
		super();
	}

	public String print(ClassInterface print){
		UnitVisitor uv=Visitors.getVisitor(print);
		return "In file "+uv.getNameFile()+" the class "+print.getName() +" (line: " +uv.getLineNumber(print.getASTNode().getStartPosition())+")\n";
	}
}
