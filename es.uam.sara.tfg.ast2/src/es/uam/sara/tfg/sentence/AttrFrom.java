package es.uam.sara.tfg.sentence;

import java.util.List;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.type.Attribute;

public class AttrFrom extends From<Attribute> {

	public AttrFrom(String var) {
		super(var);
	}

	@Override
	public List<Attribute> getElements(Container elem) {
		return elem.getAttributes();
	}



}
