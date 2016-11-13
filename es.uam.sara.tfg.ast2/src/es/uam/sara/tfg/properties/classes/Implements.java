package es.uam.sara.tfg.properties.classes;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jdt.core.dom.TypeDeclaration;


public class Implements extends Class{

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

	@Override
	public void check(List<TypeDeclaration> analyze) {
		for (TypeDeclaration t: analyze){
			if (comprobar(t)){
				super.addRight(t);
			}else{
				super.addWrong(t);
				
			}
		}
	}
	private boolean comprobar(TypeDeclaration t){
		if (intMin==-1 && intMax==-1){
			if ()
		}
		if (t.superInterfaceTypes().size()>=intMin && intMax==-1){
			return true;
		}
		if (t.superInterfaceTypes().size()>=intMin && t.superInterfaceTypes().size()<=intMax){
			return true;
		}
		return false;
	}

	public List<String> getInterface(TypeDeclaration t){
		List<String> ret=new ArrayList<String>();
		List<?>inter=t.superInterfaceTypes();
		
		return ret;
	}
	@Override
	public String toString() {
		return "implements min=" + intMin + " and max=" + intMax;
	}
	
	

}
