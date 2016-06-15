package es.uam.sara.tfg.ast.rules;

import es.uam.sara.tfg.ast.Visitors;

public interface Rule {

	public void execute (Visitors visitors);
	
}
