package es.uam.sara.tfg.sentence;

import java.util.List;
import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.type.ClassInterface;

public class ClassFrom extends From<ClassInterface>{

	public ClassFrom(String var) {
		super(var);
	}

	@Override
	public List<ClassInterface> getElements(Container elem) {
		return elem.getClasses();
	}


}
