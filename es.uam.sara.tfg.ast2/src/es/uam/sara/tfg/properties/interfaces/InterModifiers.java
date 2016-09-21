package es.uam.sara.tfg.properties.interfaces;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import es.uam.sara.tfg.properties.ModifiersCheck;
import es.uam.sara.tfg.properties.PropertiesException;

public class InterModifiers extends Interface {

	private ModifiersCheck mc;

	public InterModifiers(List<TypeDeclaration> analyce, ModifiersCheck mc) {
		super(analyce);
		this.mc = mc;
	}

	@Override
	public void check() {
		for (TypeDeclaration t : super.analyze) {
			try {
				if (mc.modifiers(getList(t))) {
					super.addRight(t);
				} else {
					super.addWrong(t);
				}
			} catch (PropertiesException e) {
				e.printStackTrace();
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
