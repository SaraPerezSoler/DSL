/**
 * 
 */
package es.uam.sara.tfg.properties.methods;

import org.eclipse.jdt.core.dom.MethodDeclaration;

/**
 * @author Sara
 *
 */
public class Constructor extends Method{

	/**
	 * @param analyze
	 */
	public Constructor() {
		super();
	}
	
	@Override
	public String toString() {
		return "is constructor";
	}

	@Override
	public boolean checkElement(MethodDeclaration analyze) {
		return analyze.isConstructor();
	}

}
