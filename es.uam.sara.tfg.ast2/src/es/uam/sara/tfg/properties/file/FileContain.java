package es.uam.sara.tfg.properties.file;

import java.util.List;
import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.properties.Contain;
import es.uam.sara.tfg.rule.Rule;

public abstract class FileContain<T> extends File {

	private Contain<T, UnitVisitor> contain;
	
	public FileContain(Rule<T> r) {
		contain= new Contain<T, UnitVisitor>(r);
	}
	
	@Override
	public boolean checkElement(UnitVisitor analyze) {
		return contain.checkElement(analyze, getSubType(analyze));
	}
	
	public abstract List<T> getSubType(UnitVisitor uv);

	public String print(UnitVisitor print){
		return super.print(print) + contain.print(print);
	}
	@Override
	public String toString() {
		return contain.toString();
	}
}
