package es.uam.sara.tfg.properties.methods;

import es.uam.sara.tfg.elements.type.MMethod;
import es.uam.sara.tfg.properties.Property;

public class isOverride extends Property<MMethod>{

	public isOverride(boolean no) {
		super(no);
	}

	@Override
	public boolean checkElement(MMethod analyze) {
		/*if (analyze.getParent() instanceof TypeDeclaration){
			
		}*/
		return false;
	}

	@Override
	public String toString() {
		return null;
	}

}
