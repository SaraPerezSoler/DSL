/**
 * 
 */
package es.uam.sara.tfg.properties.classes;

import java.util.List;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.properties.TypeToString;


/**
 * @author Sara
 *
 */
public class SubClass extends Class{

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
	public boolean checkElement(TypeDeclaration t) {
		List<String> superClass=TypeToString.getString(t.getSuperclassType());
		if (of==null){
			if (superClass.isEmpty() || superClass.contains(Object.class.toString().toLowerCase())){
				return false;
			}else{
				return true;
			}
		}else{
			if (superClass.contains(of.toLowerCase())){
				return true;
			}else{
				return false;
			}
		}
	}
}
