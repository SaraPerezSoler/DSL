package es.uam.sara.tfg.ast;

import java.util.ArrayList;
import java.util.List;

import es.uam.sara.tfg.elements.IElements;
import es.uam.sara.tfg.elements.JavaElement;
import es.uam.sara.tfg.elements.type.Attribute;
import es.uam.sara.tfg.elements.type.Class;
import es.uam.sara.tfg.elements.type.Enumeration;
import es.uam.sara.tfg.elements.type.Interface;
import es.uam.sara.tfg.elements.type.Method;
import es.uam.sara.tfg.elements.type.Package;

public class Visitors {
	private  List<UnitVisitor> visitors = new ArrayList<UnitVisitor>();
	private  List<Package> packages = new ArrayList<Package>();
	private String projectName;
	
	public Visitors(String projectName) {
		this.projectName=projectName;
	}
	/* Metodos de inicializacion del Visitors */
	public void addVisitor(UnitVisitor v) {
		visitors.add(v);
	}

	public void addPackage(String pack) {
		packages.add(new Package(pack,getVisitors(pack)) );
	}

	public void addPackages(List<String> packs) {
		for (String s: packs){
			packages.add(new Package(s, getVisitors(s)));
		}
	}

	/* Metodos para coger todos los elementos de un tipo */
	public List<JavaElement> getTypes() {
		List<JavaElement> result = new ArrayList<JavaElement>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getClasses());
			result.addAll(u.getInterfaces());
			result.addAll(u.getEnumerations());
		}
		return result;
	}

	public List<JavaElement> getEnumClass() {
		List<JavaElement> result = new ArrayList<JavaElement>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getClasses());
			result.addAll(u.getEnumerations());
		}
		return result;
	}

	public List<Package> getPackages() {
		return packages;
	}

	public List<Class> getClasses() {
		List<Class> result = new ArrayList<Class>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getClasses());
		}
		return result;
	}

	public List<Interface> getInterfaces() {
		List<Interface> result = new ArrayList<Interface>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getInterfaces());
		}
		return result;
	}

	public List<Enumeration> getEnumerations() {
		List<Enumeration> result = new ArrayList<Enumeration>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getEnumerations());
		}
		return result;
	}

	public List<Method> getMethods() {
		List<Method> result = new ArrayList<Method>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getMethods());
		}
		return result;
	}

	public List<Attribute> getAttributes() {
		List<Attribute> result = new ArrayList<Attribute>();
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
