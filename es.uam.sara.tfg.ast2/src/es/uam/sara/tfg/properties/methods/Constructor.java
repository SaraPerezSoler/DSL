/**
 * 
 */
package es.uam.sara.tfg.properties.methods;

import es.uam.sara.tfg.elements.type.MMethod;
import es.uam.sara.tfg.properties.Property;

/**
 * @author Sara
 *
 */
public class Constructor extends Property<MMethod>{

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
	public boolean checkElement(MMethod analyze) {
		return analyze.isConstructor();
	}

}
