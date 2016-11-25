/**
 * 
 */
package es.uam.sara.tfg.properties.all;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import es.uam.sara.tfg.elements.JavaTypes;
import es.uam.sara.tfg.elements.type.ClassInterface;
import es.uam.sara.tfg.properties.Properties;
import es.uam.sara.tfg.properties.TypeProperty;

/**
 * @author Sara
 *
 */
public abstract class Super extends Properties<ClassInterface> implements TypeProperty {

	private Map<ClassInterface, List<JavaTypes>> classesExtended;
	private int intMin;
	private int intMax;
	private List<String> nameSub;
	/*
	 * a -> b :a toma el valor analyze, b toma el valor all 
	 * class->class :a is superClass of b
	 * inter->class/enum :a is implemented for b inter->inter :a is
	 * superInterface of b class->enum :XXXXXXX no es posible
	 */
	private boolean aIsInterface;
	private boolean bIsInterface;


	public Super(int min, int max, List<String> subClass) {
		super();
		this.intMax = min;
		this.intMax = max;
		this.nameSub = subClass;
		classesExtended = new HashMap<ClassInterface, List<JavaTypes>>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see es.uam.sara.tfg.properties.Properties#check()
	 */
	@Override
	public boolean checkElement(ClassInterface td) {
		List<JavaTypes> sub = getSub(td);
		List<String> names=JavaTypes.getNames(sub);
		classesExtended.put(td, sub);
		if (sub.size() >= this.intMin && sub.size() <= this.intMax) {
			for (String s : this.nameSub) {
				if (!names.contains(s.toLowerCase())) {
					return false;
				}
			}
			return true;
		}

		return false;

	}

	public abstract List<JavaTypes> getSub(ClassInterface td);

	@Override
	public String toString() {
		String cad;
		if (aIsInterface == false && bIsInterface == false) {
			cad = "is superclass ";
		} else if (aIsInterface && bIsInterface == false) {
			cad = "is implemented ";
		} else {
			cad = "is superinterface ";
		}
		if (this.intMin != -1) {
			if (this.intMax != Integer.MAX_VALUE) {
				cad += "[" + intMin + "..*]";
			} else {
				cad += "[" + intMin + ".." + intMax + "]";
			}
		}
		if (!this.nameSub.isEmpty()) {
			cad += "{";
			for (String s : nameSub) {
				cad += s + " ";
			}
			cad += "}";
		}
		return cad;
	}

	public void setaIsInterface(boolean aIsInterface) {
		this.aIsInterface = aIsInterface;
	}

	public void setbIsInterface(boolean bIsInterface) {
		this.bIsInterface = bIsInterface;
	}
}
