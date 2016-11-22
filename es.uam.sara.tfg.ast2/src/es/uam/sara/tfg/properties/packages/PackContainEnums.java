package es.uam.sara.tfg.properties.packages;

import java.util.List;
import es.uam.sara.tfg.elements.Enumeration;
import es.uam.sara.tfg.elements.Package;
import es.uam.sara.tfg.rule.Rule;

public class PackContainEnums extends PackContain<Enumeration> {

	public PackContainEnums(Rule<Enumeration> r) {
		super(r);
	}

	@Override
	public List<Enumeration> getSubType(Package t) {
		return t.getEnumerations();
	}

}
