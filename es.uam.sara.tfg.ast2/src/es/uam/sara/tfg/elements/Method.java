package es.uam.sara.tfg.elements;

import org.eclipse.jdt.core.dom.MethodDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.properties.ModifiersCheck;

public class Method extends Elements{

	private MethodDeclaration md;
	public Method(MethodDeclaration md) {
		super(ModifiersCheck.getBlend(md));
		this.md=md;
	}
	@Override
	public String getName() {
		return md.getName().toString();
	}

	@Override
	public MethodDeclaration getBodyDeclarations() {
		return md;
	}

	public boolean isEmpty() {
		return md.getBody().statements().isEmpty();
	}
	@Override
	public String toString() {
		UnitVisitor uv=getVisitor();
		return "In file "+uv.getNameFile()+" the class "+getName() +" (line: " +uv.getLineNumber(md.getStartPosition())+")\n";
	}
}
