package es.uam.sara.tfg.properties.packages;

import java.util.List;

import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.NameCheck.Type;

public class PackNameType extends Package{

	private NameCheck nCheck;
	public PackNameType( Type type) {
		super();
		nCheck= new NameCheck(type);
	}

	@Override
	public void check(List<String> analyze) {

	}
	@Override
	public String toString() {
		return "name type="+nCheck.getType();
	}
}
