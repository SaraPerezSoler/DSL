package es.uam.sara.tfg.properties.classes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Rule;

public abstract class ClassContain<T> extends Class {

	private Rule<T> rule;
	private Map<TypeDeclaration, String> map;
	
	public ClassContain(Rule<T> r) {
		rule = r;
		map= new HashMap<TypeDeclaration, String>();
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
			map.put(t, rule.log());
		}
	}
	
	public abstract List<T> getSubType(TypeDeclaration t);

	@Override
	public String toString() {
		return "have {" + rule + "}";
	}

	public String printRight(){
		String cad="";
		List<TypeDeclaration> right=super.getRight();
		for (TypeDeclaration tp: right){
			UnitVisitor uv=Visitors.getVisitor(tp);
			cad+="In file "+uv.getNameFile()+" the class "+tp.getName() +" (line: " +uv.getLineNumber(tp.getStartPosition())+")  satisfy \""+this.toString()+"\"\n";
			cad+="{\n\t"+map.get(tp).replace("\n", "\n\t")+"\n}\n";
		}
		return cad;
	}
	public String printWrong(){
		String cad="";
		List<TypeDeclaration> wrong=super.getWrong();
		for (TypeDeclaration tp: wrong){
			UnitVisitor uv=Visitors.getVisitor(tp);
			cad+="In file: "+uv.getNameFile()+" the class "+tp.getName() +" (line: " +uv.getLineNumber(tp.getStartPosition())+") not satisfy \""+this.toString()+"\"\n";
			cad+="{\n\t"+map.get(tp).replace("\n", "\n\t")+"\n}\n";
		}
		return cad;
	}
}
