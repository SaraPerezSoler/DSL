package es.uam.sara.tfg.properties.attributes;

import java.util.List;
import org.eclipse.jdt.core.dom.FieldDeclaration;


public class Type extends Attribute{

	private String type;

	public Type(String type) {
		
		super();
		this.type = type;
	}

	@Override
	public void check(List<FieldDeclaration> analyze) {
		for (FieldDeclaration a : analyze) {
			if (a.getType().toString().compareToIgnoreCase(type)==0) {
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
