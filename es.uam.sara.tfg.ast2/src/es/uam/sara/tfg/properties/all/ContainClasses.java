package es.uam.sara.tfg.properties.all;

import java.util.List;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.type.ClassInterface;
import es.uam.sara.tfg.rule.Rule;

public class ContainClasses<T extends Container> extends Contain<T, ClassInterface> {

	public ContainClasses(Rule<ClassInterface> r) {
		super(r);
	}

	@Override
	public List<ClassInterface> getSubType(Container t) {
		return t.getClasses();
	}

}
