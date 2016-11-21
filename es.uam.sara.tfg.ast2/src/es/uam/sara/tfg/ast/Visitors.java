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

import es.uam.sara.tfg.elements.Attribute;
import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.elements.Elements;
import es.uam.sara.tfg.elements.Enumeration;
import es.uam.sara.tfg.elements.Method;

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
	public static List<ClassInterface> getTypes() {
		List<ClassInterface> result = new ArrayList<ClassInterface>();
		for (UnitVisitor u : visitors) {
			result.addAll(u.getClasses());
			result.addAll(u.getInterfaces());
		}
		return result;
	}

	public static List<String> getPackages() {
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

	/* Metodo para obtener unos determinados elementos de una lista */
	public static List<ClassInterface> getClasses(AbstractTypeDeclaration atd) {
		List<?> bd=atd.bodyDeclarations();
		List<ClassInterface> temp = new ArrayList<ClassInterface>();
		for (Object ed : bd) {
			if (ed instanceof TypeDeclaration) {
				if (!((TypeDeclaration) ed).isInterface())
					temp.add(new ClassInterface((TypeDeclaration) ed));
			}
		}
		return temp;
	}

	public static List<ClassInterface> getInterfaces(AbstractTypeDeclaration atd) {
		List<?> bd=atd.bodyDeclarations();
		List<ClassInterface> temp = new ArrayList<ClassInterface>();
		for (Object ed : bd) {
			if (ed instanceof TypeDeclaration) {
				if (((TypeDeclaration) ed).isInterface())
					temp.add(new ClassInterface((TypeDeclaration) ed));
			}
		}
		return temp;
	}

	public static List<Enumeration> getEnumerations(AbstractTypeDeclaration atd) {
		List<?> bd=atd.bodyDeclarations();
		List<Enumeration> temp = new ArrayList<Enumeration>();
		for (Object ed : bd) {
			if (ed instanceof EnumDeclaration) {
				temp.add(new Enumeration((EnumDeclaration) ed));
			}
		}
		return temp;
	}

	public static List<Method> getMethods(AbstractTypeDeclaration atd) {
		List<?> bd=atd.bodyDeclarations();
		List<Method> temp = new ArrayList<Method>();
		for (Object ed : bd) {
			if (ed instanceof MethodDeclaration) {
				temp.add(new Method((MethodDeclaration) ed));
			}
		}
		return temp;
	}

	public static List<Attribute> getAttributes(AbstractTypeDeclaration atd) {
		List<?> bd=atd.bodyDeclarations();
		List<Attribute> temp = new ArrayList<Attribute>();
		for (Object ed : bd) {
			if (ed instanceof FieldDeclaration) {
				temp.add(new Attribute((FieldDeclaration) ed));
			}
		}
		return temp;
	}

	//*Class, attributes y Methods de Las constantes del enum*/
	public static List<ClassInterface> getClasses(EnumConstantDeclaration ecd) {
		List<?> bd=ecd.getAnonymousClassDeclaration().bodyDeclarations();
		List<ClassInterface> temp = new ArrayList<ClassInterface>();
		for (Object ed : bd) {
			if (ed instanceof TypeDeclaration) {
				if (!((TypeDeclaration) ed).isInterface())
					temp.add(new ClassInterface((TypeDeclaration) ed));
			}
		}
		return temp;
	}

	public static List<Method> getMethods(EnumConstantDeclaration ecd) {
		List<?> bd=ecd.getAnonymousClassDeclaration().bodyDeclarations();
		List<Method> temp = new ArrayList<Method>();
		for (Object ed : bd) {
			if (ed instanceof MethodDeclaration) {
				temp.add(new Method((MethodDeclaration) ed));
			}
		}
		return temp;
	}

	public static List<Attribute> getAttributes(EnumConstantDeclaration ecd) {
		List<?> bd=ecd.getAnonymousClassDeclaration().bodyDeclarations();
		List<Attribute> temp = new ArrayList<Attribute>();
		for (Object ed : bd) {
			if (ed instanceof FieldDeclaration) {
				temp.add(new Attribute((FieldDeclaration) ed));
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

	public static List<ClassInterface> getClasses(String pk) {

		List<ClassInterface> temp = new ArrayList<ClassInterface>();
		for (UnitVisitor u : visitors) {
			if (isThisPackage(pk, u)) {
				temp.addAll(u.getClasses());
			}
		}
		return temp;
	}

	public static List<ClassInterface> getInterfaces(String pk) {
		List<ClassInterface> temp = new ArrayList<ClassInterface>();
		for (UnitVisitor u : visitors) {
			if (isThisPackage(pk, u)) {
				temp.addAll(u.getInterfaces());
			}
		}
		return temp;
	}

	public static List<Enumeration> getEnumerations(String pk) {
		List<Enumeration> temp = new ArrayList<Enumeration>();
		for (UnitVisitor u : visitors) {
			if (isThisPackage(pk, u)) {
				temp.addAll(u.getEnumerations());
			}
		}
		return temp;
	}

	public static List<Method> getMethods(String pk) {
		List<Method> temp = new ArrayList<Method>();
		for (UnitVisitor u : visitors) {
			if (isThisPackage(pk, u)) {
				temp.addAll(u.getMethods());
			}
		}
		return temp;
	}

	public static List<Attribute> getAttributes(String pk) {
		List<Attribute> temp = new ArrayList<Attribute>();
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

	public static UnitVisitor getVisitor(Elements elem) {
		ASTNode type=elem.getASTNode();
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
