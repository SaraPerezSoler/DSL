package es.uam.sara.tfg.properties.classes;

import java.util.List;

import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.properties.PropertiesException;

public class Implements extends Class{

	private int intMin;
	private int intMax;
	
	public Implements(List<TypeDeclaration> analyze,int min, int max) {
		super(analyze);
		intMin=min;
		intMax=max;
	}

	@Override
	public void check() {
		try{
			for (TypeDeclaration t: super.analyze){
				if (t.superInterfaceTypes().size()<intMin || t.superInterfaceTypes().size()>intMax){
					super.addWrong(t);
				}else{
					super.addRight(t);
				}
			}
		}catch(PropertiesException e){
			e.printStackTrace();
		}
		
	}

}
