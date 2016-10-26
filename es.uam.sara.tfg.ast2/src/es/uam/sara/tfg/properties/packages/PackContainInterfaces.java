package es.uam.sara.tfg.properties.packages;

import java.util.List;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Rule;

public class PackContainInterfaces extends PackContain<TypeDeclaration> {

	public PackContainInterfaces(Rule<TypeDeclaration> r) {
		super(r);
	}

	@Override
	public List<TypeDeclaration> getSubType(String t) {
		return Visitors.getInterfaces(t);
	}

}
