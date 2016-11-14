package es.uam.sara.tfg.properties.file;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.rule.Rule;

public abstract class FileContain<T> extends File {

	private Rule<T> rule;
	private Map<UnitVisitor, String> map;
	
	public FileContain(Rule<T> r) {
		rule = r;
		map= new HashMap<UnitVisitor, String>();
	}
	
	@Override
	public void check(List<UnitVisitor> analyze) {
		for (UnitVisitor uv: analyze){
			rule.reset(getSubType(uv));
			if (rule.checkTest()){
				this.addRight(uv);
			}else{
				this.addWrong(uv);
			}
			map.put(uv, rule.log());
		}
	}
	
	public abstract List<T> getSubType(UnitVisitor uv);

	@Override
	public String toString() {
		return "have {" + rule + "}";
	}

	public String printRight(){
		String cad="";
		List<UnitVisitor> right=super.getRight();
		for (UnitVisitor uv: right){
			cad+="The file "+uv.getNameFile()+")  satisfy \""+this.toString()+"\"\n";
			cad+="{\n\t"+map.get(uv).replace("\n", "\n\t")+"\n}\n";
		}
		return cad;
	}
	public String printWrong(){
		String cad="";
		List<UnitVisitor> wrong=super.getWrong();
		for (UnitVisitor uv: wrong){
			cad+="The file: "+uv.getNameFile()+") not satisfy \""+this.toString()+"\"\n";
			cad+="{\n\t"+map.get(uv).replace("\n", "\n\t")+"\n}\n";
		}
		return cad;
	}
}
