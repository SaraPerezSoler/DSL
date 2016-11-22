
/**
 * 
 */
package es.uam.sara.tfg.properties.attributes;

import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

import es.uam.sara.tfg.elements.Attribute;


/**
 * @author Sara
 *
 */
public class Initialize extends AttributeProperty{

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
	public boolean checkElement(Attribute analize) {
		if (analize.getBodyDeclarations().fragments().get(0) instanceof VariableDeclarationFragment) {
			VariableDeclarationFragment declaration = (VariableDeclarationFragment) analize.getBodyDeclarations().fragments().get(0);
			if (declaration.getInitializer() != null) {
				return true;
			}
		}
		return false;
	}

}
