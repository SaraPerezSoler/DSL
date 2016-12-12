package es.uam.sara.tfg.sentence;

import java.util.List;

import es.uam.sara.tfg.elements.IElements;

public class Rule<T extends IElements> extends Sentence<T> {

	protected boolean no;
	protected Quantifier quantifier;
	protected Or<T> filter;
	private boolean check = false;

	public interface Apply {
		public boolean apply(List<?> lista, int total);
	}

	public enum Quantifier implements Apply {
		ALL {
			@Override
			public boolean apply(List<?> lista, int total) {
				if (lista.size() == total) {
					return true;
				}
				return false;
			}
		},
		ONE {
			@Override
			public boolean apply(List<?> lista, int total) {
				if (lista.size() == 1) {
					return true;
				}
				return false;
			}
		},
		EXISTS {
			@Override
			public boolean apply(List<?> lista, int total) {
				if (lista.size() >= 1) {
					return true;
				}
				return false;
			}
		},
	}

	public Rule(boolean no, Quantifier q, List<T> elements, Or<T> filter, Or<T> satisfy, String elemntJava) {

		super(elemntJava, elements, satisfy);
		this.no = no;
		this.quantifier = q;
		if (filter == null) {
			this.filter = new NoOr<T>();
		} else {
			this.filter = filter;
		}

	}

	public void reset(List<T> elements) {

		filter.reset();
	}

	public boolean check() {
		List<T> analyze = super.getElements();
		filter.check(analyze);
		analyze = filter.getRight();
		if (satisfy.needVariables()) {
			satisfy.setUsing(using);
		}
		satisfy.check(analyze);

		if (no) {
			check = !quantifier.apply(satisfy.getRight(), analyze.size());
		} else {
			check = quantifier.apply(satisfy.getRight(), analyze.size());
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

}
