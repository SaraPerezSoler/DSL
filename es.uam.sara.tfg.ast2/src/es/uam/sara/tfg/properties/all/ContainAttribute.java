package es.uam.sara.tfg.properties.all;

import java.util.List;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.type.MAttribute;
import es.uam.sara.tfg.sentence.Rule;

public class ContainAttribute<T extends Container> extends Contain<T,MAttribute> {

	public ContainAttribute(boolean no,Rule<MAttribute> r) {
		super(no, r);
	}


	@Override
	public List<MAttribute> getSubType(Container t) {
		return t.getAttributes();
	}

}
