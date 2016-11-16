package es.uam.sara.tfg.properties.classes;

import java.util.List;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.properties.NameCheck;

public class JUnit extends Class{

	private List<TypeDeclaration> allClass;
	public JUnit(List<TypeDeclaration> allClass) {
		this.allClass=allClass;
	}
	@Override
	public boolean checkElement(TypeDeclaration analyze) {
		for (TypeDeclaration c: allClass){
			String otheClass= NameCheck.getName(c);
			String clas= NameCheck.getName(analyze);
			if (otheClass.equals(clas+"Test")){
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "exist JUnit";
	}

}
