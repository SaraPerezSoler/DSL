package es.uam.sara.tfg.properties.packages;

import java.util.List;
import es.uam.sara.tfg.elements.Attribute;
import es.uam.sara.tfg.elements.Package;
import es.uam.sara.tfg.rule.Rule;

public class PackContainAttributes extends PackContain<Attribute> {

	public PackContainAttributes(Rule<Attribute> r) {
		super(r);
	}

	@Override
	public List<Attribute> getSubType(Package t) {
		return t.getAttributes();
	}

}
