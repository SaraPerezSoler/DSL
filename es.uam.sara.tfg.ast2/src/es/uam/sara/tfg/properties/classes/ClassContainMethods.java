package es.uam.sara.tfg.properties.classes;

import java.util.List;
import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.elements.Method;
import es.uam.sara.tfg.rule.Rule;

public class ClassContainMethods extends ClassContain<Method> {

	public ClassContainMethods(Rule<Method> r) {
		super(r);
	}

	@Override
	public List<Method> getSubType(ClassInterface t) {
		return t.getMethods();
	}

}
