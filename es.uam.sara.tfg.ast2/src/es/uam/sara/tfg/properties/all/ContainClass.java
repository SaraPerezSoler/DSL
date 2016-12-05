package es.uam.sara.tfg.properties.all;

import java.util.List;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.type.Class;
import es.uam.sara.tfg.sentence.Rule;

public class ContainClass<T extends Container> extends Contain<T, Class> {

	public ContainClass(boolean no,Rule<Class> r) {
		super(no, r);
	}

	@Override
	public List<Class> getSubType(Container t) {
		return t.getClasses();
	}

}
