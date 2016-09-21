package es.uam.sara.tfg.properties.interfaces;

import java.util.List;

import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.properties.JavaDocCheck;
import es.uam.sara.tfg.properties.PropertiesException;

public class InterJavaDoc extends Interface {

	private JavaDocCheck jdc;
	public InterJavaDoc(List<TypeDeclaration> analyce,boolean author, boolean parameter,
			boolean returns, boolean version, boolean throwss, boolean see) {
		super(analyce);
		jdc=new JavaDocCheck(author, parameter, returns, version, throwss, see);
	}

	@Override
	public void check() {
		for (TypeDeclaration t: super.analyze){
			try{
				if (jdc.javaDoc(t.getJavadoc())){
					super.addRight(t);
				}else{
					super.addWrong(t);
				}
			}catch (PropertiesException e){
				e.printStackTrace();
			}
		}
	}

}
