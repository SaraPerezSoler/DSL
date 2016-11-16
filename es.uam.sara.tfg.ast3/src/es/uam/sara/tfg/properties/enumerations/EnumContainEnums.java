package es.uam.sara.tfg.properties.enumerations;

import java.util.List;

import org.eclipse.jdt.core.dom.EnumDeclaration;

import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Rule;

public class EnumContainEnums extends EnumContain<EnumDeclaration> {

	public EnumContainEnums(Rule<EnumDeclaration> r) {
		super(r);
	}

	@Override
	public List<EnumDeclaration> getSubType(EnumDeclaration t) {
		return Visitors.getEnumerations(t);
	}

}
