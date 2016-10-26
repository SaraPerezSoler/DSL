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
public class IsInheritor extends Class{

	/**
	 * @param analyze
	 */
	public IsInheritor() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see es.uam.sara.tfg.properties.Properties#check()
	 */
	@Override
	public void check(List<TypeDeclaration> analyze) {
		for (TypeDeclaration t : analyze) {
			if (t.getSuperclassType().toString().equals(Object.class.toString())) {
				super.addWrong(t);
			} else {
				super.addRight(t);
			}
		}
	}

	@Override
	public String toString() {
		return "is inheritor";
	}
}
