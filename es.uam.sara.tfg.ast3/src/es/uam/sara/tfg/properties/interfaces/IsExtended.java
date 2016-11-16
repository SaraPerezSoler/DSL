package es.uam.sara.tfg.properties.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.properties.TypeToString;

public class IsExtended extends Interface{

	private List<TypeDeclaration> allInterfaces;
	private Map<TypeDeclaration, List<TypeDeclaration>> interfacesExtended;
	public IsExtended(List<TypeDeclaration> interfaces) {
		allInterfaces=interfaces;
		interfacesExtended=new HashMap<TypeDeclaration, List<TypeDeclaration>>();
		
	}

	public boolean checkElement(TypeDeclaration td) {
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
}
