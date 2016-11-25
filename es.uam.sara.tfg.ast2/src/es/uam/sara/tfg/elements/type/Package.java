package es.uam.sara.tfg.elements.type;

import java.util.ArrayList;
import java.util.List;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;
import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.ICanEmpty;
import es.uam.sara.tfg.elements.IElements;

public class Package implements IElements, Container, ICanEmpty {

	private String pck;

	public Package(String pck) {
		this.pck = pck;
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
		List<UnitVisitor> visitors = Visitors.getVisitors(this);
		for (UnitVisitor u : visitors) {
			temp.addAll(u.getClasses());
		}
		return temp;
	}

	public List<ClassInterface> getInterfaces() {
		List<ClassInterface> temp = new ArrayList<ClassInterface>();
		List<UnitVisitor> visitors = Visitors.getVisitors(this);
		for (UnitVisitor u : visitors) {
			temp.addAll(u.getInterfaces());
		}
		return temp;
	}

	public List<Enumeration> getEnumerations() {
		List<Enumeration> temp = new ArrayList<Enumeration>();
		List<UnitVisitor> visitors = Visitors.getVisitors(this);
		for (UnitVisitor u : visitors) {
			temp.addAll(u.getEnumerations());

		}
		return temp;
	}

	public List<Method> getMethods() {
		List<Method> temp = new ArrayList<Method>();
		List<UnitVisitor> visitors = Visitors.getVisitors(this);
		for (UnitVisitor u : visitors) {
			temp.addAll(u.getMethods());

		}
		return temp;
	}

	public List<Attribute> getAttributes() {
		List<Attribute> temp = new ArrayList<Attribute>();
		List<UnitVisitor> visitors = Visitors.getVisitors(this);
		for (UnitVisitor u : visitors) {
			temp.addAll(u.getAttributes());

		}
		return temp;
	}

	public boolean isEmpty() {
		return Visitors.getVisitors(this).isEmpty();
	}

	@Override
	public boolean equals(Object object) {
		boolean sameSame = false;

		if (object != null && object instanceof Package) {
			sameSame = this.pck.equals(((Package) object).pck);
		}

		return sameSame;
	}

}
