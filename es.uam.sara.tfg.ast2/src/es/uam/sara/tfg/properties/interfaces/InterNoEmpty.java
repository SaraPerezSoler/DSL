package es.uam.sara.tfg.properties.interfaces;

import java.util.List;
import org.eclipse.jdt.core.dom.TypeDeclaration;


public class InterNoEmpty extends Interface{

	public InterNoEmpty(List<TypeDeclaration> analyze) {
		super(analyze);
	}

	@Override
	public void check() {
		for (TypeDeclaration t: super.analyze){
			if (t.bodyDeclarations().isEmpty()){
				addWrong(t);
			}else{
				addRight(t);
			}
		}
	}

}
