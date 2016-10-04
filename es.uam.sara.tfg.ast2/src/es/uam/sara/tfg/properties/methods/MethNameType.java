package es.uam.sara.tfg.properties.methods;

import java.util.List;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.NameCheck.Type;


public class MethNameType extends Method{

	private NameCheck nCheck;
	public MethNameType(List<MethodDeclaration> analyze, Type type) {
		super(analyze);
		nCheck= new NameCheck(type);
	}

	@Override
	public void check() {
		for (MethodDeclaration m: super.analyze){
			if (nCheck.checkNameType(m.getName().toString())){
				super.addRight(m);
			}else{
				super.addWrong(m);
			}
		}
	}

}
