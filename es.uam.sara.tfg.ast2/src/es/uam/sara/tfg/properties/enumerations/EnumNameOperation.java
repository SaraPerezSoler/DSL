package es.uam.sara.tfg.properties.enumerations;

import es.uam.sara.tfg.elements.Enumeration;
import es.uam.sara.tfg.properties.NameCheck;


public class EnumNameOperation extends EnumerationProperty{

	private NameCheck nCheck;
	public EnumNameOperation(NameCheck.Operation op, String cad, int idioma) {
		super();
		nCheck= new NameCheck(op, cad, idioma);
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

	@Override
	public boolean checkElement(Enumeration analyze) {
		return nCheck.checkNameOperation(analyze.getName());
	}
}
