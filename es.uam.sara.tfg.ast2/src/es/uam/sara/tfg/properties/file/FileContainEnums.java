package es.uam.sara.tfg.properties.file;

import java.util.List;

import org.eclipse.jdt.core.dom.EnumDeclaration;
import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.rule.Rule;

public class FileContainEnums extends FileContain<EnumDeclaration> {

	public FileContainEnums(Rule<EnumDeclaration> r) {
		super(r);
	}

	@Override
	public List<EnumDeclaration> getSubType(UnitVisitor uv) {
		return uv.getEnumerations();
	}

}
