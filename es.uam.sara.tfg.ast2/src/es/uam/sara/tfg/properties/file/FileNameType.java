package es.uam.sara.tfg.properties.file;

import java.util.List;
import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.NameCheck.Type;

public class FileNameType extends File{

	NameCheck nCheck;

	public FileNameType( Type type) {
		super();
		nCheck = new NameCheck(type);
	}

	@Override
	public void check(List<UnitVisitor> analyze) {
		for (UnitVisitor uv : analyze) {
			if (nCheck.checkNameType(uv.getNameFile())) {
				super.addRight(uv);
			} else {
				super.addWrong(uv);
			}
		}

	}
	@Override
	public String toString() {
		return "name type="+nCheck.getType();
	}
}
