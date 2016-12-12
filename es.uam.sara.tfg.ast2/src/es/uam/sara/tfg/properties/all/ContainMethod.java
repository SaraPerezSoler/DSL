package es.uam.sara.tfg.properties.all;

import java.util.List;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.type.MMethod;
import es.uam.sara.tfg.sentence.Rule;

public class ContainMethod<T extends Container> extends Contain<T,MMethod> {

	public ContainMethod(boolean no,Rule<MMethod> r) {
		super(no, r);
	}

	@Override
	public List<MMethod> getSubType(Container t) {
		return t.getMethods();
	}

}
