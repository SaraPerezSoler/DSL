package es.uam.sara.tfg.properties.packages;

import java.util.List;
import es.uam.sara.tfg.elements.Method;
import es.uam.sara.tfg.elements.Package;
import es.uam.sara.tfg.rule.Rule;

public class PackContainMethods extends PackContain<Method> {

	public PackContainMethods(Rule<Method> r) {
		super(r);
	}

	@Override
	public List<Method> getSubType(Package t) {
		return t.getMethods();
	}

}
