package es.uam.sara.tfg.elements;

import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.Javadoc;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.properties.BlendModifiers;
import es.uam.sara.tfg.properties.all.Modifiers;

public abstract class JavaElement implements IElements, IPosicionable{

	private BodyDeclaration bd;
	public JavaElement(BodyDeclaration bd){
		this.bd=bd;
	}
	public BlendModifiers getModifiers(){
		return Modifiers.getBlend(bd);
	}
	public Javadoc getJavadoc(){
		return bd.getJavadoc();
	}
	public BodyDeclaration getBodyDeclaration(){
		return bd;
	}
	
	public int getStartLine(){
		UnitVisitor uv=Visitors.getVisitor(this);
		if (getJavadoc()!=null){
			return uv.getLineNumber(bd.getStartPosition()+getJavadoc().getLength());
		}
		return uv.getLineNumber(bd.getStartPosition());
	}
	public int getEndLine(){
		UnitVisitor uv=Visitors.getVisitor(this);
		return uv.getLineNumber(bd.getStartPosition()+bd.getLength()-1);
	}
}
