package es.uam.sara.tfg.properties.classes;

import java.util.List;
import es.uam.sara.tfg.elements.Attribute;
import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.rule.Rule;

public class ClassContainAttributes extends ClassContain<Attribute> {

	public ClassContainAttributes(Rule<Attribute> r) {
		super(r);
	}

	@Override
	public List<Attribute> getSubType(ClassInterface t) {
		return t.getAttributes();
	}

}
