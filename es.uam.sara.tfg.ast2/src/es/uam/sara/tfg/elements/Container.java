package es.uam.sara.tfg.elements;

import java.util.List;

import es.uam.sara.tfg.elements.type.Attribute;
import es.uam.sara.tfg.elements.type.Class;
import es.uam.sara.tfg.elements.type.Enumeration;
import es.uam.sara.tfg.elements.type.Interface;
import es.uam.sara.tfg.elements.type.Method;


public interface Container extends IElements{

	public List<Attribute> getAttributes();
	public List<Class> getClasses();
	public List<Interface> getInterfaces();
	public List<Enumeration> getEnumerations();
	public List<Method> getMethods();
	
	public  boolean isEmpty();

}
