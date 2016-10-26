package es.uam.sara.tfg.properties.methods;

import java.util.List;
import org.eclipse.jdt.core.dom.MethodDeclaration;

public class MethNoEmpty extends Method{

	public MethNoEmpty() {
		super();
	}

	@Override
	public void check(List<MethodDeclaration> analyze)  {
		for (MethodDeclaration m: analyze){
			if (m.getBody().statements().isEmpty()){
				addWrong(m);
			}else{
				addRight(m);
			}
		}
	}
	@Override
	public String toString() {
		return "no empty";
	}
}
