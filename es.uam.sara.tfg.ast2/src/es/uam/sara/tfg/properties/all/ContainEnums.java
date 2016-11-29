package es.uam.sara.tfg.properties.all;

import java.util.List;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.type.Enumeration;
import es.uam.sara.tfg.sentence.Rule;

public class ContainEnums<T extends Container> extends Contain<T,Enumeration> {

	public ContainEnums(boolean no,Rule<Enumeration> r) {
		super(no,r);
	}

	@Override
	public List<Enumeration> getSubType(Container t) {
		return t.getEnumerations();
	}

}
