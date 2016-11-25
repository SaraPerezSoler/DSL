
/**
 * 
 */
package es.uam.sara.tfg.properties.attributes;

import es.uam.sara.tfg.elements.type.Attribute;


/**
 * @author Sara
 *
 */
public class Initialize extends AttributeProperty{

	/**
	 * @param analyze
	 */
	public Initialize(boolean no) {
		super(no);
	}

	@Override
	public String toString() {
		if (no){
			return "is not initialize";
		}
		return "is initialize";
	}

	@Override
	public boolean checkElement(Attribute analize) {
		return analize.isInitialize();
	}

}
