package es.uam.sara.tfg.properties.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import es.uam.sara.tfg.elements.ClassInterface;

public class IsExtended extends InterfaceProperty{

	private List<ClassInterface> allInterfaces;
	private Map<ClassInterface, List<ClassInterface>> interfacesExtended;
	public IsExtended(List<ClassInterface> interfaces) {
		allInterfaces=interfaces;
		interfacesExtended=new HashMap<ClassInterface, List<ClassInterface>>();
		
	}

	public boolean checkElement(ClassInterface td) {
		List<ClassInterface> save= new ArrayList<ClassInterface>();
		for (ClassInterface a : allInterfaces) {
			List<String> interfaces= a.getSuperInterfaces();
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
