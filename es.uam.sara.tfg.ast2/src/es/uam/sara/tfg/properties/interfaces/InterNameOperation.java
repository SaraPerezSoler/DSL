package es.uam.sara.tfg.properties.interfaces;

import java.util.List;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.properties.NameCheck;


public class InterNameOperation extends Interface{

	private NameCheck nCheck;
	public InterNameOperation(NameCheck.Operation op, String cad, int idioma) {
		super();
		nCheck=new NameCheck(op, cad, idioma);
	}

	@Override
	public void check(List<TypeDeclaration> analyze) {
		for (TypeDeclaration t : analyze) {
			if (nCheck.checkNameOperation(t.getName().toString())) {
				super.addRight(t);
			} else {
				super.addWrong(t);
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
