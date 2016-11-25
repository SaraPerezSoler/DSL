package es.uam.sara.tfg.elements.type;

import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.elements.JavaElement;
import es.uam.sara.tfg.elements.JavaTypes;


public class Enumeration extends JavaElement implements JavaTypes{
	private EnumDeclaration em;
	public Enumeration(EnumDeclaration em) {
		super(em);
		this.em=em;
	}

	@Override
	public String getName() {
		return em.getName().toString();
	}

	@Override
	public AbstractTypeDeclaration getAbstractTypeDeclaration() {
		return em;
	}

	@Override
	public EnumDeclaration getBodyDeclaration() {
		return em;
	}

	@Override
	public String toString() {
		UnitVisitor uv=getVisitor();
		return "In file "+uv.getNameFile()+" the enumeration "+getName() +" (line: " +uv.getLineNumber(em.getStartPosition())+")\n";

	}

	@Override
	public boolean isInterface() {
		return false;
	}
	
	@Override
	public boolean equals(Object object) {
		boolean sameSame = false;

		if (object != null && object instanceof Enumeration) {
			sameSame = this.em.equals(((Enumeration)object).em);
		}

		return sameSame;
	}

}
