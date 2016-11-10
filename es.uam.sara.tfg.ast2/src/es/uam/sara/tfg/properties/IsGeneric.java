package es.uam.sara.tfg.properties;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class IsGeneric {

	public boolean check(TypeDeclaration t) {
		if (t.typeParameters().isEmpty()) {
			return false;
		}
		return true;
	}

	public boolean check(MethodDeclaration meth) {
		if (meth.getParent() instanceof TypeDeclaration) {
			TypeDeclaration t = (TypeDeclaration) meth.getParent();
			if (check(t)) {
				if (comparaParam(getTypes(meth.parameters()), getGenericTypes(t.typeParameters()))){
					return true;
				}
			}
		}
		return false;
	}

	private boolean comparaParam(List<Type> parameters, List<String> generics) {

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

	private List<String> getGenericTypes(List<?> lista) {
		List<String> ret = new ArrayList<String>();
		for (Object o : lista) {
			ret.add(o.toString());
		}
		return ret;
	}

	private List<Type> getTypes(List<?> lista) {
		List<Type> ret = new ArrayList<Type>();
		for (Object o : lista) {
			if (o instanceof SingleVariableDeclaration) {
				ret.add(((SingleVariableDeclaration) o).getType());
			}if (o instanceof Type){
				ret.add((Type)o);
			}
		}
		return ret;
	}

}
