package es.uam.sara.tfg.sentence;

import java.util.ArrayList;
import java.util.List;

import es.uam.sara.tfg.elements.IElements;
import es.uam.sara.tfg.properties.Checkeable;
import es.uam.sara.tfg.properties.classes.ClassProperty;
import es.uam.sara.tfg.properties.interfaces.InterfaceProperty;

public class And<T extends IElements> extends Checkeable<T>{


	private List<PrimaryOp<T>>properties;
	
	public And() {
		super(false);
		properties= new ArrayList<PrimaryOp<T>>();
	}

	public boolean comprobar (PrimaryOp<T> a, PrimaryOp<T> b){
		if ((a instanceof ClassProperty) && !(a instanceof ClassProperty)){
			return false;
		}
		if ((a instanceof InterfaceProperty) && !(a instanceof InterfaceProperty)){
			return false;
		}
		return true;
	}
	public void addPropertie (PrimaryOp<T> p){
		if (properties.isEmpty()){
			properties.add(p);
		}else if (comprobar(properties.get(0), p))
			properties.add(p);
	}
	
	@Override
	public void check(List<T> analyze){
		for (PrimaryOp<T> p: properties){
			p.check(analyze);
			removeAllWrong(p.getWrong());
			addAllWrong(p.getWrong());
		}
		addAllRight(analyze);
		removeAllRight(getWrong());
	}
	
	public void reset() {
		for (Checkeable<T> a: properties){
			a.reset();
		}
		super.reset();
	}

	@Override
	public String toString() {
		String cad="";
		String and="";
		for (PrimaryOp<T> p: properties){
			if (p instanceof Or<?>){
				cad+=and+"("+p.toString()+")";
			}else{
				cad+=and+p.toString();
			}
			and=" and ";
			
		}
		return cad;
	}

	@Override
	public String print(boolean right) {
		String cad="";
		for (Checkeable<T> p: properties){
			cad+=p.print(right);
		}
		return cad+"\n";
	}


	@Override
	public boolean checkElement(T analyze) {
		return false;
	}

}
