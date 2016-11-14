package es.uam.sara.tfg.properties.file;

import java.util.List;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.rule.Rule;

public class FileContainInterfaces extends FileContain<TypeDeclaration> {

	public FileContainInterfaces(Rule<TypeDeclaration> r) {
		super(r);
	}
	@Override
	public List<TypeDeclaration> getSubType(UnitVisitor uv) {
		return uv.getInterfaces();
	}

}
