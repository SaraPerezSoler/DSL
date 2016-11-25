package es.uam.sara.tfg.elements;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;

public interface ICanGeneric {

	public boolean isGeneric();
	
	public default boolean comparaParam(List<Type> parameters, List<String> generics) {

		for (Type t : parameters) {
			if (t instanceof ParameterizedType) {
				if (comparaParam(getTypes(((ParameterizedType) t).typeArguments()), generics)) {
					return true;
				}
			} else {
				if (generics.contains(t.toString())) {
					return true;
				}
			}
		}
		return false;
	}

	public default List<String> getGenericTypes(List<?> lista) {
		List<String> ret = new ArrayList<String>();
		for (Object o : lista) {
			ret.add(o.toString());
		}
		return ret;
	}

	public default List<Type> getTypes(List<?> lista) {
		List<Type> ret = new ArrayList<Type>();
		for (Object o : lista) {
			if (o instanceof SingleVariableDeclaration) {
				ret.add(((SingleVariableDeclaration) o).getType());
			}
			if (o instanceof Type) {
				ret.add((Type) o);
			}
		}
		return ret;
	}
	public default List<Type> getTypes(Type returnType2) {
		List<Type> ret = new ArrayList<Type>();
		ret.add(returnType2);
		return ret;
	}

}
