package es.uam.sara.tfg.properties.attributes;

import java.util.List;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import es.uam.sara.tfg.properties.JavaDocCheck;


public class AttrJavaDoc extends Attribute{

	private JavaDocCheck jdc;
	public AttrJavaDoc(List<FieldDeclaration> analyze,boolean author, boolean parameter,
			boolean returns, boolean version, boolean throwss, boolean see) {
		super(analyze);
		jdc= new JavaDocCheck(author, parameter, returns, version, throwss, see);
	}

	@Override
	public void check(){
		for (FieldDeclaration a: super.analyze){
			if(jdc.javaDoc(a.getJavadoc())){
				super.addRight(a);
			}else{
				super.addWrong(a);
			}
		}
		
	}

}
