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
import es.uam.sara.tfg.elements.type.MAttribute;
import es.uam.sara.tfg.elements.type.MClass;
import es.uam.sara.tfg.elements.type.MEnumeration;
import es.uam.sara.tfg.elements.type.MInterface;
import es.uam.sara.tfg.elements.type.MMethod;
import es.uam.sara.tfg.elements.type.MPackage;

public class UnitVisitor extends ASTVisitor{

	private String nameFile;
	private CompilationUnit comp;
	private PackageDeclaration packageDeclaration;
	private List<MInterface> interfaces;
	private List<MClass> classes;
	private List<MEnumeration> enumerations;
	// private List<EnumConstantDeclaration> enumConstant;
	private List<MMethod> methods;
	private List<MAttribute> attributes;

	public UnitVisitor(String nameFile) {
		this.nameFile = nameFile;
		interfaces = new ArrayList<MInterface>();
		classes = new ArrayList<MClass>();
		enumerations = new ArrayList<MEnumeration>();
		methods = new ArrayList<MMethod>();
		attributes = new ArrayList<MAttribute>();
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
			interfaces.add(new MInterface(node, this));
		} else {
			classes.add(new MClass(node, this));
		}
		return super.visit(node);
	}

	@Override
	public boolean visit(EnumDeclaration node) {
		enumerations.add(new MEnumeration(node, this));
		return super.visit(node);
	}

	/*
	 * @Override public boolean visit(EnumConstantDeclaration node) {
	 * enumConstant.add(node); return super.visit(node); }
	 */

	@Override
	public boolean visit(MethodDeclaration node) {
		methods.add(new MMethod(node, this) );
		return super.visit(node);
	}

	@Override
	public boolean visit(FieldDeclaration node) {
		attributes.add(new MAttribute(node, this));
		return super.visit(node);
	}

	public String getNameFile() {
		return nameFile;
	}

	public PackageDeclaration getPackage() {
		return packageDeclaration;
	}

	public List<MInterface> getInterfaces() {
		return interfaces;
	}

	public List<MClass> getClasses() {
		return classes;
	}

	public List<MEnumeration> getEnumerations() {
		return enumerations;
	}

	public List<MMethod> getMethods() {
		return methods;
	}

	public List<MAttribute> getAttributes() {
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

		if (type instanceof MPackage) {
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
			
		} else if (type instanceof MClass) {
			if (interfaces.contains(type)) {
				return true;
			} else if (classes.contains(type)){
				return true;
			}
		} else if (type instanceof MEnumeration) {
			if (enumerations.contains(type)) {
				return true;
			}
		} else if (type instanceof MMethod) {
			if (methods.contains(type)) {
				return true;
			}
		} else if (type instanceof MAttribute) {
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
