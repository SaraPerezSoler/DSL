package es.uam.sara.tfg.properties.classes;

import java.util.List;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.properties.IsGeneric;

public class ClassIsGeneric extends Class{

	@Override
	public void check(List<TypeDeclaration> analize) {
		IsGeneric generic= new IsGeneric();
		for (TypeDeclaration t: analize){
			if (generic.check(t)){
				super.addRight(t);
			}else{
				super.addWrong(t);
			}
		}
		
	}

}
