package es.uam.sara.tfg.ast;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class Visitors {
	private static List<UnitVisitor> visitors = new ArrayList<UnitVisitor>();
	private static List<String> packages = new ArrayList<String>();

	public static void addVisitor(UnitVisitor v) {
		visitors.add(v);
	}

	public static List<TypeDeclaration> getTypes() {
		List<TypeDeclaration> result = new ArrayList<TypeDeclaration>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getClasses());
			result.addAll(u.getInterfaces());
		}
		return result;
	}

	public static List<TypeDeclaration> getClasses() {
		List<TypeDeclaration> result = new ArrayList<TypeDeclaration>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getClasses());
		}
		return result;
	}

	public static List<String> getPackages() {
		return packages;
	}

	public static void addPackage(String pack) {
		packages.add(pack);
	}

	public static List<TypeDeclaration> getInterfaces() {
		List<TypeDeclaration> result = new ArrayList<TypeDeclaration>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getInterfaces());
		}
		return result;
	}

	public static List<EnumDeclaration> getEnumerations() {
		List<EnumDeclaration> result = new ArrayList<EnumDeclaration>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getEnumerations());
		}
		return result;
	}

	public static List<MethodDeclaration> getMethods() {
		List<MethodDeclaration> result = new ArrayList<MethodDeclaration>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getMethods());
		}
		return result;
	}

	public static List<FieldDeclaration> getAttributes() {
		List<FieldDeclaration> result = new ArrayList<FieldDeclaration>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getAttributes());
		}
		return result;
	}

	public static List<TypeDeclaration> getClasses(TypeDeclaration clas) {
		List<TypeDeclaration> temp = new ArrayList<TypeDeclaration>();
		for (TypeDeclaration td : clas.getTypes()) {
			if (!td.isInterface()) {
				temp.add(td);
			}
		}
		return temp;
	}

	public static List<TypeDeclaration> getInterfaces(TypeDeclaration clas) {
		List<TypeDeclaration> temp = new ArrayList<TypeDeclaration>();
		for (TypeDeclaration td : clas.getTypes()) {
			if (td.isInterface()) {
				temp.add(td);
			}
		}
		return temp;
	}

	public static List<EnumDeclaration> getEnumerations(TypeDeclaration clas) {
		List<EnumDeclaration> temp = new ArrayList<EnumDeclaration>();
		for (Object ed : clas.bodyDeclarations()) {
			if (ed instanceof EnumDeclaration) {
				temp.add((EnumDeclaration) ed);
			}
		}
		return temp;
	}

	public static List<MethodDeclaration> getMethods(TypeDeclaration clas) {
		List<MethodDeclaration> temp = new ArrayList<MethodDeclaration>();
		for (MethodDeclaration md : clas.getMethods()) {
			temp.add(md);
		}
		return temp;
	}

	public static List<FieldDeclaration> getAttributes(TypeDeclaration clas) {
		List<FieldDeclaration> temp = new ArrayList<FieldDeclaration>();
		for (FieldDeclaration fd : clas.getFields()) {
			temp.add(fd);
		}
		return temp;
	}

	public static List<TypeDeclaration> getClasses(EnumDeclaration en) {
		List<TypeDeclaration> temp = new ArrayList<TypeDeclaration>();
		for (Object o : en.bodyDeclarations()) {
			if (o instanceof TypeDeclaration) {
				TypeDeclaration td = (TypeDeclaration) o;
				if (!td.isInterface()) {
					temp.add(td);
				}
			}
		}
		return temp;
	}

	public static List<TypeDeclaration> getInterfaces(EnumDeclaration en) {
		List<TypeDeclaration> temp = new ArrayList<TypeDeclaration>();
		for (Object o : en.bodyDeclarations()) {
			if (o instanceof TypeDeclaration) {
				TypeDeclaration td = (TypeDeclaration) o;
				if (td.isInterface()) {
					temp.add(td);
				}
			}
		}
		return temp;
	}

	public static List<EnumDeclaration> getEnumerations(EnumDeclaration en) {
		List<EnumDeclaration> temp = new ArrayList<EnumDeclaration>();
		for (Object ed : en.bodyDeclarations()) {
			if (ed instanceof EnumDeclaration) {
				temp.add((EnumDeclaration) ed);
			}
		}
		return temp;
	}

	public static List<MethodDeclaration> getMethods(EnumDeclaration en) {
		List<MethodDeclaration> temp = new ArrayList<MethodDeclaration>();
		for (Object ed : en.bodyDeclarations()) {
			if (ed instanceof MethodDeclaration) {
				temp.add((MethodDeclaration) ed);
			}
		}
		return temp;
	}

	public static List<FieldDeclaration> getAttributes(EnumDeclaration en) {
		List<FieldDeclaration> temp = new ArrayList<FieldDeclaration>();
		for (Object ed : en.bodyDeclarations()) {
			if (ed instanceof FieldDeclaration) {
				temp.add((FieldDeclaration) ed);
			}
		}
		return temp;
	}

	private static boolean isThisPackage(String name, UnitVisitor u) {
		if (name.equals("(default package)")) {
			if (u.getPackage() == null) {
				return true;
			}
		} else {
			if (u.getPackage() != null) {
				if (u.getPackage().getName().toString().equals(name)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static List<TypeDeclaration> getClasses(String pk) {

		List<TypeDeclaration> temp = new ArrayList<TypeDeclaration>();
		for (UnitVisitor u : visitors) {
			if (isThisPackage(pk, u)) {
				temp.addAll(u.getClasses());
			}
		}
		return temp;
	}

	

	public static List<TypeDeclaration> getInterfaces(String pk) {
		List<TypeDeclaration> temp = new ArrayList<TypeDeclaration>();
		for (UnitVisitor u : visitors) {
			if (isThisPackage(pk, u)){
				temp.addAll(u.getInterfaces());
			}
		}
		return temp;
	}

	public static List<EnumDeclaration> getEnumerations(String pk) {
		List<EnumDeclaration> temp = new ArrayList<EnumDeclaration>();
		for (UnitVisitor u : visitors) {
			if (isThisPackage(pk, u)){
				temp.addAll(u.getEnumerations());
			}
		}
		return temp;
	}

	public static List<MethodDeclaration> getMethods(String pk) {
		List<MethodDeclaration> temp = new ArrayList<MethodDeclaration>();
		for (UnitVisitor u : visitors) {
			if (isThisPackage(pk, u)){
				temp.addAll(u.getMethods());
			}
		}
		return temp;
	}

	public static List<FieldDeclaration> getAttributes(String pk) {
		List<FieldDeclaration> temp = new ArrayList<FieldDeclaration>();
		for (UnitVisitor u : visitors) {
			if (isThisPackage(pk, u)){
				temp.addAll(u.getAttributes());
			}
		}
		return temp;
	}

	public static String getFileName(TypeDeclaration type) {
		for (UnitVisitor u: visitors){
			if (u.isVisitorFrom(type)){
				return u.getNameFile();
			}
		}
		return "";
	}
	public static String getFileName(EnumDeclaration en) {
		for (UnitVisitor u: visitors){
			if (u.isVisitorFrom(en)){
				return u.getNameFile();
			}
		}
		return "";
	}
	public static String getFileName(MethodDeclaration meth) {
		for (UnitVisitor u: visitors){
			if (u.isVisitorFrom(meth)){
				return u.getNameFile();
			}
		}
		return "";
	}
	public static String getFileName(FieldDeclaration field) {
		for (UnitVisitor u: visitors){
			if (u.isVisitorFrom(field)){
				return u.getNameFile();
			}
		}
		return "";
	}
	public static UnitVisitor getVisitor(TypeDeclaration type) {
		for (UnitVisitor u: visitors){
			if (u.isVisitorFrom(type)){
				return u;
			}
		}
		return null;
	}
	public static  UnitVisitor getVisitor(EnumDeclaration en) {
		for (UnitVisitor u: visitors){
			if (u.isVisitorFrom(en)){
				return u;
			}
		}
		return null;
	}
	public static  UnitVisitor getVisitor(MethodDeclaration meth) {
		for (UnitVisitor u: visitors){
			if (u.isVisitorFrom(meth)){
				return u;
			}
		}
		return null;
	}
	public static UnitVisitor getVisitor(FieldDeclaration field) {
		for (UnitVisitor u: visitors){
			if (u.isVisitorFrom(field)){
				return u;
			}
		}
		return null;
	}
	public static void addPackages(List<String> packs) {
		packages = packs;
	}

	public static void reset() {
		visitors.clear();
		packages.clear();
	}
}
