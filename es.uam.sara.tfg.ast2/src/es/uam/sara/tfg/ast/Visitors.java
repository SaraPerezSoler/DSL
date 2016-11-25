package es.uam.sara.tfg.ast;

import java.util.ArrayList;
import java.util.List;

import es.uam.sara.tfg.elements.IElements;
import es.uam.sara.tfg.elements.JavaElement;
import es.uam.sara.tfg.elements.type.Attribute;
import es.uam.sara.tfg.elements.type.ClassInterface;
import es.uam.sara.tfg.elements.type.Enumeration;
import es.uam.sara.tfg.elements.type.Method;
import es.uam.sara.tfg.elements.type.Package;

public class Visitors {
	private static List<UnitVisitor> visitors = new ArrayList<UnitVisitor>();
	private static List<Package> packages = new ArrayList<Package>();

	/* Metodos de inicializacion del Visitors */
	public static void addVisitor(UnitVisitor v) {
		visitors.add(v);
	}

	public static void addPackage(String pack) {
		packages.add(new Package(pack));
	}

	public static void addPackages(List<String> packs) {
		for (String s: packs){
			packages.add(new Package(s));
		}
	}

	/* Metodos para coger todos los elementos de un tipo */
	public static List<JavaElement> getTypes() {
		List<JavaElement> result = new ArrayList<JavaElement>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getClasses());
			result.addAll(u.getInterfaces());
			result.addAll(u.getEnumerations());
		}
		return result;
	}

	public static List<JavaElement> getEnumClass() {
		List<JavaElement> result = new ArrayList<JavaElement>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getClasses());
			result.addAll(u.getEnumerations());
		}
		return result;
	}

	public static List<Package> getPackages() {
		return packages;
	}

	public static List<ClassInterface> getClasses() {
		List<ClassInterface> result = new ArrayList<ClassInterface>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getClasses());
		}
		return result;
	}

	public static List<ClassInterface> getInterfaces() {
		List<ClassInterface> result = new ArrayList<ClassInterface>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getInterfaces());
		}
		return result;
	}

	public static List<Enumeration> getEnumerations() {
		List<Enumeration> result = new ArrayList<Enumeration>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getEnumerations());
		}
		return result;
	}

	public static List<Method> getMethods() {
		List<Method> result = new ArrayList<Method>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getMethods());
		}
		return result;
	}

	public static List<Attribute> getAttributes() {
		List<Attribute> result = new ArrayList<Attribute>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getAttributes());
		}
		return result;
	}

	public static String getFileName(IElements type) {
		
		for (UnitVisitor u : visitors) {
			if (u.isVisitorFrom(type)) {
				return u.getNameFile();
			}
		}
		return "";
	}

	public static UnitVisitor getVisitor(IElements elem) {

		for (UnitVisitor u : visitors) {
			if (u.isVisitorFrom(elem)) {
				return u;
			}
		}
		return null;
	}
	
	public static List<UnitVisitor> getVisitors(Package elem) {
		List<UnitVisitor> list=new ArrayList<UnitVisitor>();
		for (UnitVisitor u : visitors) {
			if (u.isVisitorFrom(elem)) {
				list.add(u);
			}
		}
		return list;
	}

	public static void reset() {
		visitors.clear();
		packages.clear();
	}
}
