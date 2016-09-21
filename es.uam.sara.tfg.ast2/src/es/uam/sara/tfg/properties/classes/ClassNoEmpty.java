package es.uam.sara.tfg.properties.classes;

import java.util.List;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.properties.PropertiesException;

public class ClassNoEmpty extends Class {

	public ClassNoEmpty(List<TypeDeclaration> analyze) {
		super(analyze);
	}

	@Override
	public void check() {
		for (TypeDeclaration t: super.analyze){
			try{
				if (t.bodyDeclarations().isEmpty()){
					super.addWrong(t);
				}else{
					super.addRight(t);
				}
			}catch(PropertiesException e){
				e.printStackTrace();
			}
		}
	}

}
