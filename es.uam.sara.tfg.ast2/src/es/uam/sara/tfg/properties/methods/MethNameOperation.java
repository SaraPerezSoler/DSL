package es.uam.sara.tfg.properties.methods;

import java.util.List;

import org.eclipse.jdt.core.dom.MethodDeclaration;

import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.PropertiesException;

public class MethNameOperation extends Method{

	private NameCheck nCheck; 
	public MethNameOperation(List<MethodDeclaration> analyze,NameCheck.Operation op, String cad, int idioma) {
		super(analyze);
		nCheck= new NameCheck(op, cad, idioma);
	}

	@Override
	public void check() {
		for (MethodDeclaration m: super.analyze){
			try{
				if (nCheck.checkNameOperation(m.getName().toString())){
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
