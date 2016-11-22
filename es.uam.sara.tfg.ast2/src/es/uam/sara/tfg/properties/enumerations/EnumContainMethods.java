package es.uam.sara.tfg.properties.enumerations;

import java.util.List;
import es.uam.sara.tfg.elements.Enumeration;
import es.uam.sara.tfg.elements.Method;
import es.uam.sara.tfg.rule.Rule;

public class EnumContainMethods extends EnumContain<Method> {

	public EnumContainMethods(Rule<Method> r) {
		super(r);
	}

	@Override
	public List<Method> getSubType(Enumeration t) {
		return t.getMethods();
	}

}
