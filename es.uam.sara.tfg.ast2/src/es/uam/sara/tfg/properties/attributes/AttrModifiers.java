package es.uam.sara.tfg.properties.attributes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import es.uam.sara.tfg.properties.ModifiersCheck;


public class AttrModifiers extends Attribute{

	private ModifiersCheck mc;

	public AttrModifiers(ModifiersCheck mc) {
		super();
		this.mc = mc;
	}

	@Override
	public void check(List<FieldDeclaration> analyze) {
		for (FieldDeclaration a : analyze) {
			if (mc.modifiers(getList(a))) {
				super.addRight(a);
			} else {
				super.addWrong(a);
			}
		}
	}

	private List<Modifier> getList(FieldDeclaration a) {
		ArrayList<Modifier> mList = new ArrayList<Modifier>();
		for (Object o : a.modifiers()) {
			if (o instanceof Modifier) {
				mList.add((Modifier) o);
			}
		}
		return mList;
	}

}
