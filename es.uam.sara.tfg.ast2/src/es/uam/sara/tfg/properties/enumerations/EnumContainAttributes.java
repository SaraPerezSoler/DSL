package es.uam.sara.tfg.properties.enumerations;

import java.util.List;
import es.uam.sara.tfg.elements.Attribute;
import es.uam.sara.tfg.elements.Enumeration;
import es.uam.sara.tfg.rule.Rule;

public class EnumContainAttributes extends EnumContain<Attribute> {

	public EnumContainAttributes(Rule<Attribute> r) {
		super(r);
	}

	@Override
	public List<Attribute> getSubType(Enumeration t) {
		return t.getAttributes();
	}

}
