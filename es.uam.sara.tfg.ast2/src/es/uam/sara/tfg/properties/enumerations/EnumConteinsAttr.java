package es.uam.sara.tfg.properties.enumerations;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import es.uam.sara.tfg.rule.Rule;

public class EnumConteinsAttr extends Enumeration {

	private Rule<FieldDeclaration> rule;

	public EnumConteinsAttr(List<EnumDeclaration> analyze, Rule<FieldDeclaration> rule) {
		super(analyze);
		this.rule = rule;
	}

	@Override
	public void check() {
		for (EnumDeclaration t : super.analyze) {
			rule.reset(getListAttributes(t));
			if (rule.checkTest()) {
				super.addRight(t);
			} else {
				super.addWrong(t);
			}
		}
	}

	private List<FieldDeclaration> getListAttributes(EnumDeclaration t) {
		List<FieldDeclaration> temp = new ArrayList<FieldDeclaration>();
		for (Object fd : t.bodyDeclarations()) {
			if (fd instanceof FieldDeclaration) {
				temp.add((FieldDeclaration) fd);
			}
		}
		return temp;

	}

}
