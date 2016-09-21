package es.uam.sara.tfg.properties.interfaces;

import java.util.List;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.PropertiesException;
import es.uam.sara.tfg.properties.NameCheck.Type;

public class InterNameType extends Interface {

	private NameCheck nCheck;
	public InterNameType(List<TypeDeclaration> analyce, Type type) {
		super(analyce);
		nCheck= new NameCheck(type);
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
