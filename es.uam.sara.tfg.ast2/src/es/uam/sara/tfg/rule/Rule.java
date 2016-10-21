package es.uam.sara.tfg.rule;

import java.util.List;

public class Rule<T> {

	protected boolean no;
	protected Quantifier quantifier;
	protected List<T> elements;
	protected Filter<T> filter;
	protected Or<T> properties;
	private boolean checkeado = false;

	public enum Quantifier {
		ALL, ONE, EXISTS,
	}

	public Rule(boolean no, Quantifier q, List<T> elements, Filter<T> filter, Or<T> properties) {
		this.no = no;
		this.quantifier = q;
		this.elements = elements;
		this.filter = filter;
		this.properties = properties;
	}

	public void reset(List<T> elements) {
		this.elements = elements;
		filter.reset(elements);
		properties.reset(elements);
		checkeado = false;
	}

	public boolean checkTest() {
		
		if (!checkeado) {
			List<T> analyze=this.elements;
			if (filter != null) {
				filter.check(this.elements);
				analyze=filter.getFiltering();
			} 
			if (properties != null) {
				properties.check(analyze);
			}
			checkeado = true;
			
		}
		/////////////
		if (no) {
			return checkQuantifier(properties.getWrong());
		} else {
			return checkQuantifier(properties.getRight());
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
			if (elements.size() > 1) {
				return true;
			}
			break;
		}
		return false;
	}

}
