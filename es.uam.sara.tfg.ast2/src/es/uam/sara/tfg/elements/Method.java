package es.uam.sara.tfg.elements;

import org.eclipse.jdt.core.dom.MethodDeclaration;
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

}
