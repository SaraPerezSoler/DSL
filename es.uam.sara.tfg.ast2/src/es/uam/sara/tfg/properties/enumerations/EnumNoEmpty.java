package es.uam.sara.tfg.properties.enumerations;

import java.util.List;
import org.eclipse.jdt.core.dom.EnumDeclaration;


public class EnumNoEmpty extends Enumeration{

	public EnumNoEmpty(List<EnumDeclaration> analyze) {
		super(analyze);
	}

	@Override
	public void check() {
		for (EnumDeclaration en: super.analyze){
			if (en.bodyDeclarations().isEmpty()){
				addWrong(en);
			}else{
				addRight(en);
			}
		}
		
	}

}
