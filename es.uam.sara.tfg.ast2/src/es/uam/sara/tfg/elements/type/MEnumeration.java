package es.uam.sara.tfg.elements.type;

import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.elements.JavaElement;
import es.uam.sara.tfg.elements.JavaTypes;


public class MEnumeration extends JavaElement implements JavaTypes{
	private EnumDeclaration em;
	public MEnumeration(EnumDeclaration em, UnitVisitor uv) {
		super(em, uv);
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
		return "In file "+uv.getPath()+" the enumeration "+getName() +" (line: " +uv.getLineNumber(em.getStartPosition())+")\n";

	}

	@Override
	public boolean isInterface() {
		return false;
	}
	
	@Override
	public boolean equals(Object object) {
		boolean sameSame = false;

		if (object != null && object instanceof MEnumeration) {
			sameSame = this.em.equals(((MEnumeration)object).em);
		}

		return sameSame;
	}

}
