/**
 * 
 */
package es.uam.sara.tfg.properties.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.properties.TypeToString;

/**
 * @author Sara
 *
 */
public class isExtended extends Class {

	private List<TypeDeclaration> allClasses;
	private Map<TypeDeclaration, List<TypeDeclaration>> classesExtended;
	private int intMin;
	private int intMax;

	/**
	 * @param allClasses
	 */
	public isExtended(List<TypeDeclaration> allClasses) {
		super();
		this.allClasses = allClasses;
		this.intMax=-1;
		this.intMax=Integer.MAX_VALUE;
		classesExtended=new HashMap<TypeDeclaration, List<TypeDeclaration>>();
		
	}
	
	public isExtended(List<TypeDeclaration> allClasses, int min, int max) {
		super();
		this.allClasses = allClasses;
		classesExtended=new HashMap<TypeDeclaration, List<TypeDeclaration>>();
		this.intMin=min;
		this.intMax=max;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see es.uam.sara.tfg.properties.Properties#check()
	 */
	@Override
	public boolean checkElement(TypeDeclaration td) {
		List<TypeDeclaration> save= new ArrayList<TypeDeclaration>();
		for (TypeDeclaration a : allClasses) {
			List<String> superClass= TypeToString.getString(a.getSuperclassType());
			if (superClass.contains(td.getName().toString().toLowerCase())){
				save.add(a);
			}
		}
		if (save.size()<this.intMin || save.size()>this.intMax){
			classesExtended.put(td, save);
			return false;
		}else{
			classesExtended.put(td, save);
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
			List<TypeDeclaration>classes= classesExtended.get(inter);
			for (TypeDeclaration cl: classes){
				UnitVisitor uv1=Visitors.getVisitor(cl);
				cad+="\t Class "+ cl.getName() + " in file "+ uv1.getNameFile() +" (line: "+uv1.getLineNumber(cl.getStartPosition())+")\n";
			}
		}
		return cad;
	}
}
