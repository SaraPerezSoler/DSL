package es.uam.sara.tfg.ast;

import java.io.Serializable;

public class IsCollectionOf implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean isCollection;
	private String of="nothing";
	public boolean isCollection() {
		return isCollection;
	}
	public void setCollection(boolean isCollection) {
		this.isCollection = isCollection;
	}
	public String getOf() {
		return of;
	}
	public void setOf(String of) {
		this.of = of;
	}
	
}