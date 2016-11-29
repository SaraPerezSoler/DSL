package es.uam.sara.tfg.sentence;

import java.util.List;
import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.type.Method;

public class MethodFrom extends From<Method>{

	public MethodFrom(String var) {
		super(var);
	}

	@Override
	public List<Method> getElements(Container elem) {

		return elem.getMethods();
	}


}
