package es.uam.sara.tfg.properties.enumerations;

import java.util.List;

import org.eclipse.jdt.core.dom.EnumDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.properties.Properties;


public abstract class Enumeration extends Properties<EnumDeclaration> {

	public Enumeration() {
		super();
	}

	public String printRight(){
		String cad="";
		List<EnumDeclaration> right=super.getRight();
		for (EnumDeclaration ed: right){
			UnitVisitor uv=Visitors.getVisitor(ed);
			cad+="In file "+uv.getNameFile()+" the enumeration "+ed.getName() +" (line: " +uv.getLineNumber(ed.getStartPosition())+")  satisfy \""+this.toString()+"\"\n";
		}
		return cad;
	}
	public String printWrong(){
		String cad="";
		List<EnumDeclaration> wrong=super.getWrong();
		for (EnumDeclaration ed: wrong){
			UnitVisitor uv=Visitors.getVisitor(ed);
			cad+="In file "+uv.getNameFile()+" the enumeration "+ed.getName() +" (line: " +uv.getLineNumber(ed.getStartPosition())+") not satisfy \""+this.toString()+"\"\n";
		}
		return cad;
	}
}
