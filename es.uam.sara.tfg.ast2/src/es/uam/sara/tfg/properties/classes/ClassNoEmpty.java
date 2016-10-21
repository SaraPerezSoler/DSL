package es.uam.sara.tfg.properties.classes;

import java.util.List;
import org.eclipse.jdt.core.dom.TypeDeclaration;


public class ClassNoEmpty extends Class{

	public ClassNoEmpty() {
		super();
	}

	@Override
	public void check(List<TypeDeclaration> analyze) {
		for (TypeDeclaration t: analyze){
			if (t.bodyDeclarations().isEmpty()){
				super.addWrong(t);
			}else{
				super.addRight(t);
			}
		}
	}

}
