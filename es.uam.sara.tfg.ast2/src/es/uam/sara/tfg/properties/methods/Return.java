package es.uam.sara.tfg.properties.methods;

import org.eclipse.jdt.core.dom.Type;

import es.uam.sara.tfg.elements.type.MMethod;
import es.uam.sara.tfg.properties.StringProperty;

public class Return extends StringProperty<MMethod> {

	private es.uam.sara.tfg.properties.type.Type type = null;

	public Return(boolean no, es.uam.sara.tfg.properties.type.Type type) {
		super(no);
		this.type = type;
	}

	@Override
	public String toString() {
		if (no) {
			return "return type <>" + type;
		} else {
			return "return type =" + type;
		}

	}

	@Override
	public boolean checkElement(MMethod analyze) {
		Type returnType = analyze.getReturnType();
		if (type.compare(returnType)) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public void setString(String string, int i) {
		type.setString(string);

	}

	@Override
	public void deleteString(String string, int i) {
		type.deleteString(string);
	}

}
