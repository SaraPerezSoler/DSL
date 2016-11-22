package es.uam.sara.tfg.properties.enumerations;

import java.util.List;

import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.elements.Enumeration;
import es.uam.sara.tfg.rule.Rule;

public class EnumContainInterfaces extends EnumContain<ClassInterface> {

	public EnumContainInterfaces(Rule<ClassInterface> r) {
		super(r);
	}

	@Override
	public List<ClassInterface> getSubType(Enumeration t) {
		return t.getInterfaces();
	}

}
