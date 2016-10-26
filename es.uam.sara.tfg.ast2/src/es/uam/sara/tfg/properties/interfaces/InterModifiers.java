package es.uam.sara.tfg.properties.interfaces;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import es.uam.sara.tfg.properties.ModifiersCheck;


public class InterModifiers extends Interface{

	private ModifiersCheck mc;

	public InterModifiers( ModifiersCheck mc) {
		super();
		this.mc = mc;
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
	@Override
	public String toString() {
		return mc.toString();
	}
}
