package es.uam.sara.tfg.properties.interfaces;

import java.util.List;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.properties.Properties;


public abstract class Interface extends Properties<TypeDeclaration> {

	public Interface() {
		super();
	}

	public String printRight(){
		String cad="";
		List<TypeDeclaration> right=super.getRight();
		for (TypeDeclaration inter: right){
			UnitVisitor uv=Visitors.getVisitor(inter);
			cad+="In file "+uv.getNameFile()+" the interface "+inter.getName() +" (line: " +uv.getLineNumber(inter.getStartPosition())+")  satisfy \""+this.toString()+"\"\n";
		}
		return cad;
	}
	public String printWrong(){
		String cad="";
		List<TypeDeclaration> wrong=super.getWrong();
		for (TypeDeclaration inter: wrong){
			UnitVisitor uv=Visitors.getVisitor(inter);
			cad+="In file "+uv.getNameFile()+" the interface "+inter.getName() +" (line: " +uv.getLineNumber(inter.getStartPosition())+") not satisfy \""+this.toString()+"\"\n";
		}
		return cad;
	}
}
