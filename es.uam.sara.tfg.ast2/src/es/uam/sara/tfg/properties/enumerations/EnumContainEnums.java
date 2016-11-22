package es.uam.sara.tfg.properties.enumerations;

import java.util.List;
import es.uam.sara.tfg.elements.Enumeration;
import es.uam.sara.tfg.rule.Rule;

public class EnumContainEnums extends EnumContain<Enumeration> {

	public EnumContainEnums(Rule<Enumeration> r) {
		super(r);
	}

	@Override
	public List<Enumeration> getSubType(Enumeration t) {
		return t.getEnumerations();
	}

}
