package es.uam.sara.tfg.properties.enumerations;

import org.eclipse.jdt.core.dom.EnumDeclaration;

import es.uam.sara.tfg.properties.JavaDocCheck;


public class EnumJavaDoc extends Enumeration{

	private JavaDocCheck jdc;
	public EnumJavaDoc(boolean author, boolean parameter,
			boolean returns, boolean version, boolean throwss, boolean see) {
		super();
		jdc= new JavaDocCheck(author, parameter, returns, version, throwss, see);
		
	}
	@Override
	public String toString() {
		return  jdc.toString();
	}

	@Override
	public boolean checkElement(EnumDeclaration analyze) {
		return jdc.javaDoc(analyze);
	}
}
