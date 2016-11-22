package es.uam.sara.tfg.ast;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.elements.Attribute;
import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.elements.Enumeration;
import es.uam.sara.tfg.elements.Method;


public class UnitVisitor extends ASTVisitor{
	
	private String nameFile;
	private CompilationUnit comp;
	private PackageDeclaration packageDeclaration;
	private List<ClassInterface> interfaces;
	private List<ClassInterface> classes;
	private List<Enumeration> enumerations;
	private List<EnumConstantDeclaration> enumConstant;
	private List<Method> methods;
	private List<Attribute> attributes;
	
	
	public UnitVisitor(String nameFile){
		this.nameFile=nameFile;
		interfaces=new ArrayList<ClassInterface>();
		classes=new ArrayList<ClassInterface>();
		enumerations=new ArrayList<Enumeration>();
		methods=new ArrayList<Method>();
		attributes=new ArrayList<Attribute>();
		enumConstant= new ArrayList<EnumConstantDeclaration>();
	}
	
	
	@Override
	public boolean visit(PackageDeclaration node) {
		
		packageDeclaration=node;
		return super.visit(node);
	}
	
	@Override
	public boolean visit(TypeDeclaration node) {
		if (node.isInterface()){
			interfaces.add(new ClassInterface(node));
		}else{
			classes.add(new ClassInterface(node));
		}
		return super.visit(node);
	}
	
	@Override
	public boolean visit(EnumDeclaration node) {
		enumerations.add(new Enumeration(node));
		return super.visit(node);
	}
	
	@Override
	public boolean visit(EnumConstantDeclaration node) {
		enumConstant.add(node);
		return super.visit(node);
	}
	
	@Override
	public boolean visit(MethodDeclaration node) {
		methods.add(new Method(node));
		return super.visit(node);
	}
	@Override
	public boolean visit(FieldDeclaration node) {
		attributes.add(new Attribute(node));
		return super.visit(node);
	}

	public String getNameFile(){
		return nameFile;
	}
	public PackageDeclaration getPackage() {
		return packageDeclaration;
	}

	public List<ClassInterface> getInterfaces() {
		return interfaces;
	}

	public List<ClassInterface> getClasses() {
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
	public boolean isVisitorFrom(ASTNode type) {
		
		if (type instanceof TypeDeclaration){
			if (interfaces.contains(type)){
				return true;
			}else if (classes.contains(type));{
				return true;
			}
		}else if (type instanceof EnumDeclaration){
			if (enumerations.contains(type)){
				return true;
			}
		}else if (type instanceof EnumConstantDeclaration){
			if (enumConstant.contains(type)){
				return true;
			}
		}else if (type instanceof MethodDeclaration){
			if (methods.contains(type)){
				return true;
			}
		}else if (type instanceof FieldDeclaration){
			if (attributes.contains(type)){
				return true;
			}
		}else if (type instanceof CompilationUnit){
			if (this.comp==(CompilationUnit) type){
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


	public List<EnumConstantDeclaration> getEnumConstant() {
		return enumConstant;
	}


	public boolean isVisitorFrom(String name) {
		if (this.nameFile.equals(name)){
			return true;
		}
		if (this.packageDeclaration.getName().toString().equals(name)){
			return true;
		}
		return false;
	}
}
