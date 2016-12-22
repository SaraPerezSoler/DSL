package es.uam.sara.tfg.elements;

import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.Javadoc;

import es.uam.sara.tfg.ast.UnitVisitor;

public abstract class JavaElement implements IElements, IPosicionable{

	private BodyDeclaration bd;
	private UnitVisitor uv;
	public JavaElement(BodyDeclaration bd, UnitVisitor uv){
		this.uv=uv;
		this.bd=bd;
	}
	public Javadoc getJavadoc(){
		return bd.getJavadoc();
	}
	public BodyDeclaration getBodyDeclaration(){
		return bd;
	}
	
	public int getStartLine(){
		if (getJavadoc()!=null){
			return uv.getLineNumber(bd.getStartPosition()+getJavadoc().getLength());
		}
		return uv.getLineNumber(bd.getStartPosition());
	}
	public int getEndLine(){
		return uv.getLineNumber(bd.getStartPosition()+bd.getLength()-1);
	}
	
	public  UnitVisitor getVisitor(){
		return uv;
	}
}
