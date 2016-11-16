package es.uam.sara.tfg.properties.packages;

import java.util.List;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Rule;

public class PackContainMethods extends PackContain<MethodDeclaration> {

	public PackContainMethods(Rule<MethodDeclaration> r) {
		super(r);
	}

	@Override
	public List<MethodDeclaration> getSubType(String t) {
		return Visitors.getMethods(t);
	}

}
