package es.uam.sara.tfg.sentence;

import java.util.List;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.IElements;

public abstract class From<T extends IElements> {

	protected String var;
	
	
	public From(String var) {
		super();
		this.var = var;
	}


	public abstract List<T> getElements(Container elem);


	public String getVar() {
		return var;
	}
}
