package es.uam.sara.tfg.properties.interfaces;

import java.util.List;
import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.rule.Rule;

public class InterContainClasses extends InterContain<ClassInterface> {

	public InterContainClasses(Rule<ClassInterface> r) {
		super(r);
	}

	@Override
	public List<ClassInterface> getSubType(ClassInterface t) {
		return t.getClasses();
	}

}
