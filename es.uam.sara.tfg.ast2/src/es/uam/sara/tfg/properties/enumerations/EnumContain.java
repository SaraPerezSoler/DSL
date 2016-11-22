package es.uam.sara.tfg.properties.enumerations;

import java.util.List;
import es.uam.sara.tfg.elements.Enumeration;
import es.uam.sara.tfg.properties.Contain;
import es.uam.sara.tfg.rule.Rule;

public abstract class EnumContain<T> extends EnumerationProperty {

	private Contain<T, Enumeration> contain;

	public EnumContain(Rule<T> r) {
		contain= new Contain<T, Enumeration>(r);
	}
	
	@Override
	public boolean checkElement(Enumeration analyze){
		return contain.checkElement(analyze, getSubType(analyze));

	}
	public abstract List<T> getSubType(Enumeration t);
	

	public String print(Enumeration print){
		return super.print(print) + contain.print(print);
	}
	@Override
	public String toString() {
		return contain.toString();
	}

}
