package es.uam.sara.tfg.properties.enumerations;

import java.util.List;

import org.eclipse.jdt.core.dom.EnumDeclaration;
import es.uam.sara.tfg.properties.PropertiesException;

public class EnumNoEmpty extends Enumeration{

	public EnumNoEmpty(List<EnumDeclaration> analyze) {
		super(analyze);
	}

	@Override
	public void check() {
		for (EnumDeclaration en: super.analyze){
			try{
				if (en.bodyDeclarations().isEmpty()){
					addWrong(en);
				}else{
					addRight(en);
				}
			}catch(PropertiesException e){
				e.printStackTrace();
			}
		}
		
	}

}
