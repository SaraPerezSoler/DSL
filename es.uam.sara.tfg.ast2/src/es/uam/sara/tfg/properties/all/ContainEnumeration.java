package es.uam.sara.tfg.properties.all;

import java.util.List;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.type.MEnumeration;
import es.uam.sara.tfg.sentence.Rule;

public class ContainEnumeration<T extends Container> extends Contain<T,MEnumeration> {

	public ContainEnumeration(boolean no,Rule<MEnumeration> r) {
		super(no,r);
	}

	@Override
	public List<MEnumeration> getSubType(Container t) {
		return t.getEnumerations();
	}

}
