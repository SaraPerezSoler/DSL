package es.uam.sara.tfg.properties.packages;

import java.util.List;

import org.eclipse.jdt.core.dom.FieldDeclaration;

import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Rule;

public class PackContainAttributes extends PackContain<FieldDeclaration> {

	public PackContainAttributes(Rule<FieldDeclaration> r) {
		super(r);
	}

	@Override
	public List<FieldDeclaration> getSubType(String t) {
		return Visitors.getAttributes(t);
	}

}
