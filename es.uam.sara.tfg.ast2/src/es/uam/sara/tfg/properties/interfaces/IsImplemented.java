package es.uam.sara.tfg.properties.interfaces;

import java.util.List;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.properties.PropertiesException;

public class IsImplemented extends Interface {
	
	private List<TypeDeclaration> allTypes;

	public IsImplemented(List<TypeDeclaration> analyce, List<TypeDeclaration> allTypes) {
		super(analyce);
		this.allTypes=allTypes;
	}

	@Override
	public void check() {
		try{
			for (TypeDeclaration t: super.analyze){
				if (check(t)){
					super.addRight(t);
				}else{
					super.addWrong(t);
				}
			}
		}catch(PropertiesException e){
			e.printStackTrace();
		}
	}
	
	private boolean check(TypeDeclaration td){
		for (TypeDeclaration a: allTypes){
			System.out.println(a.getName());
			for (Object t:a.superInterfaceTypes()){
				if (t.toString().equals(td.getName())){
					return true;
				}
			}
		}
		return false;
	}

}
