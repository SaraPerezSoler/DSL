/**
 * 
 */
package es.uam.sara.tfg.properties.methods;

import java.util.List;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import es.uam.sara.tfg.properties.Properties;

/**
 * @author Sara
 *
 */
public abstract class Method extends Properties<MethodDeclaration> {

	public Method(List<MethodDeclaration> analyze) {
		super(analyze);
	}

}
