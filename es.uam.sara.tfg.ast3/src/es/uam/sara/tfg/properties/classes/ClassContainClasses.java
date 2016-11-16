package es.uam.sara.tfg.properties.classes;

import java.util.List;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Rule;

public class ClassContainClasses extends ClassContain<TypeDeclaration> {

	public ClassContainClasses(Rule<TypeDeclaration> r) {
		super(r);
	}

	@Override
	public List<TypeDeclaration> getSubType(TypeDeclaration t) {
		return Visitors.getClasses(t);
	}

}
