package es.uam.sara.tfg.properties.enumerations;

import java.util.List;
import org.eclipse.jdt.core.dom.EnumDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Rule;

public abstract class EnumContain<T> extends Enumeration {

	private Rule<T> rule;

	public EnumContain(Rule<T> r) {
		rule = r;
	}
	
	@Override
	public void check(List<EnumDeclaration> analyze) {
		for (EnumDeclaration e: analyze){
			rule.reset(getSubType(e));
			if (rule.checkTest()){
				this.addRight(e);
			}else{
				this.addWrong(e);
			}
		}
	}
	
	public abstract List<T> getSubType(EnumDeclaration t);
	
	@Override
	public String toString() {
		return "have {\n" + rule + "\n}";
	}

	public String printRight(){
		String cad="";
		List<EnumDeclaration> right=super.getRight();
		for (EnumDeclaration ed: right){
			UnitVisitor uv=Visitors.getVisitor(ed);
			cad+="In file "+uv.getNameFile()+" the enumeration "+ed.getName() +" (line: " +uv.getLineNumber(ed.getStartPosition())+")  satisfy \""+this.toString()+"\"\n";
			cad+="{\n"+rule.log()+"\n}\n";
		}
		return cad;
	}
	public String printWrong(){
		String cad="";
		List<EnumDeclaration> wrong=super.getWrong();
		for (EnumDeclaration ed: wrong){
			UnitVisitor uv=Visitors.getVisitor(ed);
			cad+="In file "+uv.getNameFile()+" the enumeration "+ed.getName() +" (line: " +uv.getLineNumber(ed.getStartPosition())+") not satisfy \""+this.toString()+"\"\n";
			cad+="{\n"+rule.log()+"\n}\n";
		}
		return cad;
	}
	

}
