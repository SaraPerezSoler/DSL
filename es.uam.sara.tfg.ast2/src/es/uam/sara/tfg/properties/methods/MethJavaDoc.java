package es.uam.sara.tfg.properties.methods;

import java.util.List;

import org.eclipse.jdt.core.dom.MethodDeclaration;

import es.uam.sara.tfg.properties.JavaDocCheck;
import es.uam.sara.tfg.properties.PropertiesException;

public class MethJavaDoc extends Method{

	private JavaDocCheck jdc;
	public MethJavaDoc(List<MethodDeclaration> analyze,boolean author, boolean parameter,
			boolean returns, boolean version, boolean throwss, boolean see) {
		super(analyze);
		jdc= new JavaDocCheck(author, parameter, returns, version, throwss, see);
	}

	@Override
	public void check() {
		for (MethodDeclaration m: super.analyze){
			try{
				if (jdc.javaDoc(m.getJavadoc())){
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
