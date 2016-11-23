package es.uam.sara.tfg.properties.classes;

import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.StringProperty;

public class ClassNameOperation extends ClassProperty implements StringProperty{
	
	private NameCheck nCheck;

	public ClassNameOperation(NameCheck.Operation op, String cad, int idioma) {
		super();
		nCheck= new NameCheck(op, cad, idioma);
	}

	@Override
	public boolean checkElement(ClassInterface analyze) {
		return nCheck.checkNameOperation(analyze.getName());
	}
	@Override
	public String toString() {
		if (nCheck.getIdioma()==NameCheck.EMPTY){
			return "name "+nCheck.getOp() +" " +nCheck.getOther();
		}else if (nCheck.getIdioma()==NameCheck.ENGLISH){
			return "name "+nCheck.getOp() +" " +nCheck.getOther()+", English";
		}else {
			return "name "+nCheck.getOp() +" " +nCheck.getOther()+", Spanish";
		}
		
	}

	
}
