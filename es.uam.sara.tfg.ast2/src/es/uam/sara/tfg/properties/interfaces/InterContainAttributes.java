package es.uam.sara.tfg.properties.interfaces;

import java.util.List;
import es.uam.sara.tfg.elements.Attribute;
import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.rule.Rule;

public class InterContainAttributes extends InterContain<Attribute> {

	public InterContainAttributes(Rule<Attribute> r) {
		super(r);
	}

	@Override
	public List<Attribute> getSubType(ClassInterface t) {
		return t.getAttributes();
	}

	

}
