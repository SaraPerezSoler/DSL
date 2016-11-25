package es.uam.sara.tfg.elements;

import java.util.List;

import es.uam.sara.tfg.elements.type.Attribute;
import es.uam.sara.tfg.elements.type.ClassInterface;
import es.uam.sara.tfg.elements.type.Enumeration;
import es.uam.sara.tfg.elements.type.Method;


public interface Container {

	public List<Attribute> getAttributes();
	public List<ClassInterface> getClasses();
	public List<ClassInterface> getInterfaces();
	public List<Enumeration> getEnumerations();
	public List<Method> getMethods();
	
	public  boolean isEmpty();
}
