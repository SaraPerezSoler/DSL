package es.uam.sara.tfg.properties.interfaces;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jdt.core.dom.Type;
import es.uam.sara.tfg.elements.JavaTypes;
import es.uam.sara.tfg.elements.type.MInterface;
import es.uam.sara.tfg.properties.all.IsSuper;
import es.uam.sara.tfg.properties.type.TypeString;

public class IsImplemented extends IsSuper<MInterface> {

	private List<JavaTypes> all;

	public IsImplemented(boolean no,List<JavaTypes> all) {
		super(no,-1, Integer.MAX_VALUE, new ArrayList<TypeString>());
		this.all = all;
	}

	public IsImplemented(boolean no,List<JavaTypes> allClasses, int min) {
		super(no,min, Integer.MAX_VALUE, new ArrayList<TypeString>());
		this.all = allClasses;
	}

	public IsImplemented(boolean no,List<JavaTypes> all, int min, int max) {
		super(no,min, max, new ArrayList<TypeString>());
		this.all = all;
	}

	public IsImplemented(boolean no,List<JavaTypes> all, List<TypeString> subClass) {
		super(no,-1, Integer.MAX_VALUE, subClass);
		this.all = all;
	}

	public IsImplemented(boolean no,List<JavaTypes> all, int min, List<TypeString> subClass) {
		super(no,min, Integer.MAX_VALUE, subClass);
		this.all = all;
	}

	public IsImplemented(boolean no,List<JavaTypes> all, int min, int max, List<TypeString> subClass) {
		super(no,min, max, subClass);
		this.all = all;
	}

	@Override
	public List<JavaTypes> getSub(MInterface td) {
		List<JavaTypes> save = new ArrayList<JavaTypes>();
		for (JavaTypes b : all) {
			if (!b.isInterface()) {
				List<Type> superClass = b.getSuperInterfaces();
				List<String> superClassList=es.uam.sara.tfg.properties.type.Type.getString(superClass);
				if (superClassList.contains(td.getName().toLowerCase())) {
					save.add(b);

				}
			}
		}
		setaIsInterface(true);
		setaIsInterface(false);
		return save;
	}

}
