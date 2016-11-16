package es.uam.sara.tfg.properties.classes;

import java.util.List;

import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Rule;

public class ClassContainEnums extends ClassContain<EnumDeclaration> {

	public ClassContainEnums(Rule<EnumDeclaration> r) {
		super(r);
	}

	@Override
	public List<EnumDeclaration> getSubType(TypeDeclaration t) {
		return Visitors.getEnumerations(t);
	}

}
