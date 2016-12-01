package es.uam.sara.tfg.elements.type;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.elements.ICanEmpty;
import es.uam.sara.tfg.elements.ICanGeneric;
import es.uam.sara.tfg.elements.JavaElement;

public class Method extends JavaElement implements ICanGeneric, ICanEmpty{

	private MethodDeclaration md;
	public Method(MethodDeclaration md, UnitVisitor uv) {
		super(md, uv);
		this.md=md;
	}
	@Override
	public String getName() {
		return md.getName().toString();
	}

	@Override
	public MethodDeclaration getBodyDeclaration() {
		return md;
	}

	public boolean isEmpty() {
		return md.getBody().statements().isEmpty();
	}
	@Override
	public String toString() {
		UnitVisitor uv=getVisitor();
		return "In file "+uv.getNameFile()+" the method "+getName() +" (line: " +uv.getLineNumber(md.getStartPosition())+")\n";
	}
	@Override
	public boolean isGeneric() {
		if (md.getParent() instanceof TypeDeclaration) {
			TypeDeclaration t = (TypeDeclaration) md.getParent();
			if (t.isInterface()){
				return false;
			}
			Class c= new Class(t, getVisitor());
			if (c.isGeneric()) {
				if (comparaParam(getTypes(md.parameters()), getGenericTypes(t.typeParameters()))) {
					return true;
				} else if (comparaParam(getTypes(md.getReturnType2()), getGenericTypes(t.typeParameters()))) {
					return true;
				}
			}
		}
		return false;
	}
	public boolean isConstructor() {
		return md.isConstructor();
	}
	public Type getReturnType() {
		return md.getReturnType2();
	}
	public List<SingleVariableDeclaration> getParameters() {
		List<SingleVariableDeclaration> ret= new ArrayList<SingleVariableDeclaration>();
		for (Object o: md.parameters()){
			if (o instanceof SingleVariableDeclaration){
				ret.add((SingleVariableDeclaration)o);
			}
		}
		return ret;
	}
	
	public List<Type> getParametersType() {
		List<Type> ret= new ArrayList<Type>();
		for (Object o: md.parameters()){
			if (o instanceof SingleVariableDeclaration){
				ret.add(((SingleVariableDeclaration)o).getType());
			}
		}
		return ret;
	}
	@Override
	public boolean equals(Object object) {
		boolean sameSame = false;

		if (object != null && object instanceof Method) {
			sameSame = this.md.equals(((Method)object).md);
		}

		return sameSame;
	}
	@Override
	public String getStringType() {
		return this.md.getReturnType2().toString();
	}
	
}
