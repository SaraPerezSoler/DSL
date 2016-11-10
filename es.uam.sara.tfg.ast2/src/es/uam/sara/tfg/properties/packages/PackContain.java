package es.uam.sara.tfg.properties.packages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.uam.sara.tfg.rule.Rule;

public abstract class PackContain<T> extends Package {

	private Rule<T> rule;
	private Map<String, String> map;

	public PackContain(Rule<T> r) {
		rule = r;
		map= new HashMap<String, String>();
	}
	
	@Override
	public void check(List<String> analyze) {
		for (String p: analyze){
			rule.reset(getSubType(p));
			if (rule.checkTest()){
				this.addRight(p);
			}else{
				this.addWrong(p);
			}
			map.put(p, rule.log());
		}
	}
	
	public abstract List<T> getSubType(String t);
	@Override
	public String toString() {
		return "have {" + rule + "}";
	}

	public String printRight(){
		String cad="";
		List<String> right=super.getRight();
		for (String p: right){
			cad+="The package "+p+"  satisfy \""+this.toString()+"\"\n";
			cad+="{\n\t"+map.get(p).replace("\n", "\n\t")+"\n}\n";
		}
		return cad;
	}
	public String printWrong(){
		String cad="";
		List<String> wrong=super.getWrong();
		for (String p: wrong){
			cad+="The package "+p+" not satisfy \""+this.toString()+"\"\n";
			cad+="{\n\t"+map.get(p).replace("\n", "\n\t")+"\n}\n";
		}
		return cad;
	}
}
