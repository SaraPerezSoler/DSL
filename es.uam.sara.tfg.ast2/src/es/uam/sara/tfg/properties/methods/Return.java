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
	public void check(List<MethodDeclaration> analyze) {
		for (MethodDeclaration m: analyze){
			List<String> returnType= TypeToString.getString(m.getReturnType2());
			if (returnType.isEmpty()){
				super.addWrong(m);
			}else if (returnType.contains(type.toLowerCase())){
				super.addRight(m);
			}else{
				super.addWrong(m);
			}
		}
	}

	@Override
	public String toString() {
		return "return type=" + type;
	}

}
