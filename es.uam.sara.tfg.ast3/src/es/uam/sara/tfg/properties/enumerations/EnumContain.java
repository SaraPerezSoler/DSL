package es.uam.sara.tfg.properties.enumerations;

import java.util.List;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import es.uam.sara.tfg.properties.Contain;
import es.uam.sara.tfg.rule.Rule;

public abstract class EnumContain<T> extends Enumeration {

	private Contain<T, EnumDeclaration> contain;

	public EnumContain(Rule<T> r) {
		contain= new Contain<T, EnumDeclaration>(r);
	}
	
	@Override
	public boolean checkElement(EnumDeclaration analyze){
		return contain.checkElement(analyze, getSubType(analyze));

	}
	public abstract List<T> getSubType(EnumDeclaration t);
	

	public String print(EnumDeclaration print){
		return super.print(print) + contain.print(print);
	}
	@Override
	public String toString() {
		return contain.toString();
	}

}
