package es.uam.sara.tfg.properties.interfaces;

import java.util.List;
import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.elements.Method;
import es.uam.sara.tfg.rule.Rule;

public class InterContainMethods extends InterContain<Method> {

	public InterContainMethods(Rule<Method> r) {
		super(r);
	}

	@Override
	public List<Method> getSubType(ClassInterface t) {
		return t.getMethods();
	}

}
