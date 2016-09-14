/**
 * 
 */
package es.uam.sara.tfg.properties.attributes;

import java.util.List;

import org.eclipse.jdt.core.dom.FieldDeclaration;

/**
 * @author Sara
 *
 */
public class Initialize extends Attribute {

	/**
	 * @param all
	 */
	public Initialize(List<FieldDeclaration> all) {
		super(all);
	}

	/* (non-Javadoc)
	 * @see es.uam.sara.tfg.properties.Properties#check()
	 */
	@Override
	public void check() {

	}

}
