package es.uam.sara.tfg.properties.methods;

import es.uam.sara.tfg.elements.Method;
import es.uam.sara.tfg.properties.JavaDocCheck;


public class MethJavaDoc extends MethodProperty{

	private JavaDocCheck jdc;
	public MethJavaDoc(boolean author, boolean parameter,
			boolean returns, boolean version, boolean throwss, boolean see) {
		super();
		jdc= new JavaDocCheck(author, parameter, returns, version, throwss, see);
	}

	@Override
	public String toString() {
		return  jdc.toString();
	}

	@Override
	public boolean checkElement(Method analyze) {
		return jdc.javaDoc(analyze.getBodyDeclarations());
	}
}
