package es.uam.sara.tfg.properties.all;

import java.util.List;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.type.Method;
import es.uam.sara.tfg.rule.Rule;

public class ContainMethods<T extends Container> extends Contain<T,Method> {

	public ContainMethods(Rule<Method> r) {
		super(r);
	}

	@Override
	public List<Method> getSubType(Container t) {
		return t.getMethods();
	}

}
