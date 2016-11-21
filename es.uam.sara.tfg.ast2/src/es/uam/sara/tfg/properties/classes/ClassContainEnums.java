package es.uam.sara.tfg.properties.classes;

import java.util.List;

import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.elements.Enumeration;
import es.uam.sara.tfg.rule.Rule;

public class ClassContainEnums extends ClassContain<Enumeration> {

	public ClassContainEnums(Rule<Enumeration> r) {
		super(r);
	}

	@Override
	public List<Enumeration> getSubType(ClassInterface t) {
		return t.getEnumerations();
	}

}
