package es.uam.sara.tfg.properties.attributes;

import java.util.List;
import org.eclipse.jdt.core.dom.FieldDeclaration;

import es.uam.sara.tfg.properties.TypeToString;


public class Type extends Attribute{

	private String type;

	public Type(String type) {
		
		super();
		this.type = type;
	}
	@Override
	public String toString() {
		return "type=" + type ;
	}

	@Override
	public boolean checkElement(FieldDeclaration a) {
		List<String>types=TypeToString.getString(a.getType());
		return types.contains(type.toLowerCase());
	}

}
