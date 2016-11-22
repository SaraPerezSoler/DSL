package es.uam.sara.tfg.properties.file;

import es.uam.sara.tfg.elements.File;

public class FileEmpty extends FileProperty{

	@Override
	public boolean checkElement(File analyze) {
		return analyze.isEmpty();
	}

	@Override
	public String toString() {
		
		return "is empty";
	}

}
