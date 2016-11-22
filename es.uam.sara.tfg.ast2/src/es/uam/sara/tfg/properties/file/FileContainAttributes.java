package es.uam.sara.tfg.properties.file;

import java.util.List;
import es.uam.sara.tfg.elements.Attribute;
import es.uam.sara.tfg.elements.File;
import es.uam.sara.tfg.rule.Rule;

public class FileContainAttributes extends FileContain<Attribute> {

	public FileContainAttributes(Rule<Attribute> r) {
		super(r);
	}

	@Override
	public List<Attribute> getSubType(File uv) {
		return uv.getAttributes();
	}



}
