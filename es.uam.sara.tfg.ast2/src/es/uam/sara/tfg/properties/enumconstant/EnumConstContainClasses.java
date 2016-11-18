package es.uam.sara.tfg.properties.enumconstant;

import java.util.List;

import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Rule;

public class EnumConstContainClasses extends EnumConstContain<TypeDeclaration> {

	public EnumConstContainClasses(Rule<TypeDeclaration> r) {
		super(r);
	}

	@Override
	public List<TypeDeclaration> getSubType(EnumConstantDeclaration t) {
		return Visitors.getClasses(t);
	}

}
