package es.uam.sara.tfg.properties.all;

import es.uam.sara.tfg.elements.ICanGeneric;
import es.uam.sara.tfg.properties.Properties;

public class IsGeneric<T extends ICanGeneric> extends Properties<T> {

	@Override
	public String toString() {
		return "is generic";
	}

	@Override
	public boolean checkElement(T analyze) {
		return analyze.isGeneric();

	}
}
