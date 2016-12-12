package es.uam.sara.tfg.properties.classes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.Type;
import es.uam.sara.tfg.elements.JavaTypes;
import es.uam.sara.tfg.elements.type.MClass;
import es.uam.sara.tfg.properties.all.IsSuper;
import es.uam.sara.tfg.properties.type.TypeString;

public class IsSuperClass extends IsSuper<MClass> {

	private List<MClass> all;

	public IsSuperClass(boolean no,List<MClass> allClasses) {
		super(no,-1, Integer.MAX_VALUE, new ArrayList<TypeString>());
		this.all = allClasses;
	}

	public IsSuperClass(boolean no,List<MClass> allClasses, int min) {
		super(no,min, Integer.MAX_VALUE, new ArrayList<TypeString>());
		this.all = allClasses;
	}

	public IsSuperClass(boolean no,List<MClass> allClasses, int min, int max) {
		super(no,min, max, new ArrayList<TypeString>());
		this.all = allClasses;
	}

	public IsSuperClass(boolean no,List<MClass> allClasses, List<TypeString> subClass) {
		super(no,-1, Integer.MAX_VALUE, subClass);
		this.all = allClasses;
	}

	public IsSuperClass(boolean no,List<MClass> allClasses, int min, List<TypeString> subClass) {
		super(no,min, Integer.MAX_VALUE, subClass);
		this.all = allClasses;
	}

	public IsSuperClass(boolean no,List<MClass> allClasses, int min, int max, List<TypeString> subClass) {
		super(no,min, max, subClass);
		this.all = allClasses;
	}

	@Override
	public List<JavaTypes> getSub(MClass td) {
		List<JavaTypes> save = new ArrayList<JavaTypes>();
		for (JavaTypes b : all) {
			if (b instanceof MClass) {
				if (!b.isInterface()) {
					Type superClass = ((MClass) b).getSuperclass();
					List<String> superClassList= es.uam.sara.tfg.properties.type.Type.getString(superClass);
					if (superClassList.contains(td.getName().toLowerCase())) {
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
