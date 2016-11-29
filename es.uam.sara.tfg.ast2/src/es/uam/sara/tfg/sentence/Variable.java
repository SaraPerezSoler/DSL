package es.uam.sara.tfg.sentence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.uam.sara.tfg.elements.Container;
import es.uam.sara.tfg.elements.IElements;
import es.uam.sara.tfg.elements.type.Attribute;
import es.uam.sara.tfg.elements.type.ClassInterface;
import es.uam.sara.tfg.elements.type.Enumeration;
import es.uam.sara.tfg.elements.type.Method;

public class Variable<T extends IElements> extends Sentence<T> {

	private boolean checkeado = false;

	public Variable(String elementJava, List<T> elements, Or<T> satisfy, From<T> from, List<In<T>> in) {
		super(elementJava, elements, satisfy, from, in);
	}

	public void check() {
		if (!checkeado) {
			List<T> analyze = this.elements;
			if (from != null) {
				analyze = from.getElements();
			}
			for (In<T> i : in) {
				analyze = i.getUnion(analyze);
			}
			satisfy.check(analyze);
		}
	}

	public List<T> getT() {
		return satisfy.getRight();
	}

	public Map<T, List<Attribute>> getAttributes() {
		Map<T, List<Attribute>> ret = new HashMap<T, List<Attribute>>();
		if (!checkeado) {
			check();
		}
			for (T t : satisfy.getRight()) {
				if (t instanceof Container) {
					ret.put(t, ((Container) t).getAttributes());
				}
			}
		return ret;
	}

	public Map<T, List<ClassInterface>> getClasses() {
		Map<T, List<ClassInterface>> ret = new HashMap<T, List<ClassInterface>>();
		if (!checkeado) {
			check();
		}
			for (T t : satisfy.getRight()) {
				if (t instanceof Container) {
					ret.put(t, ((Container) t).getClasses());
				}
			}
		return ret;
	}

	public Map<T, List<ClassInterface>> getInterface() {
		Map<T, List<ClassInterface>> ret = new HashMap<T, List<ClassInterface>>();
		if (!checkeado) {
			check();
		}
			for (T t : satisfy.getRight()) {
				if (t instanceof Container) {
					ret.put(t, ((Container) t).getInterfaces());
				}
			}
		return ret;
	}

	public Map<T, List<Method>> getMethods() {
		Map<T, List<Method>> ret = new HashMap<T, List<Method>>();
		if (!checkeado) {
			check();
		}
			for (T t : satisfy.getRight()) {
				if (t instanceof Container) {
					ret.put(t, ((Container) t).getMethods());
				}
			}
		return ret;
	}

	public Map<T, List<Enumeration>> getEnumerations() {
		Map<T, List<Enumeration>> ret = new HashMap<T, List<Enumeration>>();
		if (!checkeado) {
			check();
		}
			for (T t : satisfy.getRight()) {
				if (t instanceof Container) {
					ret.put(t, ((Container) t).getEnumerations());
				}
			}
		return ret;
	}

}
