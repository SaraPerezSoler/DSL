package es.uam.sara.tfg.properties.methods;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import es.uam.sara.tfg.properties.JavaDocCheck;


public class MethJavaDoc extends Method{

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
	public boolean checkElement(MethodDeclaration analyze) {
		return jdc.javaDoc(analyze);
	}
}
