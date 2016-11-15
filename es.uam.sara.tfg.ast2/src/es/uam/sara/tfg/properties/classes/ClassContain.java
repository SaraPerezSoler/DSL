package es.uam.sara.tfg.properties.classes;

import java.util.List;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.properties.Contain;
import es.uam.sara.tfg.rule.Rule;

public abstract class ClassContain<T> extends Class {

	private Contain<T, TypeDeclaration> contain;
	
	public ClassContain(Rule<T> r) {
		contain= new Contain<T, TypeDeclaration>(r);
	}
	
	@Override
	public boolean checkElement(TypeDeclaration analyze){
		return contain.checkElement(analyze, getSubType(analyze));

	}
	public abstract List<T> getSubType(TypeDeclaration t);
	
	public String print(TypeDeclaration print){
		return super.print(print) + contain.print(print);
	}
	
	public String toString(){
		return contain.toString();
	}
}
