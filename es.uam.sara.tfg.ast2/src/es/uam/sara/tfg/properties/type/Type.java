package es.uam.sara.tfg.properties.type;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jdt.core.dom.ParameterizedType;


public interface Type {
	public boolean equals(Object other);
	
	public static List<String> getString(org.eclipse.jdt.core.dom.Type type) {
		List<String> ret = new ArrayList<String>();
		if (type == null) {
			return ret;
		}
		if (type instanceof ParameterizedType) {
			String name = ((ParameterizedType) type).getType().toString().toLowerCase();
			ret.add(name);
			String nameType = ((ParameterizedType) type).toString().toLowerCase();
			ret.add(nameType);
		} else {
			ret.add(type.toString().toLowerCase());
		}
		return ret;
	}
	
	public static List<String> getString(List<org.eclipse.jdt.core.dom.Type> types) {
		List<String> ret = new ArrayList<String>();
		if (types == null) {
			return ret;
		}
		for (org.eclipse.jdt.core.dom.Type o : types) {
			ret.addAll(getString(o));
		}
		return ret;
	}
	public boolean compare(org.eclipse.jdt.core.dom.Type other);
	public String getString();
	
	public default boolean isVariable(){
		return false;
	}
	
	public void setString(String s);
	public void deleteString(String s);
}
