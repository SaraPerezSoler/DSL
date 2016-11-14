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
	/*
	 * (non-Javadoc)
	 * 
	 * @see es.uam.sara.tfg.properties.Properties#check()
	 */
	@Override
	public void check(List<TypeDeclaration> analyze) {
		
		for (TypeDeclaration t : analyze) {
			List<String> superClass=TypeToString.getString(t.getSuperclassType());
			if (of==null){
				if (superClass.isEmpty() || superClass.contains(Object.class.toString().toLowerCase())){
					addWrong(t);
				}else{
					addRight(t);
				}
			}else{
				if (superClass.contains(of.toLowerCase())){
					addRight(t);
				}else{
					addWrong(t);
				}
			}
		}
	}

	@Override
	public String toString() {
		if (of==null)
			return "is subClass";
		else 
			return "is subClass of "+ of;
	}
}
