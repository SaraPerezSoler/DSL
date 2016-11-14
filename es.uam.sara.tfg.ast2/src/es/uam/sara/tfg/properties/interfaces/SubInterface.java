/**
 * 
 */
package es.uam.sara.tfg.properties.interfaces;

import java.util.List;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.properties.TypeToString;


/**
 * @author Sara
 *
 */
public class SubInterface extends Interface{

	private String of;
	/**
	 * @param analyze
	 */
	public SubInterface(String of) {
		this.of=of;
	}

	public SubInterface() {
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
			List<String> superInterface=TypeToString.getString(t.superInterfaceTypes());
			if (of==null){
				if (superInterface.isEmpty()){
					addWrong(t);
				}else{
					addRight(t);
				}
			}else{
				if (superInterface.contains(of.toLowerCase())){
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
