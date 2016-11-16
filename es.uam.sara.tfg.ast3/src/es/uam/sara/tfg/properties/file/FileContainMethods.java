package es.uam.sara.tfg.properties.file;

import java.util.List;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.rule.Rule;

public class FileContainMethods extends FileContain<MethodDeclaration> {

	public FileContainMethods(Rule<MethodDeclaration> r) {
		super(r);
	}

	@Override
	public List<MethodDeclaration> getSubType(UnitVisitor uv) {
		return uv.getMethods();
	}

}
