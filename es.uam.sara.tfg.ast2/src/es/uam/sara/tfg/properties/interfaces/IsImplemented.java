package es.uam.sara.tfg.properties.interfaces;

import java.util.List;

import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class IsImplemented extends Interface {

	private List<TypeDeclaration> allTypes;

	public IsImplemented(List<TypeDeclaration> allTypes) {
		super();
		this.allTypes = allTypes;
	}

	@Override
	public void check(List<TypeDeclaration> analyze) {
		for (TypeDeclaration t : analyze) {
			if (check(t)) {
				super.addRight(t);
			} else {
				super.addWrong(t);
			}
		}
	}

	private boolean check(TypeDeclaration td) {
		for (TypeDeclaration a : allTypes) {
			for (Object t : a.superInterfaceTypes()) {
				if (t instanceof SimpleType) {
					SimpleType st = (SimpleType) t;
					if (st.getName().toString().equals(td.getName().toString())) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "is implemented";
	}

}
