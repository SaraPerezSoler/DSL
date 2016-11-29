package es.uam.sara.tfg.sentence;

import java.util.List;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.type.Enumeration;

public class EnumFrom extends From<Enumeration>{

	public EnumFrom(String var) {
		super(var);
	}

	@Override
	public List<Enumeration> getElements(Container elem) {
		return elem.getEnumerations();
	}


}
