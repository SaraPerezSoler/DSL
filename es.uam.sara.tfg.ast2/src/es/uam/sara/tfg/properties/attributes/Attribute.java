
package es.uam.sara.tfg.properties.attributes;

import java.util.List;

import org.eclipse.jdt.core.dom.FieldDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.properties.Properties;


public abstract class Attribute extends Properties<FieldDeclaration> {

	public Attribute() {
	}
	
	public String printRight(){
		String cad="";
		List<FieldDeclaration> right=super.getRight();
		for (FieldDeclaration fd: right){
			UnitVisitor uv=Visitors.getVisitor(fd);
			cad+="In file "+uv.getNameFile()+" the attribute "+fd +" (line: " +uv.getLineNumber(fd.getStartPosition())+") satisfy \""+this.toString()+"\"\n";
		}
		return cad;
	}
	public String printWrong(){
		String cad="";
		List<FieldDeclaration> wrong=super.getWrong();
		for (FieldDeclaration fd: wrong){
			UnitVisitor uv=Visitors.getVisitor(fd);
			cad+="In file "+uv.getNameFile()+" the attribute "+fd +" (line: " +uv.getLineNumber(fd.getStartPosition())+") not satisfy \""+this.toString()+"\"\n";
		}
		return cad;
	}
}
