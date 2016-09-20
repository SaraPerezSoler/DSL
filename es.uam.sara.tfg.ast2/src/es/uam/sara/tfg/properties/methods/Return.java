package es.uam.sara.tfg.properties.methods;

import java.util.List;

import org.eclipse.jdt.core.dom.MethodDeclaration;

import es.uam.sara.tfg.properties.PropertiesException;

public class Return extends Method {

	private String type;
	public Return(List<MethodDeclaration> analyze, String type) {
		super(analyze);
		this.type=type;
	}

	@Override
	public void check() {
		try{
			for (MethodDeclaration m: super.analyze){
				if (m.getReturnType2().toString().compareTo(type)==0){
					super.addRight(m);
				}else{
					super.addWrong(m);
				}
			}
		}catch(PropertiesException e){
			e.printStackTrace();
		}
	}

}
