package es.uam.sara.tfg.properties.all;

import es.uam.sara.tfg.elements.ICanEmpty;
import es.uam.sara.tfg.properties.Property;

public class isEmpty<T extends ICanEmpty> extends Property<T> {

	public isEmpty(boolean no) {
		super(no);
	}

	@Override
	public boolean checkElement(T analyze) {

		return analyze.isEmpty();
	}

	@Override
	public String toString() {
		if (no){
			return "is not empty";
		}else{
			return "is empty";
		}
	}

}
