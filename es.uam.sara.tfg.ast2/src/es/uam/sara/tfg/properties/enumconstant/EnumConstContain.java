package es.uam.sara.tfg.properties.enumconstant;

import java.util.List;

import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import es.uam.sara.tfg.properties.Contain;
import es.uam.sara.tfg.rule.Rule;

public abstract class EnumConstContain<T> extends EnumConstant {

	private Contain<T, EnumConstantDeclaration> contain;

	public EnumConstContain(Rule<T> r) {
		contain= new Contain<T, EnumConstantDeclaration>(r);
	}
	
	@Override
	public boolean checkElement(EnumConstantDeclaration analyze){
		return contain.checkElement(analyze, getSubType(analyze));
	}

	public abstract List<T> getSubType(EnumConstantDeclaration t);
	

	public String print(EnumConstantDeclaration print){
		return super.print(print) + contain.print(print);
	}
	@Override
	public String toString() {
		return contain.toString();
	}

}
