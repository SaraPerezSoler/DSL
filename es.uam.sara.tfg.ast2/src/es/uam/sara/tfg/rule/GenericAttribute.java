package es.uam.sara.tfg.rule;

import org.eclipse.jdt.core.dom.FieldDeclaration;

import es.uam.sara.tfg.properties.attributes.Attribute;

public class GenericAttribute {

	public static Object getElem(){
		return Attribute.class;
	}
	
	public static Object getClas() {
		return FieldDeclaration.class;
	}
}
