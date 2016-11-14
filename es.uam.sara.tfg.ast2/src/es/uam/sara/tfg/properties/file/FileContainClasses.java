package es.uam.sara.tfg.properties.file;

import java.util.List;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.rule.Rule;

public class FileContainClasses extends FileContain<TypeDeclaration> {

	public FileContainClasses(Rule<TypeDeclaration> r) {
		super(r);
	}
	@Override
	public List<TypeDeclaration> getSubType(UnitVisitor uv) {
		return uv.getClasses();
	}

}
