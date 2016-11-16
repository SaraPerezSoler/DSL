package es.uam.sara.tfg.properties.methods;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import es.uam.sara.tfg.properties.NameCheck;


public class MethNameOperation extends Method{

	private NameCheck nCheck; 
	public MethNameOperation(NameCheck.Operation op, String cad, int idioma) {
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
	public boolean checkElement(MethodDeclaration analyze) {
		return nCheck.checkNameOperation(analyze);
	}
}
