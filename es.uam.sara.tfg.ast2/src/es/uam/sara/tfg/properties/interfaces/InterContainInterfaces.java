package es.uam.sara.tfg.properties.interfaces;

import java.util.List;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Rule;

public class InterContainInterfaces extends InterContain<TypeDeclaration> {

	public InterContainInterfaces(Rule<TypeDeclaration> r) {
		super(r);
	}

	@Override
	public List<TypeDeclaration> getSubType(TypeDeclaration t) {
		return Visitors.getInterfaces(t);
	}

}