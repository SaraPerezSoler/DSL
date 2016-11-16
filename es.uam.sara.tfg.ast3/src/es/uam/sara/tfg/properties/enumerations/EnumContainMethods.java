package es.uam.sara.tfg.properties.enumerations;

import java.util.List;

import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Rule;

public class EnumContainMethods extends EnumContain<MethodDeclaration> {

	public EnumContainMethods(Rule<MethodDeclaration> r) {
		super(r);
	}

	@Override
	public List<MethodDeclaration> getSubType(EnumDeclaration t) {
		return Visitors.getMethods(t);
	}

}
