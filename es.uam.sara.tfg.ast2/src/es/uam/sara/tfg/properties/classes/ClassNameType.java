package es.uam.sara.tfg.properties.classes;

import java.util.List;

import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.NameCheck.Type;

public class ClassNameType extends Class{

	NameCheck nCheck;

	public ClassNameType( Type type) {
		super();
		nCheck = new NameCheck(type);
	}

	@Override
	public void check(List<TypeDeclaration> analyze) {
		for (TypeDeclaration t : analyze) {
			if (nCheck.checkNameType(t.getName().toString())) {
				super.addRight(t);
			} else {
				super.addWrong(t);
			}
		}

	}

}
