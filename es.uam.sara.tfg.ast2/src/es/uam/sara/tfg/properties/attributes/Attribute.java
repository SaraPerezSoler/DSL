
package es.uam.sara.tfg.properties.attributes;

import java.util.List;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import es.uam.sara.tfg.properties.Properties;


public abstract class Attribute extends Properties<FieldDeclaration> {

	public Attribute(List<FieldDeclaration> analyze) {
		super(analyze);
	}

	@Override
	public void check() {		
	}
}
