package es.uam.sara.tfg.properties.methods;

import java.util.List;
import org.eclipse.jdt.core.dom.MethodDeclaration;

import es.uam.sara.tfg.properties.TypeToString;


public class Return extends Method{

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
	public boolean checkElement(MethodDeclaration analyze) {
		List<String> returnType= TypeToString.getString(analyze.getReturnType2());
		if (returnType.contains(type.toLowerCase())){
			return true;
		}else{
			return false;
		}
		
	}

}
