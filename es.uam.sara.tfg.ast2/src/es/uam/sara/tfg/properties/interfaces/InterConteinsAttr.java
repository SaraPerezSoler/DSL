package es.uam.sara.tfg.properties.interfaces;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.rule.Rule;

public class InterConteinsAttr extends Interface{

	private Rule<FieldDeclaration> rule;
	
	public InterConteinsAttr(List<TypeDeclaration> analyze, Rule<FieldDeclaration> rule) {
		super(analyze);
		this.rule=rule;
	}

	@Override
	public void check() {
		for (TypeDeclaration t:super.analyze){
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
