package es.uam.sara.tfg.properties.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.properties.TypeToString;

public class IsExtended extends Interface{

	private List<TypeDeclaration> allInterfaces;
	private Map<TypeDeclaration, List<TypeDeclaration>> interfacesExtended;
	public IsExtended(List<TypeDeclaration> interfaces) {
		allInterfaces=interfaces;
		interfacesExtended=new HashMap<TypeDeclaration, List<TypeDeclaration>>();
		
	}
	@Override
	public void check(List<TypeDeclaration> analyze) {
		for (TypeDeclaration t : analyze) {
			if (check(t)) {
				super.addRight(t);
			} else {
				super.addWrong(t);
			}
		}
	}

	private boolean check(TypeDeclaration td) {
		List<TypeDeclaration> save= new ArrayList<TypeDeclaration>();
		for (TypeDeclaration a : allInterfaces) {
			List<String> interfaces= TypeToString.getString(a.superInterfaceTypes());
			if (interfaces.contains(td.getName().toString().toLowerCase())){
				save.add(a);
			}
		}
		if (save.isEmpty()){
			return false;
		}else{
			interfacesExtended.put(td, save);
			return true;
		}
	}
	
	@Override
	public String toString() {
		return "is extended";
	}

	public String printRight(){
		String cad="";
		List<TypeDeclaration> right=super.getRight();
		for (TypeDeclaration inter: right){
			UnitVisitor uv=Visitors.getVisitor(inter);
			cad+="In file "+uv.getNameFile()+" the interface "+inter.getName() +" (line: " +uv.getLineNumber(inter.getStartPosition())+")  satisfy \""+this.toString()+"\" for:\n";
			List<TypeDeclaration>classes= interfacesExtended.get(inter);
			for (TypeDeclaration cl: classes){
				UnitVisitor uv1=Visitors.getVisitor(cl);
				cad+="\t Interface "+ cl.getName() + " in file "+ uv1.getNameFile() +" (line: "+uv1.getLineNumber(cl.getStartPosition())+")\n";
			}
		}
		return cad;
	}
}
