package es.uam.sara.tfg.rule;

import java.util.ArrayList;
import java.util.List;
import es.uam.sara.tfg.properties.Properties;
import es.uam.sara.tfg.properties.classes.Class;
import es.uam.sara.tfg.properties.interfaces.Interface;

public class And<T> extends Properties<T>{


	private List<Properties<T>>properties;
	
	public And(List<T> analyze) {
		super(analyze);
		properties= new ArrayList<Properties<T>>();
	}

	public boolean comprobar (Properties<T> a, Properties<T> b){
		if ((a instanceof Class) && !(a instanceof Class)){
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
	public void check(){
		for (Properties<T> p: properties){
			p.check();
			removeAllWrong(p.getWrong());
			addAllWrong(p.getWrong());
		}
		addAllRight(getAnalyze());
		removeAllRight(getWrong());
	}

}
