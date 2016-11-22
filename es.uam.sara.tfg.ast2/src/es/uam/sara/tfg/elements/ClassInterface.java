package es.uam.sara.tfg.elements;

import java.util.List;

import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.properties.ModifiersCheck;
import es.uam.sara.tfg.properties.TypeToString;

public class ClassInterface extends Elements implements Types{
	private TypeDeclaration tp;
	
	public ClassInterface(TypeDeclaration tp) {
		super(ModifiersCheck.getBlend(tp));
		this.tp=tp;
		
	}	
	public String getName(){
		return tp.getName().toString();
	}
	
	public List<String> getSuperclass() {
		return TypeToString.getString(tp.getSuperclassType());
	}
	@Override
	public TypeDeclaration getBodyDeclarations() {
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
	
}
