
package es.uam.sara.tfg.properties;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import es.uam.sara.tfg.rule.Rule;

public class Contain<T,K> {

	private Rule<T> rule;
	private Map<K, String> map;
	
	public Contain(Rule<T> r) {
		rule = r;
		map= new HashMap<K, String>();
	}
	
	public boolean checkElement(K analyze, List<T> subTypes) {
		rule.reset(subTypes);
		boolean ret= rule.checkTest();
		map.put(analyze, rule.log());
		return ret;
	}
	
	public String print(K print){
		return "{\n\t"+map.get(print).replace("\n", "\n\t")+"\n}\n";
		 
	}
	
	@Override
	public String toString() {
		return "have {" + rule + "}";
	}
}
