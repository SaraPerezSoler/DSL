package es.uam.sara.tfg.properties.classes;

import java.util.List;
import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.rule.Rule;

public class ClassContainInterfaces extends ClassContain<ClassInterface> {

	public ClassContainInterfaces(Rule<ClassInterface> r) {
		super(r);
	}

	@Override
	public List<ClassInterface> getSubType(ClassInterface t) {
		return t.getInterfaces();
	}

}
