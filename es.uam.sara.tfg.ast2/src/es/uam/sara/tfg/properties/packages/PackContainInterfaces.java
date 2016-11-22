package es.uam.sara.tfg.properties.packages;

import java.util.List;
import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.elements.Package;
import es.uam.sara.tfg.rule.Rule;

public class PackContainInterfaces extends PackContain<ClassInterface> {

	public PackContainInterfaces(Rule<ClassInterface> r) {
		super(r);
	}

	@Override
	public List<ClassInterface> getSubType(Package t) {
		return t.getInterfaces();
	}

}
