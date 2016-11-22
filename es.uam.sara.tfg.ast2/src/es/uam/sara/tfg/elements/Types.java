package es.uam.sara.tfg.elements;

import java.util.List;

import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.properties.TypeToString;

public interface Types {

	public default List<Attribute> getAttributes(){
		return Visitors.getAttributes(getAbstractTypeDeclaration());
	}
	public default List<ClassInterface> getClasses(){
		return Visitors.getClasses(getAbstractTypeDeclaration());
	}
	
	public default List<ClassInterface> getInterfaces(){
		return Visitors.getInterfaces(getAbstractTypeDeclaration());
	}
	public default List<Enumeration> getEnumerations(){
		return Visitors.getEnumerations(getAbstractTypeDeclaration());
	}
	public default List<Method> getMethods(){
		return Visitors.getMethods(getAbstractTypeDeclaration());
	}
	
	public default  boolean isEmpty() {
		return getAbstractTypeDeclaration().bodyDeclarations().isEmpty();
	}
	
	public default List<String> getSuperInterfaces() {
		AbstractTypeDeclaration t= getAbstractTypeDeclaration();
		if (t instanceof TypeDeclaration){
			TypeDeclaration tp=(TypeDeclaration)t;
			List<?>inter=tp.superInterfaceTypes();
			return TypeToString.getString(inter);
		}else if (t instanceof EnumDeclaration){
			EnumDeclaration tp=(EnumDeclaration)t;
			List<?>inter=tp.superInterfaceTypes();
			return TypeToString.getString(inter);
		}
		return null;
	}
	
	public default int getNumSuperInterfaces() {
		AbstractTypeDeclaration t= getAbstractTypeDeclaration();
		if (t instanceof TypeDeclaration){
			TypeDeclaration tp=(TypeDeclaration)t;
			return tp.superInterfaceTypes().size();
		}else if (t instanceof EnumDeclaration){
			EnumDeclaration tp=(EnumDeclaration)t;
			return tp.superInterfaceTypes().size();
		}
		return -1;
	}
	
	public AbstractTypeDeclaration getAbstractTypeDeclaration();
}
