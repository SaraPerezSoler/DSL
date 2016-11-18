package es.uam.sara.tfg.properties.enumconstant;

import java.util.List;

import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.rule.Rule;

public class EnumConstContainMethods extends EnumConstContain<MethodDeclaration> {

	public EnumConstContainMethods(Rule<MethodDeclaration> r) {
		super(r);
	}

	@Override
	public List<MethodDeclaration> getSubType(EnumConstantDeclaration t) {
		return Visitors.getMethods(t);
	}

}
