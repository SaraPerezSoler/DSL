package es.uam.sara.tfg.properties.classes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.properties.ModifiersCheck;


public class ClassModifiers extends Class{

	private ModifiersCheck mc;
	public ClassModifiers(ModifiersCheck mc) {
		super();
		this.mc=mc;
	}

	@Override
	public void check(List<TypeDeclaration> analyze) {
		for (TypeDeclaration t : analyze) {
			if (mc.modifiers(getList(t))) {
				super.addRight(t);
			} else {
				super.addWrong(t);
			}
		}
	}

	private List<Modifier> getList(TypeDeclaration t) {
		ArrayList<Modifier> mList = new ArrayList<Modifier>();
		for (Object o : t.modifiers()) {
			if (o instanceof Modifier) {
				mList.add((Modifier) o);
			}
		}
		return mList;
	}


}
