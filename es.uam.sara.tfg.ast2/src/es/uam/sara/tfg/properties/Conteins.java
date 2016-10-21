package es.uam.sara.tfg.properties;

import java.util.List;

import es.uam.sara.tfg.rule.Rule;

public class Conteins<T> {
	private Rule<T> rule;
	
	public Conteins(Rule<T> r) {
		this.rule=r;
	}
	
	public boolean check( List<T> cont){
		if (rule==null && cont.isEmpty()){
			
		}
		rule.reset(cont);
		return rule.checkTest();
	}
}
