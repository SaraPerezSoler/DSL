package es.uam.sara.tfg.properties.interfaces;

import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.properties.NameCheck;


public class InterNameOperation extends Interface{

	private NameCheck nCheck;
	public InterNameOperation(NameCheck.Operation op, String cad, int idioma) {
		super();
		nCheck=new NameCheck(op, cad, idioma);
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
	public boolean checkElement(TypeDeclaration analyze) {
		return nCheck.checkNameOperation(analyze);
	}
}
