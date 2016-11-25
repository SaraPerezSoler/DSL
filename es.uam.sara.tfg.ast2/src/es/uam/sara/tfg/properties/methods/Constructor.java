/**
 * 
 */
package es.uam.sara.tfg.properties.methods;

import es.uam.sara.tfg.elements.type.Method;

/**
 * @author Sara
 *
 */
public class Constructor extends MethodProperty{

	/**
	 * @param analyze
	 */
	public Constructor(boolean no) {
		super(no);
	}
	
	@Override
	public String toString() {
		if (no){
			return "is not constructor";
		}
		return "is constructor";
	}

	@Override
	public boolean checkElement(Method analyze) {
		return analyze.isConstructor();
	}

}
