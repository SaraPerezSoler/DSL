package es.uam.sara.tfg.properties.interfaces;

import java.util.List;

import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Rule;

public class InterContainEnums extends InterContain<EnumDeclaration> {

	public InterContainEnums(Rule<EnumDeclaration> r) {
		super(r);
	}

	@Override
	public List<EnumDeclaration> getSubType(TypeDeclaration t) {
		return Visitors.getEnumerations(t);
	}

}
