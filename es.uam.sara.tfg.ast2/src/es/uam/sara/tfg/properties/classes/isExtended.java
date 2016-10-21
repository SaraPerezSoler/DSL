/**
 * 
 */
package es.uam.sara.tfg.properties.classes;

import java.util.List;
import org.eclipse.jdt.core.dom.TypeDeclaration;


/**
 * @author Sara
 *
 */
public class isExtended extends Class{

	private  List<TypeDeclaration> allClasses;
	/**
	 * @param allClasses
	 */
	public isExtended(List<TypeDeclaration> allClasses) {
		super();
		this.allClasses=allClasses;

	}

	/* (non-Javadoc)
	 * @see es.uam.sara.tfg.properties.Properties#check()
	 */
	@Override
	public void check(List<TypeDeclaration> analyze) {
		for (TypeDeclaration t: analyze){
			if (check(t)){
				super.addRight(t);
			}else{
				super.addWrong(t);
			}
		}

	}
	private boolean check(TypeDeclaration t){
		for(TypeDeclaration td: allClasses){
			if (td.getSuperclassType().toString().equals(t.getName())){
				return true;
			}
		}
		return false;
	}

}
