package es.uam.sara.tfg.properties.interfaces;

import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.properties.JavaDocCheck;


public class InterJavaDoc extends InterfaceProperty{

	private JavaDocCheck jdc;
	public InterJavaDoc(boolean author, boolean parameter,
			boolean returns, boolean version, boolean throwss, boolean see) {
		super();
		jdc=new JavaDocCheck(author, parameter, returns, version, throwss, see);
	}

	@Override
	public String toString() {
		return  jdc.toString();
	}

	@Override
	public boolean checkElement(ClassInterface analyze) {
		return jdc.javaDoc(analyze.getBodyDeclarations());
	}
}
