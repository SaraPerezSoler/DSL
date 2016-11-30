package es.uam.sara.tfg.sentence;

import java.util.List;
import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.type.Class;

public class ClassFrom extends From<Class>{

	public ClassFrom(String var) {
		super(var);
	}

	@Override
	public List<Class> getElements(Container elem) {
		return elem.getClasses();
	}


}
