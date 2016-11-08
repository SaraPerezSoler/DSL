package es.uam.sara.tfg.properties.classes;

import java.util.List;
import org.eclipse.jdt.core.dom.TypeDeclaration;


public class Implements extends Class{

	private int intMin;
	private int intMax;
	
	public Implements(int min, int max) {
		super();
		intMin=min;
		intMax=max;
	}

	@Override
	public void check(List<TypeDeclaration> analyze) {
		for (TypeDeclaration t: analyze){
			if (comprobar(t)){
				super.addRight(t);
			}else{
				super.addWrong(t);
				
			}
		}
	}
	private boolean comprobar(TypeDeclaration t){
		if (t.superInterfaceTypes().size()>=intMin && intMax==-1){
			return true;
		}
		if (t.superInterfaceTypes().size()>=intMin && t.superInterfaceTypes().size()<=intMax){
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "implements min=" + intMin + " and max=" + intMax;
	}
	
	

}
