package es.uam.sara.tfg.properties.enumerations;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;

import es.uam.sara.tfg.rule.Rule;

public class EnumConteinsMethod extends Enumeration {

	private Rule<MethodDeclaration> rule;
	public EnumConteinsMethod( Rule<MethodDeclaration> r) {
		super();
		rule=r;
	}
	
	@Override
	public void check(List<EnumDeclaration> analyze) {
	 for (EnumDeclaration t: analyze){
		 rule.reset(getListMethod(t));
		 if(rule.checkTest()){
			 super.addRight(t);
		 }else{
			 super.addWrong(t);
		 }
	 }
		
	}
	private List<MethodDeclaration> getListMethod(EnumDeclaration t){
		List<MethodDeclaration> temp=new ArrayList<MethodDeclaration>();
		for (Object md: t.bodyDeclarations()){
			if (md instanceof MethodDeclaration){
				temp.add((MethodDeclaration)md);
			}
		}
		return temp;
	}
	
	

}
