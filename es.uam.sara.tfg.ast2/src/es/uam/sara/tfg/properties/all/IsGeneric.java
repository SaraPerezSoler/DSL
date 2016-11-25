package es.uam.sara.tfg.properties.all;

import es.uam.sara.tfg.elements.ICanGeneric;
import es.uam.sara.tfg.properties.Properties;

public class IsGeneric<T extends ICanGeneric> extends Properties<T> {

	public IsGeneric(boolean no) {
		super(no);
	}

	@Override
	public String toString() {
		if (no){
			return "is not generic";
		}else{
			return "is generic";
		}
	}

	@Override
	public boolean checkElement(T analyze) {
		return analyze.isGeneric();

	}
}
