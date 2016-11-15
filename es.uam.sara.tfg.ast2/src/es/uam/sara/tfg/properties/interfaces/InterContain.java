package es.uam.sara.tfg.properties.interfaces;

import java.util.List;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.properties.Contain;
import es.uam.sara.tfg.rule.Rule;

public abstract class InterContain<T> extends Interface {

	private Contain<T, TypeDeclaration> contain;
	
	public InterContain(Rule<T> r) {
		contain= new Contain<T, TypeDeclaration>(r);
	}
	@Override
	public boolean checkElement(TypeDeclaration analyze) {
		return contain.checkElement(analyze, getSubType(analyze));
	}
	public abstract List<T> getSubType(TypeDeclaration t);

		
	public String print(TypeDeclaration print){
		return super.print(print) + contain.print(print);
	}
	@Override
	public String toString() {
		return contain.toString();
	}
}
