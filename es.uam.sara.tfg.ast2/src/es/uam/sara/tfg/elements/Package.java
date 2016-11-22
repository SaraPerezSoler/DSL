package es.uam.sara.tfg.elements;

import java.util.List;

import org.eclipse.jdt.core.dom.BodyDeclaration;

import es.uam.sara.tfg.ast.Visitors;

public class Package extends Elements {

	private String pck;
	public Package(String pck) {
		super(null);
		this.pck=pck;
	}

	@Override
	public String getName() {
		return pck;
	}

	@Override
	public BodyDeclaration getBodyDeclarations() {
		return null;
	}

	@Override
	public String toString() {
		return "The packages "+getName()+"\n";
	}
	
	public List<Attribute> getAttributes(){
		return Visitors.getAttributes(pck);
	}
	public List<ClassInterface> getClasses(){
		return Visitors.getClasses(pck);
	}
	
	public List<ClassInterface> getInterfaces(){
		return Visitors.getInterfaces(pck);
	}
	public List<Enumeration> getEnumerations(){
		return Visitors.getEnumerations(pck);
	}
	public List<Method> getMethods(){
		return Visitors.getMethods(pck);
	}
	
	public  boolean isEmpty() {
		return Visitors.getVisitors(pck).isEmpty();
	}
	

}
