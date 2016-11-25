package es.uam.sara.tfg.properties.interfaces;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.Type;

import es.uam.sara.tfg.elements.JavaTypes;
import es.uam.sara.tfg.elements.type.ClassInterface;
import es.uam.sara.tfg.properties.all.Super;

public class SuperInterface extends Super{

	private List<ClassInterface> allInterfaces;
	
	public SuperInterface(boolean no,List<ClassInterface> allInterfaces) {
		super(no,-1, Integer.MAX_VALUE, new ArrayList<String>());
		this.allInterfaces=allInterfaces;
	}

	public SuperInterface(boolean no,List<ClassInterface> allInterfaces, int min) {
		super(no,min, Integer.MAX_VALUE, new ArrayList<String>());
		this.allInterfaces=allInterfaces;
	}

	public SuperInterface(boolean no,List<ClassInterface> allInterfaces, int min, int max) {
		super(no,min, max, new ArrayList<String>());
		this.allInterfaces=allInterfaces;
	}

	public SuperInterface(boolean no,List<ClassInterface> allInterfaces, List<String> subClass) {
		super(no,-1, Integer.MAX_VALUE, subClass);
		this.allInterfaces=allInterfaces;
	}

	public SuperInterface(boolean no,List<ClassInterface> allInterfaces, int min, List<String> subClass) {
		super(no,min, Integer.MAX_VALUE, subClass);
		this.allInterfaces=allInterfaces;
	}
	public SuperInterface(boolean no,List<ClassInterface> allInterfaces,int min, int max, List<String> subClass) {
		super(no,min, max, subClass);
		this.allInterfaces=allInterfaces;
	}

	@Override
	public List<JavaTypes> getSub(ClassInterface td) {
		List<JavaTypes> save = new ArrayList<JavaTypes>();
		for (JavaTypes b : allInterfaces) {
			if (b.isInterface()) {
				List<Type> superClass = b.getSuperInterfaces();
				if (this.listContainElement(superClass, td.getName())) {
					save.add(b);

				}
			}
		}
		setaIsInterface(true);
		setaIsInterface(true);
		return save;
	}
	
}
