package es.uam.sara.tfg.properties.type;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jdt.core.dom.ParameterizedType;


public interface Type {
	public boolean equals(Object other);
	
	public default List<String> getString(org.eclipse.jdt.core.dom.Type type) {
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
	public boolean compare(org.eclipse.jdt.core.dom.Type other);
	public String getString();
	
	public default boolean isVariable(){
		return false;
	}
}
