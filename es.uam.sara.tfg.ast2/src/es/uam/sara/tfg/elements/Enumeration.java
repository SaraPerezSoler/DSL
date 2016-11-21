package es.uam.sara.tfg.elements;

import java.util.List;

import org.eclipse.jdt.core.dom.EnumDeclaration;

import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.properties.ModifiersCheck;

public class Enumeration extends Elements{
	private EnumDeclaration em;
	public Enumeration(EnumDeclaration em) {
		super(ModifiersCheck.getBlend(em));
		this.em=em;
	}

	@Override
	public String getName() {
		return em.getName().toString();
	}

	public List<Attribute> getAttributes(){
		return Visitors.getAttributes(em);
	}
	public List<ClassInterface> getClasses(){
		return Visitors.getClasses(em);
	}
	
	public List<ClassInterface> getInterfaces(){
		return Visitors.getInterfaces(em);
	}
	public List<Enumeration> getEnumerations(){
		return Visitors.getEnumerations(em);
	}
	public List<Method> getMethods(){
		return Visitors.getMethods(em);
	}
}
