package es.uam.sara.tfg.elements.type;

import java.util.ArrayList;
import java.util.List;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.ICanEmpty;

public class Package implements Container, ICanEmpty {

	private String pck;
	List<UnitVisitor> visitors;
	public Package(String pck,List<UnitVisitor> uv) {
		this.pck = pck;
		visitors=uv;
	}

	@Override
	public String getName() {
		return pck;
	}

	@Override
	public String toString() {
		return "The packages " + getName() + "\n";
	}

	public List<ClassInterface> getClasses() {
		List<ClassInterface> temp = new ArrayList<ClassInterface>();
		for (UnitVisitor u : visitors) {
			temp.addAll(u.getClasses());
		}
		return temp;
	}

	public List<ClassInterface> getInterfaces() {
		List<ClassInterface> temp = new ArrayList<ClassInterface>();
		for (UnitVisitor u : visitors) {
			temp.addAll(u.getInterfaces());
		}
		return temp;
	}

	public List<Enumeration> getEnumerations() {
		List<Enumeration> temp = new ArrayList<Enumeration>();
		for (UnitVisitor u : visitors) {
			temp.addAll(u.getEnumerations());

		}
		return temp;
	}

	public List<Method> getMethods() {
		List<Method> temp = new ArrayList<Method>();
		for (UnitVisitor u : visitors) {
			temp.addAll(u.getMethods());

		}
		return temp;
	}

	public List<Attribute> getAttributes() {
		List<Attribute> temp = new ArrayList<Attribute>();
		for (UnitVisitor u : visitors) {
			temp.addAll(u.getAttributes());

		}
		return temp;
	}

	public boolean isEmpty() {
		return visitors.isEmpty();
	}

	@Override
	public boolean equals(Object object) {
		boolean sameSame = false;

		if (object != null && object instanceof Package) {
			sameSame = this.pck.equals(((Package) object).pck);
		}

		return sameSame;
	}

	@Override
	public UnitVisitor getVisitor() {
		return null;
	}

}
