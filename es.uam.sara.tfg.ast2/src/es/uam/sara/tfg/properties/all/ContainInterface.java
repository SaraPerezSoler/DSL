package es.uam.sara.tfg.properties.all;

import java.util.List;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.type.Interface;
import es.uam.sara.tfg.sentence.Rule;

public class ContainInterface<T extends Container> extends Contain<T,Interface> {

	public ContainInterface(boolean no, Rule<Interface> r) {
		super(no, r);
	}

	@Override
	public List<Interface> getSubType(Container t) {
		return t.getInterfaces();
	}

}
