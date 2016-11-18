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


public class UnitVisitor extends ASTVisitor{
	
	private String nameFile;
	private CompilationUnit comp;
	private PackageDeclaration packageDeclaration;
	private List<TypeDeclaration> interfaces;
	private List<TypeDeclaration> classes;
	private List<EnumDeclaration> enumerations;
	private List<EnumConstantDeclaration> enumConstant;
	private List<MethodDeclaration> methods;
	private List<FieldDeclaration> attributes;
	
	
	public UnitVisitor(String nameFile){
		this.nameFile=nameFile;
		interfaces=new ArrayList<TypeDeclaration>();
		classes=new ArrayList<TypeDeclaration>();
		enumerations=new ArrayList<EnumDeclaration>();
		methods=new ArrayList<MethodDeclaration>();
		attributes=new ArrayList<FieldDeclaration>();
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
	public boolean visit(EnumConstantDeclaration node) {
		enumConstant.add(node);
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
}
