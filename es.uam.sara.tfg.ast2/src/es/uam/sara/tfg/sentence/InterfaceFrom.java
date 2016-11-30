package es.uam.sara.tfg.sentence;

import java.util.List;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.type.Class;

public class InterfaceFrom extends From<Class>{

	public InterfaceFrom(String var) {
		super(var);
	}

	@Override
	public List<Class> getElements(Container elem) {
		return elem.getInterfaces();
	}



}
