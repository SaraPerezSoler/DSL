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
	public void check(List<FieldDeclaration> analyze) {
		for (FieldDeclaration a : analyze) {
			List<String>types=TypeToString.getString(a.getType());
			if (types.contains(type.toLowerCase())) {
				super.addRight(a);
			} else {
				super.addWrong(a);
			}
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "type=" + type ;
	}

}
