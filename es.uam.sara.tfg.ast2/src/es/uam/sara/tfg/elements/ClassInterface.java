package es.uam.sara.tfg.elements;

import java.util.List;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.properties.ModifiersCheck;
import es.uam.sara.tfg.properties.TypeToString;

public class ClassInterface extends Elements{
	private TypeDeclaration tp;
	
	public ClassInterface(TypeDeclaration tp) {
		super(ModifiersCheck.getBlend(tp));
		this.tp=tp;
		
	}	
	public String getName(){
		return tp.getName().toString();
	}
	public List<Attribute> getAttributes(){
		return Visitors.getAttributes(tp);
	}
	public List<ClassInterface> getClasses(){
		return Visitors.getClasses(tp);
	}
	
	public List<ClassInterface> getInterfaces(){
		return Visitors.getInterfaces(tp);
	}
	public List<Enumeration> getEnumerations(){
		return Visitors.getEnumerations(tp);
	}
	public List<Method> getMethods(){
		return null;
	}
	@Override
	public ASTNode getASTNode() {
		return tp;
	}
	
	public List<String> getSuperInterfaces(){
		List<?>inter=tp.superInterfaceTypes();
		return TypeToString.getString(inter);
	}
	public int getNumSuperInterfaces(){
		return tp.superInterfaceTypes().size();
		 
	}
	public List<String> getSuperclass() {
		return TypeToString.getString(tp.getSuperclassType());
	}
	
}
