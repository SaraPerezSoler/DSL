package es.uam.sara.tfg.properties.attributes;

import java.util.List;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import es.uam.sara.tfg.properties.IsGeneric;

public class AttrIsGeneric extends Attribute{

	@Override
	public void check(List<FieldDeclaration> analize) {
		IsGeneric generic= new IsGeneric();
		for (FieldDeclaration t: analize){
			if (generic.check(t)){
				super.addRight(t);
			}else{
				super.addWrong(t);
			}
		}
		
	}

}
