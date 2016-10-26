package es.uam.sara.tfg.properties.enumerations;

import java.util.List;

import org.eclipse.jdt.core.dom.EnumDeclaration;
import es.uam.sara.tfg.properties.NameCheck;


public class EnumNameOperation extends Enumeration{

	private NameCheck nCheck;
	public EnumNameOperation(List<EnumDeclaration> analyce,NameCheck.Operation op, String cad, int idioma) {
		super();
		nCheck= new NameCheck(op, cad, idioma);
	}

	@Override
	public void check(List<EnumDeclaration> analyze) {
		for (EnumDeclaration en:analyze){
			if (nCheck.checkNameOperation(en.getName().toString())){
				super.addRight(en);
			}else{
				super.addWrong(en);
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
