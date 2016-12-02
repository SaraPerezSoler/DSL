package es.uam.sara.tfg.properties.methods;

import org.eclipse.jdt.core.dom.Type;

import es.uam.sara.tfg.elements.type.Method;
import es.uam.sara.tfg.properties.StringProperty;
import es.uam.sara.tfg.properties.type.TypeIsCollection;
import es.uam.sara.tfg.properties.type.TypeString;

public class Return extends StringProperty<Method> {

	private es.uam.sara.tfg.properties.type.Type type = null;

	public Return(boolean no) {
		super(no);
	}

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
	public boolean checkElement(Method analyze) {
		Type returnType = analyze.getReturnType();
		if (type.compare(returnType)) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public void setString(String string) {
		if (type != null) {
			if (type.isVariable()) {
				if (type instanceof TypeIsCollection) {
					((TypeIsCollection) type).setString(string);
				} else {
					type = new TypeString(string, true);
				}
			}
		} else {
			type = new TypeString(string, true);
		}

	}

	@Override
	public void deleteString(String string) {
		if (type == null) {
			return;
		}
		if (type.isVariable()) {
			if (type instanceof TypeIsCollection) {
				((TypeIsCollection) type).removeString(string);
			} else {
				if (type.getString().equals(string)) {
					type = null;
				}
			}
		}

	}

}
