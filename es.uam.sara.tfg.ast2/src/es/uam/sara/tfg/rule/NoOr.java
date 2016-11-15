package es.uam.sara.tfg.rule;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;

public class NoOr<T> extends Filter<T> {

	public NoOr() {
		super(false);
		// TODO Auto-generated constructor stub
	}
	
	public String print(boolean right) {
		List<T> print;
		String cad="";
		if (right){
			print=this.getRight();
		}else{
			print=new ArrayList<T>();
		}

		for (T t : print) {
			cad+=print(t);
		}
		return cad;
	}

	@Override
	public void check(List<T> elem){
		this.addAllRight(elem);
	}
	public String print(T t){
		String cad="";
		if (t instanceof TypeDeclaration){
			TypeDeclaration tp=(TypeDeclaration)t;
			UnitVisitor uv=Visitors.getVisitor(tp);
			cad+="In file "+uv.getNameFile()+" is the class "+tp.getName() +" (line: " +uv.getLineNumber(tp.getStartPosition())+")\n";
		}else if (t instanceof EnumDeclaration){
			EnumDeclaration ed=(EnumDeclaration)t;
			UnitVisitor uv=Visitors.getVisitor(ed);
			cad+="In file "+uv.getNameFile()+" is the enumeration "+ed.getName() +" (line: " +uv.getLineNumber(ed.getStartPosition())+")\n";
		}else if (t instanceof MethodDeclaration){
			MethodDeclaration meth=(MethodDeclaration)t;
			UnitVisitor uv=Visitors.getVisitor(meth);
			cad+="In file "+uv.getNameFile()+" is the method "+meth.getName() +" (line:" +uv.getLineNumber(meth.getStartPosition())+")\n";
		}else if (t instanceof FieldDeclaration){
			FieldDeclaration fd=(FieldDeclaration)t;
			UnitVisitor uv=Visitors.getVisitor(fd);
			cad+="In file "+uv.getNameFile()+" is the attribute "+fd.toString().replace("\n", "") +" (line: " +uv.getLineNumber(fd.getStartPosition())+")\n";
		}
		return cad;
	}

	public boolean isNoProperty(){
		return true;
	}
}
