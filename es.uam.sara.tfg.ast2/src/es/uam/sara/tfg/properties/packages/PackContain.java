package es.uam.sara.tfg.properties.packages;

import java.util.List;
import es.uam.sara.tfg.rule.Rule;

public abstract class PackContain<T> extends Package {

	private Rule<T> rule;

	public PackContain(Rule<T> r) {
		rule = r;
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
		}
	}
	
	public abstract List<T> getSubType(String t);
	@Override
	public String toString() {
		return "have {\n" + rule + "\n}";
	}

	public String printRight(){
		String cad="";
		List<String> right=super.getRight();
		for (String meth: right){
			cad+="The package "+meth+"  satisfy \""+this.toString()+"\"\n";
			cad+="{\n"+rule.log().replace("\n", "\n\t")+"\n}\n";
		}
		return cad;
	}
	public String printWrong(){
		String cad="";
		List<String> wrong=super.getWrong();
		for (String meth: wrong){
			cad+="The package "+meth+" not satisfy \""+this.toString()+"\"\n";
			cad+="{\n"+rule.log().replace("\n", "\n\t")+"\n}\n";
		}
		return cad;
	}
}
