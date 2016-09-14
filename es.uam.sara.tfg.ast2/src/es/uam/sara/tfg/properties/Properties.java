package es.uam.sara.tfg.properties;

import java.util.ArrayList;
import java.util.List;

public abstract class Properties<T> {
	private List<T> right;
	private List<T> wrong;
	protected List<T> all;
	
	public Properties(List<T> all) {
		this.all=all;
		this.right=new ArrayList<T>();
		this.wrong=new ArrayList<T>();
	}	
	public abstract void check();
	
	public List<T> getRight(){
		return right;
	}
	public List<T> getWrong(){
		return wrong;
	}
	public void addRight(T t) throws PropertiesException{
		if ((!all.contains(t))|| right.contains(t) || wrong.contains(t)){
			throw new PropertiesException("Cod 01: El elemento que intenta a�adir no se encuentra o ya se ha a�adido.");
		}
		this.right.add(t);
	}
	public void addWrong(T t) throws PropertiesException {
		if ((!all.contains(t))|| right.contains(t) || wrong.contains(t)){
			throw new PropertiesException("Cod 01: El elemento que intenta a�adir no se encuentra o ya se ha a�adido.");
		}
		this.wrong.add(t);
	}
	
}
