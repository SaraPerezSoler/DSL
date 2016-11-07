package es.uam.sara.tfg.properties.classes;

import java.util.List;
import org.eclipse.jdt.core.dom.TypeDeclaration;


public class ClassEmpty extends Class{

	private boolean no;

	public ClassEmpty(boolean no) {
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
		if (no){
			return "no empty";
		}else{
			return "empty";
		}
	}

}
