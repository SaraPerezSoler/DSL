package es.uam.sara.tfg.properties.attributes;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import es.uam.sara.tfg.properties.JavaDocCheck;


public class AttrJavaDoc extends Attribute{

	private JavaDocCheck jdc;
	public AttrJavaDoc(boolean author, boolean parameter,
			boolean returns, boolean version, boolean throwss, boolean see) {
		super();
		jdc= new JavaDocCheck(author, parameter, returns, version, throwss, see);
	}

	@Override
	public String toString() {
		return jdc.toString();
	}

	@Override
	public boolean checkElement(FieldDeclaration analize) {
		return jdc.javaDoc(analize);
	}
}

