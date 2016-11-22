package es.uam.sara.tfg.elements;
import org.eclipse.jdt.core.dom.BodyDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.properties.BlendModifiers;

public abstract class Elements {

	protected BlendModifiers bm;

	public abstract String getName();

	public BlendModifiers getModifiers(){
		return bm;
	}
	
	public Elements(BlendModifiers bm) {
		this.bm=bm;
	}

	public boolean isAbstract() {
		if (bm!=null){
			return bm.isAbstract_();
		}
		return false;
	}

	public boolean isStatic() {
		if (bm!=null){
			return bm.isStatic_();
		}
		return false;
	}

	public boolean isFinal() {
		if (bm!=null){
			return bm.isFinal_();
		}
		return false;
	}

	public boolean isDefault() {
		
		if (bm!=null){
			return bm.isDefault_();
		}
		return false;
	}

	public boolean isSynchronize() {
		if (bm!=null){
			return bm.isSynchronized_();
		}
		return false;
	}

	public String accessModifier() {
		if (bm!=null){
			return bm.getAcceso().toString();
		}
		return "";
	}

	//public abstract ASTNode getASTNode();
	public abstract BodyDeclaration getBodyDeclarations();
	public abstract String toString();
	
	public UnitVisitor getVisitor() {
		return Visitors.getVisitor(this);
	}
	
}
