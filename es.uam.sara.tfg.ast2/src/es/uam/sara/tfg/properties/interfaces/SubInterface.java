/**
 * 
 */
package es.uam.sara.tfg.properties.interfaces;

import java.util.List;
import es.uam.sara.tfg.elements.ClassInterface;

/**
 * @author Sara
 *
 */
public class SubInterface extends InterfaceProperty {

	private String of;
	private int intMin;
	private int intMax;

	/**
	 * @param analyze
	 */
	public SubInterface(String of) {
		this.of = of;
		this.intMax = Integer.MAX_VALUE;
		this.intMin = -1;
	}

	public SubInterface(int min, int max) {
		of = null;
		this.intMax = max;
		this.intMin = min;
	}

	public SubInterface() {
		this.of = null;
		this.intMax = Integer.MAX_VALUE;
		this.intMin = -1;
	}

	@Override
	public String toString() {
		if (of == null) {
			if (intMin == -1 && intMax == Integer.MAX_VALUE) {
				return "extends some interface";
			} else {
				if (intMax == Integer.MAX_VALUE) {
					return "extends [" + intMin + "..*] interfaces";
				} else {
					return "extends [" + intMin + ".." + intMax + "] interfaces";
				}
			}
		} else {
			return "extends the interface " + of;
		}
	}

	@Override
	public boolean checkElement(ClassInterface analyze) {
		List<String> superInterface = analyze.getSuperInterfaces();
		if (of == null) {
			if (superInterface.size() < intMin || superInterface.size() > intMax) {
				return false;
			} else {
				return true;
			}
		} else {
			if (superInterface.contains(of.toLowerCase())) {
				return true;
			} else {
				return false;
			}
		}
		
	}
}
