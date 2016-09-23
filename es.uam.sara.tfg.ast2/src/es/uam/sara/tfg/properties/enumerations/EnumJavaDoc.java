package es.uam.sara.tfg.properties.enumerations;

import java.util.List;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import es.uam.sara.tfg.properties.JavaDocCheck;


public class EnumJavaDoc extends Enumeration{

	private JavaDocCheck jdc;
	public EnumJavaDoc(List<EnumDeclaration> analyce,boolean author, boolean parameter,
			boolean returns, boolean version, boolean throwss, boolean see) {
		super(analyce);
		jdc= new JavaDocCheck(author, parameter, returns, version, throwss, see);
		
	}

	@Override
	public void check() {
		for (EnumDeclaration en: super.analyze){
			if (jdc.javaDoc(en.getJavadoc())){
				super.addRight(en);
			}else{
				super.addWrong(en);
			}
		}
	}

}
