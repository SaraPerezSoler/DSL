package es.uam.sara.tfg.properties.classes;


import java.util.List;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.rule.Rule;

public class ClassConteins<T> extends Class {

	private Rule<T> rule;

	public ClassConteins(Rule<T> r) {
		this.rule = r;
	}

	@Override
	public void check(List<TypeDeclaration> analyze) {
		
	}

}
