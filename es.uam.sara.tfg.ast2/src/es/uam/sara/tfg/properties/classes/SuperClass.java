package es.uam.sara.tfg.properties.classes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.Type;

import es.uam.sara.tfg.elements.JavaTypes;
import es.uam.sara.tfg.elements.type.ClassInterface;
import es.uam.sara.tfg.properties.all.Super;

public class SuperClass extends Super {

	private List<ClassInterface> all;

	public SuperClass(boolean no,List<ClassInterface> allClasses) {
		super(no,-1, Integer.MAX_VALUE, new ArrayList<String>());
		this.all = allClasses;
	}

	public SuperClass(boolean no,List<ClassInterface> allClasses, int min) {
		super(no,min, Integer.MAX_VALUE, new ArrayList<String>());
		this.all = allClasses;
	}

	public SuperClass(boolean no,List<ClassInterface> allClasses, int min, int max) {
		super(no,min, max, new ArrayList<String>());
		this.all = allClasses;
	}

	public SuperClass(boolean no,List<ClassInterface> allClasses, List<String> subClass) {
		super(no,-1, Integer.MAX_VALUE, subClass);
		this.all = allClasses;
	}

	public SuperClass(boolean no,List<ClassInterface> allClasses, int min, List<String> subClass) {
		super(no,min, Integer.MAX_VALUE, subClass);
		this.all = allClasses;
	}

	public SuperClass(boolean no,List<ClassInterface> allClasses, int min, int max, List<String> subClass) {
		super(no,min, max, subClass);
		this.all = allClasses;
	}

	@Override
	public List<JavaTypes> getSub(ClassInterface td) {
		List<JavaTypes> save = new ArrayList<JavaTypes>();
		for (JavaTypes b : all) {
			if (b instanceof ClassInterface) {
				if (!b.isInterface()) {
					Type superClass = ((ClassInterface) b).getSuperclass();
					if (this.equalType(superClass, td.getName())) {
						save.add(b);
					}
				}
			}
		}
		setaIsInterface(false);
		setbIsInterface(false);
		return save;
	}

}
