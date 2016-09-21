package es.uam.sara.tfg.properties.classes;

import java.util.List;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.PropertiesException;

public class ClassNameOperation extends Class {
	
	private NameCheck nCheck;

	public ClassNameOperation(List<TypeDeclaration> analyze,NameCheck.Operation op, String cad, int idioma) {
		super(analyze);
		nCheck= new NameCheck(op, cad, idioma);
	}

	@Override
	public void check() {
		for (TypeDeclaration t: super.analyze){
			try{
				if(nCheck.checkNameOperation(t.getName().toString())){
					super.addRight(t);
				}else{
					super.addWrong(t);
				}
			}catch(PropertiesException e){
				e.printStackTrace();
			}
		}

	}

}
