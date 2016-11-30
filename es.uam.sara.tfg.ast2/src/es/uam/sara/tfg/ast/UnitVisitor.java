package es.uam.sara.tfg.ast;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.elements.IElements;
import es.uam.sara.tfg.elements.type.Attribute;
import es.uam.sara.tfg.elements.type.Class;
import es.uam.sara.tfg.elements.type.Enumeration;
import es.uam.sara.tfg.elements.type.Interface;
import es.uam.sara.tfg.elements.type.Method;
import es.uam.sara.tfg.elements.type.Package;

public class UnitVisitor extends ASTVisitor {

	private String nameFile;
	private CompilationUnit comp;
	private PackageDeclaration packageDeclaration;
	private List<Interface> interfaces;
	private List<Class> classes;
	private List<Enumeration> enumerations;
	// private List<EnumConstantDeclaration> enumConstant;
	private List<Method> methods;
	private List<Attribute> attributes;

	public UnitVisitor(String nameFile) {
		this.nameFile = nameFile;
		interfaces = new ArrayList<Interface>();
		classes = new ArrayList<Class>();
		enumerations = new ArrayList<Enumeration>();
		methods = new ArrayList<Method>();
		attributes = new ArrayList<Attribute>();
		// enumConstant= new ArrayList<EnumConstantDeclaration>();
	}

	@Override
	public boolean visit(PackageDeclaration node) {

		packageDeclaration = node;
		return super.visit(node);
	}

	@Override
	public boolean visit(TypeDeclaration node) {
		if (node.isInterface()) {
			interfaces.add(new Interface(node, this));
		} else {
			classes.add(new Class(node, this));
		}
		return super.visit(node);
	}

	@Override
	public boolean visit(EnumDeclaration node) {
		enumerations.add(new Enumeration(node, this));
		return super.visit(node);
	}

	/*
	 * @Override public boolean visit(EnumConstantDeclaration node) {
	 * enumConstant.add(node); return super.visit(node); }
	 */

	@Override
	public boolean visit(MethodDeclaration node) {
		methods.add(new Method(node, this) );
		return super.visit(node);
	}

	@Override
	public boolean visit(FieldDeclaration node) {
		attributes.add(new Attribute(node, this));
		return super.visit(node);
	}

	public String getNameFile() {
		return nameFile;
	}

	public PackageDeclaration getPackage() {
		return packageDeclaration;
	}

	public List<Interface> getInterfaces() {
		return interfaces;
	}

	public List<Class> getClasses() {
		return classes;
	}

	public List<Enumeration> getEnumerations() {
		return enumerations;
	}

	public List<Method> getMethods() {
		return methods;
	}

	public List<Attribute> getAttributes() {
		return attributes;
	}

	public boolean isVisitorFrom(String pk) {
		if (pk.equals("(default package)")){
			if (packageDeclaration == null) {
				return true;
			}
		}else if (packageDeclaration!=null) {
			if (packageDeclaration.getName().toString().equals(pk)) {
				return true;
			}
		}
		return false;
	}
	public boolean isVisitorFrom(IElements type) {

		if (type instanceof Package) {
			if (type.getName().equals("(default package)")){
				if (packageDeclaration == null) {
					return true;
				}
				return false;
			}else if (packageDeclaration!=null) {
				if (packageDeclaration.getName().toString().equals(type.getName())) {
					return true;
				}
			}
			
		} else if (type instanceof Class) {
			if (interfaces.contains(type)) {
				return true;
			} else if (classes.contains(type)){
				return true;
			}
		} else if (type instanceof Enumeration) {
			if (enumerations.contains(type)) {
				return true;
			}
		} else if (type instanceof Method) {
			if (methods.contains(type)) {
				return true;
			}
		} else if (type instanceof Attribute) {
			if (attributes.contains(type)) {
				return true;
			}
		} 

		return false;
	}

	public CompilationUnit getComp() {
		return comp;
	}

	public int getLineNumber(int position) {
		return (comp.getLineNumber(position));
	}

	public void setComp(CompilationUnit comp) {
		this.comp = comp;
	}

	public boolean isEmpty() {
		if (this.packageDeclaration != null) {
			return false;
		}
		if (!this.interfaces.isEmpty()) {
			return false;
		}
		if (!this.classes.isEmpty()) {
			return false;
		}
		if (!this.enumerations.isEmpty()) {
			return false;
		}
		if (!this.methods.isEmpty()) {
			return false;
		}
		if (!this.attributes.isEmpty()) {
			return false;
		}
		return true;
	}
}
