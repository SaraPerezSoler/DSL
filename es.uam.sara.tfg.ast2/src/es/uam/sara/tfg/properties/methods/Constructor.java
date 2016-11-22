/**
 * 
 */
package es.uam.sara.tfg.properties.methods;

import es.uam.sara.tfg.elements.Method;

/**
 * @author Sara
 *
 */
public class Constructor extends MethodProperty{

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
	public boolean checkElement(Method analyze) {
		return analyze.getBodyDeclarations().isConstructor();
	}

}
