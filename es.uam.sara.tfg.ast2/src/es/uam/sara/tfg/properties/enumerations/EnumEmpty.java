package es.uam.sara.tfg.properties.enumerations;

import java.util.List;
import org.eclipse.jdt.core.dom.EnumDeclaration;


public class EnumEmpty extends Enumeration{

	private boolean no;

	public EnumEmpty(boolean no) {
		super();
		this.no = no;
	}

	@Override
	public void check(List<EnumDeclaration> analyze) {
		for (EnumDeclaration en: analyze){
			if (en.bodyDeclarations().isEmpty()){
				if (no) {
					addWrong(en);
				} else {
					addRight(en);
				}
			} else {
				if (no) {
					addRight(en);
				} else {
					addWrong(en);
				}
				
			}
		}
		
	}
	@Override
	public String toString() {
		return "no empty";
	}
}
