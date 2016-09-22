package es.uam.sara.tfg.properties;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Properties<T> {

	private List<T> right;
	private List<T> wrong;
	protected List<T> analyze = null;

	public Properties(List<T> analyce) {
		this.analyze = analyce;
		this.right = new ArrayList<T>();
		this.wrong = new ArrayList<T>();
	}

	public void setAnlyze(List<T> analyze) {
		if (this.analyze == null)
			this.analyze = analyze;
	}

	public List<T> getRight() {
		return right;
	}

	public List<T> getWrong() {
		return wrong;
	}

	public List<T> getAnalyze() {
		return analyze;
	}

	public void addRight(T t) {
		try {
			if ((!analyze.contains(t)) || right.contains(t) || wrong.contains(t)) {
				throw new PropertiesException(
						"Cod 01: El elemento que intenta a�adir no se encuentra o ya se ha a�adido.");
			}
			this.right.add(t);
		} catch (PropertiesException p) {
			p.printStackTrace();
		}
	}

	public void addWrong(T t) {
		try {
			if ((!analyze.contains(t)) || right.contains(t) || wrong.contains(t)) {
				throw new PropertiesException(
						"Cod 01: El elemento que intenta a�adir no se encuentra o ya se ha a�adido.");
			}
			this.wrong.add(t);
		} catch (PropertiesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void reset(List<T> analyze) {
		this.analyze = analyze;
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

	public abstract void check();

}