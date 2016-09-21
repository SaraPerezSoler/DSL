package es.uam.sara.tfg.properties.methods;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import es.uam.sara.tfg.properties.ModifiersCheck;
import es.uam.sara.tfg.properties.PropertiesException;

public class MethModifiers extends Method {

	private ModifiersCheck mc;
	public MethModifiers(List<MethodDeclaration> analyze, ModifiersCheck mc) {
		super(analyze);
		this.mc=mc;
	}

	@Override
	public void check() {
		for (MethodDeclaration m : super.analyze) {
			try {
				if (mc.modifiers(getList(m))) {
					super.addRight(m);
				} else {
					super.addWrong(m);
				}
			} catch (PropertiesException e) {
				e.printStackTrace();
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


}
