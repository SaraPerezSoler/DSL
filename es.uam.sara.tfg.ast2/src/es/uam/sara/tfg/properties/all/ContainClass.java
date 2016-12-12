package es.uam.sara.tfg.properties.all;

import java.util.List;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.type.MClass;
import es.uam.sara.tfg.sentence.Rule;

public class ContainClass<T extends Container> extends Contain<T, MClass> {

	public ContainClass(boolean no,Rule<MClass> r) {
		super(no, r);
	}

	@Override
	public List<MClass> getSubType(Container t) {
		return t.getClasses();
	}

}
