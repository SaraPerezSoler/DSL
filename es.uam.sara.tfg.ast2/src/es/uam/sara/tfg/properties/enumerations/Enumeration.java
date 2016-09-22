package es.uam.sara.tfg.properties.enumerations;

import java.util.List;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import es.uam.sara.tfg.properties.Properties;


public abstract class Enumeration extends Properties<EnumDeclaration> {

	public Enumeration(List<EnumDeclaration> analyce) {
		super(analyce);
	}

}
