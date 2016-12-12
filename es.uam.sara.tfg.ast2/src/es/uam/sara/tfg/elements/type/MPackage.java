package es.uam.sara.tfg.elements.type;

import java.util.ArrayList;
import java.util.List;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.ICanEmpty;

public class MPackage implements Container, ICanEmpty {

	private String pck;
	List<UnitVisitor> visitors;
	public MPackage(String pck,List<UnitVisitor> uv) {
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

	public List<MClass> getClasses() {
		List<MClass> temp = new ArrayList<MClass>();
		for (UnitVisitor u : visitors) {
			temp.addAll(u.getClasses());
		}
		return temp;
	}

	public List<MInterface> getInterfaces() {
		List<MInterface> temp = new ArrayList<MInterface>();
		for (UnitVisitor u : visitors) {
			temp.addAll(u.getInterfaces());
		}
		return temp;
	}

	public List<MEnumeration> getEnumerations() {
		List<MEnumeration> temp = new ArrayList<MEnumeration>();
		for (UnitVisitor u : visitors) {
			temp.addAll(u.getEnumerations());

		}
		return temp;
	}

	public List<MMethod> getMethods() {
		List<MMethod> temp = new ArrayList<MMethod>();
		for (UnitVisitor u : visitors) {
			temp.addAll(u.getMethods());

		}
		return temp;
	}

	public List<MAttribute> getAttributes() {
		List<MAttribute> temp = new ArrayList<MAttribute>();
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

		if (object != null && object instanceof MPackage) {
			sameSame = this.pck.equals(((MPackage) object).pck);
		}

		return sameSame;
	}

	@Override
	public UnitVisitor getVisitor() {
		return null;
	}

	@Override
	public String getStringType() {
		return "";
	}

}
