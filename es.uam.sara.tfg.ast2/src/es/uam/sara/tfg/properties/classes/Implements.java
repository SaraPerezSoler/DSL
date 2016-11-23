package es.uam.sara.tfg.properties.classes;

import java.util.List;

import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.properties.StringProperty;



public class Implements extends ClassProperty implements StringProperty{

	private int intMin;
	private int intMax;
	private String inter;
	
	public Implements(int min, int max) {
		intMin=min;
		intMax=max;
		inter="";
	}
	public Implements(String inter) {
		this.inter=inter;
		intMin=-1;
		intMax=-1;
	}
	
	public boolean checkElement(ClassInterface t){
		if (intMin==-1 && intMax==-1){
			List<String> lis=t.getSuperInterfaces();
			if (lis.contains(inter.toLowerCase())){
				return true;
			}
		}else if (t.getNumSuperInterfaces()>=intMin && intMax==-1){
			return true;
		}else if (t.getNumSuperInterfaces()>=intMin && t.getNumSuperInterfaces()<=intMax){
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "implements min=" + intMin + " and max=" + intMax;
	}
	

}
