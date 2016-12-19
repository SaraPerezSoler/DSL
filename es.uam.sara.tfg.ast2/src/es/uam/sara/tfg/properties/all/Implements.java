package es.uam.sara.tfg.properties.all;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.core.dom.Type;
import es.uam.sara.tfg.elements.JavaTypes;
import es.uam.sara.tfg.properties.StringProperty;
import es.uam.sara.tfg.properties.type.TypeString;

public class Implements<T extends JavaTypes> extends StringProperty<T> {
	
	private Map<T, List<Type>> implement= new HashMap<T, List<Type>>();
	private int min;
	private int max;
	private List<TypeString> interfConstantes;
	private List<TypeString> interfVariables;
	private boolean isInterface;

	public Implements(boolean no) {
		super(no);
		min = 1;
		max = Integer.MAX_VALUE;
		interfConstantes = new ArrayList<TypeString>();
		interfVariables = new ArrayList<TypeString>();
	}

	public Implements(boolean no,int min) {
		super(no);
		this.min = min;
		this.max = Integer.MAX_VALUE;
		interfConstantes = new ArrayList<TypeString>();
		interfVariables = new ArrayList<TypeString>();
	}

	public Implements(boolean no,int min, int max) {
		super(no);
		this.min = min;
		this.max = max;
		interfConstantes = new ArrayList<TypeString>();
		interfVariables = new ArrayList<TypeString>();
	}

	public Implements(boolean no,List<TypeString> interf) {
		super(no);
		this.min = interf.size();
		this.max = Integer.MAX_VALUE;
		interfConstantes = new ArrayList<TypeString>();
		interfVariables = new ArrayList<TypeString>();
		
		for (TypeString t: interf){
			if (t.isVariable()){
				interfVariables.add(t);
			}else{
				interfConstantes.add(t);
			}
		}
	}

	public Implements(boolean no,int min, List<TypeString> interf) {
		super(no);
		this.min = min;
		this.max = Integer.MAX_VALUE;
		interfConstantes = new ArrayList<TypeString>();
		interfVariables = new ArrayList<TypeString>();
		
		for (TypeString t: interf){
			if (t.isVariable()){
				interfVariables.add(t);
			}else{
				interfConstantes.add(t);
			}
		}
	}

	public Implements(boolean no,int min, int max, List<TypeString> interf) {
		super(no);
		this.min = min;
		this.max = max;
		interfConstantes = new ArrayList<TypeString>();
		interfVariables = new ArrayList<TypeString>();
		
		for (TypeString t: interf){
			if (t.isVariable()){
				interfVariables.add(t);
			}else{
				interfConstantes.add(t);
			}
		}
	}

	@Override
	public boolean checkElement(T analyze) {
		
		List<TypeString> interf=new ArrayList<TypeString>();
		interf.addAll(this.interfConstantes);
		interf.addAll(interfVariables);
		if (analyze.isInterface()) {
			isInterface = true;
		}
		List<Type> superInterface = analyze.getSuperInterfaces();
		implement.put(analyze, superInterface);
		List<String>superInterfaceList=es.uam.sara.tfg.properties.type.Type.getString(superInterface);
		if (superInterface.size() >= min && superInterface.size() <= max) {
			for (TypeString type : interf) {
				if (!type.isTypeIn(superInterfaceList)){
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
		List<TypeString> interf=new ArrayList<TypeString>();
		interf.addAll(this.interfConstantes);
		interf.addAll(interfVariables);
		if (!interf.isEmpty()) {
			cad += "{";
			for (TypeString s : interf) {
				cad += s + " ";
			}
			cad += "}";
		}

		return cad;
	}

	@Override
	public void setString(String string, int i) {
		this.interfVariables.get(i).setString(string);
		
	}

	@Override
	public void deleteString(String string, int i) {
		this.interfVariables.get(i).deleteString(string);
		
	}
	
	public String print(T t) {
		String cad="";
		
		if (!isInterface) {
			cad += "implement ";
		} else {
			cad += "extend ";
		}
		List<Type> interfaces=this.implement.get(t);
		if (interfaces.isEmpty()){
			cad="";
		}
		for (Type ty: interfaces){
			cad+=ty+" ";
		}
		
		return t.toString()+cad+"\n";
	}

}
