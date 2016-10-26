package es.uam.sara.tfg.properties.packages;

import java.util.List;

import org.eclipse.jdt.core.dom.EnumDeclaration;

import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Rule;

public class PackContainEnums extends PackContain<EnumDeclaration> {

	public PackContainEnums(Rule<EnumDeclaration> r) {
		super(r);
	}

	@Override
	public List<EnumDeclaration> getSubType(String t) {
		return Visitors.getEnumerations(t);
	}

}
