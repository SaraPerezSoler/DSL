package es.uam.sara.tfg.properties.methods;

import java.util.List;
import org.eclipse.jdt.core.dom.MethodDeclaration;

public class MethEmpty extends Method {

	private boolean no;

	public MethEmpty(boolean no) {
		super();
		this.no = no;
	}

	@Override
	public void check(List<MethodDeclaration> analyze) {
		for (MethodDeclaration m : analyze) {
			if (m.getBody().statements().isEmpty()) {
				if (no) {
					addWrong(m);
				} else {
					addRight(m);
				}
			} else {
				if (no) {
					addRight(m);
				} else {
					addWrong(m);
				}
				
			}
		}
	}

	@Override
	public String toString() {
		return "no empty";
	}
}
