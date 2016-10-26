package es.uam.sara.tfg.properties.enumerations;

import java.util.List;
import org.eclipse.jdt.core.dom.EnumDeclaration;


public class EnumNoEmpty extends Enumeration{

	public EnumNoEmpty() {
		super();
	}

	@Override
	public void check(List<EnumDeclaration> analyze) {
		for (EnumDeclaration en: analyze){
			if (en.bodyDeclarations().isEmpty()){
				addWrong(en);
			}else{
				addRight(en);
			}
		}
		
	}
	@Override
	public String toString() {
		return "no empty";
	}
}
