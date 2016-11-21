package es.uam.sara.tfg.rule;

import java.util.ArrayList;
import java.util.List;
import es.uam.sara.tfg.properties.Properties;
import es.uam.sara.tfg.properties.classes.ClassProperty;
import es.uam.sara.tfg.properties.interfaces.Interface;

public class And<T> extends Properties<T>{


	private List<Properties<T>>properties;
	
	public And() {
		super();
		properties= new ArrayList<Properties<T>>();
	}

	public boolean comprobar (Properties<T> a, Properties<T> b){
		if ((a instanceof ClassProperty) && !(a instanceof ClassProperty)){
			return false;
		}
		if ((a instanceof Interface) && !(a instanceof Interface)){
			return false;
		}
		return true;
	}
	public void addPropertie (Properties<T> p){
		if (properties.isEmpty()){
			properties.add(p);
		}else if (comprobar(properties.get(0), p))
			properties.add(p);
	}
	
	@Override
	public void check(List<T> analyze){
		for (Properties<T> p: properties){
			p.check(analyze);
			removeAllWrong(p.getWrong());
			addAllWrong(p.getWrong());
		}
		addAllRight(analyze);
		removeAllRight(getWrong());
	}
	
	public void reset() {
		for (Properties<T> a: properties){
			a.reset();
		}
		super.reset();
	}

	@Override
	public String toString() {
		String cad;
		if (properties.size()==1){
			cad=properties.get(0).toString();
		}else{
			cad="("+properties.get(0).toString();
			for (int i=1; i<properties.size();i++){
				cad+=" and "+properties.get(i).toString();
			}
			cad+=")";
		}
		return cad;
	}

	@Override
	public String print(boolean right) {
		String cad="";
		for (Properties<T> p: properties){
			cad+=p.print(right);
		}
		return cad+"\n";
	}


	@Override
	public boolean checkElement(T analyze) {
		return false;
	}

	@Override
	public String print(T print) {
		return "";
	}

}
