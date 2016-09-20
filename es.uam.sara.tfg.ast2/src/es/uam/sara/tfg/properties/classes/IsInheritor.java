/**
 * 
 */
package es.uam.sara.tfg.properties.classes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.properties.PropertiesException;

/**
 * @author Sara
 *
 */
public class IsInheritor extends Class {

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
		try {
			for (TypeDeclaration t : super.analyze) {
				if (t.getSuperclassType().toString().equals(Object.class.toString())) {
					super.addWrong(t);
				} else {
					super.addRight(t);
				}
			}
		} catch (PropertiesException e) {
			e.printStackTrace();
		}
	}
}
