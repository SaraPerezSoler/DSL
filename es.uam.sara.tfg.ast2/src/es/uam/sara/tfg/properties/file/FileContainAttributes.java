package es.uam.sara.tfg.properties.file;

import java.util.List;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.rule.Rule;

public class FileContainAttributes extends FileContain<FieldDeclaration> {

	public FileContainAttributes(Rule<FieldDeclaration> r) {
		super(r);
	}

	@Override
	public List<FieldDeclaration> getSubType(UnitVisitor uv) {
		return uv.getAttributes();
	}



}
