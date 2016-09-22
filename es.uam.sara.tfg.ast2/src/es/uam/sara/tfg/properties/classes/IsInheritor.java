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
	public IsInheritor(List<TypeDeclaration> analyze) {
		super(analyze);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see es.uam.sara.tfg.properties.Properties#check()
	 */
	@Override
	public void check() {
		for (TypeDeclaration t : super.analyze) {
			if (t.getSuperclassType().toString().equals(Object.class.toString())) {
				super.addWrong(t);
			} else {
				super.addRight(t);
			}
		}
	}
}
