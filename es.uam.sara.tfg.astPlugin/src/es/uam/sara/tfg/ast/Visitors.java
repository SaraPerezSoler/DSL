package es.uam.sara.tfg.ast;

import java.util.ArrayList;
import java.util.List;

import es.uam.sara.tfg.elements.IElements;
import es.uam.sara.tfg.elements.JavaTypes;
import es.uam.sara.tfg.elements.type.MAttribute;
import es.uam.sara.tfg.elements.type.MClass;
import es.uam.sara.tfg.elements.type.MEnumeration;
import es.uam.sara.tfg.elements.type.MInterface;
import es.uam.sara.tfg.elements.type.MMethod;
import es.uam.sara.tfg.elements.type.MPackage;

public class Visitors {
	private  List<UnitVisitor> visitors = new ArrayList<UnitVisitor>();
	private  List<MPackage> packages = new ArrayList<MPackage>();
	private String projectName;
	
	public Visitors(String projectName) {
		this.projectName=projectName;
	}
	/* Metodos de inicializacion del Visitors */
	public void addVisitor(UnitVisitor v) {
		visitors.add(v);
	}

	public void addPackage(String pack) {
		packages.add(new MPackage(pack,getVisitors(pack)) );
	}

	public void addPackages(List<String> packs) {
		for (String s: packs){
			packages.add(new MPackage(s, getVisitors(s)));
		}
	}

	/* Metodos para coger todos los elementos de un tipo */
	public List<JavaTypes> getTypes() {
		List<JavaTypes> result = new ArrayList<JavaTypes>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getClasses());
			result.addAll(u.getInterfaces());
			result.addAll(u.getEnumerations());
		}
		return result;
	}

	public List<JavaTypes> getEnumClass() {
		List<JavaTypes> result = new ArrayList<JavaTypes>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getClasses());
			result.addAll(u.getEnumerations());
		}
		return result;
	}

	public List<MPackage> getPackages() {
		return packages;
	}

	public List<MClass> getClasses() {
		List<MClass> result = new ArrayList<MClass>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getClasses());
		}
		return result;
	}

	public List<MInterface> getInterfaces() {
		List<MInterface> result = new ArrayList<MInterface>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getInterfaces());
		}
		return result;
	}

	public List<MEnumeration> getEnumerations() {
		List<MEnumeration> result = new ArrayList<MEnumeration>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getEnumerations());
		}
		return result;
	}

	public List<MMethod> getMethods() {
		List<MMethod> result = new ArrayList<MMethod>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getMethods());
		}
		return result;
	}

	public List<MAttribute> getAttributes() {
		List<MAttribute> result = new ArrayList<MAttribute>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getAttributes());
		}
		return result;
	}

	public String getFileName(IElements type) {
		
		for (UnitVisitor u : visitors) {
			if (u.isVisitorFrom(type)) {
				return u.getNameFile();
			}
		}
		return "";
	}

	public UnitVisitor getVisitor(IElements elem) {

		for (UnitVisitor u : visitors) {
			if (u.isVisitorFrom(elem)) {
				return u;
			}
		}
		return null;
	}
	
	public List<UnitVisitor> getVisitors(String elem) {
		List<UnitVisitor> list=new ArrayList<UnitVisitor>();
		for (UnitVisitor u : visitors) {
			if (u.isVisitorFrom(elem)) {
				list.add(u);
			}
		}
		return list;
	}

	public void reset() {
		visitors.clear();
		packages.clear();
	}
	public String getProjectName() {
		return projectName;
	}
}
