/**
 * 
 */
package es.uam.sara.tfg.properties.classes;


import org.eclipse.jdt.core.dom.Type;
import es.uam.sara.tfg.elements.type.ClassInterface;
import es.uam.sara.tfg.properties.TypeProperty;



/**
 * @author Sara
 *
 */
public class SubClass extends ClassProperty implements TypeProperty{

	private String of;
	/**
	 * @param analyze
	 */
	public SubClass(String subClass) {
		this.of=subClass;
	}

	public SubClass() {
		of=null;
	}

	@Override
	public String toString() {
		if (of==null)
			return "is subClass";
		else 
			return "is subClass of "+ of;
	}

	@Override
	public boolean checkElement(ClassInterface t) {
		Type superClass=t.getSuperclass();
		if (of==null){
			if (superClass!=null){
				return false;
			}else{
				return true;
			}
		}else{
			if (this.equalType(superClass, of)){
				return true;
			}else{
				return false;
			}
		}
	}
}
