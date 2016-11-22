package es.uam.sara.tfg.properties.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import es.uam.sara.tfg.elements.ClassInterface;


public class IsImplemented extends InterfaceProperty {

	private List<ClassInterface> allClass;
	private Map<ClassInterface, List<ClassInterface>> interfacesImplemented;
	private int intMin;
	private int intMax;

	public IsImplemented(List<ClassInterface> allClass) {
		super();
		this.allClass = allClass;
		interfacesImplemented= new HashMap<ClassInterface, List<ClassInterface>>();
		this.intMax = Integer.MAX_VALUE;
		this.intMin = -1;
	}

	public IsImplemented(List<ClassInterface> allClass, int min, int max) {
		super();
		this.allClass = allClass;
		interfacesImplemented= new HashMap<ClassInterface, List<ClassInterface>>();
		this.intMax = max;
		this.intMin = min;
	} 
	

	public boolean checkElement(ClassInterface td) {
		List<ClassInterface> save= new ArrayList<ClassInterface>();
		for (ClassInterface a : allClass) {
			List<String> interfaces= a.getSuperInterfaces();
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
