package es.uam.sara.tfg.rule;

import java.util.List;

import es.uam.sara.tfg.properties.NoProperty;

public class Rule<T> {

	protected boolean no;
	protected Quantifier quantifier;
	protected List<T> elements;
	protected Filter<T> filter;
	protected Or<T> properties;
	private boolean checkeado = false;
	private String elementJava;

	public enum Quantifier {
		ALL, ONE, EXISTS,
	}

	public Rule(boolean no, Quantifier q, List<T> elements, Filter<T> filter, Or<T> properties, String elemntJava) {
		this.no = no;
		this.quantifier = q;
		this.elements = elements;
		if (filter==null){
			this.filter= new NoProperty<T>();
		}else{
			this.filter = filter;
		}
		if (properties==null){
			this.properties= new NoProperty<T>();
		}else{
			this.properties = properties;
		}
		this.elementJava = elemntJava;
	}

	public void reset(List<T> elements) {
		this.elements = elements;
		filter.reset();
		properties.reset();
		checkeado = false;
	}

	public boolean checkTest() {
		if (!checkeado) {
			filter.check(this.elements);
			List<T> analyze = filter.getFiltering();
			properties.check(analyze);
			checkeado = true;
		}
		if (no) {
			return !checkQuantifier(properties.getRight());
		} else {
			return checkQuantifier(properties.getRight());
		}
	}

	private boolean checkQuantifier(List<T> l) {
		switch (quantifier) {
		case ALL:
			if (filter.getFiltering().size() == l.size())
				return true;
			break;
		case ONE:
			if (l.size() == 1) {
				return true;
			}
			break;
		default:
			if (l.size() >= 1) {
				return true;
			}
			break;
		}
		return false;
	}

	@Override
	public String toString() {
		String cad = "";
		if (no) {
			cad += "no ";
		}
		cad += this.quantifier.toString().toLowerCase() + " " + elementJava;
		if (!(filter.isNoProperty())) {
			cad += " which " + filter;
		}
		if (!(properties.isNoProperty())) {
			cad += " satisfy " + properties + " ";
		}
		return cad;
	}

	public String printWrong() {
		if (checkeado) {
			if (no) {
				return properties.printRight();
			} else {
				return properties.printWrong();
			}
		}
		return "";
	}

	public String printRight() {
		if (checkeado) {
			if (no) {
				return properties.printWrong();
			} else {
				return properties.printRight();
			}
		} else {
			return "";
		}
	}

	public String log() {
		if (checkeado) {
			String cad = toString() + "\n" + "Checked.....";
			boolean res;
			if (no) {
				res = !checkQuantifier(properties.getRight());
			} else {
				res = checkQuantifier(properties.getRight());
			}
			if (res) {
				cad += "OK\n";
			} else {
				cad += "ERROR\n";
			}
			if (properties.isNoProperty()){
				cad+=this.printWrong().replace("\n", "\n\t")+this.printRight().replace("\n", "\n\t");
			}else{
				cad += "WRONG: \n\t" + this.printWrong().replace("\n", "\n\t")+"\n";
				cad += "RIGHT: \n\t" + this.printRight().replace("\n", "\n\t")+"\n";
			}return cad;
		} else {
			return toString() + "Rule is not checked\n";
		}

	}

}
