package es.uam.sara.tfg.properties;
import java.util.List;

import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Filter;

public class NoProperty<T> extends Filter<T> {

	public NoProperty() {
		super(false);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void check(List<T> analize) {
		super.addAllRight(analize);
		
	}

	@Override
	public String printRight() {
		String cad="";
		List<T> right=super.getRight();
		for (T t: right){
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
				cad+="In file "+uv.getNameFile()+" is the attribute "+fd +" (line: " +uv.getLineNumber(fd.getStartPosition())+")\n";
			}
			
		}
		return cad;
	}

	@Override
	public String printWrong() {
		return "";
	}
	public boolean isNoProperty(){
		return true;
	}
}
