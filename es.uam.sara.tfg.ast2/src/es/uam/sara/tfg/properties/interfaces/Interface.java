package es.uam.sara.tfg.properties.interfaces;

import java.util.List;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.properties.Properties;


public abstract class Interface extends Properties<TypeDeclaration> {

	public Interface(List<TypeDeclaration> analyce) {
		super(analyce);
	}

}
