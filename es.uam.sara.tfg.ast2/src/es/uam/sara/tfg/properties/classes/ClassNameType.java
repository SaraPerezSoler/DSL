package es.uam.sara.tfg.properties.classes;

import java.util.List;

import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.NameCheck.Type;

public class ClassNameType extends Class{

	NameCheck nCheck;

	public ClassNameType(List<TypeDeclaration> analyze, Type type) {
		super(analyze);
		nCheck = new NameCheck(type);
	}

	@Override
	public void check() {
		for (TypeDeclaration t : super.analyze) {
			if (nCheck.checkNameType(t.getName().toString())) {
				super.addRight(t);
			} else {
				super.addWrong(t);
			}
		}

	}

}
