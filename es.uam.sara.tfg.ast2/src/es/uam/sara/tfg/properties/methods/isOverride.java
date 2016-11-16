package es.uam.sara.tfg.properties.methods;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class isOverride extends Method{

	@Override
	public boolean checkElement(MethodDeclaration analyze) {
		if (analyze.getParent() instanceof TypeDeclaration){
			
		}
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
