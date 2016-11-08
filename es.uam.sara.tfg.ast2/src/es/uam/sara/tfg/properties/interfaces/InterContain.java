package es.uam.sara.tfg.properties.interfaces;

import java.util.List;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Rule;

public abstract class InterContain<T> extends Interface {

	private Rule<T> rule;

	public InterContain(Rule<T> r) {
		rule = r;
	}
	
	@Override
	public void check(List<TypeDeclaration> analyze) {
		for (TypeDeclaration t: analyze){
			rule.reset(getSubType(t));
			if (rule.checkTest()){
				this.addRight(t);
			}else{
				this.addWrong(t);
			}
		}
	}
	
	public abstract List<T> getSubType(TypeDeclaration t);

	@Override
	public String toString() {
		return "have {\n" + rule + "\n}";
	}

	public String printRight(){
		String cad="";
		List<TypeDeclaration> right=super.getRight();
		for (TypeDeclaration inter: right){
			UnitVisitor uv=Visitors.getVisitor(inter);
			cad+="In file "+uv.getNameFile()+" the interface "+inter.getName() +" (line: " +uv.getLineNumber(inter.getStartPosition())+")  satisfy \""+this.toString()+"\"\n";
			cad+="{\n"+rule.log()+"\n}\n";
		}
		return cad;
	}
	public String printWrong(){
		String cad="";
		List<TypeDeclaration> wrong=super.getWrong();
		for (TypeDeclaration inter: wrong){
			UnitVisitor uv=Visitors.getVisitor(inter);
			cad+="In file "+uv.getNameFile()+" the interface "+inter.getName() +" (line: " +uv.getLineNumber(inter.getStartPosition())+") not satisfy \""+this.toString()+"\"\n";
			cad+="{\n"+rule.log()+"\n}\n";
		}
		return cad;
	}
}
