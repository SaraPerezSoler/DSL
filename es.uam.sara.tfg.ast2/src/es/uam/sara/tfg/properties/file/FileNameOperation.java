package es.uam.sara.tfg.properties.file;

import java.util.List;
import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.properties.NameCheck;

public class FileNameOperation extends File{
	
	private NameCheck nCheck;

	public FileNameOperation(NameCheck.Operation op, String cad, int idioma) {
		super();
		nCheck= new NameCheck(op, cad, idioma);
	}

	@Override
	public void check(List<UnitVisitor> analyze) {
		for (UnitVisitor uv: analyze){
			if(nCheck.checkNameOperation(uv.getNameFile())){
				super.addRight(uv);
			}else{
				super.addWrong(uv);
			}
		}

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
