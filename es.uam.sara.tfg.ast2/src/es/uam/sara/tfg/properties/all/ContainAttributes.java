package es.uam.sara.tfg.properties.all;

import java.util.List;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.type.Attribute;
import es.uam.sara.tfg.rule.Rule;

public class ContainAttributes<T extends Container> extends Contain<T,Attribute> {

	public ContainAttributes(Rule<Attribute> r) {
		super(r);
	}


	@Override
	public List<Attribute> getSubType(Container t) {
		return t.getAttributes();
	}

}
