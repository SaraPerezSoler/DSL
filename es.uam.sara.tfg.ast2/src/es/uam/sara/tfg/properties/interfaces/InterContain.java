package es.uam.sara.tfg.properties.interfaces;

import java.util.List;
import org.eclipse.jdt.core.dom.TypeDeclaration;
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

}
