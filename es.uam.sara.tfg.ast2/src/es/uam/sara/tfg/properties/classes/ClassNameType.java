package es.uam.sara.tfg.properties.classes;

import java.util.List;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.NameCheck.Type;
import es.uam.sara.tfg.properties.PropertiesException;

public class ClassNameType extends Class {

	NameCheck nCheck;

	public ClassNameType(List<TypeDeclaration> analyze, Type type) {
		super(analyze);
		nCheck = new NameCheck(type);
	}

	@Override
	public void check() {
		for (TypeDeclaration t : super.analyze) {
			try {
				if (nCheck.checkNameType(t.getName().toString())) {
					super.addRight(t);
				} else {
					super.addWrong(t);
				}
			} catch (PropertiesException e) {
				e.printStackTrace();
			}
		}

	}

}
