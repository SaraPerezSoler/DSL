package es.uam.sara.tfg.properties.file;

import java.util.List;
import es.uam.sara.tfg.elements.Enumeration;
import es.uam.sara.tfg.elements.File;
import es.uam.sara.tfg.rule.Rule;

public class FileContainEnums extends FileContain<Enumeration> {

	public FileContainEnums(Rule<Enumeration> r) {
		super(r);
	}

	@Override
	public List<Enumeration> getSubType(File uv) {
		return uv.getEnumerations();
	}

}
