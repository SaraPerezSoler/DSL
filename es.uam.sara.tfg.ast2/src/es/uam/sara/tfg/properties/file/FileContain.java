package es.uam.sara.tfg.properties.file;

import java.util.List;
import es.uam.sara.tfg.elements.File;
import es.uam.sara.tfg.properties.Contain;
import es.uam.sara.tfg.rule.Rule;

public abstract class FileContain<T> extends FileProperty {

	private Contain<T, File> contain;
	
	public FileContain(Rule<T> r) {
		contain= new Contain<T, File>(r);
	}
	
	@Override
	public boolean checkElement(File analyze) {
		return contain.checkElement(analyze, getSubType(analyze));
	}
	
	public abstract List<T> getSubType(File uv);

	public String print(File print){
		return super.print(print) + contain.print(print);
	}
	@Override
	public String toString() {
		return contain.toString();
	}
}
