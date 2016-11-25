package es.uam.sara.tfg.properties.all;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.Type;

import es.uam.sara.tfg.elements.JavaTypes;
import es.uam.sara.tfg.properties.Properties;
import es.uam.sara.tfg.properties.TypeProperty;

public class SubInterface<T extends JavaTypes> extends Properties<T> implements TypeProperty {

	private int min;
	private int max;
	private List<String> interf;
	private boolean isInterface;

	public SubInterface(boolean no) {
		super(no);
		min = 1;
		max = Integer.MAX_VALUE;
		interf = new ArrayList<String>();
	}

	public SubInterface(boolean no,int min) {
		super(no);
		this.min = min;
		this.max = Integer.MAX_VALUE;
		this.interf = new ArrayList<String>();
	}

	public SubInterface(boolean no,int min, int max) {
		super(no);
		this.min = min;
		this.max = max;
		this.interf = new ArrayList<String>();
	}

	public SubInterface(boolean no,List<String> interf) {
		super(no);
		this.min = interf.size();
		this.max = Integer.MAX_VALUE;
		this.interf = interf;
	}

	public SubInterface(boolean no,int min, List<String> interf) {
		super(no);
		this.min = min;
		this.max = Integer.MAX_VALUE;
		this.interf = interf;
	}

	public SubInterface(boolean no,int min, int max, List<String> interf) {
		super(no);
		this.min = min;
		this.max = max;
		this.interf = interf;
	}

	@Override
	public boolean checkElement(T analyze) {
		if (analyze.isInterface()) {
			isInterface = true;
		}
		List<Type> superInterface = analyze.getSuperInterfaces();
		if (superInterface.size() >= min && superInterface.size() <= max) {
			for (String type : this.interf) {
				if (!(this.listContainElement(superInterface, type))) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String cad;
		if (no){
			cad="don't ";
		}else{
			cad="";
		}
		
		if (!isInterface) {
			cad += "implement ";
		} else {
			cad += "extend";
		}
		if (min != -1) {
			if (max != Integer.MAX_VALUE) {
				cad += "[" + min + "..*] ";
			} else {
				cad += "[" + min + ".." + max + "] ";
			}
		}
		if (!this.interf.isEmpty()) {
			cad += "{";
			for (String s : interf) {
				cad += s + " ";
			}
			cad += "}";
		}

		return cad;
	}

}
