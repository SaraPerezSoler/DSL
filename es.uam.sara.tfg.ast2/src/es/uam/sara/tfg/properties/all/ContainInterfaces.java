package es.uam.sara.tfg.properties.all;

import java.util.List;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.type.ClassInterface;
import es.uam.sara.tfg.sentence.Rule;

public class ContainInterfaces<T extends Container> extends Contain<T,ClassInterface> {

	public ContainInterfaces(boolean no, Rule<ClassInterface> r) {
		super(no, r);
	}

	@Override
	public List<ClassInterface> getSubType(Container t) {
		return t.getInterfaces();
	}

}
