package es.uam.sara.tfg.ast;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class Visitors {
	private static List<UnitVisitor> visitors = new ArrayList<UnitVisitor>();
	private static List<String> packages = new ArrayList<String>();

	/* Metodos de inicializacion del Visitors */
	public static void addVisitor(UnitVisitor v) {
		visitors.add(v);
	}

	public static void addPackage(String pack) {
		packages.add(pack);
	}

	public static void addPackages(List<String> packs) {
		packages = packs;
	}

	/* Metodos para coger todos los elementos de un tipo */
	public static List<TypeDeclaration> getTypes() {
		List<TypeDeclaration> result = new ArrayList<TypeDeclaration>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getClasses());
			result.addAll(u.getInterfaces());
		}
		return result;
	}

	public static List<String> getPackages() {
		return packages;
	}

	public static List<TypeDeclaration> getClasses() {
		List<TypeDeclaration> result = new ArrayList<TypeDeclaration>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getClasses());
		}
		return result;
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

	/* Metodo para obtener unos determinados elementos de una lista */
	public static List<TypeDeclaration> getClasses(AbstractTypeDeclaration atd) {
		List<?> bd=atd.bodyDeclarations();
		List<TypeDeclaration> temp = new ArrayList<TypeDeclaration>();
		for (Object ed : bd) {
			if (ed instanceof TypeDeclaration) {
				if (!((TypeDeclaration) ed).isInterface())
					temp.add((TypeDeclaration) ed);
			}
		}
		return temp;
	}

	public static List<TypeDeclaration> getInterfaces(AbstractTypeDeclaration atd) {
		List<?> bd=atd.bodyDeclarations();
		List<TypeDeclaration> temp = new ArrayList<TypeDeclaration>();
		for (Object ed : bd) {
			if (ed instanceof TypeDeclaration) {
				if (((TypeDeclaration) ed).isInterface())
					temp.add((TypeDeclaration) ed);
			}
		}
		return temp;
	}

	public static List<EnumDeclaration> getEnumerations(AbstractTypeDeclaration atd) {
		List<?> bd=atd.bodyDeclarations();
		List<EnumDeclaration> temp = new ArrayList<EnumDeclaration>();
		for (Object ed : bd) {
			if (ed instanceof EnumDeclaration) {
				temp.add((EnumDeclaration) ed);
			}
		}
		return temp;
	}

	public static List<MethodDeclaration> getMethods(AbstractTypeDeclaration atd) {
		List<?> bd=atd.bodyDeclarations();
		List<MethodDeclaration> temp = new ArrayList<MethodDeclaration>();
		for (Object ed : bd) {
			if (ed instanceof MethodDeclaration) {
				temp.add((MethodDeclaration) ed);
			}
		}
		return temp;
	}

	public static List<FieldDeclaration> getAttributes(AbstractTypeDeclaration atd) {
		List<?> bd=atd.bodyDeclarations();
		List<FieldDeclaration> temp = new ArrayList<FieldDeclaration>();
		for (Object ed : bd) {
			if (ed instanceof FieldDeclaration) {
				temp.add((FieldDeclaration) ed);
			}
		}
		return temp;
	}

	//*Class, attributes y Methods de Las constantes del enum*/
	public static List<TypeDeclaration> getClasses(EnumConstantDeclaration ecd) {
		List<?> bd=ecd.getAnonymousClassDeclaration().bodyDeclarations();
		List<TypeDeclaration> temp = new ArrayList<TypeDeclaration>();
		for (Object ed : bd) {
			if (ed instanceof TypeDeclaration) {
				if (!((TypeDeclaration) ed).isInterface())
					temp.add((TypeDeclaration) ed);
			}
		}
		return temp;
	}

	public static List<MethodDeclaration> getMethods(EnumConstantDeclaration ecd) {
		List<?> bd=ecd.getAnonymousClassDeclaration().bodyDeclarations();
		List<MethodDeclaration> temp = new ArrayList<MethodDeclaration>();
		for (Object ed : bd) {
			if (ed instanceof MethodDeclaration) {
				temp.add((MethodDeclaration) ed);
			}
		}
		return temp;
	}

	public static List<FieldDeclaration> getAttributes(EnumConstantDeclaration ecd) {
		List<?> bd=ecd.getAnonymousClassDeclaration().bodyDeclarations();
		List<FieldDeclaration> temp = new ArrayList<FieldDeclaration>();
		for (Object ed : bd) {
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
			if (isThisPackage(pk, u)) {
				temp.addAll(u.getInterfaces());
			}
		}
		return temp;
	}

	public static List<EnumDeclaration> getEnumerations(String pk) {
		List<EnumDeclaration> temp = new ArrayList<EnumDeclaration>();
		for (UnitVisitor u : visitors) {
			if (isThisPackage(pk, u)) {
				temp.addAll(u.getEnumerations());
			}
		}
		return temp;
	}

	public static List<MethodDeclaration> getMethods(String pk) {
		List<MethodDeclaration> temp = new ArrayList<MethodDeclaration>();
		for (UnitVisitor u : visitors) {
			if (isThisPackage(pk, u)) {
				temp.addAll(u.getMethods());
			}
		}
		return temp;
	}

	public static List<FieldDeclaration> getAttributes(String pk) {
		List<FieldDeclaration> temp = new ArrayList<FieldDeclaration>();
		for (UnitVisitor u : visitors) {
			if (isThisPackage(pk, u)) {
				temp.addAll(u.getAttributes());
			}
		}
		return temp;
	}

	public static String getFileName(ASTNode type) {
		for (UnitVisitor u : visitors) {
			if (u.isVisitorFrom(type)) {
				return u.getNameFile();
			}
		}
		return "";
	}

	public static UnitVisitor getVisitor(ASTNode type) {
		for (UnitVisitor u : visitors) {
			if (u.isVisitorFrom(type)) {
				return u;
			}
		}
		return null;
	}

	public static void reset() {
		visitors.clear();
		packages.clear();
	}

}
