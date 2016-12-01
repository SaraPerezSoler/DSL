package es.uam.sara.tfg.properties.methods;

import org.eclipse.jdt.core.dom.Type;

import es.uam.sara.tfg.elements.type.Method;
import es.uam.sara.tfg.properties.StringProperty;
import es.uam.sara.tfg.properties.type.TypeString;


public class Return extends StringProperty<Method>{

	private es.uam.sara.tfg.properties.type.Type type;
	public Return(boolean no) {
		super(no);
	}
	public Return(boolean no, es.uam.sara.tfg.properties.type.Type type) {
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
		if (type.compare(returnType)){
			return true;
		}else{
			return false;
		}
		
	}

	@Override
	public void setString(String string) {
		type=new TypeString(string);
		
	}
	@Override
	public void deleteString(String string) {
		type=new TypeString("");
		
	}

}
