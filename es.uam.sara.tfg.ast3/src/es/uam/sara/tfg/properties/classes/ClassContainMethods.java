package es.uam.sara.tfg.properties.classes;

import java.util.List;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Rule;

public class ClassContainMethods extends ClassContain<MethodDeclaration> {

	public ClassContainMethods(Rule<MethodDeclaration> r) {
		super(r);
	}

	@Override
	public List<MethodDeclaration> getSubType(TypeDeclaration t) {
		return Visitors.getMethods(t);
	}

}
