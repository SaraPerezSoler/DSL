package es.uam.sara.tfg.properties.enumerations;

import java.util.List;

import org.eclipse.jdt.core.dom.EnumDeclaration;

import es.uam.sara.tfg.properties.JavaDocCheck;
import es.uam.sara.tfg.properties.PropertiesException;

public class EnumJavaDoc extends Enumeration {

	private JavaDocCheck jdc;
	public EnumJavaDoc(List<EnumDeclaration> analyce,boolean author, boolean parameter,
			boolean returns, boolean version, boolean throwss, boolean see) {
		super(analyce);
		jdc= new JavaDocCheck(author, parameter, returns, version, throwss, see);
		
	}

	@Override
	public void check() {
		for (EnumDeclaration en: super.analyze){
			try{
				if (jdc.javaDoc(en.getJavadoc())){
					super.addRight(en);
				}else{
					super.addWrong(en);
				}
			}catch(PropertiesException e){
				e.printStackTrace();
			}
		}
	}

}
