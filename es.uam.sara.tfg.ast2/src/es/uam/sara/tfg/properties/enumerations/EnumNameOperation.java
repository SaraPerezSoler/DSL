package es.uam.sara.tfg.properties.enumerations;

import java.util.List;

import org.eclipse.jdt.core.dom.EnumDeclaration;
import es.uam.sara.tfg.properties.NameCheck;


public class EnumNameOperation extends Enumeration{

	private NameCheck nCheck;
	public EnumNameOperation(List<EnumDeclaration> analyce,NameCheck.Operation op, String cad, int idioma) {
		super(analyce);
		nCheck= new NameCheck(op, cad, idioma);
	}

	@Override
	public void check() {
		for (EnumDeclaration en:super.analyze){
			if (nCheck.checkNameOperation(en.getName().toString())){
				super.addRight(en);
			}else{
				super.addWrong(en);
			}
		}
	}

}
