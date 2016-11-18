package es.uam.sara.tfg.properties.enumconstant;

import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import es.uam.sara.tfg.properties.JavaDocCheck;


public class EnumConstJavaDoc extends EnumConstant{

	private JavaDocCheck jdc;
	public EnumConstJavaDoc(boolean author, boolean parameter,
			boolean returns, boolean version, boolean throwss, boolean see) {
		super();
		jdc= new JavaDocCheck(author, parameter, returns, version, throwss, see);
		
	}
	@Override
	public String toString() {
		return  jdc.toString();
	}

	@Override
	public boolean checkElement(EnumConstantDeclaration analyze) {
		return jdc.javaDoc(analyze);
	}
}
