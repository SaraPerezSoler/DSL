package es.uam.sara.tfg.properties.interfaces;

import java.util.List;
import org.eclipse.jdt.core.dom.TypeDeclaration;


public class InterEmpty extends Interface{

	private boolean no;

	public InterEmpty(boolean no) {
		super();
		this.no = no;
	}

	@Override
	public void check(List<TypeDeclaration> analyze) {
		for (TypeDeclaration t: analyze){
			if (t.bodyDeclarations().isEmpty()){
				if (no) {
					addWrong(t);
				} else {
					addRight(t);
				}
			} else {
				if (no) {
					addRight(t);
				} else {
					addWrong(t);
				}
				
			}
		}
	}
	@Override
	public String toString() {
		return "no empty";
	}
}
