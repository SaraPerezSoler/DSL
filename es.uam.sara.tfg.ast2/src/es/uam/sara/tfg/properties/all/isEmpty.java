package es.uam.sara.tfg.properties.all;

import es.uam.sara.tfg.elements.ICanEmpty;
import es.uam.sara.tfg.properties.Properties;

public class isEmpty<T extends ICanEmpty> extends Properties<T> {

	@Override
	public boolean checkElement(T analyze) {

		return analyze.isEmpty();
	}

	@Override
	public String toString() {
		return "is empty";
	}

}
