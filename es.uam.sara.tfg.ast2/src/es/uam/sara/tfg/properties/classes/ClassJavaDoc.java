package es.uam.sara.tfg.properties.classes;

import es.uam.sara.tfg.elements.ClassInterface;
import es.uam.sara.tfg.properties.JavaDocCheck;


public class ClassJavaDoc extends ClassProperty{

	private JavaDocCheck jdc;
	public ClassJavaDoc(boolean author, boolean parameter,
			boolean returns, boolean version, boolean throwss, boolean see) {
		super();
		jdc= new JavaDocCheck(author, parameter, returns, version, throwss, see);
	}

	@Override
	public String toString() {
		return  jdc.toString();
	}

	@Override
	public boolean checkElement(ClassInterface analize) {
		return jdc.javaDoc(analize.getBodyDeclarations());
	}

}
