package es.uam.sara.tfg.properties.interfaces;

import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.properties.JavaDocCheck;


public class InterJavaDoc extends Interface{

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
	public boolean checkElement(TypeDeclaration analyze) {
		return jdc.javaDoc(analyze);
	}
}
