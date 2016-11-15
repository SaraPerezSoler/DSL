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


public class UnitVisitor extends ASTVisitor{
	
	private String nameFile;
	private CompilationUnit comp;
	private PackageDeclaration packageDeclaration;
	private List<TypeDeclaration> interfaces;
	private List<TypeDeclaration> classes;
	private List<EnumDeclaration> enumerations;
	private List<MethodDeclaration> methods;
	private List<FieldDeclaration> attributes;
	
	
	public UnitVisitor(String nameFile){
		this.nameFile=nameFile;
		interfaces=new ArrayList<TypeDeclaration>();
		classes=new ArrayList<TypeDeclaration>();
		enumerations=new ArrayList<EnumDeclaration>();
		methods=new ArrayList<MethodDeclaration>();
		attributes=new ArrayList<FieldDeclaration>();
	}
	
	
	@Override
	public boolean visit(PackageDeclaration node) {
		
		packageDeclaration=node;
		return super.visit(node);
	}
	
	@Override
	public boolean visit(TypeDeclaration node) {
		if (node.isInterface()){
			interfaces.add(node);
		}else{
			classes.add(node);
		}
		return super.visit(node);
	}
	
	@Override
	public boolean visit(EnumDeclaration node) {
		enumerations.add(node);
		return super.visit(node);
	}
	
	@Override
	public boolean visit(MethodDeclaration node) {
		methods.add(node);
		return super.visit(node);
	}
	@Override
	public boolean visit(FieldDeclaration node) {
		attributes.add(node);
		return super.visit(node);
	}

	public String getNameFile(){
		return nameFile;
	}
	public PackageDeclaration getPackage() {
		return packageDeclaration;
	}

	public List<TypeDeclaration> getInterfaces() {
		return interfaces;
	}

	public List<TypeDeclaration> getClasses() {
		return classes;
	}

	public List<EnumDeclaration> getEnumerations() {
		return enumerations;
	}

	public List<MethodDeclaration> getMethods() {
		return methods;
	}

	public List<FieldDeclaration> getAttributes() {
		return attributes;
	}


	public boolean isVisitorFrom(TypeDeclaration type) {
		if (type.isInterface()){
			if (interfaces.contains(type)){
				return true;
			}else{
				return false;
			}
		}else{
			if (classes.contains(type)){
				return true;
			}else{
				return false;
			}
		}
	}


	public boolean isVisitorFrom(EnumDeclaration en) {
		if (enumerations.contains(en)){
			return true;
		}
		return false;
	}


	public boolean isVisitorFrom(MethodDeclaration meth) {
		if (methods.contains(meth)){
			return true;
		}
		return false;
	}


	public boolean isVisitorFrom(FieldDeclaration field) {
		if (attributes.contains(field)){
			return true;
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
	
	public boolean isEmpty(){
		if (this.packageDeclaration!= null){
			return false;
		}
		if (!this.interfaces.isEmpty()){
			return false;
		}
		if (!this.classes.isEmpty()){
			return false;
		}
		if (!this.enumerations.isEmpty()){
			return false;
		}
		if (!this.methods.isEmpty()){
			return false;
		}
		if (!this.attributes.isEmpty()){
			return false;
		}
		return true;
	}
}
