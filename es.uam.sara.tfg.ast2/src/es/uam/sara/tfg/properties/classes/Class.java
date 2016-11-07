package es.uam.sara.tfg.properties.classes;


import java.util.List;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.properties.Properties;


public abstract class Class extends Properties<TypeDeclaration> {

	public Class() {
		super();
	}
	
	public String printRight(){
		String cad="";
		List<TypeDeclaration> right=super.getRight();
		for (TypeDeclaration tp: right){
			UnitVisitor uv=Visitors.getVisitor(tp);
			cad+="In file: "+uv.getNameFile()+" the class "+tp.getName() +" (line: " +uv.getLineNumber(tp.getStartPosition())+")  satisfy \""+this.toString()+"\"\n";
		}
		return cad;
	}
	public String printWrong(){
		String cad="";
		List<TypeDeclaration> wrong=super.getWrong();
		for (TypeDeclaration tp: wrong){
			UnitVisitor uv=Visitors.getVisitor(tp);
			cad+="In file: "+uv.getNameFile()+" the class "+tp.getName() +" (line: " +uv.getLineNumber(tp.getStartPosition())+") not satisfy \""+this.toString()+"\"\n";
		}
		return cad;
	}
}
