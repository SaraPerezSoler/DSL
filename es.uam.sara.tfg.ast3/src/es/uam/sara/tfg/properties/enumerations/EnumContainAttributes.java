package es.uam.sara.tfg.properties.enumerations;

import java.util.List;

import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;

import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Rule;

public class EnumContainAttributes extends EnumContain<FieldDeclaration> {

	public EnumContainAttributes(Rule<FieldDeclaration> r) {
		super(r);
	}

	@Override
	public List<FieldDeclaration> getSubType(EnumDeclaration t) {
		return Visitors.getAttributes(t);
	}

}
