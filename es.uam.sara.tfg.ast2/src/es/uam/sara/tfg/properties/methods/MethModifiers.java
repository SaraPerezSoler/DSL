package es.uam.sara.tfg.properties.methods;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import es.uam.sara.tfg.properties.ModifiersCheck;


public class MethModifiers extends Method{

	private ModifiersCheck mc;
	public MethModifiers(ModifiersCheck mc) {
		super();
		this.mc=mc;
	}

	@Override
	public void check(List<MethodDeclaration> analyze) {
		for (MethodDeclaration m : analyze) {
			if (mc.modifiers(getList(m))) {
				super.addRight(m);
			} else {
				super.addWrong(m);
			}
		}
	}

	private List<Modifier> getList(MethodDeclaration m) {
		ArrayList<Modifier> mList = new ArrayList<Modifier>();
		for (Object o : m.modifiers()) {
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
