package es.uam.sara.tfg.properties.enumerations;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.Modifier;


import es.uam.sara.tfg.properties.ModifiersCheck;
import es.uam.sara.tfg.properties.PropertiesException;

public class EnumModifiers extends Enumeration {

	private ModifiersCheck mc;
	public EnumModifiers(List<EnumDeclaration> analyce, ModifiersCheck mc) {
		super(analyce);
		this.mc=mc;
	}

	@Override
	public void check() {
		for (EnumDeclaration en : super.analyze) {
			try {
				if (mc.modifiers(getList(en))) {
					super.addRight(en);
				} else {
					super.addWrong(en);
				}
			} catch (PropertiesException e) {
				e.printStackTrace();
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
