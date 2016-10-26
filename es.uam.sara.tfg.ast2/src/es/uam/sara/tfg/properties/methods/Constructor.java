/**
 * 
 */
package es.uam.sara.tfg.properties.methods;

import java.util.List;
import org.eclipse.jdt.core.dom.MethodDeclaration;

/**
 * @author Sara
 *
 */
public class Constructor extends Method{

	/**
	 * @param analyze
	 */
	public Constructor() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see es.uam.sara.tfg.properties.Properties#check()
	 */
	@Override
	public void check(List<MethodDeclaration> analyze){
		for (MethodDeclaration m : analyze) {
			if (m.isConstructor()) {
				super.addRight(m);
			} else {
				super.addWrong(m);
			}
		}
	}

	@Override
	public String toString() {
		return "is constructor";
	}

}
