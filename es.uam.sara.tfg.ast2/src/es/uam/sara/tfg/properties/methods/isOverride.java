package es.uam.sara.tfg.properties.methods;

import es.uam.sara.tfg.elements.type.Method;

public class isOverride extends MethodProperty{

	@Override
	public boolean checkElement(Method analyze) {
		/*if (analyze.getParent() instanceof TypeDeclaration){
			
		}*/
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
