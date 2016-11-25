package es.uam.sara.tfg.elements;

import es.uam.sara.tfg.ast.UnitVisitor;
import es.uam.sara.tfg.ast.Visitors;

public interface IElements {

	public abstract String getName();

	public abstract String toString();

	public default UnitVisitor getVisitor() {
		return Visitors.getVisitor(this);
	}
	public boolean equals(Object object);
}
