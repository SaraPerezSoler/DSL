package es.uam.sara.tfg.properties.methods;

import org.eclipse.jdt.core.dom.Type;

import es.uam.sara.tfg.elements.type.Method;
import es.uam.sara.tfg.properties.TypeProperty;


public class Return extends MethodProperty implements TypeProperty{

	private String type;
	public Return(boolean no, String type) {
		super(no);
		this.type=type;
	}

	@Override
	public String toString() {
		if (no){
			return "return type <>" + type;
		}else{
			return "return type =" + type;
		}
		
	}

	@Override
	public boolean checkElement(Method analyze) {
		Type returnType= analyze.getReturnType();
		if (this.equalType(returnType, type.toLowerCase())){
			return true;
		}else{
			return false;
		}
		
	}

}
