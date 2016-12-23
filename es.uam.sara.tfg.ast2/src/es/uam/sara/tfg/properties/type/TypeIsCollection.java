package es.uam.sara.tfg.properties.type;

import java.util.Map;

import org.eclipse.jdt.core.dom.ArrayType;

import es.uam.sara.tfg.ast.IsCollectionOf;
import es.uam.sara.tfg.ast.TypeVisitor;

public class TypeIsCollection implements TypeFunction {

	private Type of;
	private boolean variable;
	private TypeVisitor tv;
	
	public TypeIsCollection(TypeVisitor tv) {
		of = null;
		this.variable = false;
		this.tv=tv;

	}

	public TypeIsCollection(Type of, TypeVisitor tv) {
		super();
		this.of = of;
		this.variable = of.isVariable();
		this.tv=tv;
	}

	@Override
	public boolean compare(org.eclipse.jdt.core.dom.Type other) {
		if (other.isArrayType()){
			if (of==null){
				return true;
			}else {
				return of.compare(((ArrayType)other).getElementType());
			}
		}
		
		Map<String, IsCollectionOf> map=tv.getIsCollection();
		IsCollectionOf isCO=map.get(other.toString());
		if (isCO==null){
			return false;
		}
		if (isCO.isCollection()==false){
			return false;
		}else{
			if (of==null){
				return true;
			}
			else return of.compare(isCO.getOf());
		}
	}

	public void setString(String string) {
		if (of != null) {
			if (of.isVariable()) {
				of.setString(string);
			}
		}
	}

	@Override
	public String getString() {
		if (of != null) {
			return "isCollection(" + of + ")";
		}
		return "isCollection()";
	}

	public boolean isVariable() {
		if (of != null) {
			return of.isVariable();
		} else {
			return variable;
		}
	}

	@Override
	public void deleteString(String s) {
		if (of!=null){
			of.deleteString(s);
		}
	}

	@Override
	public boolean compare(String other) {
		Map<String, IsCollectionOf> map=tv.getIsCollection();
		IsCollectionOf isCO=map.get(other);
		if (isCO==null){
			return false;
		}
		if (isCO.isCollection()==false){
			return false;
		}else{
			if (of==null){
				return true;
			}
			else return of.compare(isCO.getOf());
		}
	}
	
	@Override
	public String toString() {
		if (of != null) {
			return "isCollection(" + of + ")";
		}
		return "isCollection()";
	}
}
