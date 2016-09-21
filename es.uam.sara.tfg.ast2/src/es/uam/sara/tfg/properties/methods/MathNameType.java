package es.uam.sara.tfg.properties.methods;

import java.util.List;

import org.eclipse.jdt.core.dom.MethodDeclaration;

import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.PropertiesException;
import es.uam.sara.tfg.properties.NameCheck.Type;

public class MathNameType extends Method {

	private NameCheck nCheck;
	public MathNameType(List<MethodDeclaration> analyze, Type type) {
		super(analyze);
		nCheck= new NameCheck(type);
	}

	@Override
	public void check() {
		for (MethodDeclaration m: super.analyze){
			try{
				if (nCheck.checkNameType(m.getName().toString())){
					super.addRight(m);
				}else{
					super.addWrong(m);
				}
				
			}catch(PropertiesException e){
				e.printStackTrace();
			}
		}
	}

}
