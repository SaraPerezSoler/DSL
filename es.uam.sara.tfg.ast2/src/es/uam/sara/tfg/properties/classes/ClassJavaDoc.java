package es.uam.sara.tfg.properties.classes;

import java.util.List;

import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.properties.JavaDocCheck;


public class ClassJavaDoc extends Class{

	private JavaDocCheck jdc;
	public ClassJavaDoc(List<TypeDeclaration> analyze,boolean author, boolean parameter,
			boolean returns, boolean version, boolean throwss, boolean see) {
		super(analyze);
		jdc= new JavaDocCheck(author, parameter, returns, version, throwss, see);
	}

	@Override
	public void check() {
		for (TypeDeclaration t: super.analyze){
			if (jdc.javaDoc(t.getJavadoc())){
				super.addRight(t);
			}else{
				super.addWrong(t);
			}
		}

	}

}
