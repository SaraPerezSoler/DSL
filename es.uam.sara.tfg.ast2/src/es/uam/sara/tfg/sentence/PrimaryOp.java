package es.uam.sara.tfg.sentence;



import es.uam.sara.tfg.elements.IElements;
import es.uam.sara.tfg.properties.Checkeable;

public abstract class PrimaryOp <T extends IElements> extends Checkeable<T>{

	public PrimaryOp(boolean no) {
		super(no);
	}

}
