/**
 * 
 */
package es.uam.sara.tfg.properties.attributes;

import java.util.List;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import es.uam.sara.tfg.properties.NameCheck;


/**
 * @author Sara
 *
 */
public class AttrNameOperation extends Attribute{

	private NameCheck ncheck;

	/**
	 * @param analyze
	 */
	public AttrNameOperation(List<FieldDeclaration> analyze, NameCheck.Operation op, String cad, int idioma) {
		super(analyze);
		ncheck= new NameCheck(op,cad,idioma);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see es.uam.sara.tfg.properties.Properties#check()
	 */
	@Override
	public void check() {
		for (FieldDeclaration a : super.analyze) {
			if (a.fragments().get(0) instanceof VariableDeclarationFragment) {
				VariableDeclarationFragment declaration = (VariableDeclarationFragment) a.fragments().get(0);
				if (ncheck.checkNameOperation(declaration.getName().toString())) {
					addRight(a);
				} else {
					addWrong(a);
				}
			}
		}
	}

}
