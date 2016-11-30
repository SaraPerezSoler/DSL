package es.uam.sara.tfg.properties.interfaces;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jdt.core.dom.Type;
import es.uam.sara.tfg.elements.JavaTypes;
import es.uam.sara.tfg.elements.type.Interface;
import es.uam.sara.tfg.properties.all.Super;

public class isImplemented extends Super<Interface> {

	private List<JavaTypes> all;

	public isImplemented(boolean no,List<JavaTypes> all) {
		super(no,-1, Integer.MAX_VALUE, new ArrayList<String>());
		this.all = all;
	}

	public isImplemented(boolean no,List<JavaTypes> allClasses, int min) {
		super(no,min, Integer.MAX_VALUE, new ArrayList<String>());
		this.all = allClasses;
	}

	public isImplemented(boolean no,List<JavaTypes> all, int min, int max) {
		super(no,min, max, new ArrayList<String>());
		this.all = all;
	}

	public isImplemented(boolean no,List<JavaTypes> all, List<String> subClass) {
		super(no,-1, Integer.MAX_VALUE, subClass);
		this.all = all;
	}

	public isImplemented(boolean no,List<JavaTypes> all, int min, List<String> subClass) {
		super(no,min, Integer.MAX_VALUE, subClass);
		this.all = all;
	}

	public isImplemented(boolean no,List<JavaTypes> all, int min, int max, List<String> subClass) {
		super(no,min, max, subClass);
		this.all = all;
	}

	@Override
	public List<JavaTypes> getSub(Interface td) {
		List<JavaTypes> save = new ArrayList<JavaTypes>();
		for (JavaTypes b : all) {
			if (!b.isInterface()) {
				List<Type> superClass = b.getSuperInterfaces();
				if (this.listContainElement(superClass, td.getName())) {
					save.add(b);

				}
			}
		}
		setaIsInterface(true);
		setaIsInterface(false);
		return save;
	}

}
