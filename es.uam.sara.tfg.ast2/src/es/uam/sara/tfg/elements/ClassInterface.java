package es.uam.sara.tfg.elements;

import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.elements.ICanGeneric;
import es.uam.sara.tfg.elements.JavaElement;
import es.uam.sara.tfg.elements.JavaTypes;

public abstract class ClassInterface extends JavaElement implements JavaTypes, ICanGeneric{
	private TypeDeclaration tp;
	
	public ClassInterface(TypeDeclaration tp, UnitVisitor uv) {
		super(tp, uv);
		this.tp=tp;
		
	}	
	public String getName(){
		return tp.getName().toString();
	}
	
	public Type getSuperclass() {
		return tp.getSuperclassType() ;
	}
	@Override
	public TypeDeclaration getBodyDeclaration() {
		return tp;
	}
	@Override
	public AbstractTypeDeclaration getAbstractTypeDeclaration() {
		return tp;
	}
	@Override
	public String toString() {
		UnitVisitor uv=getVisitor();
		if (tp.isInterface()){
			return "In file "+uv.getNameFile()+" the interface "+getName() +" (line: " +uv.getLineNumber(tp.getStartPosition())+")\n";
		}else{
			return "In file "+uv.getNameFile()+" the class "+getName() +" (line: " +uv.getLineNumber(tp.getStartPosition())+")\n";
		}
		
	
	}
	@Override
	public boolean isGeneric() {
		if (tp.typeParameters().isEmpty()) {
			return false;
		}
		return true;
	}
	@Override
	public boolean isInterface() {
		return tp.isInterface();
	}
	
	@Override
	public boolean equals(Object object) {
		boolean sameSame = false;

		if (object != null && object instanceof ClassInterface) {
			sameSame = this.tp.equals(((ClassInterface)object).tp);
		}

		return sameSame;
	}
	
	
}
