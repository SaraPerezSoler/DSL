
/**
 * 
 */
package es.uam.sara.tfg.properties.attributes;

import es.uam.sara.tfg.elements.type.MAttribute;
import es.uam.sara.tfg.properties.Property;


/**
 * @author Sara
 *
 */
public class Initialize extends Property<MAttribute>{

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
	public boolean checkElement(MAttribute analize) {
		return analize.isInitialize();
	}

}
