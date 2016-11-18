package es.uam.sara.tfg.rule;

import java.util.List;

public class Rule<T> {

	protected boolean no;
	protected Quantifier quantifier;
	protected List<T> elements;
	protected Filter<T> filter;
	protected Or<T> properties;
	private boolean checkeado = false;
	private boolean check = false;
	private String elementJava;

	public interface Apply{
		public boolean apply(List<?> lista, int total);
	}
	public enum Quantifier implements Apply{
		ALL{
			@Override
			public boolean apply(List<?> lista, int total) {
				if (lista.size()==total){
					return true;
				}
				return false;
			}
		}, ONE{
			@Override
			public boolean apply(List<?> lista, int total) {
				if (lista.size()==1){
					return true;
				}
				return false;
			}
		}
		, EXISTS{
			@Override
			public boolean apply(List<?> lista, int total) {
				if (lista.size()>=1){
					return true;
				}
				return false;
			}
		},
	}

	public Rule(boolean no, Quantifier q, List<T> elements, Filter<T> filter, Or<T> properties, String elemntJava) {
		this.no = no;
		this.quantifier = q;
		this.elements = elements;
		if (filter==null){
			this.filter= new NoOr<T>();
		}else{
			this.filter = filter;
		}
		if (properties==null){
			this.properties= new NoOr<T>();
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
			check= !quantifier.apply(properties.getRight(), filter.getFiltering().size());
		} else {
			check= quantifier.apply(properties.getRight(), filter.getFiltering().size());
		}
		return check;
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
				return properties.print(true);
			} else {
				return properties.print(false);
			}
		}
		return "";
	}

	public String printRight() {
		if (checkeado) {
			if (no) {
				return properties.print(false);
			} else {
				return properties.print(true);
			}
		} else {
			return "";
		}
	}

	public String log() {
		if (checkeado) {
			String cad = toString() + "\n" + "Checked.....";	
			if (check) {
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
