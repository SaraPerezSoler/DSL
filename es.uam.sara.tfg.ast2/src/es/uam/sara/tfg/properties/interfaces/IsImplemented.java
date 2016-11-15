package es.uam.sara.tfg.properties.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.properties.TypeToString;

public class IsImplemented extends Interface {

	private List<TypeDeclaration> allClass;
	private Map<TypeDeclaration, List<TypeDeclaration>> interfacesImplemented;
	private int intMin;
	private int intMax;

	public IsImplemented(List<TypeDeclaration> allClass) {
		super();
		this.allClass = allClass;
		interfacesImplemented= new HashMap<TypeDeclaration, List<TypeDeclaration>>();
		this.intMax = Integer.MAX_VALUE;
		this.intMin = -1;
	}

	public IsImplemented(List<TypeDeclaration> allClass, int min, int max) {
		super();
		this.allClass = allClass;
		interfacesImplemented= new HashMap<TypeDeclaration, List<TypeDeclaration>>();
		this.intMax = max;
		this.intMin = min;
	} 
	

	public boolean checkElement(TypeDeclaration td) {
		List<TypeDeclaration> save= new ArrayList<TypeDeclaration>();
		for (TypeDeclaration a : allClass) {
			List<String> interfaces= TypeToString.getString(a.superInterfaceTypes());
			if (interfaces.contains(td.getName().toString().toLowerCase())){
				save.add(a);
			}
		}
		if (save.size()<intMin || save.size()>intMax){
			interfacesImplemented.put(td, save);
			return false;
		}else{
			interfacesImplemented.put(td, save);
			return true;
		}
	}

	@Override
	public String toString() {
		return "is implemented";
	}
}
