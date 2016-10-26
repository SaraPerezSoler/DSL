package es.uam.sara.tfg.properties;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Properties<T> {

	private List<T> right;
	private List<T> wrong;

	public Properties() {
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
		try {
			if (right.contains(t) || wrong.contains(t)) {
				throw new PropertiesException(
						"Cod 01: El elemento que intenta añadir no se encuentra o ya se ha añadido.");
			}
			this.right.add(t);
		} catch (PropertiesException p) {
			p.printStackTrace();
		}
	}

	public void addWrong(T t) {
		try {
			if (right.contains(t) || wrong.contains(t)) {
				throw new PropertiesException(
						"Cod 01: El elemento que intenta añadir no se encuentra o ya se ha añadido.");
			}
			this.wrong.add(t);
		} catch (PropertiesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	public abstract void check(List<T> analize);

}