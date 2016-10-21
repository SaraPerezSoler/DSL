package es.uam.sara.tfg.properties.methods;

import java.util.List;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import es.uam.sara.tfg.properties.NameCheck;


public class MethNameOperation extends Method{

	private NameCheck nCheck; 
	public MethNameOperation(NameCheck.Operation op, String cad, int idioma) {
		super();
		nCheck= new NameCheck(op, cad, idioma);
	}

	@Override
	public void check(List<MethodDeclaration> analyze) {
		for (MethodDeclaration m: analyze){
			if (nCheck.checkNameOperation(m.getName().toString())){
				super.addRight(m);
			}else{
				super.addWrong(m);
			}
		}
	}

}
