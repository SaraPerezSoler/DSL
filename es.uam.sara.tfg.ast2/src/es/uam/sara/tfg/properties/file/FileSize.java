package es.uam.sara.tfg.properties.file;
import es.uam.sara.tfg.elements.File;
import es.uam.sara.tfg.properties.Size;

public class FileSize extends FileProperty {

	private Size size;
	
	public FileSize(int min, int max) {
		size= new Size(min, max);
	}

	@Override
	public boolean checkElement(File analyze) {
		return size.checkElement(analyze.getASTNode(), analyze.getVisitor());
	}

	@Override
	public String toString() {
		return size.toString();
	}
}
