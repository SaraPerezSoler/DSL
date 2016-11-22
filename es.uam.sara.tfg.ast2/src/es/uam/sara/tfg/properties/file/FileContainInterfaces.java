package es.uam.sara.tfg.properties.file;

import java.util.List;
import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.elements.File;
import es.uam.sara.tfg.rule.Rule;

public class FileContainInterfaces extends FileContain<ClassInterface> {

	public FileContainInterfaces(Rule<ClassInterface> r) {
		super(r);
	}
	@Override
	public List<ClassInterface> getSubType(File uv) {
		return uv.getInterfaces();
	}

}
