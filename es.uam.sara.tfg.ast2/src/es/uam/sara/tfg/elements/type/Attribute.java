package es.uam.sara.tfg.elements.type;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.elements.ICanGeneric;
import es.uam.sara.tfg.elements.JavaElement;


public class Attribute extends JavaElement implements ICanGeneric{

	private FieldDeclaration fd;
	
	public Attribute(FieldDeclaration fd, UnitVisitor uv) {
		super(fd, uv);
		this.fd=fd;
	}
	
	public String getName (){
		if (fd.fragments().get(0) instanceof VariableDeclarationFragment) {
			VariableDeclarationFragment declaration = (VariableDeclarationFragment) fd.fragments().get(0);
			return declaration.getName().toString();
		}
		return "";
	}
	
	
	public Type getType(){
		return fd.getType();
	}

	@Override
	public FieldDeclaration getBodyDeclaration() {
		return fd;
	}

	@Override
	public String toString() {
		UnitVisitor uv=getVisitor();
		return "In file "+uv.getNameFile()+" the attribute "+getName() +" (line: " +uv.getLineNumber(fd.getStartPosition())+")\n";
	}
	
	public boolean isInitialize(){
		if (fd.fragments().get(0) instanceof VariableDeclarationFragment) {
			VariableDeclarationFragment declaration = (VariableDeclarationFragment) fd.fragments().get(0);
			if (declaration.getInitializer() != null) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isGeneric() {
		if (fd.getParent() instanceof TypeDeclaration) {
			TypeDeclaration t = (TypeDeclaration) fd.getParent();
			if (t.isInterface()){
				return false;
			}
			Class c= new Class(t, getVisitor());
			if (c.isGeneric()) {
				if (comparaParam(getTypes(fd.getType()), getGenericTypes(t.typeParameters()))) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public boolean equals(Object object) {
		boolean sameSame = false;

		if (object != null && object instanceof Attribute) {
			sameSame = this.fd.equals(((Attribute)object).fd);
		}

		return sameSame;
	}
	


}
