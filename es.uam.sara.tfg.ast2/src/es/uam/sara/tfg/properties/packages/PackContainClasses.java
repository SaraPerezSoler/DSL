package es.uam.sara.tfg.properties.packages;

import java.util.List;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Rule;

public class PackContainClasses extends PackContain<TypeDeclaration> {

	public PackContainClasses(Rule<TypeDeclaration> r) {
		super(r);
	}

	@Override
	public List<TypeDeclaration> getSubType(String t) {
		return Visitors.getClasses(t);
	}

}
