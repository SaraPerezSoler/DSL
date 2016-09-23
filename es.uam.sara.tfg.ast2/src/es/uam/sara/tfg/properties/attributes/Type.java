package es.uam.sara.tfg.properties.attributes;

import java.util.List;
import org.eclipse.jdt.core.dom.FieldDeclaration;


public class Type extends Attribute{

	private String type;

	public Type(List<FieldDeclaration> analyze, String type) {
		super(analyze);
		this.type = type;
	}

	@Override
	public void check() {
		for (FieldDeclaration a : super.analyze) {
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

}
