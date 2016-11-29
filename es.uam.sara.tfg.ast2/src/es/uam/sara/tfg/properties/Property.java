package es.uam.sara.tfg.properties;

import es.uam.sara.tfg.elements.IElements;
import es.uam.sara.tfg.sentence.PrimaryOp;

public abstract class Property<T extends IElements> extends PrimaryOp<T>{

	public Property(boolean no) {
		super(no);
	}

}
