package es.uam.sara.tfg.properties.methods;

import java.util.List;

import org.eclipse.jdt.core.dom.MethodDeclaration;

import es.uam.sara.tfg.properties.IsGeneric;

public class MethIsGeneric extends Method{

	@Override
	public void check(List<MethodDeclaration> analize) {
		IsGeneric generic= new IsGeneric();
		for (MethodDeclaration meth: analize){
			if (generic.check(meth)){
				super.addRight(meth);
			}else{
				super.addWrong(meth);
			}
		}
		
	}

}
