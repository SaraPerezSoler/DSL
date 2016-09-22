package es.uam.sara.tfg.properties.attributes;

import java.util.List;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

import es.uam.sara.tfg.properties.NameCheck;
import es.uam.sara.tfg.properties.PropertiesException;

public class AttrNameType extends Attribute{

	private NameCheck nCheck;
	
	public AttrNameType(List<FieldDeclaration> analyze, NameCheck.Type type) {
		super(analyze);
		nCheck= new NameCheck(type);
	}

	@Override
	public void check() {
		for (FieldDeclaration a : super.analyze) {
			try {
				if (a.fragments().get(0) instanceof VariableDeclarationFragment) {
					VariableDeclarationFragment declaration = (VariableDeclarationFragment) a.fragments().get(0);
					if (nCheck.checkNameType(declaration.getName().toString())) {
						addRight(a);
					} else {
						addWrong(a);
					}
				}
			} catch (PropertiesException e) {
				e.printStackTrace();
			}
		}

	}

}
