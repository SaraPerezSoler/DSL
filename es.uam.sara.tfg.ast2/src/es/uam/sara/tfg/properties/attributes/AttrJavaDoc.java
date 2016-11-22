package es.uam.sara.tfg.properties.attributes;

import es.uam.sara.tfg.elements.Attribute;
import es.uam.sara.tfg.properties.JavaDocCheck;


public class AttrJavaDoc extends AttributeProperty{

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
	public boolean checkElement(Attribute analize) {
		return jdc.javaDoc(analize.getBodyDeclarations());
	}
}

