package es.uam.sara.tfg.sentence;

import java.util.List;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.type.ClassInterface;

public class InterfaceFrom extends From<ClassInterface>{

	public InterfaceFrom(String var) {
		super(var);
	}

	@Override
	public List<ClassInterface> getElements(Container elem) {
		return elem.getInterfaces();
	}



}
