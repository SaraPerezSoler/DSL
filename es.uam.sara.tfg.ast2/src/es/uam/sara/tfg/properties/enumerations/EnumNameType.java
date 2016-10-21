package es.uam.sara.tfg.properties.enumerations;

import java.util.List;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.NameCheck.Type;


public class EnumNameType extends Enumeration{

	private NameCheck nCheck;

	public EnumNameType(Type type) {
		super();
		nCheck = new NameCheck(type);
	}

	@Override
	public void check(List<EnumDeclaration> analyze) {
		for (EnumDeclaration en : analyze) {
			if (nCheck.checkNameType(en.getName().toString())) {
				super.addRight(en);
			} else {
				super.addWrong(en);
			}

		}
	}

}
