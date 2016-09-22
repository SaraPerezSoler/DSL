package es.uam.sara.tfg.properties.enumerations;

import java.util.List;

import org.eclipse.jdt.core.dom.EnumDeclaration;

import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.NameCheck.Type;
import es.uam.sara.tfg.properties.PropertiesException;

public class EnumNameType extends Enumeration{

	private NameCheck nCheck;

	public EnumNameType(List<EnumDeclaration> analyce, Type type) {
		super(analyce);
		nCheck = new NameCheck(type);
	}

	@Override
	public void check() {
		for (EnumDeclaration en : super.analyze) {
			try {
				if (nCheck.checkNameType(en.getName().toString())) {
					super.addRight(en);
				} else {
					super.addWrong(en);
				}
			} catch (PropertiesException e) {
				e.printStackTrace();
			}

		}
	}

}
