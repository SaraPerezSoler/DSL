package es.uam.sara.tfg.properties.methods;

import java.util.List;
import es.uam.sara.tfg.elements.Method;
import es.uam.sara.tfg.properties.TypeToString;


public class Return extends MethodProperty{

	private String type;
	public Return( String type) {
		super();
		this.type=type;
	}

	@Override
	public String toString() {
		return "return type=" + type;
	}

	@Override
	public boolean checkElement(Method analyze) {
		List<String> returnType= TypeToString.getString(analyze.getBodyDeclarations().getReturnType2());
		if (returnType.contains(type.toLowerCase())){
			return true;
		}else{
			return false;
		}
		
	}

}
