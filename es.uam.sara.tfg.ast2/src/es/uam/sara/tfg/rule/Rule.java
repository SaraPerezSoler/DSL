package es.uam.sara.tfg.rule;

import java.util.List;

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
		this.filter = filter;
		this.properties = properties;
		this.elementJava=elemntJava;
	}

	public void reset(List<T> elements) {
		this.elements = elements;
		if (filter!=null)
			filter.reset();
		if (properties!=null)
			properties.reset();
		checkeado = false;
	}

	public boolean checkTest() {
		List<T> right;
		if (!checkeado) {
			List<T> analyze = this.elements;
			if (filter != null) {
				filter.check(this.elements);
				analyze = filter.getFiltering();
			}

			if (properties != null) {
				properties.check(analyze);
				right = properties.getRight();
			} else {
				right = analyze;
			}
			checkeado = true;

		} else {
			if (properties != null) {
				right = properties.getRight();
			} else {
				right = this.elements;
			}
		}

		if (no) {
			return !checkQuantifier(right);
		} else {
			return checkQuantifier(right);
		}
	}

	private boolean checkQuantifier(List<T> l) {
		switch (quantifier) {
		case ALL:
			if (elements.size() == l.size())
				return true;
			break;
		case ONE:
			if (l.size() == 1) {
				return true;
			}
			break;
		default:
			if (elements.size() >= 1) {
				return true;
			}
			break;
		}
		return false;
	}

	@Override
	public String toString() {
		String cad="";
		if (no){
			cad+="no ";
		}
		cad+=this.quantifier.toString().toLowerCase()+" "+elementJava;
		if (filter!= null){
			cad+=" which "+filter;
		}
		if (properties!= null){
			cad+=" satisfy "+properties+" ";
		}
		return cad;
	}

}
