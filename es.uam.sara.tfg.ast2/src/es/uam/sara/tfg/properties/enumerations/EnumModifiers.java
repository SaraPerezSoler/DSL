package es.uam.sara.tfg.properties.enumerations;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import es.uam.sara.tfg.properties.ModifiersCheck;


public class EnumModifiers extends Enumeration{

	private ModifiersCheck mc;
	public EnumModifiers(List<EnumDeclaration> analyce, ModifiersCheck mc) {
		super();
		this.mc=mc;
	}

	@Override
	public void check(List<EnumDeclaration> analyze) {
		for (EnumDeclaration en : analyze) {
			if (mc.modifiers(getList(en))) {
				super.addRight(en);
			} else {
				super.addWrong(en);
			}
		}
	}

	private List<Modifier> getList(EnumDeclaration en) {
		ArrayList<Modifier> mList = new ArrayList<Modifier>();
		for (Object o : en.modifiers()) {
			if (o instanceof Modifier) {
				mList.add((Modifier) o);
			}
		}
		return mList;
	}

}
