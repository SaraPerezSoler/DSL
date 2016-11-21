package es.uam.sara.tfg.elements;

import org.eclipse.jdt.core.dom.ASTNode;

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
		return bm.isAbstract_();
	}

	public boolean isStatic() {
		return bm.isStatic_();
	}

	public boolean isFinal() {
		return bm.isFinal_();
	}

	public boolean isDefault() {
		return bm.isDefault_();
	}

	public boolean isSynchronize() {
		return bm.isSynchronized_();
	}

	public String accessModifier() {
		return bm.getAcceso().toString();
	}

	public abstract ASTNode getASTNode();
	
}
