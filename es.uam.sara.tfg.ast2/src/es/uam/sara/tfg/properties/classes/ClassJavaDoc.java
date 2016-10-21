package es.uam.sara.tfg.properties.classes;

import java.util.List;

import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.properties.JavaDocCheck;


public class ClassJavaDoc extends Class{

	private JavaDocCheck jdc;
	public ClassJavaDoc(boolean author, boolean parameter,
			boolean returns, boolean version, boolean throwss, boolean see) {
		super();
		jdc= new JavaDocCheck(author, parameter, returns, version, throwss, see);
	}

	@Override
	public void check(List<TypeDeclaration> analyze) {
		for (TypeDeclaration t: analyze){
			if (jdc.javaDoc(t.getJavadoc())){
				super.addRight(t);
			}else{
				super.addWrong(t);
			}
		}

	}

}
