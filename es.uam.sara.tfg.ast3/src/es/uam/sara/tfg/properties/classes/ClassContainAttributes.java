package es.uam.sara.tfg.properties.classes;

import java.util.List;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Rule;

public class ClassContainAttributes extends ClassContain<FieldDeclaration> {

	public ClassContainAttributes(Rule<FieldDeclaration> r) {
		super(r);
	}

	@Override
	public List<FieldDeclaration> getSubType(TypeDeclaration t) {
		return Visitors.getAttributes(t);
	}

}
