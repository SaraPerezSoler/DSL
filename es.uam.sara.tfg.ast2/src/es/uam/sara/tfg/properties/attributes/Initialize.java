
/**
 * 
 */
package es.uam.sara.tfg.properties.attributes;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;


/**
 * @author Sara
 *
 */
public class Initialize extends Attribute{

	/**
	 * @param analyze
	 */
	public Initialize() {
		super();
	}

	@Override
	public String toString() {
		return "is initialize";
	}

	@Override
	public boolean checkElement(FieldDeclaration analize) {
		if (analize.fragments().get(0) instanceof VariableDeclarationFragment) {
			VariableDeclarationFragment declaration = (VariableDeclarationFragment) analize.fragments().get(0);
			if (declaration.getInitializer() != null) {
				return true;
			}
		}
		return false;
	}

}
