package es.uam.sara.tfg.elements;

import es.uam.sara.tfg.ast.UnitVisitor;

public interface IElements {

	public abstract String getName();

	public abstract String toString();

	public  UnitVisitor getVisitor();
	public boolean equals(Object object);

	public abstract String getStringType();
}
