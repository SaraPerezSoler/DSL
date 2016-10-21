package es.uam.sara.tfg.properties.interfaces;

import java.util.List;
import org.eclipse.jdt.core.dom.TypeDeclaration;


public class InterNoEmpty extends Interface{

	public InterNoEmpty() {
		super();
	}

	@Override
	public void check(List<TypeDeclaration> analyze) {
		for (TypeDeclaration t: analyze){
			if (t.bodyDeclarations().isEmpty()){
				addWrong(t);
			}else{
				addRight(t);
			}
		}
	}

}
