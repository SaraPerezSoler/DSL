package es.uam.sara.tfg.ast;

import java.util.ArrayList;

import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class Visitors {
	private static ArrayList<UnitVisitor> visitors=new ArrayList<UnitVisitor>();
	
	public static void addVisitor(UnitVisitor v){
		visitors.add(v);
	}
	
	public static ArrayList <TypeDeclaration> getTypes(){
		ArrayList<TypeDeclaration> result=new ArrayList<TypeDeclaration>();
		for (UnitVisitor u: visitors){
			result.addAll(u.getClasses());
			result.addAll(u.getInterfaces());
		}
		return result;
	}
	
	public static ArrayList <TypeDeclaration> getClasses(){
		ArrayList<TypeDeclaration> result=new ArrayList<TypeDeclaration>();
		for (UnitVisitor u: visitors){
			result.addAll(u.getClasses());
		}
		return result;
	}
	
	public static ArrayList<PackageDeclaration> getPackages() {
		ArrayList<PackageDeclaration> result=new ArrayList<PackageDeclaration>();
		for (UnitVisitor u: visitors){
			result.add(u.getPackages());
		}
		return result;
	}

	public static ArrayList<TypeDeclaration> getInterfaces() {
		ArrayList<TypeDeclaration> result=new ArrayList<TypeDeclaration>();
		for (UnitVisitor u: visitors){
			result.addAll(u.getInterfaces());
		}
		return result;
	}

	public static ArrayList<EnumDeclaration> getEnumerations() {
		ArrayList<EnumDeclaration> result=new ArrayList<EnumDeclaration>();
		for (UnitVisitor u: visitors){
			result.addAll(u.getEnumerations());
		}
		return result;
	}

	public static ArrayList<MethodDeclaration> getMethods() {
		ArrayList<MethodDeclaration> result=new ArrayList<MethodDeclaration>();
		for (UnitVisitor u: visitors){
			result.addAll(u.getMethods());
		}
		return result;
	}

	public static ArrayList<FieldDeclaration> getAttributes() {
		ArrayList<FieldDeclaration> result=new ArrayList<FieldDeclaration>();
		for (UnitVisitor u: visitors){
			result.addAll(u.getAttributes());
		}
		return result;
	}
	
	public static ArrayList<TypeDeclaration> classForPackage (String packageName){
		ArrayList<TypeDeclaration> result=new ArrayList<TypeDeclaration>();
		for (UnitVisitor u: visitors){
			if (packageName.compareTo(u.getPackages().getName().toString())==0){
				result.addAll(u.getClasses());
			}
		}
		return result;
	}
	
	public static ArrayList<TypeDeclaration> interfacesForPackage (String packageName){
		ArrayList<TypeDeclaration> result=new ArrayList<TypeDeclaration>();
		for (UnitVisitor u: visitors){
			if (packageName.compareTo(u.getPackages().getName().toString())==0){
				result.addAll(u.getInterfaces());
			}
		}
		return result;
	}
	
	public static ArrayList<EnumDeclaration> enumForPackage (String packageName){
		ArrayList<EnumDeclaration> result=new ArrayList<EnumDeclaration>();
		for (UnitVisitor u: visitors){
			if (packageName.compareTo(u.getPackages().getName().toString())==0){
				result.addAll(u.getEnumerations());
			}
		}
		return result;
	}
	
	public static ArrayList<MethodDeclaration> methodForClass (TypeDeclaration clas){
		ArrayList<MethodDeclaration> result=new ArrayList<MethodDeclaration>();
		for (MethodDeclaration m: clas.getMethods()){
			result.add(m);
		}
		return result;
	}
	
	public static ArrayList<FieldDeclaration> attributesForClass (TypeDeclaration clas){
		ArrayList<FieldDeclaration> result=new ArrayList<FieldDeclaration>();
		for (FieldDeclaration a: clas.getFields()){
			result.add(a);
		}
		return result;
	}
	
	public static ArrayList<MethodDeclaration> methodForInterface (TypeDeclaration inter){
		ArrayList<MethodDeclaration> result=new ArrayList<MethodDeclaration>();
		for (MethodDeclaration m: inter.getMethods()){
			result.add(m);
		}
		return result;
	}
	
	public static ArrayList<FieldDeclaration> attributesForInterface (TypeDeclaration inter){
		ArrayList<FieldDeclaration> result=new ArrayList<FieldDeclaration>();
		for (FieldDeclaration a: inter.getFields()){
			result.add(a);
		}
		return result;
	}

}
