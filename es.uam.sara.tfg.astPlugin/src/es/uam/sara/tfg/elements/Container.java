package es.uam.sara.tfg.elements;

import java.util.List;

import es.uam.sara.tfg.elements.type.MAttribute;
import es.uam.sara.tfg.elements.type.MClass;
import es.uam.sara.tfg.elements.type.MEnumeration;
import es.uam.sara.tfg.elements.type.MInterface;
import es.uam.sara.tfg.elements.type.MMethod;


public interface Container extends IElements{

	public List<MAttribute> getAttributes();
	public List<MClass> getClasses();
	public List<MInterface> getInterfaces();
	public List<MEnumeration> getEnumerations();
	public List<MMethod> getMethods();
	
	public  boolean isEmpty();

}
