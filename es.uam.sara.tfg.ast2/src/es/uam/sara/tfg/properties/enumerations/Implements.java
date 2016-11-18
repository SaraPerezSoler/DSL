package es.uam.sara.tfg.properties.enumerations;

import java.util.List;
import org.eclipse.jdt.core.dom.EnumDeclaration;

import es.uam.sara.tfg.properties.TypeToString;


public class Implements extends Enumeration{

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
	
	public boolean checkElement(EnumDeclaration t){
		if (intMin==-1 && intMax==-1){
			List<String> lis=getInterface(t);
			if (lis.contains(inter.toLowerCase())){
				return true;
			}
		}else if (t.superInterfaceTypes().size()>=intMin && intMax==-1){
			return true;
		}else if (t.superInterfaceTypes().size()>=intMin && t.superInterfaceTypes().size()<=intMax){
			return true;
		}
		return false;
	}

	public List<String> getInterface(EnumDeclaration t){
		List<?>inter=t.superInterfaceTypes();
		return TypeToString.getString(inter);
	}
	@Override
	public String toString() {
		return "implements min=" + intMin + " and max=" + intMax;
	}
	

}
