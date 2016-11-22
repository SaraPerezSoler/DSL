package es.uam.sara.tfg.elements;

import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.properties.ModifiersCheck;

public class Enumeration extends Elements implements Types{
	private EnumDeclaration em;
	public Enumeration(EnumDeclaration em) {
		super(ModifiersCheck.getBlend(em));
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
	public EnumDeclaration getBodyDeclarations() {
		return em;
	}

	@Override
	public String toString() {
		UnitVisitor uv=getVisitor();
		return "In file "+uv.getNameFile()+" the enumeration "+getName() +" (line: " +uv.getLineNumber(em.getStartPosition())+")\n";

	}
	

}
