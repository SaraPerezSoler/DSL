package es.uam.sara.tfg.properties.classes;

import java.util.List;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.properties.Properties;

public abstract class Class extends Properties<TypeDeclaration> {

	public Class(List<TypeDeclaration> analyze) {
		super(analyze);
	}

}
