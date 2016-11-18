package es.uam.sara.tfg.properties.enumconstant;

import java.util.List;

import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;

import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Rule;

public class EnumConstContainAttributes extends EnumConstContain<FieldDeclaration> {

	public EnumConstContainAttributes(Rule<FieldDeclaration> r) {
		super(r);
	}

	@Override
	public List<FieldDeclaration> getSubType(EnumConstantDeclaration t) {
		return Visitors.getAttributes(t);
	}

}
