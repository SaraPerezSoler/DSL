package es.uam.sara.tfg.properties.packages;

import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.NameCheck.Type;
import es.uam.sara.tfg.elements.Package;

public class PackNameType extends PackageProperty{

	private NameCheck nCheck;
	public PackNameType( Type type) {
		super();
		nCheck= new NameCheck(type);
	}
	@Override
	public String toString() {
		return "name type="+nCheck.getType();
	}

	@Override
	public boolean checkElement(Package analyze) {
		return nCheck.checkNameType(analyze.getName());
	}
}
