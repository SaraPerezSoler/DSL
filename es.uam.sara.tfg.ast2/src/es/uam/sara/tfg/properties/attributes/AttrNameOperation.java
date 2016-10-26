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
	public AttrNameOperation(NameCheck.Operation op, String cad, int idioma) {
		super();
		ncheck= new NameCheck(op,cad,idioma);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see es.uam.sara.tfg.properties.Properties#check()
	 */
	@Override
	public void check(List<FieldDeclaration> analyze) {
		for (FieldDeclaration a : analyze) {
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

	@Override
	public String toString() {
		if (ncheck.getIdioma()==NameCheck.EMPTY){
			return "name "+ncheck.getOp() +" " +ncheck.getOther();
		}else if (ncheck.getIdioma()==NameCheck.ENGLISH){
			return "name "+ncheck.getOp() +" " +ncheck.getOther()+", English";
		}else {
			return "name "+ncheck.getOp() +" " +ncheck.getOther()+", Spanish";
		}
		
	}

}
