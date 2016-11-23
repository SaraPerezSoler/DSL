/**
 * 
 */
package es.uam.sara.tfg.properties.attributes;

import es.uam.sara.tfg.elements.Attribute;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.StringProperty;


/**
 * @author Sara
 *
 */
public class AttrNameOperation extends AttributeProperty implements StringProperty{

	private NameCheck ncheck;

	
	public AttrNameOperation(NameCheck.Operation op, String cad, int idioma) {
		super();
		ncheck= new NameCheck(op,cad,idioma);
	}

	public AttrNameOperation(NameCheck.Operation op, String cad) {
		super();
		ncheck= new NameCheck(op,cad,NameCheck.EMPTY);
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

	@Override
	public boolean checkElement(Attribute analyze) {
		return ncheck.checkNameOperation(analyze.getName());

	}

}
