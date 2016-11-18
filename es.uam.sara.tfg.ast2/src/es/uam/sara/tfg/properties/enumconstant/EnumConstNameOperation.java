package es.uam.sara.tfg.properties.enumconstant;

import java.util.List;

import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import es.uam.sara.tfg.properties.NameCheck;


public class EnumConstNameOperation extends EnumConstant{

	private NameCheck nCheck;
	public EnumConstNameOperation(List<EnumConstantDeclaration> analyce,NameCheck.Operation op, String cad, int idioma) {
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
	public boolean checkElement(EnumConstantDeclaration analyze) {
		return nCheck.checkNameOperation(analyze);
	}
}
