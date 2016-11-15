package es.uam.sara.tfg.properties.packages;

import java.util.List;
import es.uam.sara.tfg.properties.Contain;
import es.uam.sara.tfg.rule.Rule;

public abstract class PackContain<T> extends Package {

	private Contain<T, String> contain;
	
	public PackContain(Rule<T> r) {
		contain= new Contain<T, String>(r);
	}
	
	@Override
	public boolean checkElement(String analyze) {
		return contain.checkElement(analyze, getSubType(analyze));
	}
	
	public abstract List<T> getSubType(String pk);

	public String print(String print){
		return super.print(print) + contain.print(print);
	}
	@Override
	public String toString() {
		return contain.toString();
	}
}
