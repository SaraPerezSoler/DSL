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
	public SubClass(boolean no,String subClass) {
		super(no);
		this.of=subClass;
	}

	public SubClass(boolean no) {
		super(no);
		of=null;
	}

	@Override
	public String toString() {
		String cad;
		if (no){
			cad="is not ";
		}else{
			cad="is ";
		}
		if (of==null)
			return cad +"subClass";
		else 
			return cad +"subClass of "+ of;
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
