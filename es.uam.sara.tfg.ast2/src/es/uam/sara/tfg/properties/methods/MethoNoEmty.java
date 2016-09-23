package es.uam.sara.tfg.properties.methods;

import java.util.List;
import org.eclipse.jdt.core.dom.MethodDeclaration;

public class MethoNoEmty extends Method{

	public MethoNoEmty(List<MethodDeclaration> analyze) {
		super(analyze);
	}

	@Override
	public void check()  {
		for (MethodDeclaration m: super.analyze){
			if (m.getBody().statements().isEmpty()){
				addWrong(m);
			}else{
				addRight(m);
			}
		}
	}

}
