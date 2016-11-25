package es.uam.sara.tfg.properties.methods;

import es.uam.sara.tfg.elements.type.Method;

public class isOverride extends MethodProperty{

	public isOverride(boolean no) {
		super(no);
	}

	@Override
	public boolean checkElement(Method analyze) {
		/*if (analyze.getParent() instanceof TypeDeclaration){
			
		}*/
		return false;
	}

	@Override
	public String toString() {
		return null;
	}

}
