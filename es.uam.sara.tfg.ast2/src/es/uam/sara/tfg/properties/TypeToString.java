package es.uam.sara.tfg.properties;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;

public class TypeToString {

	public static List<String> getString(List<?> types){
		List<String> ret=new ArrayList<String>();
		if (types==null){
			return ret;
		}
		for (Object o: types){
			if (o instanceof Type){
				ret.addAll(getString((Type)o));
			}else if (o instanceof SingleVariableDeclaration){
				ret.addAll(getString(((SingleVariableDeclaration)o).getType()));
			}
		}
		return ret;
	}
	
	public static List<String> getString (Type type){
		List<String> ret=new ArrayList<String>();
		if (type==null){
			return ret;
		}
		if (type instanceof ParameterizedType){
			String name=((ParameterizedType)type).getType().toString().toLowerCase();
			ret.add(name);
			String nameType=((ParameterizedType)type).toString().toLowerCase();
			ret.add(nameType);
		}else{
			ret.add(type.toString().toLowerCase());
		}
		return ret;
	}
}
