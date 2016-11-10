package es.uam.sara.tfg.properties.enumerations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.core.dom.EnumDeclaration;
import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Rule;

public abstract class EnumContain<T> extends Enumeration {

	private Rule<T> rule;
	private Map<EnumDeclaration, String> map;

	public EnumContain(Rule<T> r) {
		rule = r;
		map= new HashMap<EnumDeclaration, String>();
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
			map.put(e, rule.log());
		}
	}
	
	public abstract List<T> getSubType(EnumDeclaration t);
	
	@Override
	public String toString() {
		return "have {" + rule + "}";
	}

	public String printRight(){
		String cad="";
		List<EnumDeclaration> right=super.getRight();
		for (EnumDeclaration ed: right){
			UnitVisitor uv=Visitors.getVisitor(ed);
			cad+="In file "+uv.getNameFile()+" the enumeration "+ed.getName() +" (line: " +uv.getLineNumber(ed.getStartPosition())+")  satisfy \""+this.toString()+"\"\n";
			cad+="{\n\t"+map.get(ed).replace("\n", "\n\t")+"\n}\n";
		}
		return cad;
	}
	public String printWrong(){
		String cad="";
		List<EnumDeclaration> wrong=super.getWrong();
		for (EnumDeclaration ed: wrong){
			UnitVisitor uv=Visitors.getVisitor(ed);
			cad+="In file "+uv.getNameFile()+" the enumeration "+ed.getName() +" (line: " +uv.getLineNumber(ed.getStartPosition())+") not satisfy \""+this.toString()+"\"\n";
			cad+="{\n\t"+map.get(ed).replace("\n", "\n\t")+"\n}\n";
		}
		return cad;
	}
	

}
