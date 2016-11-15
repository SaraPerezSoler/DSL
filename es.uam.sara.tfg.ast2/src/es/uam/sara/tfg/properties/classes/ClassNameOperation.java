package es.uam.sara.tfg.properties.classes;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.properties.NameCheck;

public class ClassNameOperation extends Class{
	
	private NameCheck nCheck;

	public ClassNameOperation(NameCheck.Operation op, String cad, int idioma) {
		super();
		nCheck= new NameCheck(op, cad, idioma);
	}

	@Override
	public boolean checkElement(TypeDeclaration analyze) {
		return nCheck.checkNameOperation(analyze);
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
