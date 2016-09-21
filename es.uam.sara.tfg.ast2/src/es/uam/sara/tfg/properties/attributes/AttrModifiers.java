package es.uam.sara.tfg.properties.attributes;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import es.uam.sara.tfg.properties.ModifiersCheck;
import es.uam.sara.tfg.properties.PropertiesException;

public class AttrModifiers extends Attribute {

	private ModifiersCheck mc;

	public AttrModifiers(List<FieldDeclaration> analyze, ModifiersCheck mc) {
		super(analyze);
		this.mc = mc;
	}

	@Override
	public void check() {
		for (FieldDeclaration a : super.analyze) {
			try {
				if (mc.modifiers(getList(a))) {
					super.addRight(a);
				} else {
					super.addWrong(a);
				}
			} catch (PropertiesException e) {
				e.printStackTrace();
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
