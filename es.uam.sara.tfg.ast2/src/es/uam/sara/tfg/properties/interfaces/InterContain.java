package es.uam.sara.tfg.properties.interfaces;

import java.util.List;
import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.properties.Contain;
import es.uam.sara.tfg.rule.Rule;

public abstract class InterContain<T> extends InterfaceProperty {

	private Contain<T, ClassInterface> contain;
	
	public InterContain(Rule<T> r) {
		contain= new Contain<T, ClassInterface>(r);
	}
	@Override
	public boolean checkElement(ClassInterface analyze) {
		return contain.checkElement(analyze, getSubType(analyze));
	}
	public abstract List<T> getSubType(ClassInterface t);

		
	public String print(ClassInterface print){
		return super.print(print) + contain.print(print);
	}
	@Override
	public String toString() {
		return contain.toString();
	}
}
