/**
 * 
 */
package es.uam.sara.tfg.properties.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.elements.ClassInterface;

/**
 * @author Sara
 *
 */
public class isExtended extends ClassProperty{

	private List<ClassInterface> allClasses;
	private Map<ClassInterface, List<ClassInterface>> classesExtended;
	private int intMin;
	private int intMax;
	

	/**
	 * @param allClasses
	 */
	public isExtended(List<ClassInterface> allClasses) {
		super();
		this.allClasses = allClasses;
		this.intMax=-1;
		this.intMax=Integer.MAX_VALUE;
		classesExtended=new HashMap<ClassInterface, List<ClassInterface>>();
		
	}
	
	public isExtended(List<ClassInterface> allClasses, int min, int max) {
		super();
		this.allClasses = allClasses;
		classesExtended=new HashMap<ClassInterface, List<ClassInterface>>();
		this.intMin=min;
		this.intMax=max;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see es.uam.sara.tfg.properties.Properties#check()
	 */
	@Override
	public boolean checkElement(ClassInterface td) {
		List<ClassInterface> save= new ArrayList<ClassInterface>();
		for (ClassInterface a : allClasses) {
			List<String> superClass= a.getSuperclass();
			if (superClass.contains(td.getName().toLowerCase())){
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
		List<ClassInterface> right=super.getRight();
		for (ClassInterface inter: right){
			UnitVisitor uv=inter.getVisitor();
			cad+="In file "+uv.getNameFile()+" the interface "+inter.getName() +" (line: " +uv.getLineNumber(inter.getBodyDeclarations().getStartPosition())+")  satisfy \""+this.toString()+"\" for:\n";
			List<ClassInterface>classes= classesExtended.get(inter);
			for (ClassInterface cl: classes){
				UnitVisitor uv1=cl.getVisitor();
				cad+="\t Class "+ cl.getName() + " in file "+ uv1.getNameFile() +" (line: "+uv1.getLineNumber(cl.getBodyDeclarations().getStartPosition())+")\n";
			}
		}
		return cad;
	}
}
