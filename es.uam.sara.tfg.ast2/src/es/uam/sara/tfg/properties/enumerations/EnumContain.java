package es.uam.sara.tfg.properties.enumerations;

import java.util.List;
import org.eclipse.jdt.core.dom.EnumDeclaration;
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


}
