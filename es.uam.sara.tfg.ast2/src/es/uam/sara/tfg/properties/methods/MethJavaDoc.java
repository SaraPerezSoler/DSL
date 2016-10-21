package es.uam.sara.tfg.properties.methods;

import java.util.List;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import es.uam.sara.tfg.properties.JavaDocCheck;


public class MethJavaDoc extends Method{

	private JavaDocCheck jdc;
	public MethJavaDoc(boolean author, boolean parameter,
			boolean returns, boolean version, boolean throwss, boolean see) {
		super();
		jdc= new JavaDocCheck(author, parameter, returns, version, throwss, see);
	}

	@Override
	public void check(List<MethodDeclaration> analyze) {
		for (MethodDeclaration m: analyze){
			if (jdc.javaDoc(m.getJavadoc())){
				super.addRight(m);
			}else{
				super.addWrong(m);
			}
		}
	}

}
