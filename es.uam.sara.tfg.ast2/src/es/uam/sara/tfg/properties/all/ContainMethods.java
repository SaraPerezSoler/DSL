package es.uam.sara.tfg.properties.all;

import java.util.List;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.type.Method;
import es.uam.sara.tfg.sentence.Rule;

public class ContainMethods<T extends Container> extends Contain<T,Method> {

	public ContainMethods(boolean no,Rule<Method> r) {
		super(no, r);
	}

	@Override
	public List<Method> getSubType(Container t) {
		return t.getMethods();
	}

}
