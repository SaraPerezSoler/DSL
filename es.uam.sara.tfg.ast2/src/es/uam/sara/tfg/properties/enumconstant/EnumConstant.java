package es.uam.sara.tfg.properties.enumconstant;

import org.eclipse.jdt.core.dom.EnumConstantDeclaration;

import es.uam.sara.tfg.elements.IElements;
import es.uam.sara.tfg.properties.Property;

public abstract class EnumConstant<T extends IElements> extends Property<T>{

	public EnumConstant(boolean no) {
		super(no);
	}


}
