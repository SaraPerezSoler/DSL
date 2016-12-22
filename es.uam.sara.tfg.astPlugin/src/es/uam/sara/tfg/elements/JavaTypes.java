package es.uam.sara.tfg.elements;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.elements.type.MAttribute;
import es.uam.sara.tfg.elements.type.MClass;
import es.uam.sara.tfg.elements.type.MEnumeration;
import es.uam.sara.tfg.elements.type.MInterface;
import es.uam.sara.tfg.elements.type.MMethod;


public interface JavaTypes extends Container, ICanEmpty, IElements{

	public default List<MClass> getClasses() {
		List<?> bd = getAbstractTypeDeclaration().bodyDeclarations();
		List<MClass> temp = new ArrayList<MClass>();
		for (Object ed : bd) {
			if (ed instanceof TypeDeclaration) {
				if (!((TypeDeclaration) ed).isInterface())
					temp.add(new MClass((TypeDeclaration) ed, getVisitor()));
			}
		}
		return temp;
	}

	public default List<MInterface> getInterfaces() {
		List<?> bd = getAbstractTypeDeclaration().bodyDeclarations();
		List<MInterface> temp = new ArrayList<MInterface>();
		for (Object ed : bd) {
			if (ed instanceof TypeDeclaration) {
				if (((TypeDeclaration) ed).isInterface())
					temp.add(new MInterface((TypeDeclaration) ed, getVisitor()));
			}
		}
		return temp;
	}

	public default List<MEnumeration> getEnumerations() {
		List<?> bd = getAbstractTypeDeclaration().bodyDeclarations();
		List<MEnumeration> temp = new ArrayList<MEnumeration>();
		for (Object ed : bd) {
			if (ed instanceof EnumDeclaration) {
				temp.add(new MEnumeration((EnumDeclaration) ed, getVisitor()));
			}
		}
		return temp;
	}

	public default List<MMethod> getMethods() {
		List<?> bd = getAbstractTypeDeclaration().bodyDeclarations();
		List<MMethod> temp = new ArrayList<MMethod>();
		for (Object ed : bd) {
			if (ed instanceof MethodDeclaration) {
				temp.add(new MMethod((MethodDeclaration) ed, getVisitor()));
			}
		}
		return temp;
	}

	public default List<MAttribute> getAttributes() {
		List<?> bd = getAbstractTypeDeclaration().bodyDeclarations();
		List<MAttribute> temp = new ArrayList<MAttribute>();
		for (Object ed : bd) {
			if (ed instanceof FieldDeclaration) {
				temp.add(new MAttribute((FieldDeclaration) ed, getVisitor()));
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
	@Override
	public default String getStringType() {
		return this.getName();
	}
}
