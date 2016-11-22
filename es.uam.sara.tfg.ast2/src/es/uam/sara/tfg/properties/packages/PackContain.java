package es.uam.sara.tfg.properties.packages;

import java.util.List;
import es.uam.sara.tfg.properties.Contain;
import es.uam.sara.tfg.rule.Rule;
import es.uam.sara.tfg.elements.Package;

public abstract class PackContain<T> extends PackageProperty {

	private Contain<T, Package> contain;
	
	public PackContain(Rule<T> r) {
		contain= new Contain<T, Package>(r);
	}
	
	@Override
	public boolean checkElement(Package analyze) {
		return contain.checkElement(analyze, getSubType(analyze));
	}
	
	public abstract List<T> getSubType(Package pk);

	public String print(Package print){
		return super.print(print) + contain.print(print);
	}
	@Override
	public String toString() {
		return contain.toString();
	}
}
