package es.uam.sara.tfg.properties.enumerations;

import java.util.List;

import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Rule;

public class EnumContainInterfaces extends EnumContain<TypeDeclaration> {

	public EnumContainInterfaces(Rule<TypeDeclaration> r) {
		super(r);
	}

	@Override
	public List<TypeDeclaration> getSubType(EnumDeclaration t) {
		return Visitors.getInterfaces(t);
	}

}
