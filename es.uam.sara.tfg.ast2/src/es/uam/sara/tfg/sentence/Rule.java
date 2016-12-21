package es.uam.sara.tfg.sentence;

import java.util.List;
import java.util.Set;

import es.uam.sara.tfg.elements.IElements;

public class Rule<T extends IElements> extends Sentence<T> {

	protected boolean no;
	protected Quantifier quantifier;
	
	private boolean check = false;

	public interface Apply {
		public boolean apply(List<?> right, List<?> wrong);
	}

	public enum Quantifier implements Apply {
		ALL {
			@Override
			public boolean apply(List<?> lista, List<?> wrong) {
				if (wrong.size() == 0) {
					return true;
				}
				return false;
			}
		},
		ONE {
			@Override
			public boolean apply(List<?> lista, List<?> wrong) {
				if (lista.size() == 1) {
					return true;
				}
				return false;
			}
		},
		EXISTS {
			@Override
			public boolean apply(List<?> lista, List<?> wrong) {
				if (lista.size() >= 1) {
					return true;
				}
				return false;
			}
		},
	}

	public Rule(boolean no, Quantifier q, List<T> elements, Or<T> filter, Or<T> satisfy, String elemntJava) {

		super(elemntJava, elements, satisfy, filter);
		this.no = no;
		this.quantifier = q;
		

	}

	public void reset(List<T> elements, List<T> right, List<T> wrong) {
		super.reset(elements, right, wrong);
		filter.reset();
	}

	public boolean check() {		
		if (no) {
			check = !quantifier.apply(satisfy.getRight(), satisfy.getWrong());
		} else {
			check = quantifier.apply(satisfy.getRight(), satisfy.getWrong());
		}
		return check;
	}

	@Override
	public String toString() {
		String cad = "";
		if (no) {
			cad += "no ";
		}

		cad += this.quantifier.toString().toLowerCase() + " " + ielement;
		
		if (this.from!=null){
			cad+=" from "+this.from.getName();
		}
		String in=" in ";
		for (In<T> i: this.in){
			cad+=in+i.getName();
			in=", ";
		}
		String using=" using ";
		Set<String> us= this.using.keySet();
		for (String u: us){
			cad+=using+u;
			using=", ";
		}
		
		
		if (!(filter.isNoProperty())) {
			cad += " which " + filter;
		}
		if (!(satisfy.isNoProperty())) {
			cad += " satisfy " + satisfy + " ";
		}
		return cad;
	}

	public String printWrong() {

		if (no) {
			return satisfy.print(true);
		} else {
			return satisfy.print(false);
		}

	}

	public String printRight() {

		if (no) {
			return satisfy.print(false);
		} else {
			return satisfy.print(true);
		}

	}

	public String log() {

		String cad = toString() + "\n" + "Checked.....";
		if (check) {
			cad += "OK\n";
		} else {
			cad += "ERROR\n";
		}
		if (satisfy.isNoProperty()) {
			cad += this.printWrong().replace("\n", "\n\t") + this.printRight().replace("\n", "\n\t");
		} else {
			cad += "WRONG: \n\t" + this.printWrong().replace("\n", "\n\t") + "\n";
			cad += "RIGHT: \n\t" + this.printRight().replace("\n", "\n\t") + "\n";
		}
		return cad;

	}

	public boolean needVariabes() {
		return this.satisfy.needVariables() || this.filter.needVariables();
	}

}
