package es.uam.sara.tfg.properties.packages;

import es.uam.sara.tfg.properties.NameCheck;

public class PackNameOperation extends Package {

	private NameCheck nCheck;
	public PackNameOperation(NameCheck.Operation op, String cad, int idioma) {
		super();
		this.nCheck=new NameCheck(op, cad, idioma);
	}
	@Override
	public String toString() {
		if (nCheck.getIdioma()==NameCheck.EMPTY){
			return "name "+nCheck.getOp() +" " +nCheck.getOther();
		}else if (nCheck.getIdioma()==NameCheck.ENGLISH){
			return "name "+nCheck.getOp() +" " +nCheck.getOther()+", English";
		}else {
			return "name "+nCheck.getOp() +" " +nCheck.getOther()+", Spanish";
		}
		
	}

	@Override
	public boolean checkElement(String analyze) {
		return nCheck.checkNameOperation(analyze);
	}
}
