package es.uam.sara.tfg.properties.file;

import java.util.List;
import es.uam.sara.tfg.elements.File;
import es.uam.sara.tfg.elements.Method;
import es.uam.sara.tfg.rule.Rule;

public class FileContainMethods extends FileContain<Method> {

	public FileContainMethods(Rule<Method> r) {
		super(r);
	}

	@Override
	public List<Method> getSubType(File uv) {
		return uv.getMethods();
	}

}
