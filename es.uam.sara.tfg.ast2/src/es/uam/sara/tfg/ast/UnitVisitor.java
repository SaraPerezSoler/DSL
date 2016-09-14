package es.uam.sara.tfg.ast;

import java.util.ArrayList;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;


public class UnitVisitor extends ASTVisitor{
	
	private String nameFile;
	private PackageDeclaration packageDeclaration;
	private ArrayList<TypeDeclaration> interfaces;
	private ArrayList<TypeDeclaration> classes;
	private ArrayList<EnumDeclaration> enumerations;
	private ArrayList<MethodDeclaration> methods;
	private ArrayList<FieldDeclaration> attributes;
	
	
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
	public PackageDeclaration getPackages() {
		return packageDeclaration;
	}

	public ArrayList<TypeDeclaration> getInterfaces() {
		return interfaces;
	}

	public ArrayList<TypeDeclaration> getClasses() {
		return classes;
	}

	public ArrayList<EnumDeclaration> getEnumerations() {
		return enumerations;
	}

	public ArrayList<MethodDeclaration> getMethods() {
		return methods;
	}

	public ArrayList<FieldDeclaration> getAttributes() {
		return attributes;
	}
}
