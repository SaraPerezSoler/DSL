package es.uam.sara.tfg.elements;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.elements.type.Attribute;
import es.uam.sara.tfg.elements.type.Class;
import es.uam.sara.tfg.elements.type.Enumeration;
import es.uam.sara.tfg.elements.type.Interface;
import es.uam.sara.tfg.elements.type.Method;


public interface JavaTypes extends Container, ICanEmpty, IElements{

	public default List<Class> getClasses() {
		List<?> bd = getAbstractTypeDeclaration().bodyDeclarations();
		List<Class> temp = new ArrayList<Class>();
		for (Object ed : bd) {
			if (ed instanceof TypeDeclaration) {
				if (!((TypeDeclaration) ed).isInterface())
					temp.add(new Class((TypeDeclaration) ed, getVisitor()));
			}
		}
		return temp;
	}

	public default List<Interface> getInterfaces() {
		List<?> bd = getAbstractTypeDeclaration().bodyDeclarations();
		List<Interface> temp = new ArrayList<Interface>();
		for (Object ed : bd) {
			if (ed instanceof TypeDeclaration) {
				if (((TypeDeclaration) ed).isInterface())
					temp.add(new Interface((TypeDeclaration) ed, getVisitor()));
			}
		}
		return temp;
	}

	public default List<Enumeration> getEnumerations() {
		List<?> bd = getAbstractTypeDeclaration().bodyDeclarations();
		List<Enumeration> temp = new ArrayList<Enumeration>();
		for (Object ed : bd) {
			if (ed instanceof EnumDeclaration) {
				temp.add(new Enumeration((EnumDeclaration) ed, getVisitor()));
			}
		}
		return temp;
	}

	public default List<Method> getMethods() {
		List<?> bd = getAbstractTypeDeclaration().bodyDeclarations();
		List<Method> temp = new ArrayList<Method>();
		for (Object ed : bd) {
			if (ed instanceof MethodDeclaration) {
				temp.add(new Method((MethodDeclaration) ed, getVisitor()));
			}
		}
		return temp;
	}

	public default List<Attribute> getAttributes() {
		List<?> bd = getAbstractTypeDeclaration().bodyDeclarations();
		List<Attribute> temp = new ArrayList<Attribute>();
		for (Object ed : bd) {
			if (ed instanceof FieldDeclaration) {
				temp.add(new Attribute((FieldDeclaration) ed, getVisitor()));
			}
		}
		return temp;
	}

	
	public default  boolean isEmpty() {
		return getAbstractTypeDeclaration().bodyDeclarations().isEmpty();
	}
	public boolean isInterface();
	
	public default List<Type> getSuperInterfaces() {
		List<Type> ret= new ArrayList<Type>();
		AbstractTypeDeclaration t= getAbstractTypeDeclaration();
		List<?> inter=new ArrayList<Object>();
		if (t instanceof TypeDeclaration){
			TypeDeclaration tp=(TypeDeclaration)t;
			inter=tp.superInterfaceTypes();
		}else if (t instanceof EnumDeclaration){
			EnumDeclaration tp=(EnumDeclaration)t;
			inter=tp.superInterfaceTypes();
		}
		
		for (Object o: inter){
			if (o instanceof Type){
				ret.add((Type)o);
			}
		}
		return ret;
	}
	
	public AbstractTypeDeclaration getAbstractTypeDeclaration();
	public static List<String> getNames(List<JavaTypes> list){
		List<String> names=new ArrayList<String>();
		for (JavaTypes j: list){
			names.add(j.getName().toLowerCase());
		}
		return names;
	}
}
