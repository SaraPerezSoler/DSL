package es.uam.sara.tfg.properties;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import es.uam.sara.tfg.elements.IElements;

public abstract class Checkeable<T>{

	private ArrayList<T> right;
	private List<T> wrong;
	protected boolean no;
	protected Map<String, IElements> using;
	
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
		if (!this.right.contains(t)){
			this.right.add(t);
		}
		if (this.wrong.contains(t)){
			this.wrong.remove(t);
		}
	}

	public void addWrong(T t) {
		if (!this.wrong.contains(t) && !this.right.contains(t)){
			this.wrong.add(t);
		}
	}

	public void reset() {
		this.right.clear();
		this.wrong.clear();
	}

	public void removeAllRight(Collection<T> c) {
		for (T c1: c){
			this.right.remove(c1);
		}
	}

	public void addAllRight(Collection<T> c) {
		for (T c1: c){
			if (!this.right.contains(c1)){
				this.right.add(c1);
			}
		}
	}

	public void removeAllWrong(Collection<T> c) {
		for (T c1: c){
			this.wrong.remove(c1);
		}
	}

	public void addAllWrong(Collection<T> c) {
		for (T c1: c){
			if (!right.contains(c1) && !wrong.contains(c1)){
				wrong.add(c1);
			}
		}
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
			cad = "\nThis elements satisfy " + this.toString() + ":\n\n";
			print = this.getRight();
		} else {
			cad = "\nThis elements not satisfy " + this.toString() + ":\n\n";
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
	
	public boolean needVariables() {
		return false;
	}
	
	public void setUsing(Map<String, IElements> using) {
		this.using = using;
	}
	public abstract String toString();
}