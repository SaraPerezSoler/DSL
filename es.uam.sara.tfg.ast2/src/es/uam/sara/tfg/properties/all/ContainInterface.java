package es.uam.sara.tfg.properties.all;

import java.util.List;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.type.MInterface;
import es.uam.sara.tfg.sentence.Rule;

public class ContainInterface<T extends Container> extends Contain<T,MInterface> {

	public ContainInterface(boolean no, Rule<MInterface> r) {
		super(no, r);
	}

	@Override
	public List<MInterface> getSubType(Container t) {
		return t.getInterfaces();
	}

}
