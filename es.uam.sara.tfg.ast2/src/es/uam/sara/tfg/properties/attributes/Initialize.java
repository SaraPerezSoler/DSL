
/**
 * 
 */
package es.uam.sara.tfg.properties.attributes;

import java.util.List;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see es.uam.sara.tfg.properties.Properties#check()
	 */
	@Override
	public void check(List<FieldDeclaration> analyze){
		for (FieldDeclaration fd : analyze) {
			if (fd.fragments().get(0) instanceof VariableDeclarationFragment) {
				VariableDeclarationFragment declaration = (VariableDeclarationFragment) fd.fragments().get(0);
				if (declaration.getInitializer() == null) {
					super.addWrong(fd);
				} else {
					super.addRight(fd);
				}
			}
		}
	}

	@Override
	public String toString() {
		return "is initialize";
	}

}
