package es.uam.sara.tfg.properties.file;
import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.properties.Size;

public class FileSize extends File {

	private Size size;
	
	public FileSize(int min, int max) {
		size= new Size(min, max);
	}

	@Override
	public boolean checkElement(UnitVisitor analyze) {
		return size.checkElement(analyze.getComp());
	}

	@Override
	public String toString() {
		return size.toString();
	}
}
