package es.uam.sara.tfg.properties.annotations;

import org.eclipse.jdt.core.dom.AnnotationTypeDeclaration;

import es.uam.sara.tfg.elements.IElements;
import es.uam.sara.tfg.properties.Property;

public abstract class  AnnotationDeclaration<T extends IElements> extends Property<T>{

	public AnnotationDeclaration(boolean no) {
		super(no);
	}

}
