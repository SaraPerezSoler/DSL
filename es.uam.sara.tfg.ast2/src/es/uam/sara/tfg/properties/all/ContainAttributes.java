package es.uam.sara.tfg.properties.all;

import java.util.List;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.type.Attribute;
import es.uam.sara.tfg.rule.Rule;

public class ContainAttributes<T extends Container> extends Contain<T,Attribute> {

	public ContainAttributes(boolean no,Rule<Attribute> r) {
		super(no, r);
	}


	@Override
	public List<Attribute> getSubType(Container t) {
		return t.getAttributes();
	}

}
