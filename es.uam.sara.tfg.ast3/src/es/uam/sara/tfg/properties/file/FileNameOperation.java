package es.uam.sara.tfg.properties.file;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.properties.NameCheck;

public class FileNameOperation extends File{
	
	private NameCheck nCheck;

	public FileNameOperation(NameCheck.Operation op, String cad, int idioma) {
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
	public boolean checkElement(UnitVisitor analyze) {
		return nCheck.checkNameOperation(analyze.getNameFile());
	}
}
