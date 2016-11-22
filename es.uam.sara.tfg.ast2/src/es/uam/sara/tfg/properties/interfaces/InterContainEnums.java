package es.uam.sara.tfg.properties.interfaces;

import java.util.List;
import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.elements.Enumeration;
import es.uam.sara.tfg.rule.Rule;

public class InterContainEnums extends InterContain<Enumeration> {

	public InterContainEnums(Rule<Enumeration> r) {
		super(r);
	}

	@Override
	public List<Enumeration> getSubType(ClassInterface t) {
		return t.getEnumerations();
	}

}
