package es.uam.sara.tfg.properties.methods;

import java.util.List;
import org.eclipse.jdt.core.dom.MethodDeclaration;


public class Return extends Method{

	private String type;
	public Return( String type) {
		super();
		this.type=type;
	}

	@Override
	public void check(List<MethodDeclaration> analyze) {
		for (MethodDeclaration m: analyze){
			if (m.getReturnType2()==null){
				super.addWrong(m);
			}else if (m.getReturnType2().toString().compareTo(type)==0){
				super.addRight(m);
			}else{
				super.addWrong(m);
			}
		}
	}

	@Override
	public String toString() {
		return "return type=" + type;
	}

}
