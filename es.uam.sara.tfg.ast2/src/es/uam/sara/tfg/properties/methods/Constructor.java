/**
 * 
 */
package es.uam.sara.tfg.properties.methods;

import java.util.List;

import org.eclipse.jdt.core.dom.MethodDeclaration;

import es.uam.sara.tfg.properties.PropertiesException;

/**
 * @author Sara
 *
 */
public class Constructor extends Method{

	/**
	 * @param analyze
	 */
	public Constructor(List<MethodDeclaration> analyze) {
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
			for (MethodDeclaration m : super.analyze) {
				if (m.isConstructor()) {
					super.addRight(m);
				} else {
					super.addWrong(m);
				}
			}
		} catch (PropertiesException e) {
			e.printStackTrace();
		}
	}

}
