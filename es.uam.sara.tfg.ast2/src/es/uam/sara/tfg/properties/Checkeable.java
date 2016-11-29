package es.uam.sara.tfg.properties;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Checkeable<T>{

	private ArrayList<T> right;
	private List<T> wrong;
	protected boolean no;

	public Checkeable(boolean no) {
		this.no = no;
		this.right = new ArrayList<T>();
		this.wrong = new ArrayList<T>();
	}

	public List<T> getRight() {
		return right;
	}

	public List<T> getWrong() {
		return wrong;
	}

	public void addRight(T t) {
		this.right.add(t);
	}

	public void addWrong(T t) {
		this.wrong.add(t);
	}

	public void reset() {
		this.right.clear();
		this.wrong.clear();
	}

	public void removeAllRight(Collection<T> c) {
		right.removeAll(c);
	}

	public void addAllRight(Collection<T> c) {
		right.addAll(c);
	}

	public void removeAllWrong(Collection<T> c) {
		wrong.removeAll(c);
	}

	public void addAllWrong(Collection<T> c) {
		wrong.addAll(c);
	}

	public boolean isNoProperty() {
		return false;
	}

	public void check(List<T> analyze) {
		for (T t : analyze) {
			if (no) {
				if (!checkElement(t)) {
					addRight(t);
				} else {
					addWrong(t);
				}
			}else{
				if (checkElement(t)) {
					addRight(t);
				} else {
					addWrong(t);
				}
			}
		}
	}

	public abstract boolean checkElement(T analyze);

	public String print(boolean right) {
		List<T> print;
		String cad;
		if (right) {
			cad = "This elements satisfy " + this.toString() + ":\n";
			print = this.getRight();
		} else {
			cad = "This elements not satisfy " + this.toString() + ":\n";
			print = this.getWrong();
		}

		for (T t : print) {
			cad += print(t);
		}
		return cad;
	}

	public String print(T t) {
		return t.toString();
	}

	public abstract String toString();
}