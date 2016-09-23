package es.uam.sara.tfg.properties.interfaces;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.rule.Rule;

public class InterConteinsMethod extends Interface {

	private Rule<MethodDeclaration> rule;
	public InterConteinsMethod(List<TypeDeclaration> analyze, Rule<MethodDeclaration> r) {
		super(analyze);
		rule=r;
	}
	
	@Override
	public void check() {
	 for (TypeDeclaration t: super.analyze){
		 rule.reset(getListMethod(t));
		 if(rule.checkTest()){
			 super.addRight(t);
		 }else{
			 super.addWrong(t);
		 }
	 }
		
	}
	private List<MethodDeclaration> getListMethod(TypeDeclaration t){
		List<MethodDeclaration> temp=new ArrayList<MethodDeclaration>();
		for (MethodDeclaration md: t.getMethods()){
			temp.add(md);
		}
		return temp;
	}
	
	

}
