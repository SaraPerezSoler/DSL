
package es.uam.sara.tfg.properties.attributes;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import es.uam.sara.tfg.properties.NameCheck;


public class AttrNameType extends Attribute{

	private NameCheck nCheck;
	
	public AttrNameType(NameCheck.Type type) {
		super();
		nCheck= new NameCheck(type);
	}

	@Override
	public String toString() {
		return "name type="+nCheck.getType();
	}

	@Override
	public boolean checkElement(FieldDeclaration analyze) {
		return nCheck.checkNameType(analyze);
	}

}
