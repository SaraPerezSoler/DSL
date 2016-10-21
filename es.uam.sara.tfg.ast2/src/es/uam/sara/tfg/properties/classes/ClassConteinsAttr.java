package es.uam.sara.tfg.properties.classes;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.rule.Rule;

public class ClassConteinsAttr extends Class{

	private Rule<FieldDeclaration> rule;
	
	public ClassConteinsAttr(Rule<FieldDeclaration> rule) {
		super();
		this.rule=rule;
	}

	@Override
	public void check(List<TypeDeclaration> analyze) {
		for (TypeDeclaration t:analyze){
			 rule.reset(getListAttributes(t));
			 if(rule.checkTest()){
				 super.addRight(t);
			 }else{
				 super.addWrong(t);
			 }
		}
	}

	private List<FieldDeclaration> getListAttributes(TypeDeclaration t) {
		List<FieldDeclaration> temp=new ArrayList<FieldDeclaration>();
		for (FieldDeclaration fd: t.getFields()){
			temp.add(fd);
		}
		return temp;
	
	}

}
