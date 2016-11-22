package es.uam.sara.tfg.properties.file;

import es.uam.sara.tfg.elements.File;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.NameCheck.Type;

public class FileNameType extends FileProperty{

	NameCheck nCheck;

	public FileNameType( Type type) {
		super();
		nCheck = new NameCheck(type);
	}

	@Override
	public String toString() {
		return "name type="+nCheck.getType();
	}

	@Override
	public boolean checkElement(File analyze) {
		return nCheck.checkNameType(analyze.getName());
	}
}
